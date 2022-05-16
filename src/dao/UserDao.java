package dao;

import java.util.List;

import exception.InvalidLogin;
import model.UserPojo;

public interface UserDao {
	
	UserPojo updateUser(UserPojo UserPojo); //update
	
	void deleteUser(int userName); // delete
	
	List<UserPojo> psswordIncorrect()throws InvalidLogin; // Read 
	
	UserPojo generateAccountNo(int accountNumber);

	UserPojo addUser(UserPojo UserPojo);

}

