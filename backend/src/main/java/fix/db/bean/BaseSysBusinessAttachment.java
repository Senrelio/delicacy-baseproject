package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseSysBusinessAttachment extends GenericBase implements BaseFactory<BaseSysBusinessAttachment>, Comparable<BaseSysBusinessAttachment> 
{


	public static BaseSysBusinessAttachment newInstance(){
		return new BaseSysBusinessAttachment();
	}

	@Override
	public BaseSysBusinessAttachment make(){
		BaseSysBusinessAttachment b = new BaseSysBusinessAttachment();
		return b;
	}

	public final static java.lang.String CS_ID = "id" ;
	public final static java.lang.String CS_BUSINESS_TYPE = "business_type" ;
	public final static java.lang.String CS_BUSINESS_ID = "business_id" ;
	public final static java.lang.String CS_ATTACHMENT_ID = "attachment_id" ;

	public final static java.lang.String ALL_CAPTIONS = ",业务类型,业务id,附件id";

	public java.lang.Integer getId() {
		return this.__id;
	}

	public void setId( java.lang.Integer value ) {
		this.__id = value;
	}

	public java.lang.String getBusinessType() {
		return this.__business_type;
	}

	public void setBusinessType( java.lang.String value ) {
		this.__business_type = value;
	}

	public java.lang.Integer getBusinessId() {
		return this.__business_id;
	}

	public void setBusinessId( java.lang.Integer value ) {
		this.__business_id = value;
	}

	public java.lang.Integer getAttachmentId() {
		return this.__attachment_id;
	}

	public void setAttachmentId( java.lang.Integer value ) {
		this.__attachment_id = value;
	}

	public void cloneCopy(BaseSysBusinessAttachment __bean){
		__bean.setId(getId());
		__bean.setBusinessType(getBusinessType());
		__bean.setBusinessId(getBusinessId());
		__bean.setAttachmentId(getAttachmentId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getId() == null ? "" : getId());
		sb.append(",");
		sb.append(getBusinessType() == null ? "" : getBusinessType());
		sb.append(",");
		sb.append(getBusinessId() == null ? "" : getBusinessId());
		sb.append(",");
		sb.append(getAttachmentId() == null ? "" : getAttachmentId());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseSysBusinessAttachment o) {
		return __id == null ? -1 : __id.compareTo(o.getId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__id);
		hash = 97 * hash + Objects.hashCode(this.__business_type);
		hash = 97 * hash + Objects.hashCode(this.__business_id);
		hash = 97 * hash + Objects.hashCode(this.__attachment_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseSysBusinessAttachment o = (BaseSysBusinessAttachment)obj;
		if(!Objects.equals(this.__id, o.getId())) return false;
		if(!Objects.equals(this.__business_type, o.getBusinessType())) return false;
		if(!Objects.equals(this.__business_id, o.getBusinessId())) return false;
		if(!Objects.equals(this.__attachment_id, o.getAttachmentId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getId() != null) sb.append(__wrapNumber(count++, "id", getId()));
		if(getBusinessType() != null) sb.append(__wrapString(count++, "businessType", getBusinessType()));
		if(getBusinessId() != null) sb.append(__wrapNumber(count++, "businessId", getBusinessId()));
		if(getAttachmentId() != null) sb.append(__wrapNumber(count++, "attachmentId", getAttachmentId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getId() != null) res.put("id", getId());
		if(getBusinessType() != null) res.put("businessType", getBusinessType());
		if(getBusinessId() != null) res.put("businessId", getBusinessId());
		if(getAttachmentId() != null) res.put("attachmentId", getAttachmentId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("id")) != null) setId(__getInt(val)); 
		if((val = values.get("businessType")) != null) setBusinessType(__getString(val));
		if((val = values.get("businessId")) != null) setBusinessId(__getInt(val)); 
		if((val = values.get("attachmentId")) != null) setAttachmentId(__getInt(val)); 
	}

	protected java.lang.Integer  __id ;
	protected java.lang.String  __business_type ;
	protected java.lang.Integer  __business_id ;
	protected java.lang.Integer  __attachment_id ;
}
