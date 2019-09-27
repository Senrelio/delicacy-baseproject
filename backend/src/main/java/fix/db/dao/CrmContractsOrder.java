package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmContractsOrder;


public class CrmContractsOrder extends AbstractTable<BaseCrmContractsOrder>
{

	public CrmContractsOrder() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 3;

		initTables();

		__tableName            = "crm_contracts_orders";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmContractsOrder.CS_CONTRACT_ORDERS_ID;
		__column_names[1] = BaseCrmContractsOrder.CS_CONTRACT_ID;
		__column_names[2] = BaseCrmContractsOrder.CS_ORDER_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmContractsOrder b) {
		clear();
		setContractOrdersIdClear(b.getContractOrdersId());
	}

	public boolean isPrimaryKeyNull() {
		return getContractOrdersId() == null;
	}

	@Override
	public BaseCrmContractsOrder generateBase(){
		BaseCrmContractsOrder b = new BaseCrmContractsOrder();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmContractsOrder b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setContractOrdersId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContractId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setOrderId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmContractsOrder b, Object[] buff){
		int count = 0;
		buff[count++] = b.getContractOrdersId();
		buff[count++] = b.getContractId();
		buff[count++] = b.getOrderId();
	}

	@Override
	public void setDataFromBase(BaseCrmContractsOrder b){
		if(b.getContractOrdersId() != null) setContractOrdersIdClear(b.getContractOrdersId());
		if(b.getContractId() != null) setContractId(b.getContractId());
		if(b.getOrderId() != null) setOrderId(b.getOrderId());
	}

	@Override
	public BaseCrmContractsOrder generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmContractsOrder b = new BaseCrmContractsOrder();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmContractsOrder __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractOrdersId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContractId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setOrderId(GenericBase.__getInt(val));
	}

	public void setContractOrdersId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getContractOrdersId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setContractOrdersIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setContractId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getContractId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setOrderId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getOrderId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setConditionContractOrdersId(String op, java.lang.Integer val) {
		setConditionContractOrdersId(op, val, CONDITION_AND);
	}

	public void setConditionContractOrdersId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectContractOrdersId(boolean val) {
		__select_flags[0] = val;
	}

	public void setContractOrdersIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionContractId(String op, java.lang.Integer val) {
		setConditionContractId(op, val, CONDITION_AND);
	}

	public void setConditionContractId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectContractId(boolean val) {
		__select_flags[1] = val;
	}

	public void setContractIdExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionOrderId(String op, java.lang.Integer val) {
		setConditionOrderId(op, val, CONDITION_AND);
	}

	public void setConditionOrderId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectOrderId(boolean val) {
		__select_flags[2] = val;
	}

	public void setOrderIdExpression(String val) {
		__dataExpressions[2] = val;
	}


}

