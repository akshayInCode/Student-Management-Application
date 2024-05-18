package com.studentmanagementsystem.model;

import java.sql.ResultSet;

//model layer
public interface DAOService {
	public void connectDB();
	public void Signup(String name, String username, String password);
	public boolean verifyLogin(String username, String password);
	public void  createRegistration(int id, String name, String course, String email, String mobile);
	public ResultSet getAllRegistration();
	public void deleteByEmail(String email);
	public void updateRegistration(String email, String mobile);
	boolean isUsernameExists(String username);

}
