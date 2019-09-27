package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmOpportunity;


public class CrmOpportunity extends AbstractTable<BaseCrmOpportunity>
{

	public CrmOpportunity() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 27;

		initTables();

		__tableName            = "crm_opportunities";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmOpportunity.CS_OPPORTUNITY_ID;
		__column_names[1] = BaseCrmOpportunity.CS_ENTITY_TYPE;
		__column_names[2] = BaseCrmOpportunity.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[3] = BaseCrmOpportunity.CS_OPPORTUNITY_NAME;
		__column_names[4] = BaseCrmOpportunity.CS_CUSTOMER_ID;
		__column_names[5] = BaseCrmOpportunity.CS_PRICE_LIST_ID;
		__column_names[6] = BaseCrmOpportunity.CS_OPPORTUNITY_TYPE;
		__column_names[7] = BaseCrmOpportunity.CS_SALES_AMOUNT;
		__column_names[8] = BaseCrmOpportunity.CS_SALES_STAGE_ID;
		__column_names[9] = BaseCrmOpportunity.CS_SALES_STAGE_LOST_ID;
		__column_names[10] = BaseCrmOpportunity.CS_WINRATE;
		__column_names[11] = BaseCrmOpportunity.CS_DESCRIPTION_LOST;
		__column_names[12] = BaseCrmOpportunity.CS_REASON_LOST;
		__column_names[13] = BaseCrmOpportunity.CS_DATE_CLOSE_OPPORTUNITY;
		__column_names[14] = BaseCrmOpportunity.CS_FLAG_PROMISED_BY_CUSTOMER;
		__column_names[15] = BaseCrmOpportunity.CS_BUDGET_PROJECT;
		__column_names[16] = BaseCrmOpportunity.CS_COST_ACTUAL;
		__column_names[17] = BaseCrmOpportunity.CS_DATE_STAGE_UPDATED;
		__column_names[18] = BaseCrmOpportunity.CS_DATE_LATEST_ACTIVITY;
		__column_names[19] = BaseCrmOpportunity.CS_DATE_CREATED;
		__column_names[20] = BaseCrmOpportunity.CS_EMPLOYEE_ID_CREATED;
		__column_names[21] = BaseCrmOpportunity.CS_DATE_UPDATED;
		__column_names[22] = BaseCrmOpportunity.CS_EMPLOYEE_ID_UPDATED;
		__column_names[23] = BaseCrmOpportunity.CS_DEPARTMENT_ID;
		__column_names[24] = BaseCrmOpportunity.CS_FLAG_LOCKED;
		__column_names[25] = BaseCrmOpportunity.CS_LEAD_ID;
		__column_names[26] = BaseCrmOpportunity.CS_MEMO;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmOpportunity b) {
		clear();
		setOpportunityIdClear(b.getOpportunityId());
	}

	public boolean isPrimaryKeyNull() {
		return getOpportunityId() == null;
	}

	@Override
	public BaseCrmOpportunity generateBase(){
		BaseCrmOpportunity b = new BaseCrmOpportunity();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmOpportunity b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setOpportunityId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOpportunityName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPriceListId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOpportunityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setSalesAmount(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setSalesStageId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setSalesStageLostId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setWinrate(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDescriptionLost(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setReasonLost(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCloseOpportunity(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setFlagPromisedByCustomer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setBudgetProject(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setCostActual(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setDateStageUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setLeadId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmOpportunity b, Object[] buff){
		int count = 0;
		buff[count++] = b.getOpportunityId();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = b.getOpportunityName();
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getPriceListId();
		buff[count++] = b.getOpportunityType();
		buff[count++] = b.getSalesAmount();
		buff[count++] = b.getSalesStageId();
		buff[count++] = b.getSalesStageLostId();
		buff[count++] = b.getWinrate();
		buff[count++] = b.getDescriptionLost();
		buff[count++] = b.getReasonLost();
		buff[count++] = generateTimestampFromDate(b.getDateCloseOpportunity());
		buff[count++] = b.getFlagPromisedByCustomer();
		buff[count++] = b.getBudgetProject();
		buff[count++] = b.getCostActual();
		buff[count++] = generateTimestampFromDate(b.getDateStageUpdated());
		buff[count++] = generateTimestampFromDate(b.getDateLatestActivity());
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getLeadId();
		buff[count++] = b.getMemo();
	}

	@Override
	public void setDataFromBase(BaseCrmOpportunity b){
		if(b.getOpportunityId() != null) setOpportunityIdClear(b.getOpportunityId());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getOpportunityName() != null) setOpportunityName(b.getOpportunityName());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getPriceListId() != null) setPriceListId(b.getPriceListId());
		if(b.getOpportunityType() != null) setOpportunityType(b.getOpportunityType());
		if(b.getSalesAmount() != null) setSalesAmount(b.getSalesAmount());
		if(b.getSalesStageId() != null) setSalesStageId(b.getSalesStageId());
		if(b.getSalesStageLostId() != null) setSalesStageLostId(b.getSalesStageLostId());
		if(b.getWinrate() != null) setWinrate(b.getWinrate());
		if(b.getDescriptionLost() != null) setDescriptionLost(b.getDescriptionLost());
		if(b.getReasonLost() != null) setReasonLost(b.getReasonLost());
		if(b.getDateCloseOpportunity() != null) setDateCloseOpportunity(b.getDateCloseOpportunity());
		if(b.getFlagPromisedByCustomer() != null) setFlagPromisedByCustomer(b.getFlagPromisedByCustomer());
		if(b.getBudgetProject() != null) setBudgetProject(b.getBudgetProject());
		if(b.getCostActual() != null) setCostActual(b.getCostActual());
		if(b.getDateStageUpdated() != null) setDateStageUpdated(b.getDateStageUpdated());
		if(b.getDateLatestActivity() != null) setDateLatestActivity(b.getDateLatestActivity());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getLeadId() != null) setLeadId(b.getLeadId());
		if(b.getMemo() != null) setMemo(b.getMemo());
	}

	@Override
	public BaseCrmOpportunity generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmOpportunity b = new BaseCrmOpportunity();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmOpportunity __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPriceListId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSalesAmount(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSalesStageId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSalesStageLostId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setWinrate(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDescriptionLost(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReasonLost(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCloseOpportunity(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagPromisedByCustomer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setBudgetProject(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCostActual(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateStageUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setLeadId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
	}

	public void setOpportunityId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getOpportunityId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setOpportunityIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setOpportunityName(java.lang.String val) {
		setCurrentData(3, val);
	}

	public java.lang.String getOpportunityName() {
		return GenericBase.__getString(__current_data[3]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setPriceListId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getPriceListId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setOpportunityType(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getOpportunityType() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setSalesAmount(java.math.BigDecimal val) {
		setCurrentData(7, val);
	}

	public java.math.BigDecimal getSalesAmount() {
		return GenericBase.__getDecimal(__current_data[7]);
	}

	public void setSalesStageId(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getSalesStageId() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setSalesStageLostId(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getSalesStageLostId() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setWinrate(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getWinrate() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setDescriptionLost(java.lang.String val) {
		setCurrentData(11, val);
	}

	public java.lang.String getDescriptionLost() {
		return GenericBase.__getString(__current_data[11]);
	}

	public void setReasonLost(java.lang.Integer val) {
		setCurrentData(12, val);
	}

	public java.lang.Integer getReasonLost() {
		return GenericBase.__getInt(__current_data[12]);
	}

	public void setDateCloseOpportunity(java.util.Date val) {
		setCurrentData(13, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCloseOpportunity() {
		return GenericBase.__getDateFromSQL(__current_data[13]);
	}

	public void setFlagPromisedByCustomer(java.lang.Integer val) {
		setCurrentData(14, val);
	}

	public java.lang.Integer getFlagPromisedByCustomer() {
		return GenericBase.__getInt(__current_data[14]);
	}

	public void setBudgetProject(java.math.BigDecimal val) {
		setCurrentData(15, val);
	}

	public java.math.BigDecimal getBudgetProject() {
		return GenericBase.__getDecimal(__current_data[15]);
	}

	public void setCostActual(java.math.BigDecimal val) {
		setCurrentData(16, val);
	}

	public java.math.BigDecimal getCostActual() {
		return GenericBase.__getDecimal(__current_data[16]);
	}

	public void setDateStageUpdated(java.util.Date val) {
		setCurrentData(17, generateTimestampFromDate(val));
	}

	public java.util.Date getDateStageUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[17]);
	}

	public void setDateLatestActivity(java.util.Date val) {
		setCurrentData(18, generateTimestampFromDate(val));
	}

	public java.util.Date getDateLatestActivity() {
		return GenericBase.__getDateFromSQL(__current_data[18]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(19, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[19]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(20, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[20]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(21, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[21]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(22, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[22]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(23, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[23]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(24, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[24]);
	}

	public void setLeadId(java.lang.Integer val) {
		setCurrentData(25, val);
	}

	public java.lang.Integer getLeadId() {
		return GenericBase.__getInt(__current_data[25]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(26, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[26]);
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val) {
		setConditionOpportunityId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectOpportunityId(boolean val) {
		__select_flags[0] = val;
	}

	public void setOpportunityIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionEntityType(String op, java.lang.Integer val) {
		setConditionEntityType(op, val, CONDITION_AND);
	}

	public void setConditionEntityType(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectEntityType(boolean val) {
		__select_flags[1] = val;
	}

	public void setEntityTypeExpression(String val) {
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

	public void setConditionOpportunityName(String op, java.lang.String val) {
		setConditionOpportunityName(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityName(String op, java.lang.String val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectOpportunityName(boolean val) {
		__select_flags[3] = val;
	}

	public void setOpportunityNameExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionCustomerId(String op, java.lang.Integer val) {
		setConditionCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectCustomerId(boolean val) {
		__select_flags[4] = val;
	}

	public void setCustomerIdExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionPriceListId(String op, java.lang.Integer val) {
		setConditionPriceListId(op, val, CONDITION_AND);
	}

	public void setConditionPriceListId(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectPriceListId(boolean val) {
		__select_flags[5] = val;
	}

	public void setPriceListIdExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionOpportunityType(String op, java.lang.Integer val) {
		setConditionOpportunityType(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityType(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectOpportunityType(boolean val) {
		__select_flags[6] = val;
	}

	public void setOpportunityTypeExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionSalesAmount(String op, java.math.BigDecimal val) {
		setConditionSalesAmount(op, val, CONDITION_AND);
	}

	public void setConditionSalesAmount(String op, java.math.BigDecimal val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectSalesAmount(boolean val) {
		__select_flags[7] = val;
	}

	public void setSalesAmountExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionSalesStageId(String op, java.lang.Integer val) {
		setConditionSalesStageId(op, val, CONDITION_AND);
	}

	public void setConditionSalesStageId(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectSalesStageId(boolean val) {
		__select_flags[8] = val;
	}

	public void setSalesStageIdExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionSalesStageLostId(String op, java.lang.Integer val) {
		setConditionSalesStageLostId(op, val, CONDITION_AND);
	}

	public void setConditionSalesStageLostId(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectSalesStageLostId(boolean val) {
		__select_flags[9] = val;
	}

	public void setSalesStageLostIdExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionWinrate(String op, java.lang.Integer val) {
		setConditionWinrate(op, val, CONDITION_AND);
	}

	public void setConditionWinrate(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectWinrate(boolean val) {
		__select_flags[10] = val;
	}

	public void setWinrateExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionDescriptionLost(String op, java.lang.String val) {
		setConditionDescriptionLost(op, val, CONDITION_AND);
	}

	public void setConditionDescriptionLost(String op, java.lang.String val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectDescriptionLost(boolean val) {
		__select_flags[11] = val;
	}

	public void setDescriptionLostExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionReasonLost(String op, java.lang.Integer val) {
		setConditionReasonLost(op, val, CONDITION_AND);
	}

	public void setConditionReasonLost(String op, java.lang.Integer val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectReasonLost(boolean val) {
		__select_flags[12] = val;
	}

	public void setReasonLostExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionDateCloseOpportunity(String op, java.util.Date val) {
		setConditionDateCloseOpportunity(op, val, CONDITION_AND);
	}

	public void setConditionDateCloseOpportunity(String op, java.util.Date val, String relation) {
		addCondition(13, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCloseOpportunity(boolean val) {
		__select_flags[13] = val;
	}

	public void setDateCloseOpportunityExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionFlagPromisedByCustomer(String op, java.lang.Integer val) {
		setConditionFlagPromisedByCustomer(op, val, CONDITION_AND);
	}

	public void setConditionFlagPromisedByCustomer(String op, java.lang.Integer val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectFlagPromisedByCustomer(boolean val) {
		__select_flags[14] = val;
	}

	public void setFlagPromisedByCustomerExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionBudgetProject(String op, java.math.BigDecimal val) {
		setConditionBudgetProject(op, val, CONDITION_AND);
	}

	public void setConditionBudgetProject(String op, java.math.BigDecimal val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectBudgetProject(boolean val) {
		__select_flags[15] = val;
	}

	public void setBudgetProjectExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionCostActual(String op, java.math.BigDecimal val) {
		setConditionCostActual(op, val, CONDITION_AND);
	}

	public void setConditionCostActual(String op, java.math.BigDecimal val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectCostActual(boolean val) {
		__select_flags[16] = val;
	}

	public void setCostActualExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionDateStageUpdated(String op, java.util.Date val) {
		setConditionDateStageUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateStageUpdated(String op, java.util.Date val, String relation) {
		addCondition(17, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateStageUpdated(boolean val) {
		__select_flags[17] = val;
	}

	public void setDateStageUpdatedExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionDateLatestActivity(String op, java.util.Date val) {
		setConditionDateLatestActivity(op, val, CONDITION_AND);
	}

	public void setConditionDateLatestActivity(String op, java.util.Date val, String relation) {
		addCondition(18, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateLatestActivity(boolean val) {
		__select_flags[18] = val;
	}

	public void setDateLatestActivityExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(19, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[19] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[20] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
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

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(22, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[22] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
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

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(24, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[24] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[24] = val;
	}

	public void setConditionLeadId(String op, java.lang.Integer val) {
		setConditionLeadId(op, val, CONDITION_AND);
	}

	public void setConditionLeadId(String op, java.lang.Integer val, String relation) {
		addCondition(25, op, relation, val);
	}

	public void setSelectLeadId(boolean val) {
		__select_flags[25] = val;
	}

	public void setLeadIdExpression(String val) {
		__dataExpressions[25] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(26, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[26] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[26] = val;
	}


}

