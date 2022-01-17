package com.itenas.oop.uas.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itenas.oop.uas.bean.User;
import com.itenas.oop.uas.dao.UserDAO;
import com.itenas.oop.uas.utils.DatabaseUtil;

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

}
