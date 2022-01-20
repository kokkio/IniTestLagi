package com.itenas.oop.uas.view;

import java.util.List;
import java.util.Scanner;

import com.itenas.oop.uas.bean.User;
import com.itenas.oop.uas.dao.UserDAO;
import com.itenas.oop.uas.daoimpl.UserDaoImpl;

public class TableView {
	
	public static void execute() {
		UserDAO operation = new UserDaoImpl();
		tableUser(operation.getAllUser());
	}
	
	public static void tableUser(List<User> listUser) {
		UserDAO operation = new UserDaoImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("===================================================================================================");
		System.out.println("|                                            Data User                                            |");
		System.out.println("===================================================================================================");
		System.out.println("|            Email              |             Password             |             Nama             |");
		System.out.println("===================================================================================================");
		for (User user : listUser) {
			System.out.println("| " + user.getEmail() + "\t\t| " + user.getPassword() + "\t\t\t   | " + user.getFirstName() + "\t\t\t  |");
		}
		System.out.println("===================================================================================================");
	}
}
