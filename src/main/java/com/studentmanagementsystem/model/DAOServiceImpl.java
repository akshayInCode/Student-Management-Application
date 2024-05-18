package com.studentmanagementsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	private Connection con = null;
	private Statement stmnt = null;

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms_db", "root", "akshay");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void Signup(String name, String username, String password) {
		try {
			stmnt.executeUpdate("Insert into signup values('" + name + "','" + username + "','" + password + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean verifyLogin(String username, String password) {
		try {
			ResultSet result = stmnt.executeQuery(
					"Select * from signup where username='" + username + "'and password='" + password + "'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void createRegistration(int id, String name, String course, String email, String mobile) {
		try {
			stmnt.executeUpdate("Insert into student values('" + id + "','" + name + "','" + course + "','" + email
					+ "','" + mobile + "')");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet getAllRegistration() {
		try {
			ResultSet result = stmnt.executeQuery("Select* from student");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteByEmail(String email) {
		try {
			stmnt.executeUpdate("delete from student where email ='" + email + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateRegistration(String email, String mobile) {
		try {
			stmnt.executeUpdate("update student set mobile='" + mobile + "' where email='" + email + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isUsernameExists(String username) {
		try {
			ResultSet result = stmnt.executeQuery("SELECT username FROM signup WHERE username='" + username + "'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
