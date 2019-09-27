package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmSaleStage extends GenericBase implements BaseFactory<BaseCrmSaleStage>, Comparable<BaseCrmSaleStage> 
{


	public static BaseCrmSaleStage newInstance(){
		return new BaseCrmSaleStage();
	}

	@Override
	public BaseCrmSaleStage make(){
		BaseCrmSaleStage b = new BaseCrmSaleStage();
		return b;
	}

	public final static java.lang.String CS_SALE_STAGE_ID = "sale_stage_id" ;
	public final static java.lang.String CS_SALE_STAGE_NAME = "sale_stage_name" ;
	public final static java.lang.String CS_STATUS_OPPORTUNITY = "status_opportunity" ;
	public final static java.lang.String CS_STAGE_ORDER_NO = "stage_order_no" ;
	public final static java.lang.String CS_STAGE_WINRATE = "stage_winrate" ;
	public final static java.lang.String CS_DURATION_EXPECTED = "duration_expected" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;

	public final static java.lang.String ALL_CAPTIONS = "销售阶段编码,销售阶段名,销售机会状态,阶段顺位,阶段赢率,预期维持天数,创建日期,创建人编码,最近修改日,最近修改人";

	public java.lang.Integer getSaleStageId() {
		return this.__sale_stage_id;
	}

	public void setSaleStageId( java.lang.Integer value ) {
		this.__sale_stage_id = value;
	}

	public java.lang.String getSaleStageName() {
		return this.__sale_stage_name;
	}

	public void setSaleStageName( java.lang.String value ) {
		this.__sale_stage_name = value;
	}

	public java.lang.Integer getStatusOpportunity() {
		return this.__status_opportunity;
	}

	public void setStatusOpportunity( java.lang.Integer value ) {
		this.__status_opportunity = value;
	}

	public java.lang.Integer getStageOrderNo() {
		return this.__stage_order_no;
	}

	public void setStageOrderNo( java.lang.Integer value ) {
		this.__stage_order_no = value;
	}

	public java.lang.Float getStageWinrate() {
		return this.__stage_winrate;
	}

	public void setStageWinrate( java.lang.Float value ) {
		this.__stage_winrate = value;
	}

	public java.lang.Integer getDurationExpected() {
		return this.__duration_expected;
	}

	public void setDurationExpected( java.lang.Integer value ) {
		this.__duration_expected = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
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

	public void cloneCopy(BaseCrmSaleStage __bean){
		__bean.setSaleStageId(getSaleStageId());
		__bean.setSaleStageName(getSaleStageName());
		__bean.setStatusOpportunity(getStatusOpportunity());
		__bean.setStageOrderNo(getStageOrderNo());
		__bean.setStageWinrate(getStageWinrate());
		__bean.setDurationExpected(getDurationExpected());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getSaleStageId() == null ? "" : getSaleStageId());
		sb.append(",");
		sb.append(getSaleStageName() == null ? "" : getSaleStageName());
		sb.append(",");
		sb.append(getStatusOpportunity() == null ? "" : getStatusOpportunity());
		sb.append(",");
		sb.append(getStageOrderNo() == null ? "" : getStageOrderNo());
		sb.append(",");
		sb.append(getStageWinrate() == null ? "" : getStageWinrate());
		sb.append(",");
		sb.append(getDurationExpected() == null ? "" : getDurationExpected());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmSaleStage o) {
		return __sale_stage_id == null ? -1 : __sale_stage_id.compareTo(o.getSaleStageId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__sale_stage_id);
		hash = 97 * hash + Objects.hashCode(this.__sale_stage_name);
		hash = 97 * hash + Objects.hashCode(this.__status_opportunity);
		hash = 97 * hash + Objects.hashCode(this.__stage_order_no);
		hash = 97 * hash + Objects.hashCode(this.__stage_winrate);
		hash = 97 * hash + Objects.hashCode(this.__duration_expected);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmSaleStage o = (BaseCrmSaleStage)obj;
		if(!Objects.equals(this.__sale_stage_id, o.getSaleStageId())) return false;
		if(!Objects.equals(this.__sale_stage_name, o.getSaleStageName())) return false;
		if(!Objects.equals(this.__status_opportunity, o.getStatusOpportunity())) return false;
		if(!Objects.equals(this.__stage_order_no, o.getStageOrderNo())) return false;
		if(!Objects.equals(this.__stage_winrate, o.getStageWinrate())) return false;
		if(!Objects.equals(this.__duration_expected, o.getDurationExpected())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getSaleStageId() != null) sb.append(__wrapNumber(count++, "saleStageId", getSaleStageId()));
		if(getSaleStageName() != null) sb.append(__wrapString(count++, "saleStageName", getSaleStageName()));
		if(getStatusOpportunity() != null) sb.append(__wrapNumber(count++, "statusOpportunity", getStatusOpportunity()));
		if(getStageOrderNo() != null) sb.append(__wrapNumber(count++, "stageOrderNo", getStageOrderNo()));
		if(getStageWinrate() != null) sb.append(__wrapNumber(count++, "stageWinrate", getStageWinrate()));
		if(getDurationExpected() != null) sb.append(__wrapNumber(count++, "durationExpected", getDurationExpected()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getSaleStageId() != null) res.put("saleStageId", getSaleStageId());
		if(getSaleStageName() != null) res.put("saleStageName", getSaleStageName());
		if(getStatusOpportunity() != null) res.put("statusOpportunity", getStatusOpportunity());
		if(getStageOrderNo() != null) res.put("stageOrderNo", getStageOrderNo());
		if(getStageWinrate() != null) res.put("stageWinrate", getStageWinrate());
		if(getDurationExpected() != null) res.put("durationExpected", getDurationExpected());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("saleStageId")) != null) setSaleStageId(__getInt(val)); 
		if((val = values.get("saleStageName")) != null) setSaleStageName(__getString(val));
		if((val = values.get("statusOpportunity")) != null) setStatusOpportunity(__getInt(val)); 
		if((val = values.get("stageOrderNo")) != null) setStageOrderNo(__getInt(val)); 
		if((val = values.get("stageWinrate")) != null) setStageWinrate(__getFloat(val));  
		if((val = values.get("durationExpected")) != null) setDurationExpected(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
	}

	protected java.lang.Integer  __sale_stage_id ;
	protected java.lang.String  __sale_stage_name ;
	protected java.lang.Integer  __status_opportunity ;
	protected java.lang.Integer  __stage_order_no ;
	protected java.lang.Float  __stage_winrate ;
	protected java.lang.Integer  __duration_expected ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
}
