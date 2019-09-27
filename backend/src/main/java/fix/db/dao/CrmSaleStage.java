package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmSaleStage;


public class CrmSaleStage extends AbstractTable<BaseCrmSaleStage>
{

	public CrmSaleStage() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 10;

		initTables();

		__tableName            = "crm_sale_stages";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmSaleStage.CS_SALE_STAGE_ID;
		__column_names[1] = BaseCrmSaleStage.CS_SALE_STAGE_NAME;
		__column_names[2] = BaseCrmSaleStage.CS_STATUS_OPPORTUNITY;
		__column_names[3] = BaseCrmSaleStage.CS_STAGE_ORDER_NO;
		__column_names[4] = BaseCrmSaleStage.CS_STAGE_WINRATE;
		__column_names[5] = BaseCrmSaleStage.CS_DURATION_EXPECTED;
		__column_names[6] = BaseCrmSaleStage.CS_DATE_CREATED;
		__column_names[7] = BaseCrmSaleStage.CS_EMPLOYEE_ID_CREATED;
		__column_names[8] = BaseCrmSaleStage.CS_DATE_UPDATED;
		__column_names[9] = BaseCrmSaleStage.CS_EMPLOYEE_ID_UPDATED;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmSaleStage b) {
		clear();
		setSaleStageIdClear(b.getSaleStageId());
	}

	public boolean isPrimaryKeyNull() {
		return getSaleStageId() == null;
	}

	@Override
	public BaseCrmSaleStage generateBase(){
		BaseCrmSaleStage b = new BaseCrmSaleStage();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmSaleStage b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setSaleStageId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setSaleStageName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setStatusOpportunity(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStageOrderNo(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setStageWinrate(GenericBase.__getFloat(val));
		if((val = __current_data[count++]) != null) b.setDurationExpected(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmSaleStage b, Object[] buff){
		int count = 0;
		buff[count++] = b.getSaleStageId();
		buff[count++] = b.getSaleStageName();
		buff[count++] = b.getStatusOpportunity();
		buff[count++] = b.getStageOrderNo();
		buff[count++] = b.getStageWinrate();
		buff[count++] = b.getDurationExpected();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getEmployeeIdUpdated();
	}

	@Override
	public void setDataFromBase(BaseCrmSaleStage b){
		if(b.getSaleStageId() != null) setSaleStageIdClear(b.getSaleStageId());
		if(b.getSaleStageName() != null) setSaleStageName(b.getSaleStageName());
		if(b.getStatusOpportunity() != null) setStatusOpportunity(b.getStatusOpportunity());
		if(b.getStageOrderNo() != null) setStageOrderNo(b.getStageOrderNo());
		if(b.getStageWinrate() != null) setStageWinrate(b.getStageWinrate());
		if(b.getDurationExpected() != null) setDurationExpected(b.getDurationExpected());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
	}

	@Override
	public BaseCrmSaleStage generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmSaleStage b = new BaseCrmSaleStage();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmSaleStage __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSaleStageId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSaleStageName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusOpportunity(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStageOrderNo(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStageWinrate(GenericBase.__getFloat(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDurationExpected(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
	}

	public void setSaleStageId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getSaleStageId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setSaleStageIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setSaleStageName(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getSaleStageName() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setStatusOpportunity(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getStatusOpportunity() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setStageOrderNo(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getStageOrderNo() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setStageWinrate(java.lang.Float val) {
		setCurrentData(4, val);
	}

	public java.lang.Float getStageWinrate() {
		return GenericBase.__getFloat(__current_data[4]);
	}

	public void setDurationExpected(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getDurationExpected() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(6, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[6]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setConditionSaleStageId(String op, java.lang.Integer val) {
		setConditionSaleStageId(op, val, CONDITION_AND);
	}

	public void setConditionSaleStageId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectSaleStageId(boolean val) {
		__select_flags[0] = val;
	}

	public void setSaleStageIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionSaleStageName(String op, java.lang.String val) {
		setConditionSaleStageName(op, val, CONDITION_AND);
	}

	public void setConditionSaleStageName(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectSaleStageName(boolean val) {
		__select_flags[1] = val;
	}

	public void setSaleStageNameExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionStatusOpportunity(String op, java.lang.Integer val) {
		setConditionStatusOpportunity(op, val, CONDITION_AND);
	}

	public void setConditionStatusOpportunity(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectStatusOpportunity(boolean val) {
		__select_flags[2] = val;
	}

	public void setStatusOpportunityExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionStageOrderNo(String op, java.lang.Integer val) {
		setConditionStageOrderNo(op, val, CONDITION_AND);
	}

	public void setConditionStageOrderNo(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectStageOrderNo(boolean val) {
		__select_flags[3] = val;
	}

	public void setStageOrderNoExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionStageWinrate(String op, java.lang.Float val) {
		setConditionStageWinrate(op, val, CONDITION_AND);
	}

	public void setConditionStageWinrate(String op, java.lang.Float val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectStageWinrate(boolean val) {
		__select_flags[4] = val;
	}

	public void setStageWinrateExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDurationExpected(String op, java.lang.Integer val) {
		setConditionDurationExpected(op, val, CONDITION_AND);
	}

	public void setConditionDurationExpected(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectDurationExpected(boolean val) {
		__select_flags[5] = val;
	}

	public void setDurationExpectedExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(6, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[6] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val) {
		setConditionEmployeeIdCreated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdCreated(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectEmployeeIdCreated(boolean val) {
		__select_flags[7] = val;
	}

	public void setEmployeeIdCreatedExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(8, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[8] = val;
	}

	public void setDateUpdatedExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[9] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[9] = val;
	}


}

