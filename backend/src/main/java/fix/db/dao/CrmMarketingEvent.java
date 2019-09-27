package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmMarketingEvent;


public class CrmMarketingEvent extends AbstractTable<BaseCrmMarketingEvent>
{

	public CrmMarketingEvent() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 26;

		initTables();

		__tableName            = "crm_marketing_events";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmMarketingEvent.CS_MARKETING_EVENT_ID;
		__column_names[1] = BaseCrmMarketingEvent.CS_ENTITY_TYPE;
		__column_names[2] = BaseCrmMarketingEvent.CS_EMPLOYEE_ID_RESPONSIBLE;
		__column_names[3] = BaseCrmMarketingEvent.CS_EVENT_NAME;
		__column_names[4] = BaseCrmMarketingEvent.CS_EVENT_STATUS;
		__column_names[5] = BaseCrmMarketingEvent.CS_EVENT_TYPE;
		__column_names[6] = BaseCrmMarketingEvent.CS_DATE_START;
		__column_names[7] = BaseCrmMarketingEvent.CS_DATE_END;
		__column_names[8] = BaseCrmMarketingEvent.CS_BUDGET_EVENT;
		__column_names[9] = BaseCrmMarketingEvent.CS_REVENUE_EXPECTED;
		__column_names[10] = BaseCrmMarketingEvent.CS_NUM_PEOPLE_INVITED;
		__column_names[11] = BaseCrmMarketingEvent.CS_NUM_PEOPLE_ATTENDED;
		__column_names[12] = BaseCrmMarketingEvent.CS_COST_ACTUAL;
		__column_names[13] = BaseCrmMarketingEvent.CS_REVENUE_ACTUAL;
		__column_names[14] = BaseCrmMarketingEvent.CS_DATE_CREATED;
		__column_names[15] = BaseCrmMarketingEvent.CS_EMPLOYEE_ID_CREATED;
		__column_names[16] = BaseCrmMarketingEvent.CS_DATE_LATEST_ACTIVITY;
		__column_names[17] = BaseCrmMarketingEvent.CS_DATE_UPDATED;
		__column_names[18] = BaseCrmMarketingEvent.CS_EMPLOYEE_ID_UPDATED;
		__column_names[19] = BaseCrmMarketingEvent.CS_DEPARTMENT_ID;
		__column_names[20] = BaseCrmMarketingEvent.CS_FLAG_LOCKED;
		__column_names[21] = BaseCrmMarketingEvent.CS_EMPLOYEE_ID_LATEST_FOLLOWUP;
		__column_names[22] = BaseCrmMarketingEvent.CS_EVENT_DETAILED_ADDRESS;
		__column_names[23] = BaseCrmMarketingEvent.CS_EVENT_DESCRIPTION;
		__column_names[24] = BaseCrmMarketingEvent.CS_MARKET_REACTION_EXPECTED;
		__column_names[25] = BaseCrmMarketingEvent.CS_MEMO;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmMarketingEvent b) {
		clear();
		setMarketingEventIdClear(b.getMarketingEventId());
	}

	public boolean isPrimaryKeyNull() {
		return getMarketingEventId() == null;
	}

	@Override
	public BaseCrmMarketingEvent generateBase(){
		BaseCrmMarketingEvent b = new BaseCrmMarketingEvent();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmMarketingEvent b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setMarketingEventId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEntityType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdResponsible(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEventName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEventStatus(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEventType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateStart(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateEnd(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setBudgetEvent(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setRevenueExpected(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setNumPeopleInvited(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setNumPeopleAttended(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCostActual(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setRevenueActual(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdCreated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdLatestFollowup(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setEventDetailedAddress(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEventDescription(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setMarketReactionExpected(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmMarketingEvent b, Object[] buff){
		int count = 0;
		buff[count++] = b.getMarketingEventId();
		buff[count++] = b.getEntityType();
		buff[count++] = b.getEmployeeIdResponsible();
		buff[count++] = b.getEventName();
		buff[count++] = b.getEventStatus();
		buff[count++] = b.getEventType();
		buff[count++] = generateTimestampFromDate(b.getDateStart());
		buff[count++] = generateTimestampFromDate(b.getDateEnd());
		buff[count++] = b.getBudgetEvent();
		buff[count++] = b.getRevenueExpected();
		buff[count++] = b.getNumPeopleInvited();
		buff[count++] = b.getNumPeopleAttended();
		buff[count++] = b.getCostActual();
		buff[count++] = b.getRevenueActual();
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getEmployeeIdCreated();
		buff[count++] = generateTimestampFromDate(b.getDateLatestActivity());
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getEmployeeIdLatestFollowup();
		buff[count++] = b.getEventDetailedAddress();
		buff[count++] = b.getEventDescription();
		buff[count++] = b.getMarketReactionExpected();
		buff[count++] = b.getMemo();
	}

	@Override
	public void setDataFromBase(BaseCrmMarketingEvent b){
		if(b.getMarketingEventId() != null) setMarketingEventIdClear(b.getMarketingEventId());
		if(b.getEntityType() != null) setEntityType(b.getEntityType());
		if(b.getEmployeeIdResponsible() != null) setEmployeeIdResponsible(b.getEmployeeIdResponsible());
		if(b.getEventName() != null) setEventName(b.getEventName());
		if(b.getEventStatus() != null) setEventStatus(b.getEventStatus());
		if(b.getEventType() != null) setEventType(b.getEventType());
		if(b.getDateStart() != null) setDateStart(b.getDateStart());
		if(b.getDateEnd() != null) setDateEnd(b.getDateEnd());
		if(b.getBudgetEvent() != null) setBudgetEvent(b.getBudgetEvent());
		if(b.getRevenueExpected() != null) setRevenueExpected(b.getRevenueExpected());
		if(b.getNumPeopleInvited() != null) setNumPeopleInvited(b.getNumPeopleInvited());
		if(b.getNumPeopleAttended() != null) setNumPeopleAttended(b.getNumPeopleAttended());
		if(b.getCostActual() != null) setCostActual(b.getCostActual());
		if(b.getRevenueActual() != null) setRevenueActual(b.getRevenueActual());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getEmployeeIdCreated() != null) setEmployeeIdCreated(b.getEmployeeIdCreated());
		if(b.getDateLatestActivity() != null) setDateLatestActivity(b.getDateLatestActivity());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getEmployeeIdLatestFollowup() != null) setEmployeeIdLatestFollowup(b.getEmployeeIdLatestFollowup());
		if(b.getEventDetailedAddress() != null) setEventDetailedAddress(b.getEventDetailedAddress());
		if(b.getEventDescription() != null) setEventDescription(b.getEventDescription());
		if(b.getMarketReactionExpected() != null) setMarketReactionExpected(b.getMarketReactionExpected());
		if(b.getMemo() != null) setMemo(b.getMemo());
	}

	@Override
	public BaseCrmMarketingEvent generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmMarketingEvent b = new BaseCrmMarketingEvent();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmMarketingEvent __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMarketingEventId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEntityType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdResponsible(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEventName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEventStatus(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEventType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateStart(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateEnd(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setBudgetEvent(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRevenueExpected(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setNumPeopleInvited(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setNumPeopleAttended(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCostActual(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setRevenueActual(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdCreated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateLatestActivity(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdLatestFollowup(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEventDetailedAddress(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEventDescription(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMarketReactionExpected(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
	}

	public void setMarketingEventId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getMarketingEventId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setMarketingEventIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setEntityType(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getEntityType() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setEmployeeIdResponsible(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getEmployeeIdResponsible() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setEventName(java.lang.String val) {
		setCurrentData(3, val);
	}

	public java.lang.String getEventName() {
		return GenericBase.__getString(__current_data[3]);
	}

	public void setEventStatus(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getEventStatus() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setEventType(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getEventType() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setDateStart(java.util.Date val) {
		setCurrentData(6, generateTimestampFromDate(val));
	}

	public java.util.Date getDateStart() {
		return GenericBase.__getDateFromSQL(__current_data[6]);
	}

	public void setDateEnd(java.util.Date val) {
		setCurrentData(7, generateTimestampFromDate(val));
	}

	public java.util.Date getDateEnd() {
		return GenericBase.__getDateFromSQL(__current_data[7]);
	}

	public void setBudgetEvent(java.math.BigDecimal val) {
		setCurrentData(8, val);
	}

	public java.math.BigDecimal getBudgetEvent() {
		return GenericBase.__getDecimal(__current_data[8]);
	}

	public void setRevenueExpected(java.math.BigDecimal val) {
		setCurrentData(9, val);
	}

	public java.math.BigDecimal getRevenueExpected() {
		return GenericBase.__getDecimal(__current_data[9]);
	}

	public void setNumPeopleInvited(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getNumPeopleInvited() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setNumPeopleAttended(java.lang.Integer val) {
		setCurrentData(11, val);
	}

	public java.lang.Integer getNumPeopleAttended() {
		return GenericBase.__getInt(__current_data[11]);
	}

	public void setCostActual(java.math.BigDecimal val) {
		setCurrentData(12, val);
	}

	public java.math.BigDecimal getCostActual() {
		return GenericBase.__getDecimal(__current_data[12]);
	}

	public void setRevenueActual(java.lang.String val) {
		setCurrentData(13, val);
	}

	public java.lang.String getRevenueActual() {
		return GenericBase.__getString(__current_data[13]);
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

	public void setDateLatestActivity(java.util.Date val) {
		setCurrentData(16, generateTimestampFromDate(val));
	}

	public java.util.Date getDateLatestActivity() {
		return GenericBase.__getDateFromSQL(__current_data[16]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(17, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[17]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(18, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[18]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(19, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[19]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(20, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[20]);
	}

	public void setEmployeeIdLatestFollowup(java.lang.Integer val) {
		setCurrentData(21, val);
	}

	public java.lang.Integer getEmployeeIdLatestFollowup() {
		return GenericBase.__getInt(__current_data[21]);
	}

	public void setEventDetailedAddress(java.lang.String val) {
		setCurrentData(22, val);
	}

	public java.lang.String getEventDetailedAddress() {
		return GenericBase.__getString(__current_data[22]);
	}

	public void setEventDescription(java.lang.String val) {
		setCurrentData(23, val);
	}

	public java.lang.String getEventDescription() {
		return GenericBase.__getString(__current_data[23]);
	}

	public void setMarketReactionExpected(java.lang.String val) {
		setCurrentData(24, val);
	}

	public java.lang.String getMarketReactionExpected() {
		return GenericBase.__getString(__current_data[24]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(25, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[25]);
	}

	public void setConditionMarketingEventId(String op, java.lang.Integer val) {
		setConditionMarketingEventId(op, val, CONDITION_AND);
	}

	public void setConditionMarketingEventId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectMarketingEventId(boolean val) {
		__select_flags[0] = val;
	}

	public void setMarketingEventIdExpression(String val) {
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

	public void setConditionEmployeeIdResponsible(String op, java.lang.Integer val) {
		setConditionEmployeeIdResponsible(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdResponsible(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectEmployeeIdResponsible(boolean val) {
		__select_flags[2] = val;
	}

	public void setEmployeeIdResponsibleExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionEventName(String op, java.lang.String val) {
		setConditionEventName(op, val, CONDITION_AND);
	}

	public void setConditionEventName(String op, java.lang.String val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectEventName(boolean val) {
		__select_flags[3] = val;
	}

	public void setEventNameExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionEventStatus(String op, java.lang.Integer val) {
		setConditionEventStatus(op, val, CONDITION_AND);
	}

	public void setConditionEventStatus(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectEventStatus(boolean val) {
		__select_flags[4] = val;
	}

	public void setEventStatusExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionEventType(String op, java.lang.Integer val) {
		setConditionEventType(op, val, CONDITION_AND);
	}

	public void setConditionEventType(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectEventType(boolean val) {
		__select_flags[5] = val;
	}

	public void setEventTypeExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionDateStart(String op, java.util.Date val) {
		setConditionDateStart(op, val, CONDITION_AND);
	}

	public void setConditionDateStart(String op, java.util.Date val, String relation) {
		addCondition(6, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateStart(boolean val) {
		__select_flags[6] = val;
	}

	public void setDateStartExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionDateEnd(String op, java.util.Date val) {
		setConditionDateEnd(op, val, CONDITION_AND);
	}

	public void setConditionDateEnd(String op, java.util.Date val, String relation) {
		addCondition(7, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateEnd(boolean val) {
		__select_flags[7] = val;
	}

	public void setDateEndExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionBudgetEvent(String op, java.math.BigDecimal val) {
		setConditionBudgetEvent(op, val, CONDITION_AND);
	}

	public void setConditionBudgetEvent(String op, java.math.BigDecimal val, String relation) {
		addCondition(8, op, relation, val);
	}

	public void setSelectBudgetEvent(boolean val) {
		__select_flags[8] = val;
	}

	public void setBudgetEventExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionRevenueExpected(String op, java.math.BigDecimal val) {
		setConditionRevenueExpected(op, val, CONDITION_AND);
	}

	public void setConditionRevenueExpected(String op, java.math.BigDecimal val, String relation) {
		addCondition(9, op, relation, val);
	}

	public void setSelectRevenueExpected(boolean val) {
		__select_flags[9] = val;
	}

	public void setRevenueExpectedExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionNumPeopleInvited(String op, java.lang.Integer val) {
		setConditionNumPeopleInvited(op, val, CONDITION_AND);
	}

	public void setConditionNumPeopleInvited(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectNumPeopleInvited(boolean val) {
		__select_flags[10] = val;
	}

	public void setNumPeopleInvitedExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionNumPeopleAttended(String op, java.lang.Integer val) {
		setConditionNumPeopleAttended(op, val, CONDITION_AND);
	}

	public void setConditionNumPeopleAttended(String op, java.lang.Integer val, String relation) {
		addCondition(11, op, relation, val);
	}

	public void setSelectNumPeopleAttended(boolean val) {
		__select_flags[11] = val;
	}

	public void setNumPeopleAttendedExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionCostActual(String op, java.math.BigDecimal val) {
		setConditionCostActual(op, val, CONDITION_AND);
	}

	public void setConditionCostActual(String op, java.math.BigDecimal val, String relation) {
		addCondition(12, op, relation, val);
	}

	public void setSelectCostActual(boolean val) {
		__select_flags[12] = val;
	}

	public void setCostActualExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionRevenueActual(String op, java.lang.String val) {
		setConditionRevenueActual(op, val, CONDITION_AND);
	}

	public void setConditionRevenueActual(String op, java.lang.String val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectRevenueActual(boolean val) {
		__select_flags[13] = val;
	}

	public void setRevenueActualExpression(String val) {
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

	public void setConditionDateLatestActivity(String op, java.util.Date val) {
		setConditionDateLatestActivity(op, val, CONDITION_AND);
	}

	public void setConditionDateLatestActivity(String op, java.util.Date val, String relation) {
		addCondition(16, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateLatestActivity(boolean val) {
		__select_flags[16] = val;
	}

	public void setDateLatestActivityExpression(String val) {
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

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val) {
		setConditionEmployeeIdUpdated(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdUpdated(String op, java.lang.Integer val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectEmployeeIdUpdated(boolean val) {
		__select_flags[18] = val;
	}

	public void setEmployeeIdUpdatedExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[19] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[20] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionEmployeeIdLatestFollowup(String op, java.lang.Integer val) {
		setConditionEmployeeIdLatestFollowup(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdLatestFollowup(String op, java.lang.Integer val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectEmployeeIdLatestFollowup(boolean val) {
		__select_flags[21] = val;
	}

	public void setEmployeeIdLatestFollowupExpression(String val) {
		__dataExpressions[21] = val;
	}

	public void setConditionEventDetailedAddress(String op, java.lang.String val) {
		setConditionEventDetailedAddress(op, val, CONDITION_AND);
	}

	public void setConditionEventDetailedAddress(String op, java.lang.String val, String relation) {
		addCondition(22, op, relation, val);
	}

	public void setSelectEventDetailedAddress(boolean val) {
		__select_flags[22] = val;
	}

	public void setEventDetailedAddressExpression(String val) {
		__dataExpressions[22] = val;
	}

	public void setConditionEventDescription(String op, java.lang.String val) {
		setConditionEventDescription(op, val, CONDITION_AND);
	}

	public void setConditionEventDescription(String op, java.lang.String val, String relation) {
		addCondition(23, op, relation, val);
	}

	public void setSelectEventDescription(boolean val) {
		__select_flags[23] = val;
	}

	public void setEventDescriptionExpression(String val) {
		__dataExpressions[23] = val;
	}

	public void setConditionMarketReactionExpected(String op, java.lang.String val) {
		setConditionMarketReactionExpected(op, val, CONDITION_AND);
	}

	public void setConditionMarketReactionExpected(String op, java.lang.String val, String relation) {
		addCondition(24, op, relation, val);
	}

	public void setSelectMarketReactionExpected(boolean val) {
		__select_flags[24] = val;
	}

	public void setMarketReactionExpectedExpression(String val) {
		__dataExpressions[24] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(25, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[25] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[25] = val;
	}


}

