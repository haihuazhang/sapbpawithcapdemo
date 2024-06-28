sap.ui.define(
    [
        'sap/fe/core/PageController'
    ],
    function (PageController) {
        'use strict';

        return PageController.extend('prepaymentpendinginvsapproval.ext.main.Main', {
            /**
             * Called when a controller is instantiated and its View controls (if available) are already created.
             * Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
             * @memberOf prepaymentpendinginvsapproval.ext.main.Main
             */
            onInit: function () {
                // standard prototype caller 
                PageController.prototype.onInit.apply(this);
                this.getAppComponent().getRouter().getRoute("PrepaymentPendingInvoicesMain").attachMatched(this._initialize, this);
            },
            /**
* Initialization steps in Route Matched Event
* @param {*} oEvent 
*/
            _initialize: function (oEvent) {
                // var sPath = oEvent.getParameter("arguments").contextPath;
                // this.getView().bindElement(sPath);
                var invoiceUUID = this.getModel("context").getProperty("/invoiceUUID");
                var skey = this.getModel().getKeyPredicate("/PrepaymentPendingInvoices", {
                    ID: invoiceUUID,
                    IsActiveEntity: true
                });
                var sPath = "/PrepaymentPendingInvoices" + skey;
                this.getView().bindElement(sPath);


                // var oContextBinding = this.getModel().bindContext("/" + sPath);
                // this.getView().setBindingContext(oContextBinding.getBoundContext());

                // this.

            },

            /**
             * Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
             * (NOT before the first rendering! onInit() is used for that one!).
             * @memberOf prepaymentpendinginvsapproval.ext.main.Main
             */
            //  onBeforeRendering: function() {
            //
            //  },

            /**
             * Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
             * This hook is the same one that SAPUI5 controls get after being rendered.
             * @memberOf prepaymentpendinginvsapproval.ext.main.Main
             */
            //  onAfterRendering: function() {
            //
            //  },

            /**
             * Called when the Controller is destroyed. Use this one to free resources and finalize activities.
             * @memberOf prepaymentpendinginvsapproval.ext.main.Main
             */
            //  onExit: function() {
            //
            //  }
        });
    }
);
