package com.itenas.oop.uas.menu;

import java.util.Scanner;

import com.itenas.oop.uas.bean.User;

import com.itenas.oop.uas.dao.UserDAO;
import com.itenas.oop.uas.daoimpl.UserDaoImpl;
import com.itenas.oop.uas.view.Form;
import com.itenas.oop.uas.view.TableView;

public class MainMenu{
	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		int gameChoice = 0, signChoice, accountType, menuChoice;
	
		Scanner scan = new Scanner(System.in);
		UserDAO operation = new UserDaoImpl();
		User user;
		String email, password;
		boolean login = false;
		
		do {
			System.out.println("Login as : ");
			System.out.println("1. Admin");
			System.out.println("2. Customer");
			System.out.println("------------------");
			System.out.print("Pilih : ");
			accountType = scan.nextInt();
			
			while (!(accountType == 1 || accountType == 2 || accountType == 0)) {
	        	System.out.println("Warning: Menu yang Anda masukkan salah!");
	        	System.out.println();
	        	System.out.print("Silahkan pilih menu kembali: ");
	        	accountType = scan.nextInt();
	        }
			
			if (accountType == 1) {
				
				// Admin
				
				System.out.println("**********Login As Admin**********");
				System.out.println("                     ");
				System.out.println("Pilih menu : ");
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("-----------------------------------------------");
				System.out.print("Pilih : ");		signChoice = scan.nextInt();
				scan.nextLine();
				
				while (!(signChoice == 1 || signChoice == 2)) {
					System.out.println("Warning: Menu yang Anda masukkan salah!");
					System.out.println();
					System.out.print("Silahkan pilih menu kembali: ");
					signChoice = scan.nextInt();
				}
				
				if(signChoice == 1) {
					Form.registerFormAdmin();
				} else if(signChoice == 2) {
					
				}
					System.out.println("**********SELAMAT DATANG DI 'TOPUPIN'**********");
					System.out.println("                   ");
					System.out.println(" ");
					System.out.println("Silakan LOGIN terlebih dahulu untuk mengatur data :)");
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
						System.out.println("1. Masukan Data Admin");
						System.out.println("2. Lihat Data User");
						System.out.println("3. Lihat Data Transaksi");
						System.out.println("4. Cari Data Transaksi");
						System.out.println("5. Update Data Admin");
						System.out.println("6. Hapus Data User");
						System.out.println();
						System.out.println("0. Log out");
						System.out.println("------------------------");
						System.out.print("Pilihan Anda : ");				menuChoice = scan.nextInt();
						
						while (!(menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4 || menuChoice == 5)) {
				        	System.out.println("Warning: Menu yang Anda masukkan salah!");
				        	System.out.println();
				        	System.out.print("Silahkan pilih menu kembali: ");
				        	menuChoice = scan.nextInt();
				        }
						
						switch (menuChoice) {
						case 1 :
							Form.registerFormAdmin();
						break;
						
						case 2 :
							TableView.execute();
						break;
						
						case 3 : 
							Form.updateForm();
						break;
						
						case 4 :
							Form.deleteForm();
						break;
					}
				}
				
			} else if (accountType == 2) {
				
				// Customer
				
				System.out.println("**********SELAMAT DATANG DI 'TOPUPIN'**********");
				System.out.println("           Murah, cepat, dan lengkap!          ");
				System.out.println("Pilih menu : ");
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("-----------------------------------------------");
				System.out.print("Pilih : ");		signChoice = scan.nextInt();
				scan.nextLine();
				
				while (!(signChoice == 1 || signChoice == 2)) {
					System.out.println("Warning: Menu yang Anda masukkan salah!");
					System.out.println();
					System.out.print("Silahkan pilih menu kembali: ");
					signChoice = scan.nextInt();
				}
				
				if(signChoice == 1) {
					Form.registerForm();
				} else if(signChoice == 2) {
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
						
						// Menu Customer
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
						
						while (!(gameChoice == 1 || gameChoice == 2 || gameChoice == 3 || gameChoice == 4 || gameChoice == 0)) {
				        	System.out.println("Warning: Menu yang Anda masukkan salah!");
				        	System.out.println();
				        	System.out.print("Silahkan pilih menu kembali: ");
				        	gameChoice = scan.nextInt();
						}
				
					} else {
						System.out.println(" Email atau Password yang Anda masukkan salah, coba lagi...!");
						System.out.println(" ");
					}
				
					TopUp tm = new TopUp(gameChoice, user.getEmail());
					
					scan.close();
					
				}
			}
		} while (!login);
	}
}
