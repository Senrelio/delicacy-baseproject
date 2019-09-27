package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmOpportunityStage;


public class CrmOpportunityStage extends AbstractTable<BaseCrmOpportunityStage>
{

	public CrmOpportunityStage() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 11;

		initTables();

		__tableName            = "crm_opportunity_stages";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmOpportunityStage.CS_OPPORTUNITY_STAGE_PATH_ID;
		__column_names[1] = BaseCrmOpportunityStage.CS_OPPORTUNITY_ID;
		__column_names[2] = BaseCrmOpportunityStage.CS_CURRENT_STAGE_ID;
		__column_names[3] = BaseCrmOpportunityStage.CS_ENTITY_TYPE_ID;
		__column_names[4] = BaseCrmOpportunityStage.CS_PREVIOUS_STAGE_ID;
		__column_names[5] = BaseCrmOpportunityStage.CS_DATE_START;
		__column_names[6] = BaseCrmOpportunityStage.CS_DATE_END;
		__column_names[7] = BaseCrmOpportunityStage.CS_EMPLOYEE_ID_CREATED;
		__column_names[8] = BaseCrmOpportunityStage.CS_DATE_CREATED;
		__column_names[9] = BaseCrmOpportunityStage.CS_ENTITY_TYPE;
		__column_names[10] = BaseCrmOpportunityStage.CS_FLAG_RECENT_STAGE_PATH;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmOpportunityStage b) {
		clear();
		setOpportunityStagePathIdClear(b.getOpportunityStagePathId());
	}

	public boolean isPrimaryKeyNull() {
		return getOpportunityStagePathId() == null;
	}

	@Override
	public BaseCrmOpportunityStage generateBase(){
		BaseCrmOpportunityStage b = new BaseCrmOpportunityStage();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmOpportunityStage b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setOpportunityStagePathId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOpportunityId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCurrentStageId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityTypeId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPreviousStageId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateStart(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateEnd(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagRecentStagePath(GenericBase.__getBoolean(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmOpportunityStage b, Object[] buff){
		int count = 0;
		buff[count++] = b.getOpportunityStagePathId();
		buff[count++] = b.getOpportunityId();
		buff[count++] = b.getCurrentStageId();
		buff[count++] = b.getEntityTypeId();
		buff[count++] = b.getPreviousStageId();
		buff[count++] = generateTimestampFromDate(b.getDateStart());
		buff[count++] = generateTimestampFromDate(b.getDateEnd());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEntityType();
		buff[count++] = b.getFlagRecentStagePath();
	}

	@Override
	public void setDataFromBase(BaseCrmOpportunityStage b){
		if(b.getOpportunityStagePathId() != null) setOpportunityStagePathIdClear(b.getOpportunityStagePathId());
		if(b.getOpportunityId() != null) setOpportunityId(b.getOpportunityId());
		if(b.getCurrentStageId() != null) setCurrentStageId(b.getCurrentStageId());
		if(b.getEntityTypeId() != null) setEntityTypeId(b.getEntityTypeId());
		if(b.getPreviousStageId() != null) setPreviousStageId(b.getPreviousStageId());
		if(b.getDateStart() != null) setDateStart(b.getDateStart());
		if(b.getDateEnd() != null) setDateEnd(b.getDateEnd());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getFlagRecentStagePath() != null) setFlagRecentStagePath(b.getFlagRecentStagePath());
	}

	@Override
	public BaseCrmOpportunityStage generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmOpportunityStage b = new BaseCrmOpportunityStage();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmOpportunityStage __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityStagePathId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCurrentStageId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityTypeId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPreviousStageId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateStart(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateEnd(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagRecentStagePath(GenericBase.__getBoolean(val));
	}

	public void setOpportunityStagePathId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getOpportunityStagePathId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setOpportunityStagePathIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setOpportunityId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getOpportunityId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setCurrentStageId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getCurrentStageId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setEntityTypeId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getEntityTypeId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setPreviousStageId(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getPreviousStageId() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setDateStart(java.util.Date val) {
		setCurrentData(5, generateTimestampFromDate(val));
	}

	public java.util.Date getDateStart() {
		return GenericBase.__getDateFromSQL(__current_data[5]);
	}

	public void setDateEnd(java.util.Date val) {
		setCurrentData(6, generateTimestampFromDate(val));
	}

	public java.util.Date getDateEnd() {
		return GenericBase.__getDateFromSQL(__current_data[6]);
	}

	public void setEmployeeIdCreated(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(9, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[9]);
	}

	public void setFlagRecentStagePath(java.lang.Boolean val) {
		setCurrentData(10, val);
	}

	public java.lang.Boolean getFlagRecentStagePath() {
		return GenericBase.__getBoolean(__current_data[10]);
	}

	public void setConditionOpportunityStagePathId(String op, java.lang.Integer val) {
		setConditionOpportunityStagePathId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityStagePathId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectOpportunityStagePathId(boolean val) {
		__select_flags[0] = val;
	}

	public void setOpportunityStagePathIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val) {
		setConditionOpportunityId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectOpportunityId(boolean val) {
		__select_flags[1] = val;
	}

	public void setOpportunityIdExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionCurrentStageId(String op, java.lang.Integer val) {
		setConditionCurrentStageId(op, val, CONDITION_AND);
	}

	public void setConditionCurrentStageId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectCurrentStageId(boolean val) {
		__select_flags[2] = val;
	}

	public void setCurrentStageIdExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionEntityTypeId(String op, java.lang.Integer val) {
		setConditionEntityTypeId(op, val, CONDITION_AND);
	}

	public void setConditionEntityTypeId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectEntityTypeId(boolean val) {
		__select_flags[3] = val;
	}

	public void setEntityTypeIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionPreviousStageId(String op, java.lang.Integer val) {
		setConditionPreviousStageId(op, val, CONDITION_AND);
	}

	public void setConditionPreviousStageId(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectPreviousStageId(boolean val) {
		__select_flags[4] = val;
	}

	public void setPreviousStageIdExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionDateStart(String op, java.util.Date val) {
		setConditionDateStart(op, val, CONDITION_AND);
	}

	public void setConditionDateStart(String op, java.util.Date val, String relation) {
		addCondition(5, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateStart(boolean val) {
		__select_flags[5] = val;
	}

	public void setDateStartExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionDateEnd(String op, java.util.Date val) {
		setConditionDateEnd(op, val, CONDITION_AND);
	}

	public void setConditionDateEnd(String op, java.util.Date val, String relation) {
		addCondition(6, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateEnd(boolean val) {
		__select_flags[6] = val;
	}

	public void setDateEndExpression(String val) {
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

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(8, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[8] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionEntityType(String op, java.lang.Integer val) {
		setConditionEntityType(op, val, CONDITION_AND);
	}

	public void setConditionEntityType(String op, java.lang.Integer val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectEntityType(boolean val) {
		__select_flags[9] = val;
	}

	public void setEntityTypeExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionFlagRecentStagePath(String op, java.lang.Boolean val) {
		setConditionFlagRecentStagePath(op, val, CONDITION_AND);
	}

	public void setConditionFlagRecentStagePath(String op, java.lang.Boolean val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectFlagRecentStagePath(boolean val) {
		__select_flags[10] = val;
	}

	public void setFlagRecentStagePathExpression(String val) {
		__dataExpressions[10] = val;
	}


}

