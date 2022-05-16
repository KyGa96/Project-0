package dao;

import java.util.List;

import exception.OverdraftException;
import model.AccountPojo;

public interface AccountDao {
	
	AccountPojo addAccount (AccountPojo accountPojo); //create
	
	AccountPojo updateAccount(AccountPojo accountPojo); //update
	
	void deleteAccount(int AccountNumber); // delete
	
	List<AccountPojo> Overdraft()throws OverdraftException; // Read 
	
	AccountPojo generateAccountNo(int accountNumber);

}
