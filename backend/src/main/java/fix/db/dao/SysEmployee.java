package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseSysEmployee;


public class SysEmployee extends AbstractTable<BaseSysEmployee>
{

	public SysEmployee() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 35;

		initTables();

		__tableName            = "sys_employees";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseSysEmployee.CS_EMPLOYEE_ID;
		__column_names[1] = BaseSysEmployee.CS_PERSONAL_EMAIL;
		__column_names[2] = BaseSysEmployee.CS_MOBILE;
		__column_names[3] = BaseSysEmployee.CS_EMPLOYEE_TYPE;
		__column_names[4] = BaseSysEmployee.CS_EMPLOYEE_NAME;
		__column_names[5] = BaseSysEmployee.CS_EMPLOYEE_CODE;
		__column_names[6] = BaseSysEmployee.CS_PASSWORD;
		__column_names[7] = BaseSysEmployee.CS_DATE_JOINED;
		__column_names[8] = BaseSysEmployee.CS_BIRTHDAY;
		__column_names[9] = BaseSysEmployee.CS_PASSWORD_RULE_ID;
		__column_names[10] = BaseSysEmployee.CS_POSITION_NAME;
		__column_names[11] = BaseSysEmployee.CS_RANK_ID;
		__column_names[12] = BaseSysEmployee.CS_MANAGER_ID;
		__column_names[13] = BaseSysEmployee.CS_GENDER;
		__column_names[14] = BaseSysEmployee.CS_RELATED_DEPARTMENT_ID;
		__column_names[15] = BaseSysEmployee.CS_AREA_CODE;
		__column_names[16] = BaseSysEmployee.CS_RELATED_BUSINESS;
		__column_names[17] = BaseSysEmployee.CS_PRODUCT_LINE;
		__column_names[18] = BaseSysEmployee.CS_RELATED_PRODUCT_LINE;
		__column_names[19] = BaseSysEmployee.CS_NICKNAME;
		__column_names[20] = BaseSysEmployee.CS_STATUS_EMPLOYEE;
		__column_names[21] = BaseSysEmployee.CS_DATE_UPDATED;
		__column_names[22] = BaseSysEmployee.CS_SELFINTRO;
		__column_names[23] = BaseSysEmployee.CS_DEPARTMENT_ID;
		__column_names[24] = BaseSysEmployee.CS_EXTNO;
		__column_names[25] = BaseSysEmployee.CS_EXPERTISE;
		__column_names[26] = BaseSysEmployee.CS_WECHAT;
		__column_names[27] = BaseSysEmployee.CS_TELEPHONE;
		__column_names[28] = BaseSysEmployee.CS_WEIBO;
		__column_names[29] = BaseSysEmployee.CS_HOBBY;
		__column_names[30] = BaseSysEmployee.CS_DATE_CREATED;
		__column_names[31] = BaseSysEmployee.CS_DATE_LATEST_LOGIN;
		__column_names[32] = BaseSysEmployee.CS_EMPLOYEE_ID_CREATED;
		__column_names[33] = BaseSysEmployee.CS_QQ;
		__column_names[34] = BaseSysEmployee.CS_EMPLOYEE_ID_UPDATED;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseSysEmployee b) {
		clear();
		setEmployeeIdClear(b.getEmployeeId());
	}

	public boolean isPrimaryKeyNull() {
		return getEmployeeId() == null;
	}

	@Override
	public BaseSysEmployee generateBase(){
		BaseSysEmployee b = new BaseSysEmployee();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseSysEmployee b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setEmployeeId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPersonalEmail(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPassword(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateJoined(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setBirthday(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setPasswordRuleId(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPositionName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setRankId(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setManagerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setGender(GenericBase.__getByte(val));
		if((val = __current_data[count++]) != null) b.setRelatedDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAreaCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setRelatedBusiness(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setProductLine(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setRelatedProductLine(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setNickname(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setStatusEmployee(GenericBase.__getByte(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setSelfintro(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setExtno(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setExpertise(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setWechat(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setTelephone(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setWeibo(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setHobby(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateLatestLogin(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setQq(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseSysEmployee b, Object[] buff){
		int count = 0;
		buff[count++] = b.getEmployeeId();
		buff[count++] = b.getPersonalEmail();
		buff[count++] = b.getMobile();
		buff[count++] = b.getEmployeeType();
		buff[count++] = b.getEmployeeName();
		buff[count++] = b.getEmployeeCode();
		buff[count++] = b.getPassword();
		buff[count++] = generateTimestampFromDate(b.getDateJoined());
		buff[count++] = generateTimestampFromDate(b.getBirthday());
		buff[count++] = b.getPasswordRuleId();
		buff[count++] = b.getPositionName();
		buff[count++] = b.getRankId();
		buff[count++] = b.getManagerId();
		buff[count++] = b.getGender();
		buff[count++] = b.getRelatedDepartmentId();
		buff[count++] = b.getAreaCode();
		buff[count++] = b.getRelatedBusiness();
		buff[count++] = b.getProductLine();
		buff[count++] = b.getRelatedProductLine();
		buff[count++] = b.getNickname();
		buff[count++] = b.getStatusEmployee();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getSelfintro();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getExtno();
		buff[count++] = b.getExpertise();
		buff[count++] = b.getWechat();
		buff[count++] = b.getTelephone();
		buff[count++] = b.getWeibo();
		buff[count++] = b.getHobby();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = generateTimestampFromDate(b.getDateLatestLogin());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = b.getQq();
		buff[count++] = b.getEmployeeIdUpdated();
	}

	@Override
	public void setDataFromBase(BaseSysEmployee b){
		if(b.getEmployeeId() != null) setEmployeeIdClear(b.getEmployeeId());
		if(b.getPersonalEmail() != null) setPersonalEmail(b.getPersonalEmail());
		if(b.getMobile() != null) setMobile(b.getMobile());
		if(b.getEmployeeType() != null) setEmployeeType(b.getEmployeeType());
		if(b.getEmployeeName() != null) setEmployeeName(b.getEmployeeName());
		if(b.getEmployeeCode() != null) setEmployeeCode(b.getEmployeeCode());
		if(b.getPassword() != null) setPassword(b.getPassword());
		if(b.getDateJoined() != null) setDateJoined(b.getDateJoined());
		if(b.getBirthday() != null) setBirthday(b.getBirthday());
		if(b.getPasswordRuleId() != null) setPasswordRuleId(b.getPasswordRuleId());
		if(b.getPositionName() != null) setPositionName(b.getPositionName());
		if(b.getRankId() != null) setRankId(b.getRankId());
		if(b.getManagerId() != null) setManagerId(b.getManagerId());
		if(b.getGender() != null) setGender(b.getGender());
		if(b.getRelatedDepartmentId() != null) setRelatedDepartmentId(b.getRelatedDepartmentId());
		if(b.getAreaCode() != null) setAreaCode(b.getAreaCode());
		if(b.getRelatedBusiness() != null) setRelatedBusiness(b.getRelatedBusiness());
		if(b.getProductLine() != null) setProductLine(b.getProductLine());
		if(b.getRelatedProductLine() != null) setRelatedProductLine(b.getRelatedProductLine());
		if(b.getNickname() != null) setNickname(b.getNickname());
		if(b.getStatusEmployee() != null) setStatusEmployee(b.getStatusEmployee());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getSelfintro() != null) setSelfintro(b.getSelfintro());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getExtno() != null) setExtno(b.getExtno());
		if(b.getExpertise() != null) setExpertise(b.getExpertise());
		if(b.getWechat() != null) setWechat(b.getWechat());
		if(b.getTelephone() != null) setTelephone(b.getTelephone());
		if(b.getWeibo() != null) setWeibo(b.getWeibo());
		if(b.getHobby() != null) setHobby(b.getHobby());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getDateLatestLogin() != null) setDateLatestLogin(b.getDateLatestLogin());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getQq() != null) setQq(b.getQq());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
	}

	@Override
	public BaseSysEmployee generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseSysEmployee b = new BaseSysEmployee();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseSysEmployee __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPersonalEmail(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPassword(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateJoined(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setBirthday(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPasswordRuleId(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPositionName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRankId(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setManagerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setGender(GenericBase.__getByte(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRelatedDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAreaCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRelatedBusiness(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setProductLine(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRelatedProductLine(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setNickname(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusEmployee(GenericBase.__getByte(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSelfintro(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setExtno(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setExpertise(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setWechat(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setTelephone(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setWeibo(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setHobby(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateLatestLogin(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQq(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
	}

	public void setEmployeeId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getEmployeeId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setEmployeeIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setPersonalEmail(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getPersonalEmail() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setMobile(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getMobile() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setEmployeeType(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getEmployeeType() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setEmployeeName(java.lang.String val) {
		setCurrentData(4, val);
	}

	public java.lang.String getEmployeeName() {
		return GenericBase.__getString(__current_data[4]);
	}

	public void setEmployeeCode(java.lang.String val) {
		setCurrentData(5, val);
	}

	public java.lang.String getEmployeeCode() {
		return GenericBase.__getString(__current_data[5]);
	}

	public void setPassword(java.lang.String val) {
		setCurrentData(6, val);
	}

	public java.lang.String getPassword() {
		return GenericBase.__getString(__current_data[6]);
	}

	public void setDateJoined(java.util.Date val) {
		setCurrentData(7, generateTimestampFromDate(val));
	}

	public java.util.Date getDateJoined() {
		return GenericBase.__getDateFromSQL(__current_data[7]);
	}

	public void setBirthday(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getBirthday() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setPasswordRuleId(java.lang.String val) {
		setCurrentData(9, val);
	}

	public java.lang.String getPasswordRuleId() {
		return GenericBase.__getString(__current_data[9]);
	}

	public void setPositionName(java.lang.String val) {
		setCurrentData(10, val);
	}

	public java.lang.String getPositionName() {
		return GenericBase.__getString(__current_data[10]);
	}

	public void setRankId(java.lang.String val) {
		setCurrentData(11, val);
	}

	public java.lang.String getRankId() {
		return GenericBase.__getString(__current_data[11]);
	}

	public void setManagerId(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getManagerId() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setGender(java.lang.Byte val) {
		setCurrentData(13, val);
	}

	public java.lang.Byte getGender() {
		return GenericBase.__getByte(__current_data[13]);
	}

	public void setRelatedDepartmentId(java.lang.Integer val) {
		setCurrentData(14, val);
	}

	public java.lang.Integer getRelatedDepartmentId() {
		return GenericBase.__getInt(__current_data[14]);
	}

	public void setAreaCode(java.lang.String val) {
		setCurrentData(15, val);
	}

	public java.lang.String getAreaCode() {
		return GenericBase.__getString(__current_data[15]);
	}

	public void setRelatedBusiness(java.lang.String val) {
		setCurrentData(16, val);
	}

	public java.lang.String getRelatedBusiness() {
		return GenericBase.__getString(__current_data[16]);
	}

	public void setProductLine(java.lang.String val) {
		setCurrentData(17, val);
	}

	public java.lang.String getProductLine() {
		return GenericBase.__getString(__current_data[17]);
	}

	public void setRelatedProductLine(java.lang.String val) {
		setCurrentData(18, val);
	}

	public java.lang.String getRelatedProductLine() {
		return GenericBase.__getString(__current_data[18]);
	}

	public void setNickname(java.lang.String val) {
		setCurrentData(19, val);
	}

	public java.lang.String getNickname() {
		return GenericBase.__getString(__current_data[19]);
	}

	public void setStatusEmployee(java.lang.Byte val) {
		setCurrentData(20, val);
	}

	public java.lang.Byte getStatusEmployee() {
		return GenericBase.__getByte(__current_data[20]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(21, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[21]);
	}

	public void setSelfintro(java.lang.String val) {
		setCurrentData(22, val);
	}

	public java.lang.String getSelfintro() {
		return GenericBase.__getString(__current_data[22]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(23, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[23]);
	}

	public void setExtno(java.lang.String val) {
		setCurrentData(24, val);
	}

	public java.lang.String getExtno() {
		return GenericBase.__getString(__current_data[24]);
	}

	public void setExpertise(java.lang.String val) {
		setCurrentData(25, val);
	}

	public java.lang.String getExpertise() {
		return GenericBase.__getString(__current_data[25]);
	}

	public void setWechat(java.lang.String val) {
		setCurrentData(26, val);
	}

	public java.lang.String getWechat() {
		return GenericBase.__getString(__current_data[26]);
	}

	public void setTelephone(java.lang.String val) {
		setCurrentData(27, val);
	}

	public java.lang.String getTelephone() {
		return GenericBase.__getString(__current_data[27]);
	}

	public void setWeibo(java.lang.String val) {
		setCurrentData(28, val);
	}

	public java.lang.String getWeibo() {
		return GenericBase.__getString(__current_data[28]);
	}

	public void setHobby(java.lang.String val) {
		setCurrentData(29, val);
	}

	public java.lang.String getHobby() {
		return GenericBase.__getString(__current_data[29]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(30, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[30]);
	}

	public void setDateLatestLogin(java.util.Date val) {
		setCurrentData(31, generateTimestampFromDate(val));
	}

	public java.util.Date getDateLatestLogin() {
		return GenericBase.__getDateFromSQL(__current_data[31]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(32, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[32]);
	}

	public void setQq(java.lang.String val) {
		setCurrentData(33, val);
	}

	public java.lang.String getQq() {
		return GenericBase.__getString(__current_data[33]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(34, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[34]);
	}

	public void setConditionEmployeeId(String op, java.lang.Integer val) {
		setConditionEmployeeId(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectEmployeeId(boolean val) {
		__select_flags[0] = val;
	}

	public void setEmployeeIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionPersonalEmail(String op, java.lang.String val) {
		setConditionPersonalEmail(op, val, CONDITION_AND);
	}

	public void setConditionPersonalEmail(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectPersonalEmail(boolean val) {
		__select_flags[1] = val;
	}

	public void setPersonalEmailExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionMobile(String op, java.lang.String val) {
		setConditionMobile(op, val, CONDITION_AND);
	}

	public void setConditionMobile(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectMobile(boolean val) {
		__select_flags[2] = val;
	}

	public void setMobileExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionEmployeeType(String op, java.lang.Integer val) {
		setConditionEmployeeType(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeType(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectEmployeeType(boolean val) {
		__select_flags[3] = val;
	}

	public void setEmployeeTypeExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionEmployeeName(String op, java.lang.String val) {
		setConditionEmployeeName(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeName(String op, java.lang.String val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectEmployeeName(boolean val) {
		__select_flags[4] = val;
	}

	public void setEmployeeNameExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionEmployeeCode(String op, java.lang.String val) {
		setConditionEmployeeCode(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeCode(String op, java.lang.String val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectEmployeeCode(boolean val) {
		__select_flags[5] = val;
	}

	public void setEmployeeCodeExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionPassword(String op, java.lang.String val) {
		setConditionPassword(op, val, CONDITION_AND);
	}

	public void setConditionPassword(String op, java.lang.String val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectPassword(boolean val) {
		__select_flags[6] = val;
	}

	public void setPasswordExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionDateJoined(String op, java.util.Date val) {
		setConditionDateJoined(op, val, CONDITION_AND);
	}

	public void setConditionDateJoined(String op, java.util.Date val, String relation) {
		addCondition(7, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateJoined(boolean val) {
		__select_flags[7] = val;
	}

	public void setDateJoinedExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionBirthday(String op, java.util.Date val) {
		setConditionBirthday(op, val, CONDITION_AND);
	}

	public void setConditionBirthday(String op, java.util.Date val, String relation) {
		addCondition(8, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectBirthday(boolean val) {
		__select_flags[8] = val;
	}

	public void setBirthdayExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionPasswordRuleId(String op, java.lang.String val) {
		setConditionPasswordRuleId(op, val, CONDITION_AND);
	}

	public void setConditionPasswordRuleId(String op, java.lang.String val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectPasswordRuleId(boolean val) {
		__select_flags[9] = val;
	}

	public void setPasswordRuleIdExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionPositionName(String op, java.lang.String val) {
		setConditionPositionName(op, val, CONDITION_AND);
	}

	public void setConditionPositionName(String op, java.lang.String val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectPositionName(boolean val) {
		__select_flags[10] = val;
	}

	public void setPositionNameExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionRankId(String op, java.lang.String val) {
		setConditionRankId(op, val, CONDITION_AND);
	}

	public void setConditionRankId(String op, java.lang.String val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectRankId(boolean val) {
		__select_flags[11] = val;
	}

	public void setRankIdExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionManagerId(String op, java.lang.Integer val) {
		setConditionManagerId(op, val, CONDITION_AND);
	}

	public void setConditionManagerId(String op, java.lang.Integer val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectManagerId(boolean val) {
		__select_flags[12] = val;
	}

	public void setManagerIdExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionGender(String op, java.lang.Byte val) {
		setConditionGender(op, val, CONDITION_AND);
	}

	public void setConditionGender(String op, java.lang.Byte val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectGender(boolean val) {
		__select_flags[13] = val;
	}

	public void setGenderExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionRelatedDepartmentId(String op, java.lang.Integer val) {
		setConditionRelatedDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionRelatedDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectRelatedDepartmentId(boolean val) {
		__select_flags[14] = val;
	}

	public void setRelatedDepartmentIdExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionAreaCode(String op, java.lang.String val) {
		setConditionAreaCode(op, val, CONDITION_AND);
	}

	public void setConditionAreaCode(String op, java.lang.String val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectAreaCode(boolean val) {
		__select_flags[15] = val;
	}

	public void setAreaCodeExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionRelatedBusiness(String op, java.lang.String val) {
		setConditionRelatedBusiness(op, val, CONDITION_AND);
	}

	public void setConditionRelatedBusiness(String op, java.lang.String val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectRelatedBusiness(boolean val) {
		__select_flags[16] = val;
	}

	public void setRelatedBusinessExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionProductLine(String op, java.lang.String val) {
		setConditionProductLine(op, val, CONDITION_AND);
	}

	public void setConditionProductLine(String op, java.lang.String val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectProductLine(boolean val) {
		__select_flags[17] = val;
	}

	public void setProductLineExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionRelatedProductLine(String op, java.lang.String val) {
		setConditionRelatedProductLine(op, val, CONDITION_AND);
	}

	public void setConditionRelatedProductLine(String op, java.lang.String val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectRelatedProductLine(boolean val) {
		__select_flags[18] = val;
	}

	public void setRelatedProductLineExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionNickname(String op, java.lang.String val) {
		setConditionNickname(op, val, CONDITION_AND);
	}

	public void setConditionNickname(String op, java.lang.String val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectNickname(boolean val) {
		__select_flags[19] = val;
	}

	public void setNicknameExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionStatusEmployee(String op, java.lang.Byte val) {
		setConditionStatusEmployee(op, val, CONDITION_AND);
	}

	public void setConditionStatusEmployee(String op, java.lang.Byte val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectStatusEmployee(boolean val) {
		__select_flags[20] = val;
	}

	public void setStatusEmployeeExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(21, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[21] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[21] = val;
	}

	public void setConditionSelfintro(String op, java.lang.String val) {
		setConditionSelfintro(op, val, CONDITION_AND);
	}

	public void setConditionSelfintro(String op, java.lang.String val, String relation) {
		addCondition(22, op, relation, val);
	}

	public void setSelectSelfintro(boolean val) {
		__select_flags[22] = val;
	}

	public void setSelfintroExpression(String val) {
		__dataExpressions[22] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(23, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[23] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[23] = val;
	}

	public void setConditionExtno(String op, java.lang.String val) {
		setConditionExtno(op, val, CONDITION_AND);
	}

	public void setConditionExtno(String op, java.lang.String val, String relation) {
		addCondition(24, op, relation, val);
	}

	public void setSelectExtno(boolean val) {
		__select_flags[24] = val;
	}

	public void setExtnoExpression(String val) {
		__dataExpressions[24] = val;
	}

	public void setConditionExpertise(String op, java.lang.String val) {
		setConditionExpertise(op, val, CONDITION_AND);
	}

	public void setConditionExpertise(String op, java.lang.String val, String relation) {
		addCondition(25, op, relation, val);
	}

	public void setSelectExpertise(boolean val) {
		__select_flags[25] = val;
	}

	public void setExpertiseExpression(String val) {
		__dataExpressions[25] = val;
	}

	public void setConditionWechat(String op, java.lang.String val) {
		setConditionWechat(op, val, CONDITION_AND);
	}

	public void setConditionWechat(String op, java.lang.String val, String relation) {
		addCondition(26, op, relation, val);
	}

	public void setSelectWechat(boolean val) {
		__select_flags[26] = val;
	}

	public void setWechatExpression(String val) {
		__dataExpressions[26] = val;
	}

	public void setConditionTelephone(String op, java.lang.String val) {
		setConditionTelephone(op, val, CONDITION_AND);
	}

	public void setConditionTelephone(String op, java.lang.String val, String relation) {
		addCondition(27, op, relation, val);
	}

	public void setSelectTelephone(boolean val) {
		__select_flags[27] = val;
	}

	public void setTelephoneExpression(String val) {
		__dataExpressions[27] = val;
	}

	public void setConditionWeibo(String op, java.lang.String val) {
		setConditionWeibo(op, val, CONDITION_AND);
	}

	public void setConditionWeibo(String op, java.lang.String val, String relation) {
		addCondition(28, op, relation, val);
	}

	public void setSelectWeibo(boolean val) {
		__select_flags[28] = val;
	}

	public void setWeiboExpression(String val) {
		__dataExpressions[28] = val;
	}

	public void setConditionHobby(String op, java.lang.String val) {
		setConditionHobby(op, val, CONDITION_AND);
	}

	public void setConditionHobby(String op, java.lang.String val, String relation) {
		addCondition(29, op, relation, val);
	}

	public void setSelectHobby(boolean val) {
		__select_flags[29] = val;
	}

	public void setHobbyExpression(String val) {
		__dataExpressions[29] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(30, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[30] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[30] = val;
	}

	public void setConditionDateLatestLogin(String op, java.util.Date val) {
		setConditionDateLatestLogin(op, val, CONDITION_AND);
	}

	public void setConditionDateLatestLogin(String op, java.util.Date val, String relation) {
		addCondition(31, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateLatestLogin(boolean val) {
		__select_flags[31] = val;
	}

	public void setDateLatestLoginExpression(String val) {
		__dataExpressions[31] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(32, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[32] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[32] = val;
	}

	public void setConditionQq(String op, java.lang.String val) {
		setConditionQq(op, val, CONDITION_AND);
	}

	public void setConditionQq(String op, java.lang.String val, String relation) {
		addCondition(33, op, relation, val);
	}

	public void setSelectQq(boolean val) {
		__select_flags[33] = val;
	}

	public void setQqExpression(String val) {
		__dataExpressions[33] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(34, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[34] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[34] = val;
	}


}

