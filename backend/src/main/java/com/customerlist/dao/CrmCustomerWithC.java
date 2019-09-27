package com.customerlist.dao;

import java.util.*;
import com.customerlist.bean.BaseCrmCustomerWithC;
import fix.db.bean.BaseCrmContactsCustomer;
import fix.db.dao.CrmContactsCustomer;

public class CrmCustomerWithC extends fix.db.dao.CrmCustomer
{


	public CrmCustomerWithC() throws java.sql.SQLException { initColumnNames(); }

	public List<BaseCrmContactsCustomer> getDetailCrmContactsCustomer() {
		return this.__detail_crmcontactscustomer;
	}

	public void setDetailCrmContactsCustomer( List<BaseCrmContactsCustomer> value ) {
		this.__detail_crmcontactscustomer = value;
	}

	private void deleteAndSaveDetailTables() throws java.sql.SQLException {
		// instantiate  DAO
		CrmContactsCustomer crmcontactscustomer = new CrmContactsCustomer();
		// load the original details.
		crmcontactscustomer.setConditionCustomersId("=", getCustomerId());
		List<BaseCrmContactsCustomer> originalcrmcontactscustomer = crmcontactscustomer.conditionalLoad(null);
		// if current detail is not empty.
		if(getDetailCrmContactsCustomer() != null) {
			// need to delete list.
			List<BaseCrmContactsCustomer> needToDeleteCrmContactsCustomer = new ArrayList<>();
			// need to add list.
			List<BaseCrmContactsCustomer> needToAddCrmContactsCustomer = new ArrayList<>();
			// find the record that exists in the original list and update.
			for(BaseCrmContactsCustomer __crmcontactscustomer : getDetailCrmContactsCustomer() ) {
				// set the relative field.
				__crmcontactscustomer.setCustomersId( getCustomerId());
				// set find flag
				boolean foundCrmContactsCustomer = false;
				// find the original list.
				for(BaseCrmContactsCustomer __originalcrmcontactscustomer : originalcrmcontactscustomer) {
					// if found the original record
					if(__crmcontactscustomer.compareTo(__originalcrmcontactscustomer) == 0) {
						// set found flag to true
						foundCrmContactsCustomer = true;
						// update the record.
						// clear DAO's data
						crmcontactscustomer.clearCurrentData();
						// set original data into DAO
						crmcontactscustomer.setDataFromBase(__originalcrmcontactscustomer);
						// clear DAO modification flag, just like the is loaded from DB
						crmcontactscustomer.clearModifiedFlags();
						// set current data into DAO
						crmcontactscustomer.setDataFromBase(__crmcontactscustomer);
						// execute update
						crmcontactscustomer.update();
						break;
					}
				}
				// if not found, then add it to need-to-add list
				if(!foundCrmContactsCustomer) needToAddCrmContactsCustomer.add(__crmcontactscustomer);
			}
			// find the records that exists in the original list and not in the current list.
			for(BaseCrmContactsCustomer __originalcrmcontactscustomer : originalcrmcontactscustomer) {
				boolean foundCrmContactsCustomer = false;
				for(BaseCrmContactsCustomer __crmcontactscustomer : getDetailCrmContactsCustomer() ) {
					if(__crmcontactscustomer.compareTo(__originalcrmcontactscustomer) == 0) {
						foundCrmContactsCustomer = true;
						break;
				}
				}
				if(!foundCrmContactsCustomer) needToDeleteCrmContactsCustomer.add(__originalcrmcontactscustomer);
			}
			// process need-to-delete list
			for(BaseCrmContactsCustomer __crmcontactscustomer : needToDeleteCrmContactsCustomer ) {
				deleteFromCrmContactsCustomer(__crmcontactscustomer, crmcontactscustomer);
			}
			// process need-to-add list
			for(BaseCrmContactsCustomer __crmcontactscustomer : needToAddCrmContactsCustomer ) {
				crmcontactscustomer.clearCurrentData();
				crmcontactscustomer.setDataFromBase(__crmcontactscustomer);
				crmcontactscustomer.save();
				__crmcontactscustomer.setContactsCustomersId(crmcontactscustomer.getContactsCustomersId());
			}
		} else {
			// if current list is empty, then delete all original list.
			for(BaseCrmContactsCustomer __crmcontactscustomer : originalcrmcontactscustomer ) {
				deleteFromCrmContactsCustomer(__crmcontactscustomer, crmcontactscustomer);
			}
		}
	}

	private void deleteFromCrmContactsCustomer(BaseCrmContactsCustomer bean, CrmContactsCustomer dao) throws java.sql.SQLException {
		dao.setDataFromBase(bean);
		dao.clearModifiedFlags();
		dao.setCustomersId(null);
		if(__detail_delete_crmcontactscustomer) dao.delete(); else dao.update();
	}

	// 删除子表方法, 一般不建议使用，最好是修改关联关系，脱离关系就行
	private void deleteDetailTables()  throws java.sql.SQLException {
		CrmContactsCustomer crmcontactscustomer = new CrmContactsCustomer();
		crmcontactscustomer.setConditionCustomersId("=", getCustomerId());
		crmcontactscustomer.conditionalDelete();
	}

	// 从数据中按主键查询数据，可以包含明细数据
	public boolean load(boolean loadDetail) throws java.sql.SQLException {
		if(!super.load()) return false;
		if(loadDetail){
			CrmContactsCustomer crmcontactscustomer = new CrmContactsCustomer();
			crmcontactscustomer.setConditionCustomersId("=", getCustomerId());
			setDetailCrmContactsCustomer(crmcontactscustomer.conditionalLoad());
		}
		return true;
	}

	public List<BaseCrmCustomerWithC> conditionalLoadExt(String addtional) throws java.sql.SQLException {
		List<BaseCrmCustomerWithC> result = BaseCrmCustomerWithC.getBeanList(conditionalLoad(addtional));
		return result;
	}

	public BaseCrmCustomerWithC generateBaseExt() {
		BaseCrmCustomerWithC ____result = new BaseCrmCustomerWithC();
		setDataToBase(____result);
		return ____result;
	}

	public void setDataFromBase(BaseCrmCustomerWithC __base) {
		super.setDataFromBase(__base);
		setDetailCrmContactsCustomer(__base.getDetailCrmContactsCustomer());
	}

	public void setDataToBase(BaseCrmCustomerWithC __base) {
		super.setDataToBase(__base);
		__base.setDetailCrmContactsCustomer(getDetailCrmContactsCustomer());
	}

	@Override
	public int save() throws java.sql.SQLException {

		if(super.save() == 0) return 0;
		deleteAndSaveDetailTables();
		return 1;
	}

	@Override
	public int update() throws java.sql.SQLException {

		super.update();
		deleteAndSaveDetailTables();
		return 1;
	}

	@Override
	public int conditionalUpdate() throws java.sql.SQLException {

		super.conditionalUpdate();
		deleteAndSaveDetailTables();
		return 1;
	}

	@Override
	public int delete() throws java.sql.SQLException {
		super.delete();
		deleteDetailTables();
		return 1;
	}

	@Override
	public int conditionalDelete() throws java.sql.SQLException {
		super.conditionalDelete();
		deleteDetailTables();
		return 1;
	}

	public boolean isDeleteDetailCrmContactsCustomer() {
		return this.__detail_delete_crmcontactscustomer;
	}

	public void setDeleteDetailCrmContactsCustomer( boolean value ) {
		this.__detail_delete_crmcontactscustomer = value;
	}

	protected boolean __detail_delete_crmcontactscustomer = true; 
	protected List<BaseCrmContactsCustomer> __detail_crmcontactscustomer ; 
}
