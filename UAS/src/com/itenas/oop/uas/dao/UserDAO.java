package com.itenas.oop.uas.dao;

import java.util.List;

import com.itenas.oop.uas.bean.User;

public interface UserDAO {
	public User getUserByEmailAndPassword(String email, String password);
	public String getUserForStruct(String email);
	
	public List<User> getAllUser();
	public void register(User user);
	public void deleteUser(User user);
	public void updateUser(User admin);
	public void registerAdmin(User user);
}

