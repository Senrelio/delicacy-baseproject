package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmOrder extends GenericBase implements BaseFactory<BaseCrmOrder>, Comparable<BaseCrmOrder> 
{


	public static BaseCrmOrder newInstance(){
		return new BaseCrmOrder();
	}

	@Override
	public BaseCrmOrder make(){
		BaseCrmOrder b = new BaseCrmOrder();
		return b;
	}

	public final static java.lang.String CS_ORDER_ID = "order_id" ;
	public final static java.lang.String CS_ORDER_CODE = "order_code" ;
	public final static java.lang.String CS_ORDER_RETURN_CODE = "order_return_code" ;
	public final static java.lang.String CS_ORDER_TYPE = "order_type" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_CUSTOMER_NAME = "customer_name" ;
	public final static java.lang.String CS_CONTRACT_ID = "contract_id" ;
	public final static java.lang.String CS_OPPORTUNITY_ID = "opportunity_id" ;
	public final static java.lang.String CS_STATUS_ORDER = "status_order" ;
	public final static java.lang.String CS_PRICE_LIST_ID = "price_list_id" ;
	public final static java.lang.String CS_CONTACT_ID = "contact_id" ;
	public final static java.lang.String CS_STATUS_ORDER_RETURN = "status_order_return" ;
	public final static java.lang.String CS_SUM_ACTUAL = "sum_actual" ;
	public final static java.lang.String CS_SUM_INITIAL = "sum_initial" ;
	public final static java.lang.String CS_DATE_VALIDATION = "date_validation" ;
	public final static java.lang.String CS_CONTACT_MOBILE = "contact_mobile" ;
	public final static java.lang.String CS_ADDRESS_DELIVERY = "address_delivery" ;
	public final static java.lang.String CS_QUOTATION_ID = "quotation_id" ;
	public final static java.lang.String CS_REASON_INVALIDATION = "reason_invalidation" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_DATE_ORDER_PLACED = "date_order_placed" ;
	public final static java.lang.String CS_SUM_TOTAL_LISTED = "sum_total_listed" ;
	public final static java.lang.String CS_AMOUNT_TOTAL_DISCOUNT = "amount_total_discount" ;
	public final static java.lang.String CS_ORDER_VERSION = "order_version" ;
	public final static java.lang.String CS_DELIVERYDATE = "deliveryDate" ;
	public final static java.lang.String CS_MEMO = "memo" ;
	public final static java.lang.String CS_CUSTOMITEM175__C = "customItem175__c" ;
	public final static java.lang.String CS_CUSTOMITEM176__C = "customItem176__c" ;
	public final static java.lang.String CS_CUSTOMITEM177__C = "customItem177__c" ;
	public final static java.lang.String CS_CUSTOMITEM178__C = "customItem178__c" ;

	public final static java.lang.String ALL_CAPTIONS = "订单编码,订单编号,退货单编号,订单类型,维护人员工编码,客户名称,合同编码,销售机会编码,订单状态,价格表编码,联系人编码,退货单状态,总金额,原始金额,生效日期,联系人手机,收货地址,报价单编码,作废理由,创建人编码,创建日期,修改人编码,最近修改日期,所属部门,是否被锁定,下单时间,原总价,总折扣额,订单版本,交货日期,备注,落地工厂,业务,类型,客户来源";

	public java.lang.Integer getOrderId() {
		return this.__order_id;
	}

	public void setOrderId( java.lang.Integer value ) {
		this.__order_id = value;
	}

	public java.lang.String getOrderCode() {
		return this.__order_code;
	}

	public void setOrderCode( java.lang.String value ) {
		this.__order_code = value;
	}

	public java.lang.String getOrderReturnCode() {
		return this.__order_return_code;
	}

	public void setOrderReturnCode( java.lang.String value ) {
		this.__order_return_code = value;
	}

	public java.lang.Integer getOrderType() {
		return this.__order_type;
	}

	public void setOrderType( java.lang.Integer value ) {
		this.__order_type = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.Integer getCustomerName() {
		return this.__customer_name;
	}

	public void setCustomerName( java.lang.Integer value ) {
		this.__customer_name = value;
	}

	public java.lang.Integer getContractId() {
		return this.__contract_id;
	}

	public void setContractId( java.lang.Integer value ) {
		this.__contract_id = value;
	}

	public java.lang.Integer getOpportunityId() {
		return this.__opportunity_id;
	}

	public void setOpportunityId( java.lang.Integer value ) {
		this.__opportunity_id = value;
	}

	public java.lang.Integer getStatusOrder() {
		return this.__status_order;
	}

	public void setStatusOrder( java.lang.Integer value ) {
		this.__status_order = value;
	}

	public java.lang.Integer getPriceListId() {
		return this.__price_list_id;
	}

	public void setPriceListId( java.lang.Integer value ) {
		this.__price_list_id = value;
	}

	public java.lang.Integer getContactId() {
		return this.__contact_id;
	}

	public void setContactId( java.lang.Integer value ) {
		this.__contact_id = value;
	}

	public java.lang.Integer getStatusOrderReturn() {
		return this.__status_order_return;
	}

	public void setStatusOrderReturn( java.lang.Integer value ) {
		this.__status_order_return = value;
	}

	public java.math.BigDecimal getSumActual() {
		return this.__sum_actual;
	}

	public void setSumActual( java.math.BigDecimal value ) {
		this.__sum_actual = value;
	}

	public java.math.BigDecimal getSumInitial() {
		return this.__sum_initial;
	}

	public void setSumInitial( java.math.BigDecimal value ) {
		this.__sum_initial = value;
	}

	public java.util.Date getDateValidation() {
		return this.__date_validation;
	}

	public void setDateValidation( java.util.Date value ) {
		this.__date_validation = value;
	}

	public java.lang.String getContactMobile() {
		return this.__contact_mobile;
	}

	public void setContactMobile( java.lang.String value ) {
		this.__contact_mobile = value;
	}

	public java.lang.String getAddressDelivery() {
		return this.__address_delivery;
	}

	public void setAddressDelivery( java.lang.String value ) {
		this.__address_delivery = value;
	}

	public java.lang.Integer getQuotationId() {
		return this.__quotation_id;
	}

	public void setQuotationId( java.lang.Integer value ) {
		this.__quotation_id = value;
	}

	public java.lang.Integer getReasonInvalidation() {
		return this.__reason_invalidation;
	}

	public void setReasonInvalidation( java.lang.Integer value ) {
		this.__reason_invalidation = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.Boolean getFlagLocked() {
		return this.__flag_locked;
	}

	public void setFlagLocked( java.lang.Boolean value ) {
		this.__flag_locked = value;
	}

	public java.util.Date getDateOrderPlaced() {
		return this.__date_order_placed;
	}

	public void setDateOrderPlaced( java.util.Date value ) {
		this.__date_order_placed = value;
	}

	public java.math.BigDecimal getSumTotalListed() {
		return this.__sum_total_listed;
	}

	public void setSumTotalListed( java.math.BigDecimal value ) {
		this.__sum_total_listed = value;
	}

	public java.math.BigDecimal getAmountTotalDiscount() {
		return this.__amount_total_discount;
	}

	public void setAmountTotalDiscount( java.math.BigDecimal value ) {
		this.__amount_total_discount = value;
	}

	public java.lang.Integer getOrderVersion() {
		return this.__order_version;
	}

	public void setOrderVersion( java.lang.Integer value ) {
		this.__order_version = value;
	}

	public java.util.Date getDeliverydate() {
		return this.__deliverydate;
	}

	public void setDeliverydate( java.util.Date value ) {
		this.__deliverydate = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public java.lang.Integer getCustomitem175_c() {
		return this.__customitem175__c;
	}

	public void setCustomitem175_c( java.lang.Integer value ) {
		this.__customitem175__c = value;
	}

	public java.lang.Integer getCustomitem176_c() {
		return this.__customitem176__c;
	}

	public void setCustomitem176_c( java.lang.Integer value ) {
		this.__customitem176__c = value;
	}

	public java.lang.Integer getCustomitem177_c() {
		return this.__customitem177__c;
	}

	public void setCustomitem177_c( java.lang.Integer value ) {
		this.__customitem177__c = value;
	}

	public java.lang.Integer getCustomitem178_c() {
		return this.__customitem178__c;
	}

	public void setCustomitem178_c( java.lang.Integer value ) {
		this.__customitem178__c = value;
	}

	public void cloneCopy(BaseCrmOrder __bean){
		__bean.setOrderId(getOrderId());
		__bean.setOrderCode(getOrderCode());
		__bean.setOrderReturnCode(getOrderReturnCode());
		__bean.setOrderType(getOrderType());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setCustomerName(getCustomerName());
		__bean.setContractId(getContractId());
		__bean.setOpportunityId(getOpportunityId());
		__bean.setStatusOrder(getStatusOrder());
		__bean.setPriceListId(getPriceListId());
		__bean.setContactId(getContactId());
		__bean.setStatusOrderReturn(getStatusOrderReturn());
		__bean.setSumActual(getSumActual());
		__bean.setSumInitial(getSumInitial());
		__bean.setDateValidation(getDateValidation());
		__bean.setContactMobile(getContactMobile());
		__bean.setAddressDelivery(getAddressDelivery());
		__bean.setQuotationId(getQuotationId());
		__bean.setReasonInvalidation(getReasonInvalidation());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setDateOrderPlaced(getDateOrderPlaced());
		__bean.setSumTotalListed(getSumTotalListed());
		__bean.setAmountTotalDiscount(getAmountTotalDiscount());
		__bean.setOrderVersion(getOrderVersion());
		__bean.setDeliverydate(getDeliverydate());
		__bean.setMemo(getMemo());
		__bean.setCustomitem175_c(getCustomitem175_c());
		__bean.setCustomitem176_c(getCustomitem176_c());
		__bean.setCustomitem177_c(getCustomitem177_c());
		__bean.setCustomitem178_c(getCustomitem178_c());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getOrderId() == null ? "" : getOrderId());
		sb.append(",");
		sb.append(getOrderCode() == null ? "" : getOrderCode());
		sb.append(",");
		sb.append(getOrderReturnCode() == null ? "" : getOrderReturnCode());
		sb.append(",");
		sb.append(getOrderType() == null ? "" : getOrderType());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getCustomerName() == null ? "" : getCustomerName());
		sb.append(",");
		sb.append(getContractId() == null ? "" : getContractId());
		sb.append(",");
		sb.append(getOpportunityId() == null ? "" : getOpportunityId());
		sb.append(",");
		sb.append(getStatusOrder() == null ? "" : getStatusOrder());
		sb.append(",");
		sb.append(getPriceListId() == null ? "" : getPriceListId());
		sb.append(",");
		sb.append(getContactId() == null ? "" : getContactId());
		sb.append(",");
		sb.append(getStatusOrderReturn() == null ? "" : getStatusOrderReturn());
		sb.append(",");
		sb.append(getSumActual() == null ? "" : getSumActual());
		sb.append(",");
		sb.append(getSumInitial() == null ? "" : getSumInitial());
		sb.append(",");
		sb.append(getDateValidation() == null ? "" : sdf.format(getDateValidation()));
		sb.append(",");
		sb.append(getContactMobile() == null ? "" : getContactMobile());
		sb.append(",");
		sb.append(getAddressDelivery() == null ? "" : getAddressDelivery());
		sb.append(",");
		sb.append(getQuotationId() == null ? "" : getQuotationId());
		sb.append(",");
		sb.append(getReasonInvalidation() == null ? "" : getReasonInvalidation());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		sb.append(",");
		sb.append(getDateOrderPlaced() == null ? "" : sdf.format(getDateOrderPlaced()));
		sb.append(",");
		sb.append(getSumTotalListed() == null ? "" : getSumTotalListed());
		sb.append(",");
		sb.append(getAmountTotalDiscount() == null ? "" : getAmountTotalDiscount());
		sb.append(",");
		sb.append(getOrderVersion() == null ? "" : getOrderVersion());
		sb.append(",");
		sb.append(getDeliverydate() == null ? "" : sdf.format(getDeliverydate()));
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		sb.append(",");
		sb.append(getCustomitem175_c() == null ? "" : getCustomitem175_c());
		sb.append(",");
		sb.append(getCustomitem176_c() == null ? "" : getCustomitem176_c());
		sb.append(",");
		sb.append(getCustomitem177_c() == null ? "" : getCustomitem177_c());
		sb.append(",");
		sb.append(getCustomitem178_c() == null ? "" : getCustomitem178_c());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmOrder o) {
		return __order_id == null ? -1 : __order_id.compareTo(o.getOrderId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		hash = 97 * hash + Objects.hashCode(this.__order_code);
		hash = 97 * hash + Objects.hashCode(this.__order_return_code);
		hash = 97 * hash + Objects.hashCode(this.__order_type);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__customer_name);
		hash = 97 * hash + Objects.hashCode(this.__contract_id);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_id);
		hash = 97 * hash + Objects.hashCode(this.__status_order);
		hash = 97 * hash + Objects.hashCode(this.__price_list_id);
		hash = 97 * hash + Objects.hashCode(this.__contact_id);
		hash = 97 * hash + Objects.hashCode(this.__status_order_return);
		hash = 97 * hash + Objects.hashCode(this.__sum_actual);
		hash = 97 * hash + Objects.hashCode(this.__sum_initial);
		hash = 97 * hash + Objects.hashCode(this.__date_validation);
		hash = 97 * hash + Objects.hashCode(this.__contact_mobile);
		hash = 97 * hash + Objects.hashCode(this.__address_delivery);
		hash = 97 * hash + Objects.hashCode(this.__quotation_id);
		hash = 97 * hash + Objects.hashCode(this.__reason_invalidation);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__date_order_placed);
		hash = 97 * hash + Objects.hashCode(this.__sum_total_listed);
		hash = 97 * hash + Objects.hashCode(this.__amount_total_discount);
		hash = 97 * hash + Objects.hashCode(this.__order_version);
		hash = 97 * hash + Objects.hashCode(this.__deliverydate);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		hash = 97 * hash + Objects.hashCode(this.__customitem175__c);
		hash = 97 * hash + Objects.hashCode(this.__customitem176__c);
		hash = 97 * hash + Objects.hashCode(this.__customitem177__c);
		hash = 97 * hash + Objects.hashCode(this.__customitem178__c);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmOrder o = (BaseCrmOrder)obj;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		if(!Objects.equals(this.__order_code, o.getOrderCode())) return false;
		if(!Objects.equals(this.__order_return_code, o.getOrderReturnCode())) return false;
		if(!Objects.equals(this.__order_type, o.getOrderType())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__customer_name, o.getCustomerName())) return false;
		if(!Objects.equals(this.__contract_id, o.getContractId())) return false;
		if(!Objects.equals(this.__opportunity_id, o.getOpportunityId())) return false;
		if(!Objects.equals(this.__status_order, o.getStatusOrder())) return false;
		if(!Objects.equals(this.__price_list_id, o.getPriceListId())) return false;
		if(!Objects.equals(this.__contact_id, o.getContactId())) return false;
		if(!Objects.equals(this.__status_order_return, o.getStatusOrderReturn())) return false;
		if(!Objects.equals(this.__sum_actual, o.getSumActual())) return false;
		if(!Objects.equals(this.__sum_initial, o.getSumInitial())) return false;
		if(!Objects.equals(this.__date_validation, o.getDateValidation())) return false;
		if(!Objects.equals(this.__contact_mobile, o.getContactMobile())) return false;
		if(!Objects.equals(this.__address_delivery, o.getAddressDelivery())) return false;
		if(!Objects.equals(this.__quotation_id, o.getQuotationId())) return false;
		if(!Objects.equals(this.__reason_invalidation, o.getReasonInvalidation())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__date_order_placed, o.getDateOrderPlaced())) return false;
		if(!Objects.equals(this.__sum_total_listed, o.getSumTotalListed())) return false;
		if(!Objects.equals(this.__amount_total_discount, o.getAmountTotalDiscount())) return false;
		if(!Objects.equals(this.__order_version, o.getOrderVersion())) return false;
		if(!Objects.equals(this.__deliverydate, o.getDeliverydate())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		if(!Objects.equals(this.__customitem175__c, o.getCustomitem175_c())) return false;
		if(!Objects.equals(this.__customitem176__c, o.getCustomitem176_c())) return false;
		if(!Objects.equals(this.__customitem177__c, o.getCustomitem177_c())) return false;
		if(!Objects.equals(this.__customitem178__c, o.getCustomitem178_c())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		if(getOrderCode() != null) sb.append(__wrapString(count++, "orderCode", getOrderCode()));
		if(getOrderReturnCode() != null) sb.append(__wrapString(count++, "orderReturnCode", getOrderReturnCode()));
		if(getOrderType() != null) sb.append(__wrapNumber(count++, "orderType", getOrderType()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getCustomerName() != null) sb.append(__wrapNumber(count++, "customerName", getCustomerName()));
		if(getContractId() != null) sb.append(__wrapNumber(count++, "contractId", getContractId()));
		if(getOpportunityId() != null) sb.append(__wrapNumber(count++, "opportunityId", getOpportunityId()));
		if(getStatusOrder() != null) sb.append(__wrapNumber(count++, "statusOrder", getStatusOrder()));
		if(getPriceListId() != null) sb.append(__wrapNumber(count++, "priceListId", getPriceListId()));
		if(getContactId() != null) sb.append(__wrapNumber(count++, "contactId", getContactId()));
		if(getStatusOrderReturn() != null) sb.append(__wrapNumber(count++, "statusOrderReturn", getStatusOrderReturn()));
		if(getSumActual() != null) sb.append(__wrapDecimal(count++, "sumActual", getSumActual()));
		if(getSumInitial() != null) sb.append(__wrapDecimal(count++, "sumInitial", getSumInitial()));
		if(getDateValidation() != null) sb.append(__wrapDate(count++, "dateValidation", getDateValidation()));
		if(getContactMobile() != null) sb.append(__wrapString(count++, "contactMobile", getContactMobile()));
		if(getAddressDelivery() != null) sb.append(__wrapString(count++, "addressDelivery", getAddressDelivery()));
		if(getQuotationId() != null) sb.append(__wrapNumber(count++, "quotationId", getQuotationId()));
		if(getReasonInvalidation() != null) sb.append(__wrapNumber(count++, "reasonInvalidation", getReasonInvalidation()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getDateOrderPlaced() != null) sb.append(__wrapDate(count++, "dateOrderPlaced", getDateOrderPlaced()));
		if(getSumTotalListed() != null) sb.append(__wrapDecimal(count++, "sumTotalListed", getSumTotalListed()));
		if(getAmountTotalDiscount() != null) sb.append(__wrapDecimal(count++, "amountTotalDiscount", getAmountTotalDiscount()));
		if(getOrderVersion() != null) sb.append(__wrapNumber(count++, "orderVersion", getOrderVersion()));
		if(getDeliverydate() != null) sb.append(__wrapDate(count++, "deliverydate", getDeliverydate()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		if(getCustomitem175_c() != null) sb.append(__wrapNumber(count++, "customitem175_c", getCustomitem175_c()));
		if(getCustomitem176_c() != null) sb.append(__wrapNumber(count++, "customitem176_c", getCustomitem176_c()));
		if(getCustomitem177_c() != null) sb.append(__wrapNumber(count++, "customitem177_c", getCustomitem177_c()));
		if(getCustomitem178_c() != null) sb.append(__wrapNumber(count++, "customitem178_c", getCustomitem178_c()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getOrderId() != null) res.put("orderId", getOrderId());
		if(getOrderCode() != null) res.put("orderCode", getOrderCode());
		if(getOrderReturnCode() != null) res.put("orderReturnCode", getOrderReturnCode());
		if(getOrderType() != null) res.put("orderType", getOrderType());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getCustomerName() != null) res.put("customerName", getCustomerName());
		if(getContractId() != null) res.put("contractId", getContractId());
		if(getOpportunityId() != null) res.put("opportunityId", getOpportunityId());
		if(getStatusOrder() != null) res.put("statusOrder", getStatusOrder());
		if(getPriceListId() != null) res.put("priceListId", getPriceListId());
		if(getContactId() != null) res.put("contactId", getContactId());
		if(getStatusOrderReturn() != null) res.put("statusOrderReturn", getStatusOrderReturn());
		if(getSumActual() != null) res.put("sumActual", getSumActual());
		if(getSumInitial() != null) res.put("sumInitial", getSumInitial());
		if(getDateValidation() != null) res.put("dateValidation", getDateValidation());
		if(getContactMobile() != null) res.put("contactMobile", getContactMobile());
		if(getAddressDelivery() != null) res.put("addressDelivery", getAddressDelivery());
		if(getQuotationId() != null) res.put("quotationId", getQuotationId());
		if(getReasonInvalidation() != null) res.put("reasonInvalidation", getReasonInvalidation());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getDateOrderPlaced() != null) res.put("dateOrderPlaced", getDateOrderPlaced());
		if(getSumTotalListed() != null) res.put("sumTotalListed", getSumTotalListed());
		if(getAmountTotalDiscount() != null) res.put("amountTotalDiscount", getAmountTotalDiscount());
		if(getOrderVersion() != null) res.put("orderVersion", getOrderVersion());
		if(getDeliverydate() != null) res.put("deliverydate", getDeliverydate());
		if(getMemo() != null) res.put("memo", getMemo());
		if(getCustomitem175_c() != null) res.put("customitem175_c", getCustomitem175_c());
		if(getCustomitem176_c() != null) res.put("customitem176_c", getCustomitem176_c());
		if(getCustomitem177_c() != null) res.put("customitem177_c", getCustomitem177_c());
		if(getCustomitem178_c() != null) res.put("customitem178_c", getCustomitem178_c());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
		if((val = values.get("orderCode")) != null) setOrderCode(__getString(val));
		if((val = values.get("orderReturnCode")) != null) setOrderReturnCode(__getString(val));
		if((val = values.get("orderType")) != null) setOrderType(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("customerName")) != null) setCustomerName(__getInt(val)); 
		if((val = values.get("contractId")) != null) setContractId(__getInt(val)); 
		if((val = values.get("opportunityId")) != null) setOpportunityId(__getInt(val)); 
		if((val = values.get("statusOrder")) != null) setStatusOrder(__getInt(val)); 
		if((val = values.get("priceListId")) != null) setPriceListId(__getInt(val)); 
		if((val = values.get("contactId")) != null) setContactId(__getInt(val)); 
		if((val = values.get("statusOrderReturn")) != null) setStatusOrderReturn(__getInt(val)); 
		if((val = values.get("sumActual")) != null) setSumActual(__getDecimal(val));  
		if((val = values.get("sumInitial")) != null) setSumInitial(__getDecimal(val));  
		if((val = values.get("dateValidation")) != null) setDateValidation(__getDate(val)); 
		if((val = values.get("contactMobile")) != null) setContactMobile(__getString(val));
		if((val = values.get("addressDelivery")) != null) setAddressDelivery(__getString(val));
		if((val = values.get("quotationId")) != null) setQuotationId(__getInt(val)); 
		if((val = values.get("reasonInvalidation")) != null) setReasonInvalidation(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("dateOrderPlaced")) != null) setDateOrderPlaced(__getDate(val)); 
		if((val = values.get("sumTotalListed")) != null) setSumTotalListed(__getDecimal(val));  
		if((val = values.get("amountTotalDiscount")) != null) setAmountTotalDiscount(__getDecimal(val));  
		if((val = values.get("orderVersion")) != null) setOrderVersion(__getInt(val)); 
		if((val = values.get("deliverydate")) != null) setDeliverydate(__getDate(val)); 
		if((val = values.get("memo")) != null) setMemo(__getString(val));
		if((val = values.get("customitem175_c")) != null) setCustomitem175_c(__getInt(val)); 
		if((val = values.get("customitem176_c")) != null) setCustomitem176_c(__getInt(val)); 
		if((val = values.get("customitem177_c")) != null) setCustomitem177_c(__getInt(val)); 
		if((val = values.get("customitem178_c")) != null) setCustomitem178_c(__getInt(val)); 
	}

	protected java.lang.Integer  __order_id ;
	protected java.lang.String  __order_code ;
	protected java.lang.String  __order_return_code ;
	protected java.lang.Integer  __order_type ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.Integer  __customer_name ;
	protected java.lang.Integer  __contract_id ;
	protected java.lang.Integer  __opportunity_id ;
	protected java.lang.Integer  __status_order ;
	protected java.lang.Integer  __price_list_id ;
	protected java.lang.Integer  __contact_id ;
	protected java.lang.Integer  __status_order_return ;
	protected java.math.BigDecimal  __sum_actual ;
	protected java.math.BigDecimal  __sum_initial ;
	protected java.util.Date  __date_validation ;
	protected java.lang.String  __contact_mobile ;
	protected java.lang.String  __address_delivery ;
	protected java.lang.Integer  __quotation_id ;
	protected java.lang.Integer  __reason_invalidation ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.util.Date  __date_order_placed ;
	protected java.math.BigDecimal  __sum_total_listed ;
	protected java.math.BigDecimal  __amount_total_discount ;
	protected java.lang.Integer  __order_version ;
	protected java.util.Date  __deliverydate ;
	protected java.lang.String  __memo ;
	protected java.lang.Integer  __customitem175__c ;
	protected java.lang.Integer  __customitem176__c ;
	protected java.lang.Integer  __customitem177__c ;
	protected java.lang.Integer  __customitem178__c ;
}
