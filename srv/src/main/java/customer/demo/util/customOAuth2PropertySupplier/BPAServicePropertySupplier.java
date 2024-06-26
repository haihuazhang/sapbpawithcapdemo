package customer.demo.util.customOAuth2PropertySupplier;

import java.net.URI;
import java.net.URISyntaxException;

import com.sap.cloud.sdk.cloudplatform.connectivity.BtpServiceOptions;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultOAuth2PropertySupplier;
import com.sap.cloud.sdk.cloudplatform.connectivity.ServiceBindingDestinationOptions;
import com.sap.cloud.sdk.cloudplatform.connectivity.BtpServiceOptions.WorkflowOptions;
import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;

import jakarta.annotation.Nonnull;

public class BPAServicePropertySupplier extends DefaultOAuth2PropertySupplier {

    public BPAServicePropertySupplier(@Nonnull final ServiceBindingDestinationOptions options) {
        super(options);
        // TODO Auto-generated constructor stub
    }

    @Override
    @Nonnull
    public URI getServiceUri() {
        URI uri = getCredentialOrThrow(URI.class, "endpoints", "api");
        URI path;
        String prefix;

        WorkflowOptions workflowOptions = options.getOption(WorkflowOptions.class).get();
        switch (workflowOptions) {
            case REST_API:
                prefix = "/workflow/rest";
                break;
            case ODATA_API:
                prefix = "/workflow/odata";
                break;
            default:
                prefix = "/workflow/rest";
                break;
        }
        // return getCredentialOrThrow(URI.class, "endpoints", "api");

        try {
            path = new URI(uri.getScheme(), (String) null, uri.getHost(), uri.getPort(),
                    prefix, (String) null, (String) null);
            return path;
        } catch (URISyntaxException var6) {
            // throw new OpenApiRequestException(var6);
            return uri;
        }

    }

}
