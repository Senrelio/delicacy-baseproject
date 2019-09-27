package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseArea extends GenericBase implements BaseFactory<BaseArea>, Comparable<BaseArea> 
{


	public static BaseArea newInstance(){
		return new BaseArea();
	}

	@Override
	public BaseArea make(){
		BaseArea b = new BaseArea();
		return b;
	}

	public final static java.lang.String CS_ID = "id" ;
	public final static java.lang.String CS_CODE = "code" ;
	public final static java.lang.String CS_TITLE = "title" ;
	public final static java.lang.String CS_PATH = "path" ;
	public final static java.lang.String CS_STATUS = "status" ;
	public final static java.lang.String CS_PID = "pid" ;
	public final static java.lang.String CS_FIRST_WORD = "first_word" ;
	public final static java.lang.String CS_LEVEL = "level" ;
	public final static java.lang.String CS_IS_TOWN = "is_town" ;
	public final static java.lang.String CS_REMARK = "remark" ;
	public final static java.lang.String CS_EN_MARK = "en_mark" ;
	public final static java.lang.String CS_DEL_FLAG = "del_flag" ;
	public final static java.lang.String CS_CREATE_BY = "create_by" ;
	public final static java.lang.String CS_CREATE_TIME = "create_time" ;
	public final static java.lang.String CS_UPDATE_BY = "update_by" ;
	public final static java.lang.String CS_UPDATE_TIME = "update_time" ;

	public final static java.lang.String ALL_CAPTIONS = ",,,,,,,,,,,,,,,";

	public java.lang.Integer getId() {
		return this.__id;
	}

	public void setId( java.lang.Integer value ) {
		this.__id = value;
	}

	public java.lang.String getCode() {
		return this.__code;
	}

	public void setCode( java.lang.String value ) {
		this.__code = value;
	}

	public java.lang.String getTitle() {
		return this.__title;
	}

	public void setTitle( java.lang.String value ) {
		this.__title = value;
	}

	public java.lang.String getPath() {
		return this.__path;
	}

	public void setPath( java.lang.String value ) {
		this.__path = value;
	}

	public java.lang.Integer getStatus() {
		return this.__status;
	}

	public void setStatus( java.lang.Integer value ) {
		this.__status = value;
	}

	public java.lang.Integer getPid() {
		return this.__pid;
	}

	public void setPid( java.lang.Integer value ) {
		this.__pid = value;
	}

	public java.lang.String getFirstWord() {
		return this.__first_word;
	}

	public void setFirstWord( java.lang.String value ) {
		this.__first_word = value;
	}

	public java.lang.Integer getLevel() {
		return this.__level;
	}

	public void setLevel( java.lang.Integer value ) {
		this.__level = value;
	}

	public java.lang.Boolean getIsTown() {
		return this.__is_town;
	}

	public void setIsTown( java.lang.Boolean value ) {
		this.__is_town = value;
	}

	public java.lang.String getRemark() {
		return this.__remark;
	}

	public void setRemark( java.lang.String value ) {
		this.__remark = value;
	}

	public java.lang.String getEnMark() {
		return this.__en_mark;
	}

	public void setEnMark( java.lang.String value ) {
		this.__en_mark = value;
	}

	public java.lang.Boolean getDelFlag() {
		return this.__del_flag;
	}

	public void setDelFlag( java.lang.Boolean value ) {
		this.__del_flag = value;
	}

	public java.lang.String getCreateBy() {
		return this.__create_by;
	}

	public void setCreateBy( java.lang.String value ) {
		this.__create_by = value;
	}

	public java.util.Date getCreateTime() {
		return this.__create_time;
	}

	public void setCreateTime( java.util.Date value ) {
		this.__create_time = value;
	}

	public java.lang.String getUpdateBy() {
		return this.__update_by;
	}

	public void setUpdateBy( java.lang.String value ) {
		this.__update_by = value;
	}

	public java.util.Date getUpdateTime() {
		return this.__update_time;
	}

	public void setUpdateTime( java.util.Date value ) {
		this.__update_time = value;
	}

	public void cloneCopy(BaseArea __bean){
		__bean.setId(getId());
		__bean.setCode(getCode());
		__bean.setTitle(getTitle());
		__bean.setPath(getPath());
		__bean.setStatus(getStatus());
		__bean.setPid(getPid());
		__bean.setFirstWord(getFirstWord());
		__bean.setLevel(getLevel());
		__bean.setIsTown(getIsTown());
		__bean.setRemark(getRemark());
		__bean.setEnMark(getEnMark());
		__bean.setDelFlag(getDelFlag());
		__bean.setCreateBy(getCreateBy());
		__bean.setCreateTime(getCreateTime());
		__bean.setUpdateBy(getUpdateBy());
		__bean.setUpdateTime(getUpdateTime());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getId() == null ? "" : getId());
		sb.append(",");
		sb.append(getCode() == null ? "" : getCode());
		sb.append(",");
		sb.append(getTitle() == null ? "" : getTitle());
		sb.append(",");
		sb.append(getPath() == null ? "" : getPath());
		sb.append(",");
		sb.append(getStatus() == null ? "" : getStatus());
		sb.append(",");
		sb.append(getPid() == null ? "" : getPid());
		sb.append(",");
		sb.append(getFirstWord() == null ? "" : getFirstWord());
		sb.append(",");
		sb.append(getLevel() == null ? "" : getLevel());
		sb.append(",");
		sb.append(getIsTown() == null ? "" : getIsTown());
		sb.append(",");
		sb.append(getRemark() == null ? "" : getRemark());
		sb.append(",");
		sb.append(getEnMark() == null ? "" : getEnMark());
		sb.append(",");
		sb.append(getDelFlag() == null ? "" : getDelFlag());
		sb.append(",");
		sb.append(getCreateBy() == null ? "" : getCreateBy());
		sb.append(",");
		sb.append(getCreateTime() == null ? "" : sdf.format(getCreateTime()));
		sb.append(",");
		sb.append(getUpdateBy() == null ? "" : getUpdateBy());
		sb.append(",");
		sb.append(getUpdateTime() == null ? "" : sdf.format(getUpdateTime()));
		return sb.toString();
	}

	@Override
	public int compareTo(BaseArea o) {
		return __id == null ? -1 : __id.compareTo(o.getId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__id);
		hash = 97 * hash + Objects.hashCode(this.__code);
		hash = 97 * hash + Objects.hashCode(this.__title);
		hash = 97 * hash + Objects.hashCode(this.__path);
		hash = 97 * hash + Objects.hashCode(this.__status);
		hash = 97 * hash + Objects.hashCode(this.__pid);
		hash = 97 * hash + Objects.hashCode(this.__first_word);
		hash = 97 * hash + Objects.hashCode(this.__level);
		hash = 97 * hash + Objects.hashCode(this.__is_town);
		hash = 97 * hash + Objects.hashCode(this.__remark);
		hash = 97 * hash + Objects.hashCode(this.__en_mark);
		hash = 97 * hash + Objects.hashCode(this.__del_flag);
		hash = 97 * hash + Objects.hashCode(this.__create_by);
		hash = 97 * hash + Objects.hashCode(this.__create_time);
		hash = 97 * hash + Objects.hashCode(this.__update_by);
		hash = 97 * hash + Objects.hashCode(this.__update_time);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseArea o = (BaseArea)obj;
		if(!Objects.equals(this.__id, o.getId())) return false;
		if(!Objects.equals(this.__code, o.getCode())) return false;
		if(!Objects.equals(this.__title, o.getTitle())) return false;
		if(!Objects.equals(this.__path, o.getPath())) return false;
		if(!Objects.equals(this.__status, o.getStatus())) return false;
		if(!Objects.equals(this.__pid, o.getPid())) return false;
		if(!Objects.equals(this.__first_word, o.getFirstWord())) return false;
		if(!Objects.equals(this.__level, o.getLevel())) return false;
		if(!Objects.equals(this.__is_town, o.getIsTown())) return false;
		if(!Objects.equals(this.__remark, o.getRemark())) return false;
		if(!Objects.equals(this.__en_mark, o.getEnMark())) return false;
		if(!Objects.equals(this.__del_flag, o.getDelFlag())) return false;
		if(!Objects.equals(this.__create_by, o.getCreateBy())) return false;
		if(!Objects.equals(this.__create_time, o.getCreateTime())) return false;
		if(!Objects.equals(this.__update_by, o.getUpdateBy())) return false;
		if(!Objects.equals(this.__update_time, o.getUpdateTime())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getId() != null) sb.append(__wrapNumber(count++, "id", getId()));
		if(getCode() != null) sb.append(__wrapString(count++, "code", getCode()));
		if(getTitle() != null) sb.append(__wrapString(count++, "title", getTitle()));
		if(getPath() != null) sb.append(__wrapString(count++, "path", getPath()));
		if(getStatus() != null) sb.append(__wrapNumber(count++, "status", getStatus()));
		if(getPid() != null) sb.append(__wrapNumber(count++, "pid", getPid()));
		if(getFirstWord() != null) sb.append(__wrapString(count++, "firstWord", getFirstWord()));
		if(getLevel() != null) sb.append(__wrapNumber(count++, "level", getLevel()));
		if(getIsTown() != null) sb.append(__wrapBoolean(count++, "isTown", getIsTown()));
		if(getRemark() != null) sb.append(__wrapString(count++, "remark", getRemark()));
		if(getEnMark() != null) sb.append(__wrapString(count++, "enMark", getEnMark()));
		if(getDelFlag() != null) sb.append(__wrapBoolean(count++, "delFlag", getDelFlag()));
		if(getCreateBy() != null) sb.append(__wrapString(count++, "createBy", getCreateBy()));
		if(getCreateTime() != null) sb.append(__wrapDate(count++, "createTime", getCreateTime()));
		if(getUpdateBy() != null) sb.append(__wrapString(count++, "updateBy", getUpdateBy()));
		if(getUpdateTime() != null) sb.append(__wrapDate(count++, "updateTime", getUpdateTime()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getId() != null) res.put("id", getId());
		if(getCode() != null) res.put("code", getCode());
		if(getTitle() != null) res.put("title", getTitle());
		if(getPath() != null) res.put("path", getPath());
		if(getStatus() != null) res.put("status", getStatus());
		if(getPid() != null) res.put("pid", getPid());
		if(getFirstWord() != null) res.put("firstWord", getFirstWord());
		if(getLevel() != null) res.put("level", getLevel());
		if(getIsTown() != null) res.put("isTown", getIsTown());
		if(getRemark() != null) res.put("remark", getRemark());
		if(getEnMark() != null) res.put("enMark", getEnMark());
		if(getDelFlag() != null) res.put("delFlag", getDelFlag());
		if(getCreateBy() != null) res.put("createBy", getCreateBy());
		if(getCreateTime() != null) res.put("createTime", getCreateTime());
		if(getUpdateBy() != null) res.put("updateBy", getUpdateBy());
		if(getUpdateTime() != null) res.put("updateTime", getUpdateTime());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("id")) != null) setId(__getInt(val)); 
		if((val = values.get("code")) != null) setCode(__getString(val));
		if((val = values.get("title")) != null) setTitle(__getString(val));
		if((val = values.get("path")) != null) setPath(__getString(val));
		if((val = values.get("status")) != null) setStatus(__getInt(val)); 
		if((val = values.get("pid")) != null) setPid(__getInt(val)); 
		if((val = values.get("firstWord")) != null) setFirstWord(__getString(val));
		if((val = values.get("level")) != null) setLevel(__getInt(val)); 
		if((val = values.get("isTown")) != null) setIsTown(__getBoolean(val));
		if((val = values.get("remark")) != null) setRemark(__getString(val));
		if((val = values.get("enMark")) != null) setEnMark(__getString(val));
		if((val = values.get("delFlag")) != null) setDelFlag(__getBoolean(val));
		if((val = values.get("createBy")) != null) setCreateBy(__getString(val));
		if((val = values.get("createTime")) != null) setCreateTime(__getDate(val)); 
		if((val = values.get("updateBy")) != null) setUpdateBy(__getString(val));
		if((val = values.get("updateTime")) != null) setUpdateTime(__getDate(val)); 
	}

	protected java.lang.Integer  __id ;
	protected java.lang.String  __code ;
	protected java.lang.String  __title ;
	protected java.lang.String  __path ;
	protected java.lang.Integer  __status ;
	protected java.lang.Integer  __pid ;
	protected java.lang.String  __first_word ;
	protected java.lang.Integer  __level ;
	protected java.lang.Boolean  __is_town ;
	protected java.lang.String  __remark ;
	protected java.lang.String  __en_mark ;
	protected java.lang.Boolean  __del_flag ;
	protected java.lang.String  __create_by ;
	protected java.util.Date  __create_time ;
	protected java.lang.String  __update_by ;
	protected java.util.Date  __update_time ;
}
