package com.itenas.oop.uas.view;

import java.util.Scanner;

import com.itenas.oop.uas.bean.User;
import com.itenas.oop.uas.dao.UserDAO;
import com.itenas.oop.uas.daoimpl.UserDaoImpl;

public class Form {
	public static void registerForm() {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		UserDAO operation = new UserDaoImpl();
		
		System.out.println("===========================");
		System.out.println("        Input Data         ");
		System.out.println("===========================");
		System.out.print("Email     : ");		user.setEmail(scan.nextLine());
		System.out.print("Password  : "); 		user.setPassword(scan.nextLine());
		System.out.print("Username  : ");		user.setFirstName(scan.nextLine());
		System.out.println("===========================");
		
		operation.register(user);
	}
	
	public static void registerFormAdmin() {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		UserDAO operation = new UserDaoImpl();
		
		System.out.println("===========================");
		System.out.println("        Input Data         ");
		System.out.println("===========================");
		System.out.print("Email     : ");		user.setEmail(scan.nextLine());
		System.out.print("Password  : "); 		user.setPassword(scan.nextLine());
		System.out.print("Username  : ");		user.setFirstName(scan.nextLine());
		System.out.println("===========================");
		
		operation.registerAdmin(user);
	}
	
	public static void deleteForm() {
		Scanner scan = new Scanner(System.in);
		String email;
		User user = new User();
		UserDAO operation = new UserDaoImpl();
		
		System.out.print("Masukan email kaun yang akan dihapus : ");
		email = scan.nextLine();
		user.setEmail(email);
		operation.deleteUser(user);
	}
	
	public static void updateForm() {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		UserDAO operation = new UserDaoImpl();
		
		System.out.println("===========================");
		System.out.println("        Update Data        ");
		System.out.println("===========================");
		System.out.print("Email     : ");		user.setEmail(scan.nextLine());
		System.out.print("Password  : "); 		user.setPassword(scan.nextLine());
		System.out.print("Username  : ");		user.setFirstName(scan.nextLine());
		System.out.println("===========================");
		
		operation.updateUser(user);
	}
}
