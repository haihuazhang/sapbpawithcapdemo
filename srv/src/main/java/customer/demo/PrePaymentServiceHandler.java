package customer.demo;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
// import java.util.random.RandomGenerator;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;
import org.springframework.stereotype.Component;

import com.sap.cds.Result;
import com.sap.cds.ql.Insert;
import com.sap.cds.ql.Select;
import com.sap.cds.ql.Update;
import com.sap.cds.ql.cqn.CqnAnalyzer;
import com.sap.cds.ql.cqn.CqnInsert;
import com.sap.cds.ql.cqn.CqnUpdate;
import com.sap.cds.services.ServiceException;
import com.sap.cds.services.cds.CdsCreateEventContext;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.draft.DraftService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
import com.sap.cloud.environment.servicebinding.api.DefaultServiceBindingAccessor;
import com.sap.cloud.environment.servicebinding.api.ServiceBinding;
import com.sap.cloud.environment.servicebinding.api.ServiceIdentifier;
import com.sap.cloud.sdk.cloudplatform.connectivity.BtpServiceOptions;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import com.sap.cloud.sdk.cloudplatform.connectivity.OAuth2ServiceBindingDestinationLoader;
import com.sap.cloud.sdk.cloudplatform.connectivity.ServiceBindingDestinationLoader;
import com.sap.cloud.sdk.cloudplatform.connectivity.ServiceBindingDestinationOptions;
import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;

import cds.gen.prepayment.CreateDraftWithInitUUIDContext;
import cds.gen.prepayment.InitialLinesCreationContext;
import cds.gen.prepayment.PrePayment_;
import cds.gen.prepayment.PrepaymentPendingInvoices;
import cds.gen.prepayment.PrepaymentPendingInvoices_;
import cds.gen.prepayment.SendToApprovalContext;
import customer.demo.spa.api.WorkflowInstancesApi;
import customer.demo.spa.model.WorkflowInstance;
import customer.demo.spa.model.WorkflowInstanceStartPayload;
import customer.demo.util.customOAuth2PropertySupplier.BPAServicePropertySupplier;

@Component
@ServiceName(PrePayment_.CDS_NAME)
public class PrePaymentServiceHandler implements EventHandler {

    @Autowired
    @Qualifier(PrePayment_.CDS_NAME)
    DraftService prepaymentDraftService;

    @Autowired
    @Qualifier(PrePayment_.CDS_NAME)
    CqnService prepaymentService;

    @On(event = InitialLinesCreationContext.CDS_NAME)
    public void initialLinesCreation(InitialLinesCreationContext context) {
        // get lines
        int lines = context.getLines();

        List<PrepaymentPendingInvoices> invoices = new ArrayList<PrepaymentPendingInvoices>();

        for (int i = 0; i < lines; i++) {
            PrepaymentPendingInvoices invoice = PrepaymentPendingInvoices.create();
            invoice.setCurrencyCode("JPY"); // set default currency code JPY
            invoice.setInitCreationUUID(context.getInitCreationUUID()); // initial Creation UUID
            invoices.add(invoice);
        }
        // build insert SQL
        CqnInsert insert = Insert.into(PrepaymentPendingInvoices_.class).entries(invoices);
        // call draft service
        Result result = prepaymentDraftService.newDraft(insert);

        // set result
        if (result.rowCount() != lines) {
            // context.set
            // raise Exception
        } else {
            List<PrepaymentPendingInvoices> invoicesResult = result.listOf(PrepaymentPendingInvoices.class);
            context.setResult(invoicesResult);
            context.setLines(lines);
            // context.setResult(invoices);
            context.setCompleted();
        }

    }

    @On(event = CreateDraftWithInitUUIDContext.CDS_NAME)
    public void createDraftWithInitUUID(CreateDraftWithInitUUIDContext context) {
        // context.get
        PrepaymentPendingInvoices invioce = PrepaymentPendingInvoices.create();
        invioce.setInitCreationUUID(context.getInitCreationUUID());
        context.setResult(prepaymentDraftService.newDraft(Insert.into(PrepaymentPendingInvoices_.class).entry(invioce))
                .single(PrepaymentPendingInvoices.class));
    }

    @On(event = CqnService.EVENT_CREATE, entity = PrepaymentPendingInvoices_.CDS_NAME)
    public void onSavePrepaymentInvoice(CdsCreateEventContext context,
            Stream<PrepaymentPendingInvoices> prepaymentPendingInvoicesList) {
        prepaymentPendingInvoicesList.forEach((invoice) -> {
            invoice.setNormalCancelType("0");
            invoice.setStateOfApplication("0");
            invoice.setInterfaceFlag((short) 0);
            invoice.setStartUserID(context.getUserInfo().getId());
            invoice.setStartDateTime(Instant.now());
            invoice.setDeleteFlag((short) 0);
            // invoice.setCurrency(invoice);
            invoice.setInvoiceNumber(Long.toString(Math.abs(new Random().nextLong())).substring(0, 10));
            context.getMessages().success("common.invoice.createsuccessful", invoice.getInvoiceNumber());
        });

    }

