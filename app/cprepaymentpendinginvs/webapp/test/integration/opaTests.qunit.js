sap.ui.require(
    [
        'sap/fe/test/JourneyRunner',
        'cprepaymentpendinginvs/test/integration/FirstJourney',
		'cprepaymentpendinginvs/test/integration/pages/PrepaymentPendingInvoicesMain'
    ],
    function(JourneyRunner, opaJourney, PrepaymentPendingInvoicesMain) {
        'use strict';
        var JourneyRunner = new JourneyRunner({
            // start index.html in web folder
            launchUrl: sap.ui.require.toUrl('cprepaymentpendinginvs') + '/index.html'
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