sap.ui.define([
    "sap/ui/core/format/DateFormat"
], function (DateFormat) {
    "use strict";
    return {
        convertDate: function (sDate) {
            if (sDate) {
                var oDateFormat = DateFormat.getDateTimeInstance({
                    pattern: "yyyy-MM-dd"
                });
                return oDateFormat.format(new Date(sDate));
            } else {
                return sDate;
            }
        },

        getApprovalIcon: function (approvalResult) {
            var icon;
            switch (approvalResult) {
                case "Submit":
                    icon = "sap-icon://activity-items";
                    break;
                case "Recall":
                    icon = "sap-icon://undo";
                    break;
                case "Approve":
                    icon = "sap-icon://accept";
                    break;
                case "Reject":
                    icon = "sap-icon://decline";
                    break;
            }
            return icon;
        },

        formatNumber: function (n) {
            if (n) {
                var sign = "";
                if (typeof n === "string") {
                    var bNegative = n.endsWith("-");
                    if (bNegative) {
                        n = "-" + n.substring(0, n.length - 1);
                    }
                }
                var num = Number(n);
                if (num < 0) {
                    num = num * -1;
                    sign = "-";
                }
                var re = /\d{1,3}(?=(\d{3})+$)/g;
                var n1 = num.toString().replace(/^(\d+)((\.\d+)?)$/, function (s, s1, s2) {
                    return s1.replace(re, "$&,") + s2;
                });
                if (sign === "-") {
                    n1 = sign + n1;
                }
                return n1;
            }
        },

        formatFloat: function (n) {
            if (n) {
                var sign = "";
                if (typeof n === "string") {
                    var bNegative = n.endsWith("-");
                    if (bNegative) {
                        n = "-" + n.substring(0, n.length - 1);
                    }
                }
                var num = Number(n).toFixed(2);
                if (num < 0) {
                    num = num.substring(1);
                    sign = "-";
                }
                var re = /\d{1,3}(?=(\d{3})+$)/g;
                var n1 = num.toString().replace(/^(\d+)((\.\d+)?)$/, function (s, s1, s2) {
                    return s1.replace(re, "$&,") + s2;
                });
                if (sign === "-") {
                    n1 = sign + n1;
                }
                return n1;
            }
        },
        getFileUrl: function () {
            debugger;
            var oContext = this.getBindingContext();
            var sPath = oContext.getPath();
            sPath = "/odata/v4/PrePayment" + sPath;
            return sap.ui.require.toUrl(sPath);
        }
    };
});