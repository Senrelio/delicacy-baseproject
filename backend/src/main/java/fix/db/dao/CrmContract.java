package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmContract;


public class CrmContract extends AbstractTable<BaseCrmContract>
{

	public CrmContract() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 24;

		initTables();

		__tableName            = "crm_contracts";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmContract.CS_CONTRACT_ID;
		__column_names[1] = BaseCrmContract.CS_CONTRACT_CODE;
		__column_names[2] = BaseCrmContract.CS_CONTRACT_TITLE;
		__column_names[3] = BaseCrmContract.CS_CUSTOMER_ID;
		__column_names[4] = BaseCrmContract.CS_OPPORTUNITY_ID;
		__column_names[5] = BaseCrmContract.CS_MARKETING_EVENT_ID;
		__column_names[6] = BaseCrmContract.CS_SUM;
		__column_names[7] = BaseCrmContract.CS_STATUS_CONTRACT;
		__column_names[8] = BaseCrmContract.CS_DATE_START;
		__column_names[9] = BaseCrmContract.CS_DATE_END;
		__column_names[10] = BaseCrmContract.CS_EMPLOYEE_ID_MAINTAINER;
		__column_names[11] = BaseCrmContract.CS_DATE_SIGNED;
		__column_names[12] = BaseCrmContract.CS_DATE_CREATED;
		__column_names[13] = BaseCrmContract.CS_CREATEDBY;
		__column_names[14] = BaseCrmContract.CS_DATE_UPDATED;
		__column_names[15] = BaseCrmContract.CS_EMPLOYEE_ID_UPDATED;
		__column_names[16] = BaseCrmContract.CS_DEPARTMENT_ID;
		__column_names[17] = BaseCrmContract.CS_FLAG_LOCKED;
		__column_names[18] = BaseCrmContract.CS_CONTRACT_TYPE;
		__column_names[19] = BaseCrmContract.CS_PAYMENT_METHOD_ACCEPTED;
		__column_names[20] = BaseCrmContract.CS_CONTRACT_CONTENT;
		__column_names[21] = BaseCrmContract.CS_CUSTOMER_SIGNER_NAME;
		__column_names[22] = BaseCrmContract.CS_EMPLOYEE_ID_SIGNER;
		__column_names[23] = BaseCrmContract.CS_MEMO;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmContract b) {
		clear();
		setContractIdClear(b.getContractId());
	}

	public boolean isPrimaryKeyNull() {
		return getContractId() == null;
	}

	@Override
	public BaseCrmContract generateBase(){
		BaseCrmContract b = new BaseCrmContract();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmContract b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setContractId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContractCode(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setContractTitle(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCustomerId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOpportunityId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setMarketingEventId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setSum(GenericBase.__getDecimal(val));
		if((val = __current_data[count++]) != null) b.setStatusContract(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateStart(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateEnd(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateSigned(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setDateCreated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setCreatedby(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setDepartmentId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setFlagLocked(GenericBase.__getBoolean(val));
		if((val = __current_data[count++]) != null) b.setContractType(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setPaymentMethodAccepted(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContractContent(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setCustomerSignerName(GenericBase.__getString(val));
		if((val = __current_data[count++]) != null) b.setEmployeeIdSigner(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setMemo(GenericBase.__getString(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmContract b, Object[] buff){
		int count = 0;
		buff[count++] = b.getContractId();
		buff[count++] = b.getContractCode();
		buff[count++] = b.getContractTitle();
		buff[count++] = b.getCustomerId();
		buff[count++] = b.getOpportunityId();
		buff[count++] = b.getMarketingEventId();
		buff[count++] = b.getSum();
		buff[count++] = b.getStatusContract();
		buff[count++] = generateTimestampFromDate(b.getDateStart());
		buff[count++] = generateTimestampFromDate(b.getDateEnd());
		buff[count++] = b.getEmployeeIdMaintainer();
		buff[count++] = generateTimestampFromDate(b.getDateSigned());
		buff[count++] = generateTimestampFromDate(b.getDateCreated());
		buff[count++] = b.getCreatedby();
		buff[count++] = generateTimestampFromDate(b.getDateUpdated());
		buff[count++] = b.getEmployeeIdUpdated();
		buff[count++] = b.getDepartmentId();
		buff[count++] = b.getFlagLocked();
		buff[count++] = b.getContractType();
		buff[count++] = b.getPaymentMethodAccepted();
		buff[count++] = b.getContractContent();
		buff[count++] = b.getCustomerSignerName();
		buff[count++] = b.getEmployeeIdSigner();
		buff[count++] = b.getMemo();
	}

	@Override
	public void setDataFromBase(BaseCrmContract b){
		if(b.getContractId() != null) setContractIdClear(b.getContractId());
		if(b.getContractCode() != null) setContractCode(b.getContractCode());
		if(b.getContractTitle() != null) setContractTitle(b.getContractTitle());
		if(b.getCustomerId() != null) setCustomerId(b.getCustomerId());
		if(b.getOpportunityId() != null) setOpportunityId(b.getOpportunityId());
		if(b.getMarketingEventId() != null) setMarketingEventId(b.getMarketingEventId());
		if(b.getSum() != null) setSum(b.getSum());
		if(b.getStatusContract() != null) setStatusContract(b.getStatusContract());
		if(b.getDateStart() != null) setDateStart(b.getDateStart());
		if(b.getDateEnd() != null) setDateEnd(b.getDateEnd());
		if(b.getEmployeeIdMaintainer() != null) setEmployeeIdMaintainer(b.getEmployeeIdMaintainer());
		if(b.getDateSigned() != null) setDateSigned(b.getDateSigned());
		if(b.getDateCreated() != null) setDateCreated(b.getDateCreated());
		if(b.getCreatedby() != null) setCreatedby(b.getCreatedby());
		if(b.getDateUpdated() != null) setDateUpdated(b.getDateUpdated());
		if(b.getEmployeeIdUpdated() != null) setEmployeeIdUpdated(b.getEmployeeIdUpdated());
		if(b.getDepartmentId() != null) setDepartmentId(b.getDepartmentId());
		if(b.getFlagLocked() != null) setFlagLocked(b.getFlagLocked());
		if(b.getContractType() != null) setContractType(b.getContractType());
		if(b.getPaymentMethodAccepted() != null) setPaymentMethodAccepted(b.getPaymentMethodAccepted());
		if(b.getContractContent() != null) setContractContent(b.getContractContent());
		if(b.getCustomerSignerName() != null) setCustomerSignerName(b.getCustomerSignerName());
		if(b.getEmployeeIdSigner() != null) setEmployeeIdSigner(b.getEmployeeIdSigner());
		if(b.getMemo() != null) setMemo(b.getMemo());
	}

	@Override
	public BaseCrmContract generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmContract b = new BaseCrmContract();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmContract __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractCode(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractTitle(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOpportunityId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMarketingEventId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setSum(GenericBase.__getDecimal(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setStatusContract(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateStart(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateEnd(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdMaintainer(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateSigned(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateCreated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCreatedby(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDateUpdated(GenericBase.__getDateFromSQL(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdUpdated(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setDepartmentId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setFlagLocked(GenericBase.__getBoolean(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractType(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setPaymentMethodAccepted(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractContent(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomerSignerName(GenericBase.__getString(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setEmployeeIdSigner(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setMemo(GenericBase.__getString(val));
	}

	public void setContractId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getContractId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setContractIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setContractCode(java.lang.String val) {
		setCurrentData(1, val);
	}

	public java.lang.String getContractCode() {
		return GenericBase.__getString(__current_data[1]);
	}

	public void setContractTitle(java.lang.String val) {
		setCurrentData(2, val);
	}

	public java.lang.String getContractTitle() {
		return GenericBase.__getString(__current_data[2]);
	}

	public void setCustomerId(java.lang.Integer val) {
		setCurrentData(3, val);
	}

	public java.lang.Integer getCustomerId() {
		return GenericBase.__getInt(__current_data[3]);
	}

	public void setOpportunityId(java.lang.Integer val) {
		setCurrentData(4, val);
	}

	public java.lang.Integer getOpportunityId() {
		return GenericBase.__getInt(__current_data[4]);
	}

	public void setMarketingEventId(java.lang.Integer val) {
		setCurrentData(5, val);
	}

	public java.lang.Integer getMarketingEventId() {
		return GenericBase.__getInt(__current_data[5]);
	}

	public void setSum(java.math.BigDecimal val) {
		setCurrentData(6, val);
	}

	public java.math.BigDecimal getSum() {
		return GenericBase.__getDecimal(__current_data[6]);
	}

	public void setStatusContract(java.lang.Integer val) {
		setCurrentData(7, val);
	}

	public java.lang.Integer getStatusContract() {
		return GenericBase.__getInt(__current_data[7]);
	}

	public void setDateStart(java.util.Date val) {
		setCurrentData(8, generateTimestampFromDate(val));
	}

	public java.util.Date getDateStart() {
		return GenericBase.__getDateFromSQL(__current_data[8]);
	}

	public void setDateEnd(java.util.Date val) {
		setCurrentData(9, generateTimestampFromDate(val));
	}

	public java.util.Date getDateEnd() {
		return GenericBase.__getDateFromSQL(__current_data[9]);
	}

	public void setEmployeeIdMaintainer(java.lang.Integer val) {
		setCurrentData(10, val);
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return GenericBase.__getInt(__current_data[10]);
	}

	public void setDateSigned(java.util.Date val) {
		setCurrentData(11, generateTimestampFromDate(val));
	}

	public java.util.Date getDateSigned() {
		return GenericBase.__getDateFromSQL(__current_data[11]);
	}

	public void setDateCreated(java.util.Date val) {
		setCurrentData(12, generateTimestampFromDate(val));
	}

	public java.util.Date getDateCreated() {
		return GenericBase.__getDateFromSQL(__current_data[12]);
	}

	public void setCreatedby(java.lang.Integer val) {
		setCurrentData(13, val);
	}

	public java.lang.Integer getCreatedby() {
		return GenericBase.__getInt(__current_data[13]);
	}

	public void setDateUpdated(java.util.Date val) {
		setCurrentData(14, generateTimestampFromDate(val));
	}

	public java.util.Date getDateUpdated() {
		return GenericBase.__getDateFromSQL(__current_data[14]);
	}

	public void setEmployeeIdUpdated(java.lang.Integer val) {
		setCurrentData(15, val);
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return GenericBase.__getInt(__current_data[15]);
	}

	public void setDepartmentId(java.lang.Integer val) {
		setCurrentData(16, val);
	}

	public java.lang.Integer getDepartmentId() {
		return GenericBase.__getInt(__current_data[16]);
	}

	public void setFlagLocked(java.lang.Boolean val) {
		setCurrentData(17, val);
	}

	public java.lang.Boolean getFlagLocked() {
		return GenericBase.__getBoolean(__current_data[17]);
	}

	public void setContractType(java.lang.Integer val) {
		setCurrentData(18, val);
	}

	public java.lang.Integer getContractType() {
		return GenericBase.__getInt(__current_data[18]);
	}

	public void setPaymentMethodAccepted(java.lang.Integer val) {
		setCurrentData(19, val);
	}

	public java.lang.Integer getPaymentMethodAccepted() {
		return GenericBase.__getInt(__current_data[19]);
	}

	public void setContractContent(java.lang.String val) {
		setCurrentData(20, val);
	}

	public java.lang.String getContractContent() {
		return GenericBase.__getString(__current_data[20]);
	}

	public void setCustomerSignerName(java.lang.String val) {
		setCurrentData(21, val);
	}

	public java.lang.String getCustomerSignerName() {
		return GenericBase.__getString(__current_data[21]);
	}

	public void setEmployeeIdSigner(java.lang.Integer val) {
		setCurrentData(22, val);
	}

	public java.lang.Integer getEmployeeIdSigner() {
		return GenericBase.__getInt(__current_data[22]);
	}

	public void setMemo(java.lang.String val) {
		setCurrentData(23, val);
	}

	public java.lang.String getMemo() {
		return GenericBase.__getString(__current_data[23]);
	}

	public void setConditionContractId(String op, java.lang.Integer val) {
		setConditionContractId(op, val, CONDITION_AND);
	}

	public void setConditionContractId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectContractId(boolean val) {
		__select_flags[0] = val;
	}

	public void setContractIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionContractCode(String op, java.lang.String val) {
		setConditionContractCode(op, val, CONDITION_AND);
	}

	public void setConditionContractCode(String op, java.lang.String val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectContractCode(boolean val) {
		__select_flags[1] = val;
	}

	public void setContractCodeExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionContractTitle(String op, java.lang.String val) {
		setConditionContractTitle(op, val, CONDITION_AND);
	}

	public void setConditionContractTitle(String op, java.lang.String val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectContractTitle(boolean val) {
		__select_flags[2] = val;
	}

	public void setContractTitleExpression(String val) {
		__dataExpressions[2] = val;
	}

	public void setConditionCustomerId(String op, java.lang.Integer val) {
		setConditionCustomerId(op, val, CONDITION_AND);
	}

	public void setConditionCustomerId(String op, java.lang.Integer val, String relation) {
		addCondition(3, op, relation, val);
	}

	public void setSelectCustomerId(boolean val) {
		__select_flags[3] = val;
	}

	public void setCustomerIdExpression(String val) {
		__dataExpressions[3] = val;
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val) {
		setConditionOpportunityId(op, val, CONDITION_AND);
	}

	public void setConditionOpportunityId(String op, java.lang.Integer val, String relation) {
		addCondition(4, op, relation, val);
	}

	public void setSelectOpportunityId(boolean val) {
		__select_flags[4] = val;
	}

	public void setOpportunityIdExpression(String val) {
		__dataExpressions[4] = val;
	}

	public void setConditionMarketingEventId(String op, java.lang.Integer val) {
		setConditionMarketingEventId(op, val, CONDITION_AND);
	}

	public void setConditionMarketingEventId(String op, java.lang.Integer val, String relation) {
		addCondition(5, op, relation, val);
	}

	public void setSelectMarketingEventId(boolean val) {
		__select_flags[5] = val;
	}

	public void setMarketingEventIdExpression(String val) {
		__dataExpressions[5] = val;
	}

	public void setConditionSum(String op, java.math.BigDecimal val) {
		setConditionSum(op, val, CONDITION_AND);
	}

	public void setConditionSum(String op, java.math.BigDecimal val, String relation) {
		addCondition(6, op, relation, val);
	}

	public void setSelectSum(boolean val) {
		__select_flags[6] = val;
	}

	public void setSumExpression(String val) {
		__dataExpressions[6] = val;
	}

	public void setConditionStatusContract(String op, java.lang.Integer val) {
		setConditionStatusContract(op, val, CONDITION_AND);
	}

	public void setConditionStatusContract(String op, java.lang.Integer val, String relation) {
		addCondition(7, op, relation, val);
	}

	public void setSelectStatusContract(boolean val) {
		__select_flags[7] = val;
	}

	public void setStatusContractExpression(String val) {
		__dataExpressions[7] = val;
	}

	public void setConditionDateStart(String op, java.util.Date val) {
		setConditionDateStart(op, val, CONDITION_AND);
	}

	public void setConditionDateStart(String op, java.util.Date val, String relation) {
		addCondition(8, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateStart(boolean val) {
		__select_flags[8] = val;
	}

	public void setDateStartExpression(String val) {
		__dataExpressions[8] = val;
	}

	public void setConditionDateEnd(String op, java.util.Date val) {
		setConditionDateEnd(op, val, CONDITION_AND);
	}

	public void setConditionDateEnd(String op, java.util.Date val, String relation) {
		addCondition(9, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateEnd(boolean val) {
		__select_flags[9] = val;
	}

	public void setDateEndExpression(String val) {
		__dataExpressions[9] = val;
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val) {
		setConditionEmployeeIdMaintainer(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdMaintainer(String op, java.lang.Integer val, String relation) {
		addCondition(10, op, relation, val);
	}

	public void setSelectEmployeeIdMaintainer(boolean val) {
		__select_flags[10] = val;
	}

	public void setEmployeeIdMaintainerExpression(String val) {
		__dataExpressions[10] = val;
	}

	public void setConditionDateSigned(String op, java.util.Date val) {
		setConditionDateSigned(op, val, CONDITION_AND);
	}

	public void setConditionDateSigned(String op, java.util.Date val, String relation) {
		addCondition(11, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateSigned(boolean val) {
		__select_flags[11] = val;
	}

	public void setDateSignedExpression(String val) {
		__dataExpressions[11] = val;
	}

	public void setConditionDateCreated(String op, java.util.Date val) {
		setConditionDateCreated(op, val, CONDITION_AND);
	}

	public void setConditionDateCreated(String op, java.util.Date val, String relation) {
		addCondition(12, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateCreated(boolean val) {
		__select_flags[12] = val;
	}

	public void setDateCreatedExpression(String val) {
		__dataExpressions[12] = val;
	}

	public void setConditionCreatedby(String op, java.lang.Integer val) {
		setConditionCreatedby(op, val, CONDITION_AND);
	}

	public void setConditionCreatedby(String op, java.lang.Integer val, String relation) {
		addCondition(13, op, relation, val);
	}

	public void setSelectCreatedby(boolean val) {
		__select_flags[13] = val;
	}

	public void setCreatedbyExpression(String val) {
		__dataExpressions[13] = val;
	}

	public void setConditionDateUpdated(String op, java.util.Date val) {
		setConditionDateUpdated(op, val, CONDITION_AND);
	}

	public void setConditionDateUpdated(String op, java.util.Date val, String relation) {
		addCondition(14, op, relation, generateTimestampFromDate(val));
	}

	public void setSelectDateUpdated(boolean val) {
		__select_flags[14] = val;
	}

	public void setDateUpdatedExpression(String val) {
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

	public void setConditionDepartmentId(String op, java.lang.Integer val) {
		setConditionDepartmentId(op, val, CONDITION_AND);
	}

	public void setConditionDepartmentId(String op, java.lang.Integer val, String relation) {
		addCondition(16, op, relation, val);
	}

	public void setSelectDepartmentId(boolean val) {
		__select_flags[16] = val;
	}

	public void setDepartmentIdExpression(String val) {
		__dataExpressions[16] = val;
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val) {
		setConditionFlagLocked(op, val, CONDITION_AND);
	}

	public void setConditionFlagLocked(String op, java.lang.Boolean val, String relation) {
		addCondition(17, op, relation, val);
	}

	public void setSelectFlagLocked(boolean val) {
		__select_flags[17] = val;
	}

	public void setFlagLockedExpression(String val) {
		__dataExpressions[17] = val;
	}

	public void setConditionContractType(String op, java.lang.Integer val) {
		setConditionContractType(op, val, CONDITION_AND);
	}

	public void setConditionContractType(String op, java.lang.Integer val, String relation) {
		addCondition(18, op, relation, val);
	}

	public void setSelectContractType(boolean val) {
		__select_flags[18] = val;
	}

	public void setContractTypeExpression(String val) {
		__dataExpressions[18] = val;
	}

	public void setConditionPaymentMethodAccepted(String op, java.lang.Integer val) {
		setConditionPaymentMethodAccepted(op, val, CONDITION_AND);
	}

	public void setConditionPaymentMethodAccepted(String op, java.lang.Integer val, String relation) {
		addCondition(19, op, relation, val);
	}

	public void setSelectPaymentMethodAccepted(boolean val) {
		__select_flags[19] = val;
	}

	public void setPaymentMethodAcceptedExpression(String val) {
		__dataExpressions[19] = val;
	}

	public void setConditionContractContent(String op, java.lang.String val) {
		setConditionContractContent(op, val, CONDITION_AND);
	}

	public void setConditionContractContent(String op, java.lang.String val, String relation) {
		addCondition(20, op, relation, val);
	}

	public void setSelectContractContent(boolean val) {
		__select_flags[20] = val;
	}

	public void setContractContentExpression(String val) {
		__dataExpressions[20] = val;
	}

	public void setConditionCustomerSignerName(String op, java.lang.String val) {
		setConditionCustomerSignerName(op, val, CONDITION_AND);
	}

	public void setConditionCustomerSignerName(String op, java.lang.String val, String relation) {
		addCondition(21, op, relation, val);
	}

	public void setSelectCustomerSignerName(boolean val) {
		__select_flags[21] = val;
	}

	public void setCustomerSignerNameExpression(String val) {
		__dataExpressions[21] = val;
	}

	public void setConditionEmployeeIdSigner(String op, java.lang.Integer val) {
		setConditionEmployeeIdSigner(op, val, CONDITION_AND);
	}

	public void setConditionEmployeeIdSigner(String op, java.lang.Integer val, String relation) {
		addCondition(22, op, relation, val);
	}

	public void setSelectEmployeeIdSigner(boolean val) {
		__select_flags[22] = val;
	}

	public void setEmployeeIdSignerExpression(String val) {
		__dataExpressions[22] = val;
	}

	public void setConditionMemo(String op, java.lang.String val) {
		setConditionMemo(op, val, CONDITION_AND);
	}

	public void setConditionMemo(String op, java.lang.String val, String relation) {
		addCondition(23, op, relation, val);
	}

	public void setSelectMemo(boolean val) {
		__select_flags[23] = val;
	}

	public void setMemoExpression(String val) {
		__dataExpressions[23] = val;
	}


}

