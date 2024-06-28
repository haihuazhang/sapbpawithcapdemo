namespace zzdemo;

using {
    cuid,
    Currency,
    managed,
    User
} from '@sap/cds/common';

// @fiori.draft.enabled
entity T_PrepaymentPendingInvoice : managed, cuid {
    @title: '{i18n>InvoiceNumber}' InvoiceNumber               : String(15) NOT null; //伝票番号
    @title: '{i18n>NormalCancelType}' NormalCancelType         : String(1) NOT null; //通常/取消区分
    @title: '{i18n>RelatedInvoiceNumber}' RelatedInvoiceNumber : String(15); //関連伝票番号
    @title: '{i18n>CustomerCode}' CustomerCode                 : String(10) NOT null; //取引先コード
    @title: '{i18n>TemporaryOrHoldType}' TemporaryOrHoldType   : String(1) NOT null; //仮払い/保留区分
    @title: '{i18n>GoodSpecies}' GoodSpecies                   : String(3) NOT null; //物品種
    @title: '{i18n>Amount}' Amount                             : Decimal(15, 2) NOT null; //金額
    @title: '{i18n>Currency}' Currency                         : Currency NOT null; //通貨
    @title: '{i18n>TaxType}' TaxType                           : String(1) NOT null; //税区分
    @title: '{i18n>TaxRate}' TaxRate                           : String(2); //税率
    @title: '{i18n>ReasonForApplication}' ReasonForApplication : String(300) NOT null; //申請理由
    @title: '{i18n>PaymentBaseDate}' PaymentBaseDate           : Date NOT null; //支払基準日
    @title: '{i18n>ReasonFoRejection}' ReasonFoRejection       : String(300); //却下理由
    @title: '{i18n>WorkflowID}' WorkflowID                     : String(36); //ワークフローID
    @title: '{i18n>StateOfApplication}' StateOfApplication     : String(1); //状態（WFの申請状態）
    @title: '{i18n>IssuingDepartmentID}' IssuingDepartmentID   : String(4); //発行課
    @title: '{i18n>DivisionCode}' DivisionCode                 : String(4); //本部コード
    @title: '{i18n>DepartmentCode}' DepartmentCode             : String(4); //部署コード
    @title: '{i18n>GroupCode}' GroupCode                       : String(4); //グループコード
    @title: '{i18n>StartDateTime}' StartDateTime               : Timestamp; //起票日付時刻
    @title: '{i18n>StartUserID}' StartUserID                   : User; //起票ユーザID
    //  @title: '{i18n>// StartUserName    }'   // StartUserName        : String(10);
    @title: '{i18n>AuthorizedDateTime}' AuthorizedDateTime     : Timestamp; //承認日付時刻
    @title: '{i18n>AuthorizedUserID}' AuthorizedUserID         : User; //承認ユーザID
    //  @title: '{i18n>// AuthorizedUserNam}'   // AuthorizedUserName   : String(10);
    @title: '{i18n>Approver1}' Approver1                       : User; //第一承認者ID
    @title: '{i18n>Approver2}' Approver2                       : User; //第二承認者ID
    @title: '{i18n>Approver3}' Approver3                       : User; //第三承認者ID
    @title: '{i18n>Approver4}' Approver4                       : User; //第四承認者ID
    @title: '{i18n>Approver5}' Approver5                       : User; //第五承認者ID
    @title: '{i18n>InterfaceFlag}' InterfaceFlag               : UInt8; //インターフェースフラグ
    @title: '{i18n>InterfaceDateTime}' InterfaceDateTime       : Timestamp; //インターフェース作成日付時刻
    @title: '{i18n>DeleteFlag}' DeleteFlag                     : UInt8; //削除フラグ
    @title: '{i18n>InitCreationUUID}' InitCreationUUID         : UUID;
    to_Attachments                                             : Composition of many T_Attachemt
                                                                     on to_Attachments.Invoice = $self;
    to_Customer                                                : Association to one T_Customer
                                                                     on $self.CustomerCode = to_Customer.CustomerCode;

    to_TemporaryOrHoldType                                     : Association to one M_CommonUtility
                                                                     on $self.TemporaryOrHoldType = to_TemporaryOrHoldType.Code;
    to_GoodSpecies                                             : Association to one M_CommonUtility
                                                                     on $self.GoodSpecies = to_GoodSpecies.Code;
    to_TaxType                                                 : Association to one M_CommonUtility
                                                                     on $self.TaxType = to_TaxType.Code;
    to_ApprovalStatus                                          : Association to one M_CommonUtility
                                                                     on $self.StateOfApplication = to_ApprovalStatus.Code;
    to_NormalCancelType                                        : Association to one M_CommonUtility
                                                                     on $self.StateOfApplication = to_NormalCancelType.Code;
}

entity T_Attachemt : cuid, managed {
    MediaType : String       @Core.IsMediaType;
    FileName  : String(300);
    URL       : String       @Core.IsURL                 @Core.MediaType                  : MediaType  @Core.ContentDisposition.Filename: FileName;
    Content   : LargeBinary  @Core.MediaType: MediaType  @Core.ContentDisposition.Filename: FileName;
    Invoice   : Association to T_PrepaymentPendingInvoice;
}

@cds.search: {
    CustomerCode,
    CustomerName
}
entity T_Customer {
        @title: '{i18n>CustomerCode}'
    key CustomerCode : String(10);

        @title: '{i18n>CustomerName}'
        CustomerName : String(300);
}


entity M_CommonUtility : managed {
    @title: '{i18n>ClassCode}' key ClassCode                                        : String(2);
    @title: '{i18n>Code}' key      Code                                             : String(3);
                                   @title: '{i18n>ClassName}' ClassName             : localized String(10);
                                   @title: '{i18n>CodeDescription}' CodeDescription : localized String(100);
                                   @title: '{i18n>CodeValue}' CodeValue             : String(100);
                                   @title: '{i18n>CodeValue1}' CodeValue1           : String(100);
                                   @title: '{i18n>CodeValue2}' CodeValue2           : String(100);
                                   @title: '{i18n>DeleteFlag}' DeleteFlag           : String(1);
}


@title: '{i18n>Approver1}'
type Approver1 : User;

@title: '{i18n>Approver2}'
type Approver2 : User;

@title: '{i18n>Approver3}'
type Approver3 : User;

@title: '{i18n>Approver4}'
type Approver4 : User;

@title: '{i18n>Approver5}'
type Approver5 : User;
