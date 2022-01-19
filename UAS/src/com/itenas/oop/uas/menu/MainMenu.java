package com.itenas.oop.uas.menu;

import java.util.Scanner;

import com.itenas.oop.uas.bean.User;

import com.itenas.oop.uas.dao.UserDAO;
import com.itenas.oop.uas.daoimpl.UserDaoImpl;

import com.itenas.oop.uas.bean.Customer;
import com.itenas.oop.uas.view.StructPrint;

public class MainMenu {

	public static void main(String[] args) {
		mainMenu();
	}
	
	public static void mainMenu() {
		int gameChoice;
		
		Scanner scan = new Scanner(System.in);
		Customer cust = new Customer();	
		UserDAO operation = new UserDaoImpl();
		User user;
		String email, password;
		boolean login = false;
		
		do {
			System.out.println("**********SELAMAT DATANG DI 'TOPUPIN'**********");
			System.out.println("           Murah, cepat, dan lengkap!          ");
			System.out.println(" ");
			System.out.println("Silakan LOGIN terlebih dahulu untuk bertransaksi :)");
			System.out.println(" ");
			System.out.print("| Email      : "); email = scan.nextLine();
			System.out.print("| Password   : "); password = scan.nextLine();
			System.out.println("+---------------------------------------------+");
			System.out.println();
			user = operation.getUserByEmailAndPassword(email, password);
			if (user != null) {
				login = true;
				System.out.println();
				System.out.println("========================");
				System.out.println("          Menu          ");
				System.out.println("========================");
				System.out.println("1. Mobile Legend ");
				System.out.println("2. Love Nikki ");
				System.out.println("3. Free Fire ");
				System.out.println("4. Clash of Clans ");
				System.out.println();
				System.out.println("0. Log out");
				System.out.println("------------------------");
				System.out.print("Pilihan Anda : ");				gameChoice = scan.nextInt();
				
				while (!(gameChoice == 1 || gameChoice == 2 || gameChoice == 3)) {
		        	System.out.println("Warning: Menu yang Anda masukkan salah!");
		        	System.out.println();
		        	System.out.print("Silahkan pilih menu kembali: ");
		        	gameChoice = scan.nextInt();
		        }
				
				TopUp tm = new TopUp(gameChoice, cust);
				
				scan.close();
				

			} else {
				System.out.println("Email atau password yang Anda masukkan salah, coba lagi...!");
				System.out.println(" ");
			}
		} while (!login);
	}
}
