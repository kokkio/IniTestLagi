package com.itenas.oop.uas.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itenas.oop.uas.bean.User;
import com.itenas.oop.uas.dao.UserDAO;
import com.itenas.oop.uas.utils.DatabaseUtil;
import com.mysql.cj.protocol.Resultset;

public class UserDaoImpl implements UserDAO {

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		DatabaseUtil db = new DatabaseUtil();
		User user = new User();
		user = null;
		try {
			db.connect();

			String query = "SELECT * FROM user WHERE email = '"+email+"' AND password='"+password+"'";
			
			ResultSet rs = db.readData(query);
			
			List<User> listUser = new ArrayList<User>();

			// process query results
			while (rs.next()) {
				User us = new User();
				us.setEmail(rs.getObject(1).toString());
				us.setPassword(rs.getObject(2).toString());
				us.setFirstName(rs.getObject(3).toString());
				
				listUser.add(us);
				
				for (User usr : listUser) {
					if (email.equals(usr.getEmail()) && password.equals(usr.getPassword())) {
						user = usr;
					}
				}
			}
			
			//close db connection
			db.disconnect();

		} catch (SQLException ex) {
			System.out.println("The following error has occured : " + ex.getMessage());
		}
		
		return user;
	}
	
	@Override
	public String getUserForStruct(String email) {
		DatabaseUtil db = new DatabaseUtil();
		User user = new User();
		user = null;
		try {
			db.connect();

			String query = "SELECT * FROM user WHERE email = '"+email+"'";
			
			ResultSet rs = db.readData(query);
			
			List<User> listUser = new ArrayList<User>();

			// process query results
			while (rs.next()) {
				User us = new User();
				us.setEmail(rs.getObject(1).toString());
				us.setPassword(rs.getObject(2).toString());
				us.setFirstName(rs.getObject(3).toString());
				
				listUser.add(us);
				
				for (User usr : listUser) {
					if (email.equals(usr.getEmail())) {
						user = usr;
					}
				}
			}
			
			//close db connection
			db.disconnect();

		} catch (SQLException ex) {
			System.out.println("The following error has occured : " + ex.getMessage());
		}
		
		return user.getFirstName();
	}
	
	@Override
	public void register(User user) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO User VALUES ("
					+ "'" + user.getEmail() + "',"
					+ "'" + user.getPassword() + "',"
					+ "'" + user.getFirstName() + "');";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan");
			
		} catch (Exception ex) {
			System.out.println("Terjadi error : " + ex.getMessage());
		}
	}
	
	public void deleteUser(User user) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "DELETE FROM User WHERE Email = '" + user.getEmail() + "';";
			db.executeQuery(query);
			System.out.println("Data berhasil dihapus...");
		} catch (Exception ex) {
			System.out.println("Terjadi Error : " + ex.getMessage());
		}
	}
	
	public List<User> getAllUser() {
		List<User> listUser = new ArrayList<User>();
		DatabaseUtil db = new DatabaseUtil();
		
		try {
			db.connect();
			
			String query = "SELECT * FROM User";
			
			ResultSet rs = db.readData(query);
			
			while (rs.next()) {
				User user = new User();
				
				user.setEmail(rs.getObject(1).toString());
				user.setPassword(rs.getObject(2).toString());
				user.setFirstName(rs.getObject(3).toString());
				
				listUser.add(user);
				
			}
			
			db.disconnect();
			
		} catch (Exception ex) {
			System.out.println("Terjadi Error : " + ex.getMessage());
		}
		
		return listUser;
	}
	
	public void updateUser(User admin) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "UPDATE Admin SET "
					+ "Email = '" + admin.getEmail() + "',"
					+ "Password = '" + admin.getPassword() + "',"
					+ "Nama = '" + admin.getFirstName() + "');";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan");
			
		} catch (Exception ex) {
			System.out.println("Terjadi error : " + ex.getMessage());
		}
	}
	
	public void registerAdmin(User user) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO Admin VALUES ("
					+ "'" + user.getEmail() + "',"
					+ "'" + user.getPassword() + "',"
					+ "'" + user.getFirstName() + "');";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan");
			
		} catch (Exception ex) {
			System.out.println("Terjadi error : " + ex.getMessage());
		}
	}
	
}
