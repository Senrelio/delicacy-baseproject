package delicacy.servlet;


public class TableProcessors extends AbstractProcessores{


	public void initTables() {
		DAOS.put("SystemDictionary", "fix.db.handler.SystemDictionaryHandler");
		DAOS.put("SysEmployee", "fix.db.handler.SysEmployeeHandler");
		DAOS.put("SysDepartment", "fix.db.handler.SysDepartmentHandler");
		DAOS.put("SysBusinessAttachment", "fix.db.handler.SysBusinessAttachmentHandler");
		DAOS.put("SysAttachment", "fix.db.handler.SysAttachmentHandler");
		DAOS.put("MainFunction", "fix.db.handler.MainFunctionHandler");
		DAOS.put("FinRefund", "fix.db.handler.FinRefundHandler");
		DAOS.put("FinRefundReceivableProduct", "fix.db.handler.FinRefundReceivableProductHandler");
		DAOS.put("FinReceivable", "fix.db.handler.FinReceivableHandler");
		DAOS.put("FinReceivableProduct", "fix.db.handler.FinReceivableProductHandler");
		DAOS.put("FinReceivableChange", "fix.db.handler.FinReceivableChangeHandler");
		DAOS.put("FinReceivableChangeOrderProduct", "fix.db.handler.FinReceivableChangeOrderProductHandler");
		DAOS.put("FinReceipt", "fix.db.handler.FinReceiptHandler");
		DAOS.put("FinReceiptReceivablesProduct", "fix.db.handler.FinReceiptReceivablesProductHandler");
		DAOS.put("FinReceiptPlan", "fix.db.handler.FinReceiptPlanHandler");
		DAOS.put("FinInvoice", "fix.db.handler.FinInvoiceHandler");
		DAOS.put("FinInvoiceReceivable", "fix.db.handler.FinInvoiceReceivableHandler");
		DAOS.put("CrmSaleStage", "fix.db.handler.CrmSaleStageHandler");
		DAOS.put("CrmQuotation", "fix.db.handler.CrmQuotationHandler");
		DAOS.put("CrmQuotationProduct", "fix.db.handler.CrmQuotationProductHandler");
		DAOS.put("CrmProdutc", "fix.db.handler.CrmProdutcHandler");
		DAOS.put("CrmPriceList", "fix.db.handler.CrmPriceListHandler");
		DAOS.put("CrmPriceListProduct", "fix.db.handler.CrmPriceListProductHandler");
		DAOS.put("CrmOrder", "fix.db.handler.CrmOrderHandler");
		DAOS.put("CrmOrderProduct", "fix.db.handler.CrmOrderProductHandler");
		DAOS.put("CrmOpportunityStage", "fix.db.handler.CrmOpportunityStageHandler");
		DAOS.put("CrmOpportunityProduct", "fix.db.handler.CrmOpportunityProductHandler");
		DAOS.put("CrmOpportunityContactsRole", "fix.db.handler.CrmOpportunityContactsRoleHandler");
		DAOS.put("CrmOpportunity", "fix.db.handler.CrmOpportunityHandler");
		DAOS.put("CrmMarketingEvent", "fix.db.handler.CrmMarketingEventHandler");
		DAOS.put("CrmLead", "fix.db.handler.CrmLeadHandler");
		DAOS.put("CrmFollowupLog", "fix.db.handler.CrmFollowupLogHandler");
		DAOS.put("CrmDeliveryProduct", "fix.db.handler.CrmDeliveryProductHandler");
		DAOS.put("CrmDelivery", "fix.db.handler.CrmDeliveryHandler");
		DAOS.put("CrmCustomer", "fix.db.handler.CrmCustomerHandler");
		DAOS.put("CrmContractsOrder", "fix.db.handler.CrmContractsOrderHandler");
		DAOS.put("CrmContract", "fix.db.handler.CrmContractHandler");
		DAOS.put("CrmContactsCustomer", "fix.db.handler.CrmContactsCustomerHandler");
		DAOS.put("CrmContact", "fix.db.handler.CrmContactHandler");
		DAOS.put("ColumnDomain", "fix.db.handler.ColumnDomainHandler");
		DAOS.put("Area", "fix.db.handler.AreaHandler");

	}

}

