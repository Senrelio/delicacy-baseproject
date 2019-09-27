package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmCustomer;


public class CrmCustomer extends AbstractTable<BaseCrmCustomer>
{

	public CrmCustomer() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 33;

		initTables();

		__tableName            = "crm_customers";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmCustomer.CS_CUSTOMER_ID;
		__column_names[1] = BaseCrmCustomer.CS_CUSTOMER_CODE;
		__column_names[2] = BaseCrmCustomer.CS_LEAD_ID;
		__column_names[3] = BaseCrmCustomer.CS_ENTITY_TYPE;
		__column_names[4] = BaseCrmCustomer.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[5] = BaseCrmCustomer.CS_CUSTOMER_NAME;
		__column_names[6] = BaseCrmCustomer.CS_LEVEL;
		__column_names[7] = BaseCrmCustomer.CS_PARENT_CUSTOMER_ID;
		__column_names[8] = BaseCrmCustomer.CS_INDUSTRY_ID;
		__column_names[9] = BaseCrmCustomer.CS_AREA_PROVINCE;
		__column_names[10] = BaseCrmCustomer.CS_AREA_CITY;
		__column_names[11] = BaseCrmCustomer.CS_AREA_DISTRICT;
		__column_names[12] = BaseCrmCustomer.CS_DATE_LATEST_ACTIVITY;
		__column_names[13] = BaseCrmCustomer.CS_EMPLOYEE_ID_LATEST_FOLLOWUP;
		__column_names[14] = BaseCrmCustomer.CS_DATE_CREATED;
		__column_names[15] = BaseCrmCustomer.CS_EMPLOYEE_ID_CREATED;
		__column_names[16] = BaseCrmCustomer.CS_DATE_UPDATED;
		__column_names[17] = BaseCrmCustomer.CS_EMPLOYEE_ID_UPDATED;
		__column_names[18] = BaseCrmCustomer.CS_DEPARTMENT_ID;
		__column_names[19] = BaseCrmCustomer.CS_FLAG_LOCKED;
		__column_names[20] = BaseCrmCustomer.CS_FLAG_INDUSTRIAL_COMMERCIAL_REGISTERED;
		__column_names[21] = BaseCrmCustomer.CS_FLAG_NO_DISTURB;
		__column_names[22] = BaseCrmCustomer.CS_DATE_LATEST_VISIT;
		__column_names[23] = BaseCrmCustomer.CS_DAYCOUNT_NOT_VISITED;
		__column_names[24] = BaseCrmCustomer.CS_DETAILED_ADDRESS;
		__column_names[25] = BaseCrmCustomer.CS_POSTCODE;
		__column_names[26] = BaseCrmCustomer.CS_TELEPHONE;
		__column_names[27] = BaseCrmCustomer.CS_FAX;
		__column_names[28] = BaseCrmCustomer.CS_COMPANY_WEBSITE_LINK;
		__column_names[29] = BaseCrmCustomer.CS_WEIBO;
		__column_names[30] = BaseCrmCustomer.CS_NUMBER_EMPLOYEES;
		__column_names[31] = BaseCrmCustomer.CS_ANNUAL_REVENUE;
		__column_names[32] = BaseCrmCustomer.CS_MEMO;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmCustomer b) {
		clear();
		setCustomerIdClear(b.getCustomerId());
	}

	public boolean isPrimaryKeyNull() {
		return getCustomerId() == null;
	}

	@Override
	public BaseCrmCustomer generateBase(){
		BaseCrmCustomer b = new BaseCrmCustomer();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmCustomer b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomerCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setLeadId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomerName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setLevel(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setParentCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setIndustryId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAreaProvince(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAreaCity(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAreaDistrict(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdLatestFollowup(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setFlagIndustrialCommercialRegistered(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setFlagNoDisturb(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setDateLatestVisit(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDaycountNotVisited(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDetailedAddress(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPostcode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setTelephone(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setFax(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCompanyWebsiteLink(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setWeibo(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setNumberEmployees(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setAnnualRevenue(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmCustomer b, Object[] buff){
		int count = 0;
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getCustomerCode();
		buff[count++] = b.getLeadId();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getCustomerName();
		buff[count++] = b.getLevel();
		buff[count++] = b.getParentCustomerId();
		buff[count++] = b.getIndustryId();
		buff[count++] = b.getAreaProvince();
		buff[count++] = b.getAreaCity();
		buff[count++] = b.getAreaDistrict();
		buff[count++] = generateTimestampFromDate(b.getDateLatestActivity());
		buff[count++] = b.getEmployeeIdLatestFollowup();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getFlagIndustrialCommercialRegistered();
		buff[count++] = b.getFlagNoDisturb();
		buff[count++] = generateTimestampFromDate(b.getDateLatestVisit());
		buff[count++] = b.getDaycountNotVisited();
		buff[count++] = b.getDetailedAddress();
		buff[count++] = b.getPostcode();
		buff[count++] = b.getTelephone();
		buff[count++] = b.getFax();
		buff[count++] = b.getCompanyWebsiteLink();
		buff[count++] = b.getWeibo();
		buff[count++] = b.getNumberEmployees();
		buff[count++] = b.getAnnualRevenue();
		buff[count++] = b.getMemo();
	}

	@Override
	public void setDataFromBase(BaseCrmCustomer b){
		if(b.getCustomerId() != null) setCustomerIdClear(b.getCustomerId());
		if(b.getCustomerCode() != null) setCustomerCode(b.getCustomerCode());
		if(b.getLeadId() != null) setLeadId(b.getLeadId());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getCustomerName() != null) setCustomerName(b.getCustomerName());
		if(b.getLevel() != null) setLevel(b.getLevel());
		if(b.getParentCustomerId() != null) setParentCustomerId(b.getParentCustomerId());
		if(b.getIndustryId() != null) setIndustryId(b.getIndustryId());
		if(b.getAreaProvince() != null) setAreaProvince(b.getAreaProvince());
		if(b.getAreaCity() != null) setAreaCity(b.getAreaCity());
		if(b.getAreaDistrict() != null) setAreaDistrict(b.getAreaDistrict());
		if(b.getDateLatestActivity() != null) setDateLatestActivity(b.getDateLatestActivity());
		if(b.getEmployeeIdLatestFollowup() != null) setEmployeeIdLatestFollowup(b.getEmployeeIdLatestFollowup());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getFlagIndustrialCommercialRegistered() != null) setFlagIndustrialCommercialRegistered(b.getFlagIndustrialCommercialRegistered());
		if(b.getFlagNoDisturb() != null) setFlagNoDisturb(b.getFlagNoDisturb());
		if(b.getDateLatestVisit() != null) setDateLatestVisit(b.getDateLatestVisit());
		if(b.getDaycountNotVisited() != null) setDaycountNotVisited(b.getDaycountNotVisited());
		if(b.getDetailedAddress() != null) setDetailedAddress(b.getDetailedAddress());
		if(b.getPostcode() != null) setPostcode(b.getPostcode());
		if(b.getTelephone() != null) setTelephone(b.getTelephone());
		if(b.getFax() != null) setFax(b.getFax());
		if(b.getCompanyWebsiteLink() != null) setCompanyWebsiteLink(b.getCompanyWebsiteLink());
		if(b.getWeibo() != null) setWeibo(b.getWeibo());
		if(b.getNumberEmployees() != null) setNumberEmployees(b.getNumberEmployees());
		if(b.getAnnualRevenue() != null) setAnnualRevenue(b.getAnnualRevenue());
		if(b.getMemo() != null) setMemo(b.getMemo());
	}

	@Override
	public BaseCrmCustomer generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmCustomer b = new BaseCrmCustomer();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmCustomer __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setLeadId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setLevel(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setParentCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setIndustryId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAreaProvince(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAreaCity(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAreaDistrict(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdLatestFollowup(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagIndustrialCommercialRegistered(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagNoDisturb(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateLatestVisit(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDaycountNotVisited(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDetailedAddress(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPostcode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setTelephone(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFax(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCompanyWebsiteLink(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setWeibo(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setNumberEmployees(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAnnualRevenue(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setCustomerIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setCustomerCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getCustomerCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setLeadId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getLeadId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setCustomerName(java.lang.String val) {
		setCurrentData(5, val);
	}

	public java.lang.String getCustomerName() {
		return GenericBase.__getString(__current_data[5]);
	}

	public void setLevel(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getLevel() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setParentCustomerId(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getParentCustomerId() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setIndustryId(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getIndustryId() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setAreaProvince(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getAreaProvince() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setAreaCity(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getAreaCity() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setAreaDistrict(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getAreaDistrict() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setDateLatestActivity(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateLatestActivity() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setEmployeeIdLatestFollowup(java.lang.Integer val) {
		setCurrentData(13, val);
	}

	public java.lang.Integer getEmployeeIdLatestFollowup() {
		return GenericBase.__getInt(__current_data[13]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(14, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[14]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(16, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[16]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(17, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[17]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(18, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[18]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(19, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[19]);
	}

	public void setFlagIndustrialCommercialRegistered(java.lang.Boolean val) {
		setCurrentData(20, val);
	}

	public java.lang.Boolean getFlagIndustrialCommercialRegistered() {
		return GenericBase.__getBoolean(__current_data[20]);
	}

	public void setFlagNoDisturb(java.lang.Boolean val) {
		setCurrentData(21, val);
	}

	public java.lang.Boolean getFlagNoDisturb() {
		return GenericBase.__getBoolean(__current_data[21]);
	}

	public void setDateLatestVisit(java.util.Date val) {
		setCurrentData(22, generateTimestampFromDate(val));
	}

	public java.util.Date getDateLatestVisit() {
		return GenericBase.__getDateFromSQL(__current_data[22]);
	}

	public void setDaycountNotVisited(java.lang.Integer val) {
		setCurrentData(23, val);
	}

	public java.lang.Integer getDaycountNotVisited() {
		return GenericBase.__getInt(__current_data[23]);
	}

	public void setDetailedAddress(java.lang.String val) {
		setCurrentData(24, val);
	}

	public java.lang.String getDetailedAddress() {
		return GenericBase.__getString(__current_data[24]);
	}

	public void setPostcode(java.lang.String val) {
		setCurrentData(25, val);
	}

	public java.lang.String getPostcode() {
		return GenericBase.__getString(__current_data[25]);
	}

	public void setTelephone(java.lang.String val) {
		setCurrentData(26, val);
	}

	public java.lang.String getTelephone() {
		return GenericBase.__getString(__current_data[26]);
	}

	public void setFax(java.lang.String val) {
		setCurrentData(27, val);
	}

	public java.lang.String getFax() {
		return GenericBase.__getString(__current_data[27]);
	}

	public void setCompanyWebsiteLink(java.lang.String val) {
		setCurrentData(28, val);
	}

	public java.lang.String getCompanyWebsiteLink() {
		return GenericBase.__getString(__current_data[28]);
	}

	public void setWeibo(java.lang.String val) {
		setCurrentData(29, val);
	}

	public java.lang.String getWeibo() {
		return GenericBase.__getString(__current_data[29]);
	}

	public void setNumberEmployees(java.lang.Integer val) {
		setCurrentData(30, val);
	}

	public java.lang.Integer getNumberEmployees() {
		return GenericBase.__getInt(__current_data[30]);
	}

	public void setAnnualRevenue(java.math.BigDecimal val) {
		setCurrentData(31, val);
	}

	public java.math.BigDecimal getAnnualRevenue() {
		return GenericBase.__getDecimal(__current_data[31]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(32, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[32]);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val) {
		setConditionCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectCustomerId(boolean val) {
		__select_flags[0] = val;
	}

	public void setCustomerIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionCustomerCode(String op, java.lang.String val) {
		setConditionCustomerCode(op, val, CONDITION_AND);
	}

	public void setConditionCustomerCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectCustomerCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setCustomerCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionLeadId(String op, java.lang.Integer val) {
		setConditionLeadId(op, val, CONDITION_AND);
	}

	public void setConditionLeadId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectLeadId(boolean val) {
		__select_flags[2] = val;
	}

	public void setLeadIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionEntityType(String op, java.lang.Integer val) {
		setConditionEntityType(op, val, CONDITION_AND);
	}

	public void setConditionEntityType(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectEntityType(boolean val) {
		__select_flags[3] = val;
	}

	public void setEntityTypeExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val) {
		setConditionEmployeeIdMaintainer(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectEmployeeIdMaintainer(boolean val) {
		__select_flags[4] = val;
	}

	public void setEmployeeIdMaintainerExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionCustomerName(String op, java.lang.String val) {
		setConditionCustomerName(op, val, CONDITION_AND);
	}

	public void setConditionCustomerName(String op, java.lang.String val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectCustomerName(boolean val) {
		__select_flags[5] = val;
	}

	public void setCustomerNameExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionLevel(String op, java.lang.Integer val) {
		setConditionLevel(op, val, CONDITION_AND);
	}

	public void setConditionLevel(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectLevel(boolean val) {
		__select_flags[6] = val;
	}

	public void setLevelExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionParentCustomerId(String op, java.lang.Integer val) {
		setConditionParentCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionParentCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectParentCustomerId(boolean val) {
		__select_flags[7] = val;
	}

	public void setParentCustomerIdExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionIndustryId(String op, java.lang.Integer val) {
		setConditionIndustryId(op, val, CONDITION_AND);
	}

	public void setConditionIndustryId(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectIndustryId(boolean val) {
		__select_flags[8] = val;
	}

	public void setIndustryIdExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionAreaProvince(String op, java.lang.Integer val) {
		setConditionAreaProvince(op, val, CONDITION_AND);
	}

	public void setConditionAreaProvince(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectAreaProvince(boolean val) {
		__select_flags[9] = val;
	}

	public void setAreaProvinceExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionAreaCity(String op, java.lang.Integer val) {
		setConditionAreaCity(op, val, CONDITION_AND);
	}

	public void setConditionAreaCity(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectAreaCity(boolean val) {
		__select_flags[10] = val;
	}

	public void setAreaCityExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionAreaDistrict(String op, java.lang.Integer val) {
		setConditionAreaDistrict(op, val, CONDITION_AND);
	}

	public void setConditionAreaDistrict(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectAreaDistrict(boolean val) {
		__select_flags[11] = val;
	}

	public void setAreaDistrictExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionDateLatestActivity(String op, java.util.Date val) {
		setConditionDateLatestActivity(op, val, CONDITION_AND);
	}

	public void setConditionDateLatestActivity(String op, java.util.Date val, String relation) {
		addCondition(12, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateLatestActivity(boolean val) {
		__select_flags[12] = val;
	}

	public void setDateLatestActivityExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionEmployeeIdLatestFollowup(String op, java.lang.Integer val) {
		setConditionEmployeeIdLatestFollowup(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdLatestFollowup(String op, java.lang.Integer val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectEmployeeIdLatestFollowup(boolean val) {
		__select_flags[13] = val;
	}

	public void setEmployeeIdLatestFollowupExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(14, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[14] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[15] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(16, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[16] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[17] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[18] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[19] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionFlagIndustrialCommercialRegistered(String op, java.lang.Boolean val) {
		setConditionFlagIndustrialCommercialRegistered(op, val, CONDITION_AND);
	}

	public void setConditionFlagIndustrialCommercialRegistered(String op, java.lang.Boolean val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectFlagIndustrialCommercialRegistered(boolean val) {
		__select_flags[20] = val;
	}

	public void setFlagIndustrialCommercialRegisteredExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionFlagNoDisturb(String op, java.lang.Boolean val) {
		setConditionFlagNoDisturb(op, val, CONDITION_AND);
	}

	public void setConditionFlagNoDisturb(String op, java.lang.Boolean val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectFlagNoDisturb(boolean val) {
		__select_flags[21] = val;
	}

	public void setFlagNoDisturbExpression(String val) {
		__dataExpressions[21] = val;
	}

	public void setConditionDateLatestVisit(String op, java.util.Date val) {
		setConditionDateLatestVisit(op, val, CONDITION_AND);
	}

	public void setConditionDateLatestVisit(String op, java.util.Date val, String relation) {
		addCondition(22, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateLatestVisit(boolean val) {
		__select_flags[22] = val;
	}

	public void setDateLatestVisitExpression(String val) {
		__dataExpressions[22] = val;
	}

	public void setConditionDaycountNotVisited(String op, java.lang.Integer val) {
		setConditionDaycountNotVisited(op, val, CONDITION_AND);
	}

	public void setConditionDaycountNotVisited(String op, java.lang.Integer val, String relation) {
		addCondition(23, op, relation, val);
	}

	public void setSelectDaycountNotVisited(boolean val) {
		__select_flags[23] = val;
	}

	public void setDaycountNotVisitedExpression(String val) {
		__dataExpressions[23] = val;
	}

	public void setConditionDetailedAddress(String op, java.lang.String val) {
		setConditionDetailedAddress(op, val, CONDITION_AND);
	}

	public void setConditionDetailedAddress(String op, java.lang.String val, String relation) {
		addCondition(24, op, relation, val);
	}

	public void setSelectDetailedAddress(boolean val) {
		__select_flags[24] = val;
	}

	public void setDetailedAddressExpression(String val) {
		__dataExpressions[24] = val;
	}

	public void setConditionPostcode(String op, java.lang.String val) {
		setConditionPostcode(op, val, CONDITION_AND);
	}

	public void setConditionPostcode(String op, java.lang.String val, String relation) {
		addCondition(25, op, relation, val);
	}

	public void setSelectPostcode(boolean val) {
		__select_flags[25] = val;
	}

	public void setPostcodeExpression(String val) {
		__dataExpressions[25] = val;
	}

	public void setConditionTelephone(String op, java.lang.String val) {
		setConditionTelephone(op, val, CONDITION_AND);
	}

	public void setConditionTelephone(String op, java.lang.String val, String relation) {
		addCondition(26, op, relation, val);
	}

	public void setSelectTelephone(boolean val) {
		__select_flags[26] = val;
	}

	public void setTelephoneExpression(String val) {
		__dataExpressions[26] = val;
	}

	public void setConditionFax(String op, java.lang.String val) {
		setConditionFax(op, val, CONDITION_AND);
	}

	public void setConditionFax(String op, java.lang.String val, String relation) {
		addCondition(27, op, relation, val);
	}

	public void setSelectFax(boolean val) {
		__select_flags[27] = val;
	}

	public void setFaxExpression(String val) {
		__dataExpressions[27] = val;
	}

	public void setConditionCompanyWebsiteLink(String op, java.lang.String val) {
		setConditionCompanyWebsiteLink(op, val, CONDITION_AND);
	}

	public void setConditionCompanyWebsiteLink(String op, java.lang.String val, String relation) {
		addCondition(28, op, relation, val);
	}

	public void setSelectCompanyWebsiteLink(boolean val) {
		__select_flags[28] = val;
	}

	public void setCompanyWebsiteLinkExpression(String val) {
		__dataExpressions[28] = val;
	}

	public void setConditionWeibo(String op, java.lang.String val) {
		setConditionWeibo(op, val, CONDITION_AND);
	}

	public void setConditionWeibo(String op, java.lang.String val, String relation) {
		addCondition(29, op, relation, val);
	}

	public void setSelectWeibo(boolean val) {
		__select_flags[29] = val;
	}

	public void setWeiboExpression(String val) {
		__dataExpressions[29] = val;
	}

	public void setConditionNumberEmployees(String op, java.lang.Integer val) {
		setConditionNumberEmployees(op, val, CONDITION_AND);
	}

	public void setConditionNumberEmployees(String op, java.lang.Integer val, String relation) {
		addCondition(30, op, relation, val);
	}

	public void setSelectNumberEmployees(boolean val) {
		__select_flags[30] = val;
	}

	public void setNumberEmployeesExpression(String val) {
		__dataExpressions[30] = val;
	}

	public void setConditionAnnualRevenue(String op, java.math.BigDecimal val) {
		setConditionAnnualRevenue(op, val, CONDITION_AND);
	}

	public void setConditionAnnualRevenue(String op, java.math.BigDecimal val, String relation) {
		addCondition(31, op, relation, val);
	}

	public void setSelectAnnualRevenue(boolean val) {
		__select_flags[31] = val;
	}

	public void setAnnualRevenueExpression(String val) {
		__dataExpressions[31] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(32, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[32] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[32] = val;
	}


}

