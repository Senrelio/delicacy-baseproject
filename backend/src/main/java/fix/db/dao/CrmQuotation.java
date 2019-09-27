package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmQuotation;


public class CrmQuotation extends AbstractTable<BaseCrmQuotation>
{

	public CrmQuotation() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 25;

		initTables();

		__tableName            = "crm_quotations";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmQuotation.CS_QUOTATION_ID;
		__column_names[1] = BaseCrmQuotation.CS_QUOTATION_CODE;
		__column_names[2] = BaseCrmQuotation.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[3] = BaseCrmQuotation.CS_DEPARTMENT_ID;
		__column_names[4] = BaseCrmQuotation.CS_EMPLOYEE_ID_CREATED;
		__column_names[5] = BaseCrmQuotation.CS_DATE_CREATED;
		__column_names[6] = BaseCrmQuotation.CS_EMPLOYEE_ID_UPDATED;
		__column_names[7] = BaseCrmQuotation.CS_DATE_UPDATED;
		__column_names[8] = BaseCrmQuotation.CS_FLAG_LOCKED;
		__column_names[9] = BaseCrmQuotation.CS_CUSTOMER_NAME;
		__column_names[10] = BaseCrmQuotation.CS_OPPORTUNITY_NAME;
		__column_names[11] = BaseCrmQuotation.CS_QUOTATION_TITLE;
		__column_names[12] = BaseCrmQuotation.CS_DATE_VALIDATION;
		__column_names[13] = BaseCrmQuotation.CS_STAGE_QUOTATION;
		__column_names[14] = BaseCrmQuotation.CS_DATE_CALLED;
		__column_names[15] = BaseCrmQuotation.CS_DATE_LATEST_SYNC;
		__column_names[16] = BaseCrmQuotation.CS_SUM_QUOTATION;
		__column_names[17] = BaseCrmQuotation.CS_CONTACT_NAME;
		__column_names[18] = BaseCrmQuotation.CS_CONTACT_MOBILE;
		__column_names[19] = BaseCrmQuotation.CS_CONTACT_EMAIL;
		__column_names[20] = BaseCrmQuotation.CS_MEMO;
		__column_names[21] = BaseCrmQuotation.CS_PRICE_LIST_ID;
		__column_names[22] = BaseCrmQuotation.CS_SUM_LISTED;
		__column_names[23] = BaseCrmQuotation.CS_SUM_DISCOUNT;
		__column_names[24] = BaseCrmQuotation.CS_QUOTATION_MAIN;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmQuotation b) {
		clear();
		setQuotationIdClear(b.getQuotationId());
	}

	public boolean isPrimaryKeyNull() {
		return getQuotationId() == null;
	}

	@Override
	public BaseCrmQuotation generateBase(){
		BaseCrmQuotation b = new BaseCrmQuotation();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmQuotation b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setQuotationId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setQuotationCode(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setCustomerName(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOpportunityName(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setQuotationTitle(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateValidation(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setStageQuotation(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCalled(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateLatestSync(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setSumQuotation(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setContactName(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactMobile(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setContactEmail(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setPriceListId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setSumListed(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setSumDiscount(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setQuotationMain(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmQuotation b, Object[] buff){
		int count = 0;
		buff[count++] = b.getQuotationId();
		buff[count++] = b.getQuotationCode();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getCustomerName();
		buff[count++] = b.getOpportunityName();
		buff[count++] = b.getQuotationTitle();
		buff[count++] = generateTimestampFromDate(b.getDateValidation());
		buff[count++] = b.getStageQuotation();
		buff[count++] = generateTimestampFromDate(b.getDateCalled());
		buff[count++] = generateTimestampFromDate(b.getDateLatestSync());
		buff[count++] = b.getSumQuotation();
		buff[count++] = b.getContactName();
		buff[count++] = b.getContactMobile();
		buff[count++] = b.getContactEmail();
		buff[count++] = b.getMemo();
		buff[count++] = b.getPriceListId();
		buff[count++] = b.getSumListed();
		buff[count++] = b.getSumDiscount();
		buff[count++] = b.getQuotationMain();
	}

	@Override
	public void setDataFromBase(BaseCrmQuotation b){
		if(b.getQuotationId() != null) setQuotationIdClear(b.getQuotationId());
		if(b.getQuotationCode() != null) setQuotationCode(b.getQuotationCode());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getCustomerName() != null) setCustomerName(b.getCustomerName());
		if(b.getOpportunityName() != null) setOpportunityName(b.getOpportunityName());
		if(b.getQuotationTitle() != null) setQuotationTitle(b.getQuotationTitle());
		if(b.getDateValidation() != null) setDateValidation(b.getDateValidation());
		if(b.getStageQuotation() != null) setStageQuotation(b.getStageQuotation());
		if(b.getDateCalled() != null) setDateCalled(b.getDateCalled());
		if(b.getDateLatestSync() != null) setDateLatestSync(b.getDateLatestSync());
		if(b.getSumQuotation() != null) setSumQuotation(b.getSumQuotation());
		if(b.getContactName() != null) setContactName(b.getContactName());
		if(b.getContactMobile() != null) setContactMobile(b.getContactMobile());
		if(b.getContactEmail() != null) setContactEmail(b.getContactEmail());
		if(b.getMemo() != null) setMemo(b.getMemo());
		if(b.getPriceListId() != null) setPriceListId(b.getPriceListId());
		if(b.getSumListed() != null) setSumListed(b.getSumListed());
		if(b.getSumDiscount() != null) setSumDiscount(b.getSumDiscount());
		if(b.getQuotationMain() != null) setQuotationMain(b.getQuotationMain());
	}

	@Override
	public BaseCrmQuotation generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmQuotation b = new BaseCrmQuotation();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmQuotation __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuotationId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuotationCode(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerName(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityName(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuotationTitle(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateValidation(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStageQuotation(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCalled(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateLatestSync(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSumQuotation(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactName(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactMobile(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactEmail(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceListId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSumListed(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSumDiscount(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setQuotationMain(GenericBase.__getInt(val));
	}

	public void setQuotationId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getQuotationId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setQuotationIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setQuotationCode(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getQuotationCode() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(5, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[5]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(7, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[7]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(8, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[8]);
	}

	public void setCustomerName(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getCustomerName() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setOpportunityName(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getOpportunityName() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setQuotationTitle(java.lang.String val) {
		setCurrentData(11, val);
	}

	public java.lang.String getQuotationTitle() {
		return GenericBase.__getString(__current_data[11]);
	}

	public void setDateValidation(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateValidation() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setStageQuotation(java.lang.Integer val) {
		setCurrentData(13, val);
	}

	public java.lang.Integer getStageQuotation() {
		return GenericBase.__getInt(__current_data[13]);
	}

	public void setDateCalled(java.util.Date val) {
		setCurrentData(14, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCalled() {
		return GenericBase.__getDateFromSQL(__current_data[14]);
	}

	public void setDateLatestSync(java.util.Date val) {
		setCurrentData(15, generateTimestampFromDate(val));
	}

	public java.util.Date getDateLatestSync() {
		return GenericBase.__getDateFromSQL(__current_data[15]);
	}

	public void setSumQuotation(java.math.BigDecimal val) {
		setCurrentData(16, val);
	}

	public java.math.BigDecimal getSumQuotation() {
		return GenericBase.__getDecimal(__current_data[16]);
	}

	public void setContactName(java.lang.Integer val) {
		setCurrentData(17, val);
	}

	public java.lang.Integer getContactName() {
		return GenericBase.__getInt(__current_data[17]);
	}

	public void setContactMobile(java.lang.String val) {
		setCurrentData(18, val);
	}

	public java.lang.String getContactMobile() {
		return GenericBase.__getString(__current_data[18]);
	}

	public void setContactEmail(java.lang.String val) {
		setCurrentData(19, val);
	}

	public java.lang.String getContactEmail() {
		return GenericBase.__getString(__current_data[19]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(20, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[20]);
	}

	public void setPriceListId(java.lang.Integer val) {
		setCurrentData(21, val);
	}

	public java.lang.Integer getPriceListId() {
		return GenericBase.__getInt(__current_data[21]);
	}

	public void setSumListed(java.math.BigDecimal val) {
		setCurrentData(22, val);
	}

	public java.math.BigDecimal getSumListed() {
		return GenericBase.__getDecimal(__current_data[22]);
	}

	public void setSumDiscount(java.math.BigDecimal val) {
		setCurrentData(23, val);
	}

	public java.math.BigDecimal getSumDiscount() {
		return GenericBase.__getDecimal(__current_data[23]);
	}

	public void setQuotationMain(java.lang.Integer val) {
		setCurrentData(24, val);
	}

	public java.lang.Integer getQuotationMain() {
		return GenericBase.__getInt(__current_data[24]);
	}

	public void setConditionQuotationId(String op, java.lang.Integer val) {
		setConditionQuotationId(op, val, CONDITION_AND);
	}

	public void setConditionQuotationId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectQuotationId(boolean val) {
		__select_flags[0] = val;
	}

	public void setQuotationIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionQuotationCode(String op, java.lang.Integer val) {
		setConditionQuotationCode(op, val, CONDITION_AND);
	}

	public void setConditionQuotationCode(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectQuotationCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setQuotationCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val) {
		setConditionEmployeeIdMaintainer(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectEmployeeIdMaintainer(boolean val) {
		__select_flags[2] = val;
	}

	public void setEmployeeIdMaintainerExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[3] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[4] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(5, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[5] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[6] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(7, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[7] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[8] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionCustomerName(String op, java.lang.Integer val) {
		setConditionCustomerName(op, val, CONDITION_AND);
	}

	public void setConditionCustomerName(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectCustomerName(boolean val) {
		__select_flags[9] = val;
	}

	public void setCustomerNameExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionOpportunityName(String op, java.lang.Integer val) {
		setConditionOpportunityName(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityName(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectOpportunityName(boolean val) {
		__select_flags[10] = val;
	}

	public void setOpportunityNameExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionQuotationTitle(String op, java.lang.String val) {
		setConditionQuotationTitle(op, val, CONDITION_AND);
	}

	public void setConditionQuotationTitle(String op, java.lang.String val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectQuotationTitle(boolean val) {
		__select_flags[11] = val;
	}

	public void setQuotationTitleExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionDateValidation(String op, java.util.Date val) {
		setConditionDateValidation(op, val, CONDITION_AND);
	}

	public void setConditionDateValidation(String op, java.util.Date val, String relation) {
		addCondition(12, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateValidation(boolean val) {
		__select_flags[12] = val;
	}

	public void setDateValidationExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionStageQuotation(String op, java.lang.Integer val) {
		setConditionStageQuotation(op, val, CONDITION_AND);
	}

	public void setConditionStageQuotation(String op, java.lang.Integer val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectStageQuotation(boolean val) {
		__select_flags[13] = val;
	}

	public void setStageQuotationExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionDateCalled(String op, java.util.Date val) {
		setConditionDateCalled(op, val, CONDITION_AND);
	}

	public void setConditionDateCalled(String op, java.util.Date val, String relation) {
		addCondition(14, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCalled(boolean val) {
		__select_flags[14] = val;
	}

	public void setDateCalledExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionDateLatestSync(String op, java.util.Date val) {
		setConditionDateLatestSync(op, val, CONDITION_AND);
	}

	public void setConditionDateLatestSync(String op, java.util.Date val, String relation) {
		addCondition(15, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateLatestSync(boolean val) {
		__select_flags[15] = val;
	}

	public void setDateLatestSyncExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionSumQuotation(String op, java.math.BigDecimal val) {
		setConditionSumQuotation(op, val, CONDITION_AND);
	}

	public void setConditionSumQuotation(String op, java.math.BigDecimal val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectSumQuotation(boolean val) {
		__select_flags[16] = val;
	}

	public void setSumQuotationExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionContactName(String op, java.lang.Integer val) {
		setConditionContactName(op, val, CONDITION_AND);
	}

	public void setConditionContactName(String op, java.lang.Integer val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectContactName(boolean val) {
		__select_flags[17] = val;
	}

	public void setContactNameExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionContactMobile(String op, java.lang.String val) {
		setConditionContactMobile(op, val, CONDITION_AND);
	}

	public void setConditionContactMobile(String op, java.lang.String val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectContactMobile(boolean val) {
		__select_flags[18] = val;
	}

	public void setContactMobileExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionContactEmail(String op, java.lang.String val) {
		setConditionContactEmail(op, val, CONDITION_AND);
	}

	public void setConditionContactEmail(String op, java.lang.String val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectContactEmail(boolean val) {
		__select_flags[19] = val;
	}

	public void setContactEmailExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[20] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionPriceListId(String op, java.lang.Integer val) {
		setConditionPriceListId(op, val, CONDITION_AND);
	}

	public void setConditionPriceListId(String op, java.lang.Integer val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectPriceListId(boolean val) {
		__select_flags[21] = val;
	}

	public void setPriceListIdExpression(String val) {
		__dataExpressions[21] = val;
	}

	public void setConditionSumListed(String op, java.math.BigDecimal val) {
		setConditionSumListed(op, val, CONDITION_AND);
	}

	public void setConditionSumListed(String op, java.math.BigDecimal val, String relation) {
		addCondition(22, op, relation, val);
	}

	public void setSelectSumListed(boolean val) {
		__select_flags[22] = val;
	}

	public void setSumListedExpression(String val) {
		__dataExpressions[22] = val;
	}

	public void setConditionSumDiscount(String op, java.math.BigDecimal val) {
		setConditionSumDiscount(op, val, CONDITION_AND);
	}

	public void setConditionSumDiscount(String op, java.math.BigDecimal val, String relation) {
		addCondition(23, op, relation, val);
	}

	public void setSelectSumDiscount(boolean val) {
		__select_flags[23] = val;
	}

	public void setSumDiscountExpression(String val) {
		__dataExpressions[23] = val;
	}

	public void setConditionQuotationMain(String op, java.lang.Integer val) {
		setConditionQuotationMain(op, val, CONDITION_AND);
	}

	public void setConditionQuotationMain(String op, java.lang.Integer val, String relation) {
		addCondition(24, op, relation, val);
	}

	public void setSelectQuotationMain(boolean val) {
		__select_flags[24] = val;
	}

	public void setQuotationMainExpression(String val) {
		__dataExpressions[24] = val;
	}


}

