using {zzdemo} from '../db/domain';

@path: 'PrePayment'
service PrePayment {
    //  @Common.DraftRoot.NewAction: 'PrePayment.createDraftWithInitUUID'
    entity PrepaymentPendingInvoices as projection on zzdemo.T_PrepaymentPendingInvoice
        actions {
            //   action addReview(rating : temp.rating_enum, title : temp.title, descr : temp.description) returns Reviews;
            //   action line_addattachment();
            action send_to_approval(Approver1 : zzdemo.Approver1,
                                    Approver2 : zzdemo.Approver2,
                                    Approver3 : zzdemo.Approver3,
                                    Approver4 : zzdemo.Approver4,
                                    Approver5 : zzdemo.Approver5);
            action createDraftWithInitUUID(in : $self, InitCreationUUID : UUID) returns PrepaymentPendingInvoices;

        };

    action initialLinesCreation(lines : Integer, InitCreationUUID : UUID) returns many PrepaymentPendingInvoices;
    //   entity Reviews as projection on temp.Reviews;

    // @cds.persistence.skip
    // entity Upload         @odata.singleton {
    //     csv : LargeBinary @Core.MediaType: 'text/csv';
    // }

    entity Customers                 as projection on zzdemo.T_Customer;
    entity Attachments               as projection on zzdemo.T_Attachemt;
    entity CommonUtility             as projection on zzdemo.M_CommonUtility;

    entity TemporaryOrHoldType       as
        select from zzdemo.M_CommonUtility {
            key Code,
                CodeValue,
                CodeDescription
        }
        where
            ClassCode = '1';

    entity GoodSpecies               as
        select from zzdemo.M_CommonUtility {
            key Code,
                CodeValue,
                CodeDescription
        }
        where
            ClassCode = '5';

    entity TaxType                   as
        select from zzdemo.M_CommonUtility {
            key Code,
                CodeValue,
                CodeDescription
        }
        where
            ClassCode = '3';
}

// draft
annotate PrePayment.PrepaymentPendingInvoices with @odata.draft.enabled;

// input validation
annotate PrePayment.PrepaymentPendingInvoices with {
    ID                    @UI.Hidden                            @UI.HiddenFilter;
    InvoiceNumber         @Common.FieldControl : #ReadOnly;
    CustomerCode          @Common.FieldControl : #Mandatory;
    TemporaryOrHoldType   @Common.FieldControl : #Mandatory;
    GoodSpecies           @Common.FieldControl : #Mandatory;
    TaxType               @Common.FieldControl : #Mandatory;
    // TaxRate               @Common.FieldControl : #Mandatory;
    ReasonForApplication  @UI.MultiLineText    : true           @Common.FieldControl: #Mandatory;
    PaymentBaseDate       @Common.FieldControl : #Mandatory;
    ReasonFoRejection     @UI.MultiLineText    : true;
    Amount                @Measures.ISOCurrency: Currency_code  @Common.FieldControl: #Mandatory;
};

annotate PrePayment.Customers with {
    CustomerName @Common.FieldControl: #ReadOnly;
};


annotate PrePayment.PrepaymentPendingInvoices with {
    CustomerCode        @Common: {
        ValueList: {
            $Type         : 'Common.ValueListType',
            CollectionPath: 'Customers',
            Parameters    : [
                {
                    $Type            : 'Common.ValueListParameterInOut',
                    LocalDataProperty: CustomerCode,
                    ValueListProperty: 'CustomerCode'
                },
                {
                    $Type            : 'Common.ValueListParameterDisplayOnly',
                    ValueListProperty: 'CustomerName'
                },
            ]
        },
        Text     : to_Customer.CustomerName,
    // TextArrangement : #TextSeparate,

    };
    TemporaryOrHoldType @Common: {
        ValueListWithFixedValues: true,
        ValueList               : {
            $Type         : 'Common.ValueListType',
            CollectionPath: 'TemporaryOrHoldType',
            Parameters    : [
                {
                    $Type            : 'Common.ValueListParameterInOut',
                    LocalDataProperty: TemporaryOrHoldType,
                    ValueListProperty: 'Code'
                },
                {
                    $Type            : 'Common.ValueListParameterDisplayOnly',
                    ValueListProperty: 'CodeValue'
                },
                {
                    $Type            : 'Common.ValueListParameterDisplayOnly',
                    ValueListProperty: 'CodeDescription'
                },
            ]
        }
    };
    GoodSpecies         @Common: {
        ValueListWithFixedValues: true,
        ValueList               : {
            $Type         : 'Common.ValueListType',
            CollectionPath: 'GoodSpecies',
            Parameters    : [
                {
                    $Type            : 'Common.ValueListParameterInOut',
                    LocalDataProperty: GoodSpecies,
                    ValueListProperty: 'Code'
                },
                {
                    $Type            : 'Common.ValueListParameterDisplayOnly',
                    ValueListProperty: 'CodeValue'
                },
                {
                    $Type            : 'Common.ValueListParameterDisplayOnly',
                    ValueListProperty: 'CodeDescription'
                },
            ]
        }
    };
    TaxType             @Common: {
        ValueListWithFixedValues: true,
        ValueList               : {
            $Type         : 'Common.ValueListType',
            CollectionPath: 'TaxType',
            Parameters    : [
                {
                    $Type            : 'Common.ValueListParameterInOut',
                    LocalDataProperty: TaxType,
                    ValueListProperty: 'Code'
                },
                {
                    $Type            : 'Common.ValueListParameterDisplayOnly',
                    ValueListProperty: 'CodeValue'
                },
                {
                    $Type            : 'Common.ValueListParameterDisplayOnly',
                    ValueListProperty: 'CodeDescription'
                },
            ]
        }
    };

};


