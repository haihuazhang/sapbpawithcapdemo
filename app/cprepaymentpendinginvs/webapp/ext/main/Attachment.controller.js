sap.ui.define(
    [
        'sap/fe/core/PageController',
        'sap/m/MessageBox',
        'sap/ui/model/Filter'
    ],
    function (PageController, MessageBox, Filter) {
        'use strict';

        return PageController.extend('cprepaymentpendinginvs.ext.main.Attachment', {
            /**
             * Called when a controller is instantiated and its View controls (if available) are already created.
             * Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
             * @memberOf cprepaymentpendinginvs.ext.main.Main
             */
            onInit: function () {
                // standard prototype caller 
                PageController.prototype.onInit.apply(this);
                // set the page editable 
                // this.getView().getModel("ui").setProperty("/isEditable", true);

                // attach route matched event for initialization
                this.getAppComponent().getRouter().getRoute("Attachment").attachMatched(this._initialize, this);
            },

            /**
             * Initialization steps in Route Matched Event
             * @param {*} oEvent 
             */
            _initialize: function (oEvent) {
                // var sPath = oEvent.getParameter("arguments").contextPath;
                // this.getView().bindElement(sPath);

                // var oContextBinding = this.getModel().bindContext("/" + sPath);
                // this.getView().setBindingContext(oContextBinding.getBoundContext());

                // this.

            },
            /**
             *  bind table with filter InitialCreationUUID
             * @param {*} oEvent 
             */
            onBeforeRebindTable: function (oEvent) {
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
