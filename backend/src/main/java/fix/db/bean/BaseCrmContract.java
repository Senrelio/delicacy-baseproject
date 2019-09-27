package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmContract extends GenericBase implements BaseFactory<BaseCrmContract>, Comparable<BaseCrmContract> 
{


	public static BaseCrmContract newInstance(){
		return new BaseCrmContract();
	}

	@Override
	public BaseCrmContract make(){
		BaseCrmContract b = new BaseCrmContract();
		return b;
	}

	public final static java.lang.String CS_CONTRACT_ID = "contract_id" ;
	public final static java.lang.String CS_CONTRACT_CODE = "contract_code" ;
	public final static java.lang.String CS_CONTRACT_TITLE = "contract_title" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_OPPORTUNITY_ID = "opportunity_id" ;
	public final static java.lang.String CS_MARKETING_EVENT_ID = "marketing_event_id" ;
	public final static java.lang.String CS_SUM = "sum" ;
	public final static java.lang.String CS_STATUS_CONTRACT = "status_contract" ;
	public final static java.lang.String CS_DATE_START = "date_start" ;
	public final static java.lang.String CS_DATE_END = "date_end" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_DATE_SIGNED = "date_signed" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_CREATEDBY = "createdBy" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_CONTRACT_TYPE = "contract_type" ;
	public final static java.lang.String CS_PAYMENT_METHOD_ACCEPTED = "payment_method_accepted" ;
	public final static java.lang.String CS_CONTRACT_CONTENT = "contract_content" ;
	public final static java.lang.String CS_CUSTOMER_SIGNER_NAME = "customer_signer_name" ;
	public final static java.lang.String CS_EMPLOYEE_ID_SIGNER = "employee_id_signer" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "合同编码,合同编号,合同标题,客户编码,销售机会编码,所属市场活动编码,总金额,合同状态,开始日期,结束日期,维护人员工编码,签约日期,创建日期,创建人,最近修改日,修改人编码,所属部门,是否被锁定,合同类型,付款方式,合同正文,客户方签约人姓名,我方签约人员工编码,备注";

	public java.lang.Integer getContractId() {
		return this.__contract_id;
	}

	public void setContractId( java.lang.Integer value ) {
		this.__contract_id = value;
	}

	public java.lang.String getContractCode() {
		return this.__contract_code;
	}

	public void setContractCode( java.lang.String value ) {
		this.__contract_code = value;
	}

	public java.lang.String getContractTitle() {
		return this.__contract_title;
	}

	public void setContractTitle( java.lang.String value ) {
		this.__contract_title = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.Integer getOpportunityId() {
		return this.__opportunity_id;
	}

	public void setOpportunityId( java.lang.Integer value ) {
		this.__opportunity_id = value;
	}

	public java.lang.Integer getMarketingEventId() {
		return this.__marketing_event_id;
	}

	public void setMarketingEventId( java.lang.Integer value ) {
		this.__marketing_event_id = value;
	}

	public java.math.BigDecimal getSum() {
		return this.__sum;
	}

	public void setSum( java.math.BigDecimal value ) {
		this.__sum = value;
	}

	public java.lang.Integer getStatusContract() {
		return this.__status_contract;
	}

	public void setStatusContract( java.lang.Integer value ) {
		this.__status_contract = value;
	}

	public java.util.Date getDateStart() {
		return this.__date_start;
	}

	public void setDateStart( java.util.Date value ) {
		this.__date_start = value;
	}

	public java.util.Date getDateEnd() {
		return this.__date_end;
	}

	public void setDateEnd( java.util.Date value ) {
		this.__date_end = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.util.Date getDateSigned() {
		return this.__date_signed;
	}

	public void setDateSigned( java.util.Date value ) {
		this.__date_signed = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.lang.Integer getCreatedby() {
		return this.__createdby;
	}

	public void setCreatedby( java.lang.Integer value ) {
		this.__createdby = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
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

	public java.lang.Integer getContractType() {
		return this.__contract_type;
	}

	public void setContractType( java.lang.Integer value ) {
		this.__contract_type = value;
	}

	public java.lang.Integer getPaymentMethodAccepted() {
		return this.__payment_method_accepted;
	}

	public void setPaymentMethodAccepted( java.lang.Integer value ) {
		this.__payment_method_accepted = value;
	}

	public java.lang.String getContractContent() {
		return this.__contract_content;
	}

	public void setContractContent( java.lang.String value ) {
		this.__contract_content = value;
	}

	public java.lang.String getCustomerSignerName() {
		return this.__customer_signer_name;
	}

	public void setCustomerSignerName( java.lang.String value ) {
		this.__customer_signer_name = value;
	}

	public java.lang.Integer getEmployeeIdSigner() {
		return this.__employee_id_signer;
	}

	public void setEmployeeIdSigner( java.lang.Integer value ) {
		this.__employee_id_signer = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public void cloneCopy(BaseCrmContract __bean){
		__bean.setContractId(getContractId());
		__bean.setContractCode(getContractCode());
		__bean.setContractTitle(getContractTitle());
		__bean.setCustomerId(getCustomerId());
		__bean.setOpportunityId(getOpportunityId());
		__bean.setMarketingEventId(getMarketingEventId());
		__bean.setSum(getSum());
		__bean.setStatusContract(getStatusContract());
		__bean.setDateStart(getDateStart());
		__bean.setDateEnd(getDateEnd());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setDateSigned(getDateSigned());
		__bean.setDateCreated(getDateCreated());
		__bean.setCreatedby(getCreatedby());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setContractType(getContractType());
		__bean.setPaymentMethodAccepted(getPaymentMethodAccepted());
		__bean.setContractContent(getContractContent());
		__bean.setCustomerSignerName(getCustomerSignerName());
		__bean.setEmployeeIdSigner(getEmployeeIdSigner());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getContractId() == null ? "" : getContractId());
		sb.append(",");
		sb.append(getContractCode() == null ? "" : getContractCode());
		sb.append(",");
		sb.append(getContractTitle() == null ? "" : getContractTitle());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getOpportunityId() == null ? "" : getOpportunityId());
		sb.append(",");
		sb.append(getMarketingEventId() == null ? "" : getMarketingEventId());
		sb.append(",");
		sb.append(getSum() == null ? "" : getSum());
		sb.append(",");
		sb.append(getStatusContract() == null ? "" : getStatusContract());
		sb.append(",");
		sb.append(getDateStart() == null ? "" : sdf.format(getDateStart()));
		sb.append(",");
		sb.append(getDateEnd() == null ? "" : sdf.format(getDateEnd()));
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getDateSigned() == null ? "" : sdf.format(getDateSigned()));
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getCreatedby() == null ? "" : getCreatedby());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		sb.append(",");
		sb.append(getContractType() == null ? "" : getContractType());
		sb.append(",");
		sb.append(getPaymentMethodAccepted() == null ? "" : getPaymentMethodAccepted());
		sb.append(",");
		sb.append(getContractContent() == null ? "" : getContractContent());
		sb.append(",");
		sb.append(getCustomerSignerName() == null ? "" : getCustomerSignerName());
		sb.append(",");
		sb.append(getEmployeeIdSigner() == null ? "" : getEmployeeIdSigner());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmContract o) {
		return __contract_id == null ? -1 : __contract_id.compareTo(o.getContractId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__contract_id);
		hash = 97 * hash + Objects.hashCode(this.__contract_code);
		hash = 97 * hash + Objects.hashCode(this.__contract_title);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_id);
		hash = 97 * hash + Objects.hashCode(this.__marketing_event_id);
		hash = 97 * hash + Objects.hashCode(this.__sum);
		hash = 97 * hash + Objects.hashCode(this.__status_contract);
		hash = 97 * hash + Objects.hashCode(this.__date_start);
		hash = 97 * hash + Objects.hashCode(this.__date_end);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__date_signed);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__createdby);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__contract_type);
		hash = 97 * hash + Objects.hashCode(this.__payment_method_accepted);
		hash = 97 * hash + Objects.hashCode(this.__contract_content);
		hash = 97 * hash + Objects.hashCode(this.__customer_signer_name);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_signer);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmContract o = (BaseCrmContract)obj;
		if(!Objects.equals(this.__contract_id, o.getContractId())) return false;
		if(!Objects.equals(this.__contract_code, o.getContractCode())) return false;
		if(!Objects.equals(this.__contract_title, o.getContractTitle())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__opportunity_id, o.getOpportunityId())) return false;
		if(!Objects.equals(this.__marketing_event_id, o.getMarketingEventId())) return false;
		if(!Objects.equals(this.__sum, o.getSum())) return false;
		if(!Objects.equals(this.__status_contract, o.getStatusContract())) return false;
		if(!Objects.equals(this.__date_start, o.getDateStart())) return false;
		if(!Objects.equals(this.__date_end, o.getDateEnd())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__date_signed, o.getDateSigned())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__createdby, o.getCreatedby())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__contract_type, o.getContractType())) return false;
		if(!Objects.equals(this.__payment_method_accepted, o.getPaymentMethodAccepted())) return false;
		if(!Objects.equals(this.__contract_content, o.getContractContent())) return false;
		if(!Objects.equals(this.__customer_signer_name, o.getCustomerSignerName())) return false;
		if(!Objects.equals(this.__employee_id_signer, o.getEmployeeIdSigner())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getContractId() != null) sb.append(__wrapNumber(count++, "contractId", getContractId()));
		if(getContractCode() != null) sb.append(__wrapString(count++, "contractCode", getContractCode()));
		if(getContractTitle() != null) sb.append(__wrapString(count++, "contractTitle", getContractTitle()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getOpportunityId() != null) sb.append(__wrapNumber(count++, "opportunityId", getOpportunityId()));
		if(getMarketingEventId() != null) sb.append(__wrapNumber(count++, "marketingEventId", getMarketingEventId()));
		if(getSum() != null) sb.append(__wrapDecimal(count++, "sum", getSum()));
		if(getStatusContract() != null) sb.append(__wrapNumber(count++, "statusContract", getStatusContract()));
		if(getDateStart() != null) sb.append(__wrapDate(count++, "dateStart", getDateStart()));
		if(getDateEnd() != null) sb.append(__wrapDate(count++, "dateEnd", getDateEnd()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getDateSigned() != null) sb.append(__wrapDate(count++, "dateSigned", getDateSigned()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getCreatedby() != null) sb.append(__wrapNumber(count++, "createdby", getCreatedby()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getContractType() != null) sb.append(__wrapNumber(count++, "contractType", getContractType()));
		if(getPaymentMethodAccepted() != null) sb.append(__wrapNumber(count++, "paymentMethodAccepted", getPaymentMethodAccepted()));
		if(getContractContent() != null) sb.append(__wrapString(count++, "contractContent", getContractContent()));
		if(getCustomerSignerName() != null) sb.append(__wrapString(count++, "customerSignerName", getCustomerSignerName()));
		if(getEmployeeIdSigner() != null) sb.append(__wrapNumber(count++, "employeeIdSigner", getEmployeeIdSigner()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getContractId() != null) res.put("contractId", getContractId());
		if(getContractCode() != null) res.put("contractCode", getContractCode());
		if(getContractTitle() != null) res.put("contractTitle", getContractTitle());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getOpportunityId() != null) res.put("opportunityId", getOpportunityId());
		if(getMarketingEventId() != null) res.put("marketingEventId", getMarketingEventId());
		if(getSum() != null) res.put("sum", getSum());
		if(getStatusContract() != null) res.put("statusContract", getStatusContract());
		if(getDateStart() != null) res.put("dateStart", getDateStart());
		if(getDateEnd() != null) res.put("dateEnd", getDateEnd());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getDateSigned() != null) res.put("dateSigned", getDateSigned());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getCreatedby() != null) res.put("createdby", getCreatedby());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getContractType() != null) res.put("contractType", getContractType());
		if(getPaymentMethodAccepted() != null) res.put("paymentMethodAccepted", getPaymentMethodAccepted());
		if(getContractContent() != null) res.put("contractContent", getContractContent());
		if(getCustomerSignerName() != null) res.put("customerSignerName", getCustomerSignerName());
		if(getEmployeeIdSigner() != null) res.put("employeeIdSigner", getEmployeeIdSigner());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("contractId")) != null) setContractId(__getInt(val)); 
		if((val = values.get("contractCode")) != null) setContractCode(__getString(val));
		if((val = values.get("contractTitle")) != null) setContractTitle(__getString(val));
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("opportunityId")) != null) setOpportunityId(__getInt(val)); 
		if((val = values.get("marketingEventId")) != null) setMarketingEventId(__getInt(val)); 
		if((val = values.get("sum")) != null) setSum(__getDecimal(val));  
		if((val = values.get("statusContract")) != null) setStatusContract(__getInt(val)); 
		if((val = values.get("dateStart")) != null) setDateStart(__getDate(val)); 
		if((val = values.get("dateEnd")) != null) setDateEnd(__getDate(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("dateSigned")) != null) setDateSigned(__getDate(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("createdby")) != null) setCreatedby(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("contractType")) != null) setContractType(__getInt(val)); 
		if((val = values.get("paymentMethodAccepted")) != null) setPaymentMethodAccepted(__getInt(val)); 
		if((val = values.get("contractContent")) != null) setContractContent(__getString(val));
		if((val = values.get("customerSignerName")) != null) setCustomerSignerName(__getString(val));
		if((val = values.get("employeeIdSigner")) != null) setEmployeeIdSigner(__getInt(val)); 
		if((val = values.get("memo")) != null) setMemo(__getString(val));
	}

	protected java.lang.Integer  __contract_id ;
	protected java.lang.String  __contract_code ;
	protected java.lang.String  __contract_title ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.Integer  __opportunity_id ;
	protected java.lang.Integer  __marketing_event_id ;
	protected java.math.BigDecimal  __sum ;
	protected java.lang.Integer  __status_contract ;
	protected java.util.Date  __date_start ;
	protected java.util.Date  __date_end ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.util.Date  __date_signed ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __createdby ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Integer  __contract_type ;
	protected java.lang.Integer  __payment_method_accepted ;
	protected java.lang.String  __contract_content ;
	protected java.lang.String  __customer_signer_name ;
	protected java.lang.Integer  __employee_id_signer ;
	protected java.lang.String  __memo ;
}
