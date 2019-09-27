package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinReceipt extends GenericBase implements BaseFactory<BaseFinReceipt>, Comparable<BaseFinReceipt> 
{


	public static BaseFinReceipt newInstance(){
		return new BaseFinReceipt();
	}

	@Override
	public BaseFinReceipt make(){
		BaseFinReceipt b = new BaseFinReceipt();
		return b;
	}

	public final static java.lang.String CS_RECEIPT_ID = "receipt_id" ;
	public final static java.lang.String CS_RECEIPT_CODE = "receipt_code" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_STATUS_RECEIPT = "status_receipt" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_DATE_RECEIPTED = "date_receipted" ;
	public final static java.lang.String CS_DATE_VALIDATION = "date_validation" ;
	public final static java.lang.String CS_DATE_INVALIDATION = "date_invalidation" ;
	public final static java.lang.String CS_REASON_INVALIDATION = "reason_invalidation" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_PAYMENT_METHOD_ACCEPTED = "payment_method_accepted" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;

	public final static java.lang.String ALL_CAPTIONS = "收款单编码,收款单编号,客户编码,维护人员工编码,收款单状态,所属部门,收款日期,生效日期,作废日期,作废原因,创建人编码,客户付款方式,创建日期,修改人编码,修改日期";

	public java.lang.Integer getReceiptId() {
		return this.__receipt_id;
	}

	public void setReceiptId( java.lang.Integer value ) {
		this.__receipt_id = value;
	}

	public java.lang.String getReceiptCode() {
		return this.__receipt_code;
	}

	public void setReceiptCode( java.lang.String value ) {
		this.__receipt_code = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.Integer getStatusReceipt() {
		return this.__status_receipt;
	}

	public void setStatusReceipt( java.lang.Integer value ) {
		this.__status_receipt = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.util.Date getDateReceipted() {
		return this.__date_receipted;
	}

	public void setDateReceipted( java.util.Date value ) {
		this.__date_receipted = value;
	}

	public java.util.Date getDateValidation() {
		return this.__date_validation;
	}

	public void setDateValidation( java.util.Date value ) {
		this.__date_validation = value;
	}

	public java.util.Date getDateInvalidation() {
		return this.__date_invalidation;
	}

	public void setDateInvalidation( java.util.Date value ) {
		this.__date_invalidation = value;
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

	public java.lang.Integer getPaymentMethodAccepted() {
		return this.__payment_method_accepted;
	}

	public void setPaymentMethodAccepted( java.lang.Integer value ) {
		this.__payment_method_accepted = value;
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

	public void cloneCopy(BaseFinReceipt __bean){
		__bean.setReceiptId(getReceiptId());
		__bean.setReceiptCode(getReceiptCode());
		__bean.setCustomerId(getCustomerId());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setStatusReceipt(getStatusReceipt());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setDateReceipted(getDateReceipted());
		__bean.setDateValidation(getDateValidation());
		__bean.setDateInvalidation(getDateInvalidation());
		__bean.setReasonInvalidation(getReasonInvalidation());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setPaymentMethodAccepted(getPaymentMethodAccepted());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getReceiptId() == null ? "" : getReceiptId());
		sb.append(",");
		sb.append(getReceiptCode() == null ? "" : getReceiptCode());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getStatusReceipt() == null ? "" : getStatusReceipt());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getDateReceipted() == null ? "" : sdf.format(getDateReceipted()));
		sb.append(",");
		sb.append(getDateValidation() == null ? "" : sdf.format(getDateValidation()));
		sb.append(",");
		sb.append(getDateInvalidation() == null ? "" : sdf.format(getDateInvalidation()));
		sb.append(",");
		sb.append(getReasonInvalidation() == null ? "" : getReasonInvalidation());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getPaymentMethodAccepted() == null ? "" : getPaymentMethodAccepted());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinReceipt o) {
		return __receipt_id == null ? -1 : __receipt_id.compareTo(o.getReceiptId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__receipt_id);
		hash = 97 * hash + Objects.hashCode(this.__receipt_code);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__status_receipt);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__date_receipted);
		hash = 97 * hash + Objects.hashCode(this.__date_validation);
		hash = 97 * hash + Objects.hashCode(this.__date_invalidation);
		hash = 97 * hash + Objects.hashCode(this.__reason_invalidation);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__payment_method_accepted);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinReceipt o = (BaseFinReceipt)obj;
		if(!Objects.equals(this.__receipt_id, o.getReceiptId())) return false;
		if(!Objects.equals(this.__receipt_code, o.getReceiptCode())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__status_receipt, o.getStatusReceipt())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__date_receipted, o.getDateReceipted())) return false;
		if(!Objects.equals(this.__date_validation, o.getDateValidation())) return false;
		if(!Objects.equals(this.__date_invalidation, o.getDateInvalidation())) return false;
		if(!Objects.equals(this.__reason_invalidation, o.getReasonInvalidation())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__payment_method_accepted, o.getPaymentMethodAccepted())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getReceiptId() != null) sb.append(__wrapNumber(count++, "receiptId", getReceiptId()));
		if(getReceiptCode() != null) sb.append(__wrapString(count++, "receiptCode", getReceiptCode()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getStatusReceipt() != null) sb.append(__wrapNumber(count++, "statusReceipt", getStatusReceipt()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getDateReceipted() != null) sb.append(__wrapDate(count++, "dateReceipted", getDateReceipted()));
		if(getDateValidation() != null) sb.append(__wrapDate(count++, "dateValidation", getDateValidation()));
		if(getDateInvalidation() != null) sb.append(__wrapDate(count++, "dateInvalidation", getDateInvalidation()));
		if(getReasonInvalidation() != null) sb.append(__wrapNumber(count++, "reasonInvalidation", getReasonInvalidation()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getPaymentMethodAccepted() != null) sb.append(__wrapNumber(count++, "paymentMethodAccepted", getPaymentMethodAccepted()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getReceiptId() != null) res.put("receiptId", getReceiptId());
		if(getReceiptCode() != null) res.put("receiptCode", getReceiptCode());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getStatusReceipt() != null) res.put("statusReceipt", getStatusReceipt());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getDateReceipted() != null) res.put("dateReceipted", getDateReceipted());
		if(getDateValidation() != null) res.put("dateValidation", getDateValidation());
		if(getDateInvalidation() != null) res.put("dateInvalidation", getDateInvalidation());
		if(getReasonInvalidation() != null) res.put("reasonInvalidation", getReasonInvalidation());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getPaymentMethodAccepted() != null) res.put("paymentMethodAccepted", getPaymentMethodAccepted());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("receiptId")) != null) setReceiptId(__getInt(val)); 
		if((val = values.get("receiptCode")) != null) setReceiptCode(__getString(val));
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("statusReceipt")) != null) setStatusReceipt(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("dateReceipted")) != null) setDateReceipted(__getDate(val)); 
		if((val = values.get("dateValidation")) != null) setDateValidation(__getDate(val)); 
		if((val = values.get("dateInvalidation")) != null) setDateInvalidation(__getDate(val)); 
		if((val = values.get("reasonInvalidation")) != null) setReasonInvalidation(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("paymentMethodAccepted")) != null) setPaymentMethodAccepted(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
	}

	protected java.lang.Integer  __receipt_id ;
	protected java.lang.String  __receipt_code ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.Integer  __status_receipt ;
	protected java.lang.Integer  __department_id ;
	protected java.util.Date  __date_receipted ;
	protected java.util.Date  __date_validation ;
	protected java.util.Date  __date_invalidation ;
	protected java.lang.Integer  __reason_invalidation ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.lang.Integer  __payment_method_accepted ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
}
