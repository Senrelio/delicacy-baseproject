package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmFollowupLog extends GenericBase implements BaseFactory<BaseCrmFollowupLog>, Comparable<BaseCrmFollowupLog> 
{


	public static BaseCrmFollowupLog newInstance(){
		return new BaseCrmFollowupLog();
	}

	@Override
	public BaseCrmFollowupLog make(){
		BaseCrmFollowupLog b = new BaseCrmFollowupLog();
		return b;
	}

	public final static java.lang.String CS_ID = "id" ;
	public final static java.lang.String CS_EMPLOYEES_ID = "employees_id" ;
	public final static java.lang.String CS_SOURCE_TABLE = "source_table" ;
	public final static java.lang.String CS_SOURCE_ID = "source_id" ;
	public final static java.lang.String CS_OPERATE = "operate" ;

	public final static java.lang.String ALL_CAPTIONS = "跟进记录id,跟进员工id,来源表名，跟进哪个业务产生了此记录,跟进业务使用的表的id,跟进业务的内容概述";

	public java.lang.Integer getId() {
		return this.__id;
	}

	public void setId( java.lang.Integer value ) {
		this.__id = value;
	}

	public java.lang.Integer getEmployeesId() {
		return this.__employees_id;
	}

	public void setEmployeesId( java.lang.Integer value ) {
		this.__employees_id = value;
	}

	public java.lang.String getSourceTable() {
		return this.__source_table;
	}

	public void setSourceTable( java.lang.String value ) {
		this.__source_table = value;
	}

	public java.lang.Integer getSourceId() {
		return this.__source_id;
	}

	public void setSourceId( java.lang.Integer value ) {
		this.__source_id = value;
	}

	public java.lang.String getOperate() {
		return this.__operate;
	}

	public void setOperate( java.lang.String value ) {
		this.__operate = value;
	}

	public void cloneCopy(BaseCrmFollowupLog __bean){
		__bean.setId(getId());
		__bean.setEmployeesId(getEmployeesId());
		__bean.setSourceTable(getSourceTable());
		__bean.setSourceId(getSourceId());
		__bean.setOperate(getOperate());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getId() == null ? "" : getId());
		sb.append(",");
		sb.append(getEmployeesId() == null ? "" : getEmployeesId());
		sb.append(",");
		sb.append(getSourceTable() == null ? "" : getSourceTable());
		sb.append(",");
		sb.append(getSourceId() == null ? "" : getSourceId());
		sb.append(",");
		sb.append(getOperate() == null ? "" : getOperate());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmFollowupLog o) {
		return __id == null ? -1 : __id.compareTo(o.getId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__id);
		hash = 97 * hash + Objects.hashCode(this.__employees_id);
		hash = 97 * hash + Objects.hashCode(this.__source_table);
		hash = 97 * hash + Objects.hashCode(this.__source_id);
		hash = 97 * hash + Objects.hashCode(this.__operate);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmFollowupLog o = (BaseCrmFollowupLog)obj;
		if(!Objects.equals(this.__id, o.getId())) return false;
		if(!Objects.equals(this.__employees_id, o.getEmployeesId())) return false;
		if(!Objects.equals(this.__source_table, o.getSourceTable())) return false;
		if(!Objects.equals(this.__source_id, o.getSourceId())) return false;
		if(!Objects.equals(this.__operate, o.getOperate())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getId() != null) sb.append(__wrapNumber(count++, "id", getId()));
		if(getEmployeesId() != null) sb.append(__wrapNumber(count++, "employeesId", getEmployeesId()));
		if(getSourceTable() != null) sb.append(__wrapString(count++, "sourceTable", getSourceTable()));
		if(getSourceId() != null) sb.append(__wrapNumber(count++, "sourceId", getSourceId()));
		if(getOperate() != null) sb.append(__wrapString(count++, "operate", getOperate()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getId() != null) res.put("id", getId());
		if(getEmployeesId() != null) res.put("employeesId", getEmployeesId());
		if(getSourceTable() != null) res.put("sourceTable", getSourceTable());
		if(getSourceId() != null) res.put("sourceId", getSourceId());
		if(getOperate() != null) res.put("operate", getOperate());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("id")) != null) setId(__getInt(val)); 
		if((val = values.get("employeesId")) != null) setEmployeesId(__getInt(val)); 
		if((val = values.get("sourceTable")) != null) setSourceTable(__getString(val));
		if((val = values.get("sourceId")) != null) setSourceId(__getInt(val)); 
		if((val = values.get("operate")) != null) setOperate(__getString(val));
	}

	protected java.lang.Integer  __id ;
	protected java.lang.Integer  __employees_id ;
	protected java.lang.String  __source_table ;
	protected java.lang.Integer  __source_id ;
	protected java.lang.String  __operate ;
}
