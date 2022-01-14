package com.itenas.oop.uas.dao;

import com.itenas.oop.uas.bean.User;

public interface UserDAO {
	public User getUserByEmailAndPassword(String email, String password);
}