    @On(event = SendToApprovalContext.CDS_NAME)
    public void sendToApprove(SendToApprovalContext context) {
        // context.
        CqnAnalyzer analyzer = CqnAnalyzer.create(context.getModel());
        Map<String, Object> keys = analyzer.analyze(context.getCqn()).targetKeys();

        Optional<PrepaymentPendingInvoices> invoice = prepaymentService
                .run(Select.from(PrepaymentPendingInvoices_.class).matching(keys))
                .first(PrepaymentPendingInvoices.class);
        // error if
        invoice.orElseThrow(() -> new ServiceException("404009", keys.toString()));

        // error if entity data is still in draft
        if (invoice.map(PrepaymentPendingInvoices::getIsActiveEntity).get() == false) {
            throw new ServiceException("400005");
        }

        Map<String, Object> approvals = new HashMap<>();
        if (context.getApprover1() != "") {
            approvals.put("Approver1", context.getApprover1());
        }
        if (context.getApprover2() != "") {
            approvals.put("Approver2", context.getApprover2());
        }

        if (context.getApprover3() != "") {
            approvals.put("Approver3", context.getApprover3());
        }

        if (context.getApprover4() != "") {
            approvals.put("Approver4", context.getApprover4());
        }

        if (context.getApprover5() != "") {
            approvals.put("Approver5", context.getApprover5());
        }

        // Update Approver without draft
        CqnUpdate update = Update.entity(PrepaymentPendingInvoices_.class).data(approvals).matching(keys);
        Result result = prepaymentService.run(update);

        if (result.rowCount() != 1) {
            // No.21 error
            throw new ServiceException("common.invoice.approverupdateerror",
                    invoice.map(PrepaymentPendingInvoices::getInvoiceNumber).get());
        } else {
            // trigger worflow

            /**
             * fetch service binding
             * 1. get SAP Build Process Automation service binding
             * 2. load service binding as Destination
             */

            // 1. get service binding
            var serviceBindingList = DefaultServiceBindingAccessor.getInstance().getServiceBindings();
            ServiceBindingDestinationOptions options;
            ServiceBinding serviceBinding;
            int i = 0;
            for (i = 0; i < serviceBindingList.size(); i++) {
                serviceBinding = serviceBindingList.get(i);
                String serviceName = serviceBinding.getName().orElse("");
                if (serviceName == "process-automation-service") {
                    break;
                }
            }
            i--;

            serviceBinding = serviceBindingList.get(i);
            options = ServiceBindingDestinationOptions.forService(serviceBinding)
                    .withOption(BtpServiceOptions.WorkflowOptions.REST_API)
                    .build();
            OAuth2ServiceBindingDestinationLoader.registerPropertySupplier(
                    ServiceIdentifier.of("process-automation-service"), BPAServicePropertySupplier::new);
            // 2. load as destination
            HttpDestination workflowDestination = ServiceBindingDestinationLoader.defaultLoaderChain()
                    .getDestination(options);

            // 3. call workflow
            WorkflowInstanceStartPayload payload = new WorkflowInstanceStartPayload();
            payload.definitionId("us10.1b7dddaatrial.process1.process1");
            Map<String, Object> workflowInstanceContext = new HashMap<>();
            workflowInstanceContext.put("invoiceUUID", invoice.map(PrepaymentPendingInvoices::getId).get());
            workflowInstanceContext.put("invoiceNumber",
                    invoice.map(PrepaymentPendingInvoices::getInvoiceNumber).get());
            workflowInstanceContext.put("approval1", context.getApprover1());
            workflowInstanceContext.put("approval2", context.getApprover2());
            workflowInstanceContext.put("approval3", context.getApprover3());
            workflowInstanceContext.put("approval4", context.getApprover4());
            workflowInstanceContext.put("approval5", context.getApprover5());
            payload.context(workflowInstanceContext);

            WorkflowInstancesApi workflowInstancesApi = new WorkflowInstancesApi(workflowDestination);

            try {
                WorkflowInstance instance = workflowInstancesApi.v1WorkflowInstancesPost(payload);
                Map<String, Object> workflowInstanceData = new HashMap<>();
                workflowInstanceData.put("WorkflowID", instance.getId());
                workflowInstanceData.put("StateOfApplication", "1");

                CqnUpdate updateAfterStartWorkflow = Update.entity(PrepaymentPendingInvoices_.class)
                        .data(workflowInstanceData).matching(keys);
                Result resultofUpdateAfterStartWorkflow = prepaymentService.run(updateAfterStartWorkflow);
                if (resultofUpdateAfterStartWorkflow.rowCount() != 1) {
                    // No.11 error
                    throw new ServiceException("common.workflow.systemerror",
                            invoice.map(PrepaymentPendingInvoices::getInvoiceNumber).get());
                } else {
                    context.getMessages().success("common.invoice.submitsuccessful",
                            invoice.map(PrepaymentPendingInvoices::getInvoiceNumber).get());
                    context.setCompleted();
                }

            } catch (OpenApiRequestException e) {

                // TODO: handle exception
                // throw two error messages in one exception,however SAP CAP does not support.
                // context.getMessages().error(e.getMessage());
                // context.getMessages().error("common.workflow.systemerror",
                // invoice.map(PrepaymentPendingInvoices::getInvoiceNumber).get());
                // context.getMessages().throwIfError();

                // throw exception instead of custom message.
                throw new ServiceException(e);
            }
        }
    }

}
