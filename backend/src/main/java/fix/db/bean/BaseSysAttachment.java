package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseSysAttachment extends GenericBase implements BaseFactory<BaseSysAttachment>, Comparable<BaseSysAttachment> 
{


	public static BaseSysAttachment newInstance(){
		return new BaseSysAttachment();
	}

	@Override
	public BaseSysAttachment make(){
		BaseSysAttachment b = new BaseSysAttachment();
		return b;
	}

	public final static java.lang.String CS_ID = "id" ;
	public final static java.lang.String CS_URI = "uri" ;
	public final static java.lang.String CS_CREATE_TIME = "create_time" ;

	public final static java.lang.String ALL_CAPTIONS = ",附件文件uri,创建时间";

	public java.lang.Integer getId() {
		return this.__id;
	}

	public void setId( java.lang.Integer value ) {
		this.__id = value;
	}

	public java.lang.String getUri() {
		return this.__uri;
	}

	public void setUri( java.lang.String value ) {
		this.__uri = value;
	}

	public java.lang.String getCreateTime() {
		return this.__create_time;
	}

	public void setCreateTime( java.lang.String value ) {
		this.__create_time = value;
	}

	public void cloneCopy(BaseSysAttachment __bean){
		__bean.setId(getId());
		__bean.setUri(getUri());
		__bean.setCreateTime(getCreateTime());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getId() == null ? "" : getId());
		sb.append(",");
		sb.append(getUri() == null ? "" : getUri());
		sb.append(",");
		sb.append(getCreateTime() == null ? "" : getCreateTime());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseSysAttachment o) {
		return __id == null ? -1 : __id.compareTo(o.getId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__id);
		hash = 97 * hash + Objects.hashCode(this.__uri);
		hash = 97 * hash + Objects.hashCode(this.__create_time);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseSysAttachment o = (BaseSysAttachment)obj;
		if(!Objects.equals(this.__id, o.getId())) return false;
		if(!Objects.equals(this.__uri, o.getUri())) return false;
		if(!Objects.equals(this.__create_time, o.getCreateTime())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getId() != null) sb.append(__wrapNumber(count++, "id", getId()));
		if(getUri() != null) sb.append(__wrapString(count++, "uri", getUri()));
		if(getCreateTime() != null) sb.append(__wrapString(count++, "createTime", getCreateTime()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getId() != null) res.put("id", getId());
		if(getUri() != null) res.put("uri", getUri());
		if(getCreateTime() != null) res.put("createTime", getCreateTime());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("id")) != null) setId(__getInt(val)); 
		if((val = values.get("uri")) != null) setUri(__getString(val));
		if((val = values.get("createTime")) != null) setCreateTime(__getString(val));
	}

	protected java.lang.Integer  __id ;
	protected java.lang.String  __uri ;
	protected java.lang.String  __create_time ;
}
