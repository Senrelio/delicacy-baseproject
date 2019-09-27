package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseFinReceiptPlan;


public class FinReceiptPlan extends AbstractTable<BaseFinReceiptPlan>
{

	public FinReceiptPlan() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 19;

		initTables();

		__tableName            = "fin_receipt_plans";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseFinReceiptPlan.CS_RECEIPT_PLAN_ID;
		__column_names[1] = BaseFinReceiptPlan.CS_RECEIPT_PLAN_CODE;
		__column_names[2] = BaseFinReceiptPlan.CS_DATE_RECEIPTED_PLANNED;
		__column_names[3] = BaseFinReceiptPlan.CS_DATE_FIRST_RECEIPT;
		__column_names[4] = BaseFinReceiptPlan.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[5] = BaseFinReceiptPlan.CS_DATE_LATEST_RECEIPT;
		__column_names[6] = BaseFinReceiptPlan.CS_DEPARTMENT_ID;
		__column_names[7] = BaseFinReceiptPlan.CS_CUSTOMER_ID;
		__column_names[8] = BaseFinReceiptPlan.CS_CONTRACT_ID;
		__column_names[9] = BaseFinReceiptPlan.CS_STAGE_RECEIPT;
		__column_names[10] = BaseFinReceiptPlan.CS_RECEIPT_NTH_TIME;
		__column_names[11] = BaseFinReceiptPlan.CS_EMPLOYEE_ID_CREATED;
		__column_names[12] = BaseFinReceiptPlan.CS_PERCENTAGE_RECEIPT_PLANNED;
		__column_names[13] = BaseFinReceiptPlan.CS_DATE_CREATED;
		__column_names[14] = BaseFinReceiptPlan.CS_AMOUNT_RECEIPT_PLANNED;
		__column_names[15] = BaseFinReceiptPlan.CS_EMPLOYEE_ID_UPDATED;
		__column_names[16] = BaseFinReceiptPlan.CS_FLAG_OVERTIME;
		__column_names[17] = BaseFinReceiptPlan.CS_DATE_UPDATED;
		__column_names[18] = BaseFinReceiptPlan.CS_ORDER_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseFinReceiptPlan b) {
		clear();
		setReceiptPlanIdClear(b.getReceiptPlanId());
	}

	public boolean isPrimaryKeyNull() {
		return getReceiptPlanId() == null;
	}

	@Override
	public BaseFinReceiptPlan generateBase(){
		BaseFinReceiptPlan b = new BaseFinReceiptPlan();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseFinReceiptPlan b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setReceiptPlanId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceiptPlanCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateReceiptedPlanned(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateFirstReceipt(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateLatestReceipt(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContractId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStageReceipt(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setReceiptNthTime(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPercentageReceiptPlanned(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setAmountReceiptPlanned(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagOvertime(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseFinReceiptPlan b, Object[] buff){
		int count = 0;
		buff[count++] = b.getReceiptPlanId();
		buff[count++] = b.getReceiptPlanCode();
		buff[count++] = generateTimestampFromDate(b.getDateReceiptedPlanned());
		buff[count++] = generateTimestampFromDate(b.getDateFirstReceipt());
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = generateTimestampFromDate(b.getDateLatestReceipt());
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getContractId();
		buff[count++] = b.getStageReceipt();
		buff[count++] = b.getReceiptNthTime();
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = b.getPercentageReceiptPlanned();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getAmountReceiptPlanned();
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getFlagOvertime();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getOrderId();
	}

	@Override
	public void setDataFromBase(BaseFinReceiptPlan b){
		if(b.getReceiptPlanId() != null) setReceiptPlanIdClear(b.getReceiptPlanId());
		if(b.getReceiptPlanCode() != null) setReceiptPlanCode(b.getReceiptPlanCode());
		if(b.getDateReceiptedPlanned() != null) setDateReceiptedPlanned(b.getDateReceiptedPlanned());
		if(b.getDateFirstReceipt() != null) setDateFirstReceipt(b.getDateFirstReceipt());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getDateLatestReceipt() != null) setDateLatestReceipt(b.getDateLatestReceipt());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getContractId() != null) setContractId(b.getContractId());
		if(b.getStageReceipt() != null) setStageReceipt(b.getStageReceipt());
		if(b.getReceiptNthTime() != null) setReceiptNthTime(b.getReceiptNthTime());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getPercentageReceiptPlanned() != null) setPercentageReceiptPlanned(b.getPercentageReceiptPlanned());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getAmountReceiptPlanned() != null) setAmountReceiptPlanned(b.getAmountReceiptPlanned());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getFlagOvertime() != null) setFlagOvertime(b.getFlagOvertime());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getOrderId() != null) setOrderId(b.getOrderId());
	}

	@Override
	public BaseFinReceiptPlan generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseFinReceiptPlan b = new BaseFinReceiptPlan();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseFinReceiptPlan __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptPlanId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptPlanCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateReceiptedPlanned(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateFirstReceipt(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateLatestReceipt(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStageReceipt(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setReceiptNthTime(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPercentageReceiptPlanned(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setAmountReceiptPlanned(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagOvertime(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
	}

	public void setReceiptPlanId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getReceiptPlanId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setReceiptPlanIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setReceiptPlanCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getReceiptPlanCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setDateReceiptedPlanned(java.util.Date val) {
		setCurrentData(2, generateTimestampFromDate(val));
	}

	public java.util.Date getDateReceiptedPlanned() {
		return GenericBase.__getDateFromSQL(__current_data[2]);
	}

	public void setDateFirstReceipt(java.util.Date val) {
		setCurrentData(3, generateTimestampFromDate(val));
	}

	public java.util.Date getDateFirstReceipt() {
		return GenericBase.__getDateFromSQL(__current_data[3]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setDateLatestReceipt(java.util.Date val) {
		setCurrentData(5, generateTimestampFromDate(val));
	}

	public java.util.Date getDateLatestReceipt() {
		return GenericBase.__getDateFromSQL(__current_data[5]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(6, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[6]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setContractId(java.lang.Integer val) {
		setCurrentData(8, val);
	}

	public java.lang.Integer getContractId() {
		return GenericBase.__getInt(__current_data[8]);
	}

	public void setStageReceipt(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getStageReceipt() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setReceiptNthTime(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getReceiptNthTime() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setPercentageReceiptPlanned(java.math.BigDecimal val) {
		setCurrentData(12, val);
	}

	public java.math.BigDecimal getPercentageReceiptPlanned() {
		return GenericBase.__getDecimal(__current_data[12]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(13, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[13]);
	}

	public void setAmountReceiptPlanned(java.math.BigDecimal val) {
		setCurrentData(14, val);
	}

	public java.math.BigDecimal getAmountReceiptPlanned() {
		return GenericBase.__getDecimal(__current_data[14]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setFlagOvertime(java.lang.Boolean val) {
		setCurrentData(16, val);
	}

	public java.lang.Boolean getFlagOvertime() {
		return GenericBase.__getBoolean(__current_data[16]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(17, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[17]);
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(18, val);
	}

	public java.lang.Integer getOrderId() {
		return GenericBase.__getInt(__current_data[18]);
	}

	public void setConditionReceiptPlanId(String op, java.lang.Integer val) {
		setConditionReceiptPlanId(op, val, CONDITION_AND);
	}

	public void setConditionReceiptPlanId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectReceiptPlanId(boolean val) {
		__select_flags[0] = val;
	}

	public void setReceiptPlanIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionReceiptPlanCode(String op, java.lang.String val) {
		setConditionReceiptPlanCode(op, val, CONDITION_AND);
	}

	public void setConditionReceiptPlanCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectReceiptPlanCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setReceiptPlanCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionDateReceiptedPlanned(String op, java.util.Date val) {
		setConditionDateReceiptedPlanned(op, val, CONDITION_AND);
	}

	public void setConditionDateReceiptedPlanned(String op, java.util.Date val, String relation) {
		addCondition(2, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateReceiptedPlanned(boolean val) {
		__select_flags[2] = val;
	}

	public void setDateReceiptedPlannedExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionDateFirstReceipt(String op, java.util.Date val) {
		setConditionDateFirstReceipt(op, val, CONDITION_AND);
	}

	public void setConditionDateFirstReceipt(String op, java.util.Date val, String relation) {
		addCondition(3, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateFirstReceipt(boolean val) {
		__select_flags[3] = val;
	}

	public void setDateFirstReceiptExpression(String val) {
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

	public void setConditionDateLatestReceipt(String op, java.util.Date val) {
		setConditionDateLatestReceipt(op, val, CONDITION_AND);
	}

	public void setConditionDateLatestReceipt(String op, java.util.Date val, String relation) {
		addCondition(5, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateLatestReceipt(boolean val) {
		__select_flags[5] = val;
	}

	public void setDateLatestReceiptExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[6] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionCustomerId(String op, java.lang.Integer val) {
		setConditionCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectCustomerId(boolean val) {
		__select_flags[7] = val;
	}

	public void setCustomerIdExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionContractId(String op, java.lang.Integer val) {
		setConditionContractId(op, val, CONDITION_AND);
	}

	public void setConditionContractId(String op, java.lang.Integer val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectContractId(boolean val) {
		__select_flags[8] = val;
	}

	public void setContractIdExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionStageReceipt(String op, java.lang.Integer val) {
		setConditionStageReceipt(op, val, CONDITION_AND);
	}

	public void setConditionStageReceipt(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectStageReceipt(boolean val) {
		__select_flags[9] = val;
	}

	public void setStageReceiptExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionReceiptNthTime(String op, java.lang.Integer val) {
		setConditionReceiptNthTime(op, val, CONDITION_AND);
	}

	public void setConditionReceiptNthTime(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectReceiptNthTime(boolean val) {
		__select_flags[10] = val;
	}

	public void setReceiptNthTimeExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[11] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionPercentageReceiptPlanned(String op, java.math.BigDecimal val) {
		setConditionPercentageReceiptPlanned(op, val, CONDITION_AND);
	}

	public void setConditionPercentageReceiptPlanned(String op, java.math.BigDecimal val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectPercentageReceiptPlanned(boolean val) {
		__select_flags[12] = val;
	}

	public void setPercentageReceiptPlannedExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(13, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[13] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionAmountReceiptPlanned(String op, java.math.BigDecimal val) {
		setConditionAmountReceiptPlanned(op, val, CONDITION_AND);
	}

	public void setConditionAmountReceiptPlanned(String op, java.math.BigDecimal val, String relation) {
		addCondition(14, op, relation, val);
	}

	public void setSelectAmountReceiptPlanned(boolean val) {
		__select_flags[14] = val;
	}

	public void setAmountReceiptPlannedExpression(String val) {
		__dataExpressions[14] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(15, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[15] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[15] = val;
	}

	public void setConditionFlagOvertime(String op, java.lang.Boolean val) {
		setConditionFlagOvertime(op, val, CONDITION_AND);
	}

	public void setConditionFlagOvertime(String op, java.lang.Boolean val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectFlagOvertime(boolean val) {
		__select_flags[16] = val;
	}

	public void setFlagOvertimeExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(17, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[17] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionOrderId(String op, java.lang.Integer val) {
		setConditionOrderId(op, val, CONDITION_AND);
	}

	public void setConditionOrderId(String op, java.lang.Integer val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectOrderId(boolean val) {
		__select_flags[18] = val;
	}

	public void setOrderIdExpression(String val) {
		__dataExpressions[18] = val;
	}


}

