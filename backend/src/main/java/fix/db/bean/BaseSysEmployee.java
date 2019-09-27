package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseSysEmployee extends GenericBase implements BaseFactory<BaseSysEmployee>, Comparable<BaseSysEmployee> 
{


	public static BaseSysEmployee newInstance(){
		return new BaseSysEmployee();
	}

	@Override
	public BaseSysEmployee make(){
		BaseSysEmployee b = new BaseSysEmployee();
		return b;
	}

	public final static java.lang.String CS_EMPLOYEE_ID = "employee_id" ;
	public final static java.lang.String CS_PERSONAL_EMAIL = "personal_email" ;
	public final static java.lang.String CS_MOBILE = "mobile" ;
	public final static java.lang.String CS_EMPLOYEE_TYPE = "employee_type" ;
	public final static java.lang.String CS_EMPLOYEE_NAME = "employee_name" ;
	public final static java.lang.String CS_EMPLOYEE_CODE = "employee_code" ;
	public final static java.lang.String CS_PASSWORD = "password" ;
	public final static java.lang.String CS_DATE_JOINED = "date_joined" ;
	public final static java.lang.String CS_BIRTHDAY = "birthday" ;
	public final static java.lang.String CS_PASSWORD_RULE_ID = "password_rule_id" ;
	public final static java.lang.String CS_POSITION_NAME = "position_name" ;
	public final static java.lang.String CS_RANK_ID = "rank_id" ;
	public final static java.lang.String CS_MANAGER_ID = "manager_id" ;
	public final static java.lang.String CS_GENDER = "gender" ;
	public final static java.lang.String CS_RELATED_DEPARTMENT_ID = "related_department_id" ;
	public final static java.lang.String CS_AREA_CODE = "area_code" ;
	public final static java.lang.String CS_RELATED_BUSINESS = "related_business" ;
	public final static java.lang.String CS_PRODUCT_LINE = "product_line" ;
	public final static java.lang.String CS_RELATED_PRODUCT_LINE = "related_product_line" ;
	public final static java.lang.String CS_NICKNAME = "nickname" ;
	public final static java.lang.String CS_STATUS_EMPLOYEE = "status_employee" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_SELFINTRO = "selfIntro" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_EXTNO = "extNo" ;
	public final static java.lang.String CS_EXPERTISE = "expertise" ;
	public final static java.lang.String CS_WECHAT = "wechat" ;
	public final static java.lang.String CS_TELEPHONE = "telephone" ;
	public final static java.lang.String CS_WEIBO = "weibo" ;
	public final static java.lang.String CS_HOBBY = "hobby" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_DATE_LATEST_LOGIN = "date_latest_login" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_QQ = "qq" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;

	public final static java.lang.String ALL_CAPTIONS = "员工编码,个人邮箱,手机号码,员工业务类型,姓名,员工号,用户密码,入职日期,生日,密码规则,职位名,职级编码,上级编码,性别,相关部门编码,所属区域代码,相关业务,所属产品线,相关产品线,昵称,员工状态,修改时间,自我介绍,所属部门编码,分机号,业务专长,微信号,办公电话,微博,兴趣爱好,创建时间,最近一次登录时间,创建人编码,QQ,修改人编码";

	public java.lang.Integer getEmployeeId() {
		return this.__employee_id;
	}

	public void setEmployeeId( java.lang.Integer value ) {
		this.__employee_id = value;
	}

	public java.lang.String getPersonalEmail() {
		return this.__personal_email;
	}

	public void setPersonalEmail( java.lang.String value ) {
		this.__personal_email = value;
	}

	public java.lang.String getMobile() {
		return this.__mobile;
	}

	public void setMobile( java.lang.String value ) {
		this.__mobile = value;
	}

	public java.lang.Integer getEmployeeType() {
		return this.__employee_type;
	}

	public void setEmployeeType( java.lang.Integer value ) {
		this.__employee_type = value;
	}

	public java.lang.String getEmployeeName() {
		return this.__employee_name;
	}

	public void setEmployeeName( java.lang.String value ) {
		this.__employee_name = value;
	}

	public java.lang.String getEmployeeCode() {
		return this.__employee_code;
	}

	public void setEmployeeCode( java.lang.String value ) {
		this.__employee_code = value;
	}

	public java.lang.String getPassword() {
		return this.__password;
	}

	public void setPassword( java.lang.String value ) {
		this.__password = value;
	}

	public java.util.Date getDateJoined() {
		return this.__date_joined;
	}

	public void setDateJoined( java.util.Date value ) {
		this.__date_joined = value;
	}

	public java.util.Date getBirthday() {
		return this.__birthday;
	}

	public void setBirthday( java.util.Date value ) {
		this.__birthday = value;
	}

	public java.lang.String getPasswordRuleId() {
		return this.__password_rule_id;
	}

	public void setPasswordRuleId( java.lang.String value ) {
		this.__password_rule_id = value;
	}

	public java.lang.String getPositionName() {
		return this.__position_name;
	}

	public void setPositionName( java.lang.String value ) {
		this.__position_name = value;
	}

	public java.lang.String getRankId() {
		return this.__rank_id;
	}

	public void setRankId( java.lang.String value ) {
		this.__rank_id = value;
	}

	public java.lang.Integer getManagerId() {
		return this.__manager_id;
	}

	public void setManagerId( java.lang.Integer value ) {
		this.__manager_id = value;
	}

	public java.lang.Byte getGender() {
		return this.__gender;
	}

	public void setGender( java.lang.Byte value ) {
		this.__gender = value;
	}

	public java.lang.Integer getRelatedDepartmentId() {
		return this.__related_department_id;
	}

	public void setRelatedDepartmentId( java.lang.Integer value ) {
		this.__related_department_id = value;
	}

	public java.lang.String getAreaCode() {
		return this.__area_code;
	}

	public void setAreaCode( java.lang.String value ) {
		this.__area_code = value;
	}

	public java.lang.String getRelatedBusiness() {
		return this.__related_business;
	}

	public void setRelatedBusiness( java.lang.String value ) {
		this.__related_business = value;
	}

	public java.lang.String getProductLine() {
		return this.__product_line;
	}

	public void setProductLine( java.lang.String value ) {
		this.__product_line = value;
	}

	public java.lang.String getRelatedProductLine() {
		return this.__related_product_line;
	}

	public void setRelatedProductLine( java.lang.String value ) {
		this.__related_product_line = value;
	}

	public java.lang.String getNickname() {
		return this.__nickname;
	}

	public void setNickname( java.lang.String value ) {
		this.__nickname = value;
	}

	public java.lang.Byte getStatusEmployee() {
		return this.__status_employee;
	}

	public void setStatusEmployee( java.lang.Byte value ) {
		this.__status_employee = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.String getSelfintro() {
		return this.__selfintro;
	}

	public void setSelfintro( java.lang.String value ) {
		this.__selfintro = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.String getExtno() {
		return this.__extno;
	}

	public void setExtno( java.lang.String value ) {
		this.__extno = value;
	}

	public java.lang.String getExpertise() {
		return this.__expertise;
	}

	public void setExpertise( java.lang.String value ) {
		this.__expertise = value;
	}

	public java.lang.String getWechat() {
		return this.__wechat;
	}

	public void setWechat( java.lang.String value ) {
		this.__wechat = value;
	}

	public java.lang.String getTelephone() {
		return this.__telephone;
	}

	public void setTelephone( java.lang.String value ) {
		this.__telephone = value;
	}

	public java.lang.String getWeibo() {
		return this.__weibo;
	}

	public void setWeibo( java.lang.String value ) {
		this.__weibo = value;
	}

	public java.lang.String getHobby() {
		return this.__hobby;
	}

	public void setHobby( java.lang.String value ) {
		this.__hobby = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.util.Date getDateLatestLogin() {
		return this.__date_latest_login;
	}

	public void setDateLatestLogin( java.util.Date value ) {
		this.__date_latest_login = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.lang.String getQq() {
		return this.__qq;
	}

	public void setQq( java.lang.String value ) {
		this.__qq = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public void cloneCopy(BaseSysEmployee __bean){
		__bean.setEmployeeId(getEmployeeId());
		__bean.setPersonalEmail(getPersonalEmail());
		__bean.setMobile(getMobile());
		__bean.setEmployeeType(getEmployeeType());
		__bean.setEmployeeName(getEmployeeName());
		__bean.setEmployeeCode(getEmployeeCode());
		__bean.setPassword(getPassword());
		__bean.setDateJoined(getDateJoined());
		__bean.setBirthday(getBirthday());
		__bean.setPasswordRuleId(getPasswordRuleId());
		__bean.setPositionName(getPositionName());
		__bean.setRankId(getRankId());
		__bean.setManagerId(getManagerId());
		__bean.setGender(getGender());
		__bean.setRelatedDepartmentId(getRelatedDepartmentId());
		__bean.setAreaCode(getAreaCode());
		__bean.setRelatedBusiness(getRelatedBusiness());
		__bean.setProductLine(getProductLine());
		__bean.setRelatedProductLine(getRelatedProductLine());
		__bean.setNickname(getNickname());
		__bean.setStatusEmployee(getStatusEmployee());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setSelfintro(getSelfintro());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setExtno(getExtno());
		__bean.setExpertise(getExpertise());
		__bean.setWechat(getWechat());
		__bean.setTelephone(getTelephone());
		__bean.setWeibo(getWeibo());
		__bean.setHobby(getHobby());
		__bean.setDateCreated(getDateCreated());
		__bean.setDateLatestLogin(getDateLatestLogin());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setQq(getQq());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getEmployeeId() == null ? "" : getEmployeeId());
		sb.append(",");
		sb.append(getPersonalEmail() == null ? "" : getPersonalEmail());
		sb.append(",");
		sb.append(getMobile() == null ? "" : getMobile());
		sb.append(",");
		sb.append(getEmployeeType() == null ? "" : getEmployeeType());
		sb.append(",");
		sb.append(getEmployeeName() == null ? "" : getEmployeeName());
		sb.append(",");
		sb.append(getEmployeeCode() == null ? "" : getEmployeeCode());
		sb.append(",");
		sb.append(getPassword() == null ? "" : getPassword());
		sb.append(",");
		sb.append(getDateJoined() == null ? "" : sdf.format(getDateJoined()));
		sb.append(",");
		sb.append(getBirthday() == null ? "" : sdf.format(getBirthday()));
		sb.append(",");
		sb.append(getPasswordRuleId() == null ? "" : getPasswordRuleId());
		sb.append(",");
		sb.append(getPositionName() == null ? "" : getPositionName());
		sb.append(",");
		sb.append(getRankId() == null ? "" : getRankId());
		sb.append(",");
		sb.append(getManagerId() == null ? "" : getManagerId());
		sb.append(",");
		sb.append(getGender() == null ? "" : getGender());
		sb.append(",");
		sb.append(getRelatedDepartmentId() == null ? "" : getRelatedDepartmentId());
		sb.append(",");
		sb.append(getAreaCode() == null ? "" : getAreaCode());
		sb.append(",");
		sb.append(getRelatedBusiness() == null ? "" : getRelatedBusiness());
		sb.append(",");
		sb.append(getProductLine() == null ? "" : getProductLine());
		sb.append(",");
		sb.append(getRelatedProductLine() == null ? "" : getRelatedProductLine());
		sb.append(",");
		sb.append(getNickname() == null ? "" : getNickname());
		sb.append(",");
		sb.append(getStatusEmployee() == null ? "" : getStatusEmployee());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getSelfintro() == null ? "" : getSelfintro());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getExtno() == null ? "" : getExtno());
		sb.append(",");
		sb.append(getExpertise() == null ? "" : getExpertise());
		sb.append(",");
		sb.append(getWechat() == null ? "" : getWechat());
		sb.append(",");
		sb.append(getTelephone() == null ? "" : getTelephone());
		sb.append(",");
		sb.append(getWeibo() == null ? "" : getWeibo());
		sb.append(",");
		sb.append(getHobby() == null ? "" : getHobby());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getDateLatestLogin() == null ? "" : sdf.format(getDateLatestLogin()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getQq() == null ? "" : getQq());
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseSysEmployee o) {
		return __employee_id == null ? -1 : __employee_id.compareTo(o.getEmployeeId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__employee_id);
		hash = 97 * hash + Objects.hashCode(this.__personal_email);
		hash = 97 * hash + Objects.hashCode(this.__mobile);
		hash = 97 * hash + Objects.hashCode(this.__employee_type);
		hash = 97 * hash + Objects.hashCode(this.__employee_name);
		hash = 97 * hash + Objects.hashCode(this.__employee_code);
		hash = 97 * hash + Objects.hashCode(this.__password);
		hash = 97 * hash + Objects.hashCode(this.__date_joined);
		hash = 97 * hash + Objects.hashCode(this.__birthday);
		hash = 97 * hash + Objects.hashCode(this.__password_rule_id);
		hash = 97 * hash + Objects.hashCode(this.__position_name);
		hash = 97 * hash + Objects.hashCode(this.__rank_id);
		hash = 97 * hash + Objects.hashCode(this.__manager_id);
		hash = 97 * hash + Objects.hashCode(this.__gender);
		hash = 97 * hash + Objects.hashCode(this.__related_department_id);
		hash = 97 * hash + Objects.hashCode(this.__area_code);
		hash = 97 * hash + Objects.hashCode(this.__related_business);
		hash = 97 * hash + Objects.hashCode(this.__product_line);
		hash = 97 * hash + Objects.hashCode(this.__related_product_line);
		hash = 97 * hash + Objects.hashCode(this.__nickname);
		hash = 97 * hash + Objects.hashCode(this.__status_employee);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__selfintro);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__extno);
		hash = 97 * hash + Objects.hashCode(this.__expertise);
		hash = 97 * hash + Objects.hashCode(this.__wechat);
		hash = 97 * hash + Objects.hashCode(this.__telephone);
		hash = 97 * hash + Objects.hashCode(this.__weibo);
		hash = 97 * hash + Objects.hashCode(this.__hobby);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_login);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__qq);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseSysEmployee o = (BaseSysEmployee)obj;
		if(!Objects.equals(this.__employee_id, o.getEmployeeId())) return false;
		if(!Objects.equals(this.__personal_email, o.getPersonalEmail())) return false;
		if(!Objects.equals(this.__mobile, o.getMobile())) return false;
		if(!Objects.equals(this.__employee_type, o.getEmployeeType())) return false;
		if(!Objects.equals(this.__employee_name, o.getEmployeeName())) return false;
		if(!Objects.equals(this.__employee_code, o.getEmployeeCode())) return false;
		if(!Objects.equals(this.__password, o.getPassword())) return false;
		if(!Objects.equals(this.__date_joined, o.getDateJoined())) return false;
		if(!Objects.equals(this.__birthday, o.getBirthday())) return false;
		if(!Objects.equals(this.__password_rule_id, o.getPasswordRuleId())) return false;
		if(!Objects.equals(this.__position_name, o.getPositionName())) return false;
		if(!Objects.equals(this.__rank_id, o.getRankId())) return false;
		if(!Objects.equals(this.__manager_id, o.getManagerId())) return false;
		if(!Objects.equals(this.__gender, o.getGender())) return false;
		if(!Objects.equals(this.__related_department_id, o.getRelatedDepartmentId())) return false;
		if(!Objects.equals(this.__area_code, o.getAreaCode())) return false;
		if(!Objects.equals(this.__related_business, o.getRelatedBusiness())) return false;
		if(!Objects.equals(this.__product_line, o.getProductLine())) return false;
		if(!Objects.equals(this.__related_product_line, o.getRelatedProductLine())) return false;
		if(!Objects.equals(this.__nickname, o.getNickname())) return false;
		if(!Objects.equals(this.__status_employee, o.getStatusEmployee())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__selfintro, o.getSelfintro())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__extno, o.getExtno())) return false;
		if(!Objects.equals(this.__expertise, o.getExpertise())) return false;
		if(!Objects.equals(this.__wechat, o.getWechat())) return false;
		if(!Objects.equals(this.__telephone, o.getTelephone())) return false;
		if(!Objects.equals(this.__weibo, o.getWeibo())) return false;
		if(!Objects.equals(this.__hobby, o.getHobby())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__date_latest_login, o.getDateLatestLogin())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__qq, o.getQq())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getEmployeeId() != null) sb.append(__wrapNumber(count++, "employeeId", getEmployeeId()));
		if(getPersonalEmail() != null) sb.append(__wrapString(count++, "personalEmail", getPersonalEmail()));
		if(getMobile() != null) sb.append(__wrapString(count++, "mobile", getMobile()));
		if(getEmployeeType() != null) sb.append(__wrapNumber(count++, "employeeType", getEmployeeType()));
		if(getEmployeeName() != null) sb.append(__wrapString(count++, "employeeName", getEmployeeName()));
		if(getEmployeeCode() != null) sb.append(__wrapString(count++, "employeeCode", getEmployeeCode()));
		if(getPassword() != null) sb.append(__wrapString(count++, "password", getPassword()));
		if(getDateJoined() != null) sb.append(__wrapDate(count++, "dateJoined", getDateJoined()));
		if(getBirthday() != null) sb.append(__wrapDate(count++, "birthday", getBirthday()));
		if(getPasswordRuleId() != null) sb.append(__wrapString(count++, "passwordRuleId", getPasswordRuleId()));
		if(getPositionName() != null) sb.append(__wrapString(count++, "positionName", getPositionName()));
		if(getRankId() != null) sb.append(__wrapString(count++, "rankId", getRankId()));
		if(getManagerId() != null) sb.append(__wrapNumber(count++, "managerId", getManagerId()));
		if(getGender() != null) sb.append(__wrapNumber(count++, "gender", getGender()));
		if(getRelatedDepartmentId() != null) sb.append(__wrapNumber(count++, "relatedDepartmentId", getRelatedDepartmentId()));
		if(getAreaCode() != null) sb.append(__wrapString(count++, "areaCode", getAreaCode()));
		if(getRelatedBusiness() != null) sb.append(__wrapString(count++, "relatedBusiness", getRelatedBusiness()));
		if(getProductLine() != null) sb.append(__wrapString(count++, "productLine", getProductLine()));
		if(getRelatedProductLine() != null) sb.append(__wrapString(count++, "relatedProductLine", getRelatedProductLine()));
		if(getNickname() != null) sb.append(__wrapString(count++, "nickname", getNickname()));
		if(getStatusEmployee() != null) sb.append(__wrapNumber(count++, "statusEmployee", getStatusEmployee()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getSelfintro() != null) sb.append(__wrapString(count++, "selfintro", getSelfintro()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getExtno() != null) sb.append(__wrapString(count++, "extno", getExtno()));
		if(getExpertise() != null) sb.append(__wrapString(count++, "expertise", getExpertise()));
		if(getWechat() != null) sb.append(__wrapString(count++, "wechat", getWechat()));
		if(getTelephone() != null) sb.append(__wrapString(count++, "telephone", getTelephone()));
		if(getWeibo() != null) sb.append(__wrapString(count++, "weibo", getWeibo()));
		if(getHobby() != null) sb.append(__wrapString(count++, "hobby", getHobby()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getDateLatestLogin() != null) sb.append(__wrapDate(count++, "dateLatestLogin", getDateLatestLogin()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getQq() != null) sb.append(__wrapString(count++, "qq", getQq()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getEmployeeId() != null) res.put("employeeId", getEmployeeId());
		if(getPersonalEmail() != null) res.put("personalEmail", getPersonalEmail());
		if(getMobile() != null) res.put("mobile", getMobile());
		if(getEmployeeType() != null) res.put("employeeType", getEmployeeType());
		if(getEmployeeName() != null) res.put("employeeName", getEmployeeName());
		if(getEmployeeCode() != null) res.put("employeeCode", getEmployeeCode());
		if(getPassword() != null) res.put("password", getPassword());
		if(getDateJoined() != null) res.put("dateJoined", getDateJoined());
		if(getBirthday() != null) res.put("birthday", getBirthday());
		if(getPasswordRuleId() != null) res.put("passwordRuleId", getPasswordRuleId());
		if(getPositionName() != null) res.put("positionName", getPositionName());
		if(getRankId() != null) res.put("rankId", getRankId());
		if(getManagerId() != null) res.put("managerId", getManagerId());
		if(getGender() != null) res.put("gender", getGender());
		if(getRelatedDepartmentId() != null) res.put("relatedDepartmentId", getRelatedDepartmentId());
		if(getAreaCode() != null) res.put("areaCode", getAreaCode());
		if(getRelatedBusiness() != null) res.put("relatedBusiness", getRelatedBusiness());
		if(getProductLine() != null) res.put("productLine", getProductLine());
		if(getRelatedProductLine() != null) res.put("relatedProductLine", getRelatedProductLine());
		if(getNickname() != null) res.put("nickname", getNickname());
		if(getStatusEmployee() != null) res.put("statusEmployee", getStatusEmployee());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getSelfintro() != null) res.put("selfintro", getSelfintro());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getExtno() != null) res.put("extno", getExtno());
		if(getExpertise() != null) res.put("expertise", getExpertise());
		if(getWechat() != null) res.put("wechat", getWechat());
		if(getTelephone() != null) res.put("telephone", getTelephone());
		if(getWeibo() != null) res.put("weibo", getWeibo());
		if(getHobby() != null) res.put("hobby", getHobby());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getDateLatestLogin() != null) res.put("dateLatestLogin", getDateLatestLogin());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getQq() != null) res.put("qq", getQq());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("employeeId")) != null) setEmployeeId(__getInt(val)); 
		if((val = values.get("personalEmail")) != null) setPersonalEmail(__getString(val));
		if((val = values.get("mobile")) != null) setMobile(__getString(val));
		if((val = values.get("employeeType")) != null) setEmployeeType(__getInt(val)); 
		if((val = values.get("employeeName")) != null) setEmployeeName(__getString(val));
		if((val = values.get("employeeCode")) != null) setEmployeeCode(__getString(val));
		if((val = values.get("password")) != null) setPassword(__getString(val));
		if((val = values.get("dateJoined")) != null) setDateJoined(__getDate(val)); 
		if((val = values.get("birthday")) != null) setBirthday(__getDate(val)); 
		if((val = values.get("passwordRuleId")) != null) setPasswordRuleId(__getString(val));
		if((val = values.get("positionName")) != null) setPositionName(__getString(val));
		if((val = values.get("rankId")) != null) setRankId(__getString(val));
		if((val = values.get("managerId")) != null) setManagerId(__getInt(val)); 
		if((val = values.get("gender")) != null) setGender(__getByte(val));  
		if((val = values.get("relatedDepartmentId")) != null) setRelatedDepartmentId(__getInt(val)); 
		if((val = values.get("areaCode")) != null) setAreaCode(__getString(val));
		if((val = values.get("relatedBusiness")) != null) setRelatedBusiness(__getString(val));
		if((val = values.get("productLine")) != null) setProductLine(__getString(val));
		if((val = values.get("relatedProductLine")) != null) setRelatedProductLine(__getString(val));
		if((val = values.get("nickname")) != null) setNickname(__getString(val));
		if((val = values.get("statusEmployee")) != null) setStatusEmployee(__getByte(val));  
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("selfintro")) != null) setSelfintro(__getString(val));
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("extno")) != null) setExtno(__getString(val));
		if((val = values.get("expertise")) != null) setExpertise(__getString(val));
		if((val = values.get("wechat")) != null) setWechat(__getString(val));
		if((val = values.get("telephone")) != null) setTelephone(__getString(val));
		if((val = values.get("weibo")) != null) setWeibo(__getString(val));
		if((val = values.get("hobby")) != null) setHobby(__getString(val));
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("dateLatestLogin")) != null) setDateLatestLogin(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("qq")) != null) setQq(__getString(val));
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
	}

	protected java.lang.Integer  __employee_id ;
	protected java.lang.String  __personal_email ;
	protected java.lang.String  __mobile ;
	protected java.lang.Integer  __employee_type ;
	protected java.lang.String  __employee_name ;
	protected java.lang.String  __employee_code ;
	protected java.lang.String  __password ;
	protected java.util.Date  __date_joined ;
	protected java.util.Date  __birthday ;
	protected java.lang.String  __password_rule_id ;
	protected java.lang.String  __position_name ;
	protected java.lang.String  __rank_id ;
	protected java.lang.Integer  __manager_id ;
	protected java.lang.Byte  __gender ;
	protected java.lang.Integer  __related_department_id ;
	protected java.lang.String  __area_code ;
	protected java.lang.String  __related_business ;
	protected java.lang.String  __product_line ;
	protected java.lang.String  __related_product_line ;
	protected java.lang.String  __nickname ;
	protected java.lang.Byte  __status_employee ;
	protected java.util.Date  __date_updated ;
	protected java.lang.String  __selfintro ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.String  __extno ;
	protected java.lang.String  __expertise ;
	protected java.lang.String  __wechat ;
	protected java.lang.String  __telephone ;
	protected java.lang.String  __weibo ;
	protected java.lang.String  __hobby ;
	protected java.util.Date  __date_created ;
	protected java.util.Date  __date_latest_login ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.lang.String  __qq ;
	protected java.lang.Integer  __employee_id_updated ;
}
