package com.itenas.oop.uas.menu;

import java.util.Scanner;

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
		
		System.out.println("Login");
		System.out.print("Username : ");	cust.setUsername(scan.nextLine());
		System.out.print("Password : ");    cust.setPassword(scan.nextLine());
		
		System.out.println();
		System.out.println("========================");
		System.out.println("          Menu          ");
		System.out.println("========================");
		System.out.println("1. Game (1) ");
		System.out.println("2. Game (2) ");
		System.out.println("3. Game (3) ");
		System.out.println("4. Game (4) ");
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
		
	}
}
