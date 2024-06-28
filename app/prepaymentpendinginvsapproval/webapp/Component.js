sap.ui.define(
    ["sap/ui/core/UIComponent"],
    function (Component) {
        "use strict";

        return Component.extend("prepaymentpendinginvsapproval.Component", {
            metadata: {
                manifest: "json"
            },
            init: function () {
                // call the base component's init function
                Component.prototype.init.apply(this, arguments);



                // // set the device model
                // this.setModel(models.createDeviceModel(), "device");

                this.setTaskModels();

                this.getInboxAPI().addAction(
                    {
                        action: "APPROVE",
                        label: this.getModel("i18n").getResourceBundle().getText("BTN_APPROVE"),
                        type: "accept", // (Optional property) Define for positive appearance
                    },
                    function () {
                        this.completeTask(true, "approve");
                    },
                    this
                );

                this.getInboxAPI().addAction(
                    {
                        action: "REJECT",
                        label: this.getModel("i18n").getResourceBundle().getText("BTN_REJECT"),
                        type: "reject", // (Optional property) Define for negative appearance
                    },
                    function () {
                        this.completeTask(false, "reject");
                    },
                    this
                );

                // set binding path for App view.xml
                var that = this;
                this.getModel("context").dataLoaded().then(() => {
                    var invoiceUUID = that.getModel("context").getProperty("/invoiceUUID");
                    return that.getModel().requestKeyPredicate("/PrepaymentPendingInvoices", {
                        ID: invoiceUUID,
                        IsActiveEntity: true
                    });

                }).then((sKey) => {
                    var sPath = "/PrepaymentPendingInvoices" + sKey;
                    that.getRouter().initialize();
                    that.getRootControl().bindElement(sPath);
                    // enable routing

                });

            },

            setTaskModels: function () {
                // set the task model
                var startupParameters = this.getComponentData().startupParameters;
                this.setModel(startupParameters.taskModel, "task");

                // set the task context model
                var taskContextModel = new sap.ui.model.json.JSONModel(
                    this._getTaskInstancesBaseURL() + "/context"
                );
                this.setModel(taskContextModel, "context");
            },

            _getTaskInstancesBaseURL: function () {
                return (
                    this._getWorkflowRuntimeBaseURL() +
                    "/task-instances/" +
                    this.getTaskInstanceID()
                );
            },

            _getWorkflowRuntimeBaseURL: function () {
                var appId = this.getManifestEntry("/sap.app/id");
                var appPath = appId.replaceAll(".", "/");
                var appModulePath = jQuery.sap.getModulePath(appPath);

                return appModulePath + "/bpmworkflowruntime/v1";
            },

            getTaskInstanceID: function () {
                return this.getModel("task").getData().InstanceID;
            },

            getInboxAPI: function () {
                var startupParameters = this.getComponentData().startupParameters;
                return startupParameters.inboxAPI;
            },

            completeTask: function (approvalStatus, decision) {
                this.getModel("context").setProperty("/approved", approvalStatus);
                this._patchTaskInstance(decision);
                this._refreshTaskList();
            },

            _patchTaskInstance: function (decision) {
                var data = {
                    status: "COMPLETED",
                    decision: decision,
                    context: this.getModel("context").getData(),
                };

                jQuery.ajax({
                    url: this._getTaskInstancesBaseURL(),
                    method: "PATCH",
                    contentType: "application/json",
                    async: false,
                    data: JSON.stringify(data),
                    headers: {
                        "X-CSRF-Token": this._fetchToken(),
                    },
                });
            },

            _fetchToken: function () {
                var fetchedToken;

                jQuery.ajax({
                    url: this._getWorkflowRuntimeBaseURL() + "/xsrf-token",
                    method: "GET",
                    async: false,
                    headers: {
                        "X-CSRF-Token": "Fetch",
                    },
                    success(result, xhr, data) {
                        fetchedToken = data.getResponseHeader("X-CSRF-Token");
                    },
                });
                return fetchedToken;
            },

            _refreshTaskList: function () {
                this.getInboxAPI().updateTask("NA", this.getTaskInstanceID());
            }
        });
    }
);