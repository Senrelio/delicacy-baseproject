package fix.db.dao;

import delicacy.common.AbstractTable;
import delicacy.common.GenericBase;
import fix.db.bean.BaseCrmContactsCustomer;


public class CrmContactsCustomer extends AbstractTable<BaseCrmContactsCustomer>
{

	public CrmContactsCustomer() throws java.sql.SQLException 
	{

		initColumnNames();
	}

	protected final void initColumnNames()  throws java.sql.SQLException {

		__columnCount          = 3;

		initTables();

		__tableName            = "crm_contacts_customers";

		__key_columns          = new int[1];
		__key_columns[0] = 0;

		__column_names[0] = BaseCrmContactsCustomer.CS_CONTACTS_CUSTOMERS_ID;
		__column_names[1] = BaseCrmContactsCustomer.CS_CONTACTS_ID;
		__column_names[2] = BaseCrmContactsCustomer.CS_CUSTOMERS_ID;

		resetSelectFlags() ;
		resetInsertFlags() ;
	}

	public void resetInsertFlags(){
		for(int i = 0; i < __columnCount; i ++ ) __insert_flags[i] = true;
		__insert_flags[0] = false;
		__serial_column = 0;
	}

	public void setPrimaryKeyFromBase(BaseCrmContactsCustomer b) {
		clear();
		setContactsCustomersIdClear(b.getContactsCustomersId());
	}

	public boolean isPrimaryKeyNull() {
		return getContactsCustomersId() == null;
	}

	@Override
	public BaseCrmContactsCustomer generateBase(){
		BaseCrmContactsCustomer b = new BaseCrmContactsCustomer();
		setDataToBase(b);
		return b;
	}

	@Override
	public void setDataToBase(BaseCrmContactsCustomer b){
		int count = 0; Object val;
		if((val = __current_data[count++]) != null) b.setContactsCustomersId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setContactsId(GenericBase.__getInt(val));
		if((val = __current_data[count++]) != null) b.setCustomersId(GenericBase.__getInt(val));
	}

	@Override
	public void setBaseToBuffer(BaseCrmContactsCustomer b, Object[] buff){
		int count = 0;
		buff[count++] = b.getContactsCustomersId();
		buff[count++] = b.getContactsId();
		buff[count++] = b.getCustomersId();
	}

	@Override
	public void setDataFromBase(BaseCrmContactsCustomer b){
		if(b.getContactsCustomersId() != null) setContactsCustomersIdClear(b.getContactsCustomersId());
		if(b.getContactsId() != null) setContactsId(b.getContactsId());
		if(b.getCustomersId() != null) setCustomersId(b.getCustomersId());
	}

	@Override
	public BaseCrmContactsCustomer generateBaseFromResultSet(java.sql.ResultSet sdr)  throws java.sql.SQLException {

		BaseCrmContactsCustomer b = new BaseCrmContactsCustomer();
		setQueryResultToBase(b, sdr);
		return b;
	}

	@Override
	public void setQueryResultToBase(BaseCrmContactsCustomer __base, java.sql.ResultSet sdr ) throws java.sql.SQLException {
		int count = 1, index = 0;
		java.sql.ResultSetMetaData rsmd = sdr.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Object val;
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactsCustomersId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setContactsId(GenericBase.__getInt(val));
		if(__select_flags[index++] && count <= columnCount && (val = sdr.getObject(count++)) != null) __base.setCustomersId(GenericBase.__getInt(val));
	}

	public void setContactsCustomersId(java.lang.Integer val) {
		setCurrentData(0, val);
	}

	public java.lang.Integer getContactsCustomersId() {
		return GenericBase.__getInt(__current_data[0]);
	}

	public void setContactsCustomersIdClear(java.lang.Integer val) {
		__backup_data[0] = __current_data[0] =  val;
		__modified_flags[0] = false;
	}

	public void setContactsId(java.lang.Integer val) {
		setCurrentData(1, val);
	}

	public java.lang.Integer getContactsId() {
		return GenericBase.__getInt(__current_data[1]);
	}

	public void setCustomersId(java.lang.Integer val) {
		setCurrentData(2, val);
	}

	public java.lang.Integer getCustomersId() {
		return GenericBase.__getInt(__current_data[2]);
	}

	public void setConditionContactsCustomersId(String op, java.lang.Integer val) {
		setConditionContactsCustomersId(op, val, CONDITION_AND);
	}

	public void setConditionContactsCustomersId(String op, java.lang.Integer val, String relation) {
		addCondition(0, op, relation, val);
	}

	public void setSelectContactsCustomersId(boolean val) {
		__select_flags[0] = val;
	}

	public void setContactsCustomersIdExpression(String val) {
		__dataExpressions[0] = val;
	}

	public void setConditionContactsId(String op, java.lang.Integer val) {
		setConditionContactsId(op, val, CONDITION_AND);
	}

	public void setConditionContactsId(String op, java.lang.Integer val, String relation) {
		addCondition(1, op, relation, val);
	}

	public void setSelectContactsId(boolean val) {
		__select_flags[1] = val;
	}

	public void setContactsIdExpression(String val) {
		__dataExpressions[1] = val;
	}

	public void setConditionCustomersId(String op, java.lang.Integer val) {
		setConditionCustomersId(op, val, CONDITION_AND);
	}

	public void setConditionCustomersId(String op, java.lang.Integer val, String relation) {
		addCondition(2, op, relation, val);
	}

	public void setSelectCustomersId(boolean val) {
		__select_flags[2] = val;
	}

	public void setCustomersIdExpression(String val) {
		__dataExpressions[2] = val;
	}


}

