sap.ui.define(
    [
        'sap/fe/core/PageController',
        'sap/m/MessageBox',
        'sap/ui/model/Filter'
    ],
    function (PageController, MessageBox, Filter) {
        'use strict';

        return PageController.extend('cprepaymentpendinginvs.ext.main.Main', {
            /**
             * Called when a controller is instantiated and its View controls (if available) are already created.
             * Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
             * @memberOf cprepaymentpendinginvs.ext.main.Main
             */
            onInit: function () {
                // standard prototype caller 
                PageController.prototype.onInit.apply(this);
                // set the page editable 


                // attach route matched event for initialization
                this.getAppComponent().getRouter().getRoute("PrepaymentPendingInvoicesMain").attachMatched(this._initialize, this);


            },

            /**
             * Initialization steps in Route Matched Event
             * @param {*} oEvent 
             */
            _initialize: function (oEvent) {
                this.getView().getModel("ui").setProperty("/isEditable", true);

                if (!this.getModel("local").getProperty("/InitialCreationUUID")) {


                    // generate a random UUID 
                    var InitialCreationUUID = self.crypto.randomUUID();
                    // set UUID to local model for later usage
                    this.getModel("local").setProperty("/InitialCreationUUID", InitialCreationUUID);

                    // create initial 10 record by InitialCreationUUID
                    var that = this;
                    // set the Table busy status
                    this.byId("NewTable").setBusy(true);

                    // suspend the table loading of data
                    this.byId("NewTable").suspendBinding();

                    // call custom create action for creating 10 initial records(initialLinesCreation)
                    var promise = new Promise((resolve, reject) => {
                        var creationContext = that.getView().getModel().bindContext("/initialLinesCreation(...)");
                        creationContext.setParameter("lines", 1);
                        creationContext.setParameter("InitCreationUUID", InitialCreationUUID);
                        creationContext.execute("$auto", false, null, /*bReplaceWithRVC*/false).then(() => {
                            resolve(creationContext);
                        });
                    });

                    promise.then((oContext) => {
                        // resume table loading
                        that.byId("NewTable").resumeBinding();
                    }).catch((oError) => {
                        MessageBox.error(oError);
                    }).finally(() => {
                        that.byId("NewTable").setBusy(true);
                    });
                }
            },
            /**
             *  bind table with filter InitialCreationUUID
             * @param {*} oEvent 
             */
            onBeforeRebindTable: function (oEvent) {
                if (oEvent.getParameter("collectionBindingInfo")) {
                    var oCollectionBindingInfo = oEvent.getParameter("collectionBindingInfo");
                    oCollectionBindingInfo.addFilter(new Filter({
                        path: "InitCreationUUID",
                        operator: "EQ",
                        value1: this.getModel("local").getProperty("/InitialCreationUUID")
                    }));
                }
            },
            /**
             * Save button action
             * @param {*} oEvent 
             */
            onPressSave: function (oEvent) {
                // get all rows
                if (this.getExtensionAPI().byId("NewTable")) {
                    var oTable = this.getExtensionAPI().byId("NewTable").getContent();
                    if (oTable.getRowBinding()) {
                        var oRowBinding = oTable.getRowBinding();
                        var aRows = oRowBinding.getContexts();

                        // activate table rows if is draft
                        var aActivateFlow = [];
                        var that = this;

                        this.byId("NewTable").setBusy(true);

                        for (let row of aRows) {
                            if (!row.getProperty("IsActiveEntity")) {
                                aActivateFlow.push(this.editFlow.saveDocument(row));
                            }
                        }


                        Promise.all(aActivateFlow).then(() => {
                            that.getExtensionAPI().byId("NewTable").refresh();
                        }).catch(() => {

                        }).finally(() => {
                            that.byId("NewTable").setBusy(true);

                        });
                    }
                }
            },
            onPressNavToAttachments: function (oEvent) {
                // var sPath = oEvent.getSource().getBindingContext().getPath().substring(1);
                // this.getAppComponent().getRouter().navTo("Attachment", {
                //     // contextPath: sPath
                //     key: 
                // });
                var sKey = this.getModel().getKeyPredicate(oEvent.getSource().getBindingContext().getBinding().getPath()
                    , oEvent.getSource().getBindingContext().getObject());

                this.routing.navigateToRoute("Attachment", {
                    key: sKey
                });
            },

            /**
             * Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
             * (NOT before the first rendering! onInit() is used for that one!).
             * @memberOf cprepaymentpendinginvs.ext.main.Main
             */
            //  onBeforeRendering: function() {
            //
            //  },

            /**
             * Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
             * This hook is the same one that SAPUI5 controls get after being rendered.
             * @memberOf cprepaymentpendinginvs.ext.main.Main
             */
            //  onAfterRendering: function() {
            //
            //  },

            /**
             * Called when the Controller is destroyed. Use this one to free resources and finalize activities.
             * @memberOf cprepaymentpendinginvs.ext.main.Main
             */
            //  onExit: function() {
            //
            //  }
        });
    }
);
