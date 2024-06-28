sap.ui.require(
    [
        'sap/fe/test/JourneyRunner',
        'prepaymentpendinginvsapproval/test/integration/FirstJourney',
		'prepaymentpendinginvsapproval/test/integration/pages/PrepaymentPendingInvoicesMain'
    ],
    function(JourneyRunner, opaJourney, PrepaymentPendingInvoicesMain) {
        'use strict';
        var JourneyRunner = new JourneyRunner({
            // start index.html in web folder
            launchUrl: sap.ui.require.toUrl('prepaymentpendinginvsapproval') + '/index.html'
        });

       
        JourneyRunner.run(
            {
                pages: { 
					onThePrepaymentPendingInvoicesMain: PrepaymentPendingInvoicesMain
                }
            },
            opaJourney.run
        );
    }
);