annotate PrePayment.PrepaymentPendingInvoices with @(
                                                     //     UI.HeaderInfo     : {
                                                     //         TypeName      : '{i18n>HeaderTitle}',
                                                     //         TypeNamePlural: '{i18n>HeaderTitle}',
                                                     //     },
                                                     //     UI.SelectionFields: [
                                                     //         InvoiceNumber,
                                                     //         CustomerCode,
                                                     //         // Prepayment,
                                                     //         // MaterialType,
                                                     //         createdBy,
                                                     //         PaymentBaseDate,
                                                     //         Amount
                                                     //     ],

                                                   UI.LineItem: [
    {
        $Type             : 'UI.DataField',
        Value             : CustomerCode,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '10em'}
    },
    {
        $Type             : 'UI.DataField',
        Value             : to_Customer.CustomerName,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '10em'}
    },

    {
        $Type             : 'UI.DataField',
        Value             : TemporaryOrHoldType,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '8em'}
    },

    {
        $Type             : 'UI.DataField',
        Value             : GoodSpecies,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '8em'}
    },

    // 添付資料イメージ

    {
        $Type             : 'UI.DataField',
        Value             : Amount,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '10em'}
    },
    {
        $Type             : 'UI.DataField',
        Value             : TaxType,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '5em'}
    },
    {
        $Type             : 'UI.DataField',
        Value             : TaxRate,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '8em'}
    },

    {
        $Type             : 'UI.DataField',
        Value             : ReasonForApplication,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '20em'}
    },

    {
        $Type             : 'UI.DataField',
        Value             : PaymentBaseDate,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '10em'}
    },

    {
        $Type             : 'UI.DataField',
        Value             : InvoiceNumber,
        @UI.Importance    : #High,
        @HTML5.CssDefaults: {width: '10em'}
    },

    {
        $Type             : 'UI.DataFieldForAction',
        Action            : 'PrePayment.send_to_approval',
        Label             : '{i18n>SendToApproval}',
        Inline            : false,
        InvocationGrouping: #Isolated,
        @UI.Importance    : #Medium,
    },
]

);


annotate PrePayment.PrepaymentPendingInvoices with @(UI.Identification: [{
    $Type : 'UI.DataFieldForAction',
    Action: 'PrePayment.send_to_approval',
    Label : '{i18n>SendToApproval}'
}, ]);


annotate PrePayment.PrepaymentPendingInvoices with @(
    UI.Facets            : [
        // {
        //     $Type : 'UI.ReferenceFacet',
        //     Label : '{i18n>Header}',
        //     ID    : 'Header',
        //     Target: '@UI.FieldGroup#Header',
        // },
        // {
        //     $Type : 'UI.ReferenceFacet',
        //     Label : '{i18n>General}',
        //     ID    : 'General',
        //     Target: '@UI.FieldGroup#General',
        // },
        {
            $Type : 'UI.ReferenceFacet',
            Label : '{i18n>Details}',
            ID    : 'Details',
            Target: '@UI.FieldGroup#Details',
        },
        {
            $Type : 'UI.ReferenceFacet',
            Label : '{i18n>Attachments}',
            ID    : 'Attachment',
            Target: 'to_Attachments/@UI.LineItem',
        }

    // {
    //     $Type : 'UI.ReferenceFacet',
    //     Label : 'Administrative',
    //     ID    : 'Administrative',
    //     Target: '@UI.FieldGroup#Administrative',
    // },
    ],
    UI.FieldGroup #Header: {
        $Type: 'UI.FieldGroupType',
        Data : [{
            $Type: 'UI.DataField',
            Value: CustomerCode,
        },

        ],
    }
);

annotate PrePayment.PrepaymentPendingInvoices with @(UI.FieldGroup #General: {
    $Type: 'UI.FieldGroupType',
    Data : [

        {
            $Type: 'UI.DataField',
            Value: Amount,
        },

        {
            $Type: 'UI.DataField',
            Value: PaymentBaseDate,
        },

        {
            $Type: 'UI.DataField',
            Value: TaxRate,
        },
    ],
});

annotate PrePayment.PrepaymentPendingInvoices with @(UI.FieldGroup #Details: {
    $Type: 'UI.FieldGroupType',
    Data : [
        {
            $Type: 'UI.DataField',
            Value: CustomerCode,
        },
        {
            $Type: 'UI.DataField',
            Value: GoodSpecies,
        },
        {
            $Type: 'UI.DataField',
            Value: Amount,
        },
        {
            $Type: 'UI.DataField',
            Value: TaxRate,
        },
        {
            $Type: 'UI.DataField',
            Value: ReasonForApplication,
        },
        {
            $Type: 'UI.DataField',
            Value: PaymentBaseDate,
        },

        {
            $Type: 'UI.DataField',
            Value: InvoiceNumber,
        },

    ],
});

annotate PrePayment.Attachments with @(UI: {LineItem: [
    {Value: Content},
    {Value: FileName},
    {Value: MediaType},
    {Value: createdAt},
    {Value: createdBy}
]});
