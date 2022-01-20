package com.itenas.oop.uas.menu;

import java.util.Scanner;

import com.itenas.oop.uas.bean.Transaksi;
import com.itenas.oop.uas.view.StructPrint;

public class TopUp{
	
	public TopUp(int gameChoice, String email) {
		int itemChoice, paymentChoice;
		Scanner scan = new Scanner(System.in);
		Transaksi tr = new Transaksi();
		
		try {
			switch (gameChoice) {
			case 1 :
				tr.setGame("Mobile Legends");
				Game1Item();
				System.out.print("Pilihan Anda : ");				itemChoice = scan.nextInt();
				switch (itemChoice) {
				case 1 :
					tr.setItem("55 Diamonds");
					tr.setPrice(15000);
					break;
				case 2 :
					tr.setItem("275 Diamonds");
					tr.setPrice(75000);
					break;
				case 3 : 
					tr.setItem("550 Diamonds");
					tr.setPrice(150000);
					break;
				case 4 : 
					tr.setItem("1200 Diamonds");
					tr.setPrice(300000);
					break;
				case 0 : 
					System.exit(0);
					break;
				}
				
				while (!(itemChoice == 1 || itemChoice == 2 || itemChoice == 3 || itemChoice == 4 || itemChoice == 0)) {
			        System.out.println("Warning: Menu yang Anda masukkan salah!");
			        System.out.println();
			        System.out.print("Silahkan pilih menu kembali: ");
			        itemChoice = scan.nextInt();
				}
				
				break;
			case 2 :
				tr.setGame("Love Nikki");
				Game2Item();
				System.out.print("Pilihan Anda : ");				itemChoice = scan.nextInt();
				switch (itemChoice) {
				case 1 :
					tr.setItem("56 Diamonds");
					tr.setPrice(10000);
					break;
				case 2 :
					tr.setItem("114 Diamonds");
					tr.setPrice(20000);
					break;
				case 3 : 
					tr.setItem("440 Diamonds");
					tr.setPrice(75000);
					break;
				case 4 : 
					tr.setItem("880 Diamonds");
					tr.setPrice(150000);
					break;
				case 0 : 
					System.exit(0);
					break;
				}
				
				while (!(itemChoice == 1 || itemChoice == 2 || itemChoice == 3 || itemChoice == 4 || itemChoice == 0)) {
			        System.out.println("Warning: Menu yang Anda masukkan salah!");
			        System.out.println();
			        System.out.print("Silahkan pilih menu kembali: ");
			        itemChoice = scan.nextInt();
				}
				
				break;
			case 3 : 
				tr.setGame("Free Fire");
				Game3Item();
				System.out.print("Pilihan Anda : ");				itemChoice = scan.nextInt();
				switch (itemChoice) {
				case 1 :
					tr.setItem("70 Diamonds");
					tr.setPrice(10000);
					break;
				case 2 :
					tr.setItem("120 Diamonds");
					tr.setPrice(20000);
					break;
				case 3 : 
					tr.setItem("360 Diamonds");
					tr.setPrice(50000);
					break;
				case 4 : 
					tr.setItem("720 Diamonds");
					tr.setPrice(100000);
					break;
				case 0 : 
					System.exit(0);
					break;
				}	
				
				while (!(itemChoice == 1 || itemChoice == 2 || itemChoice == 3 || itemChoice == 4 || itemChoice == 0)) {
			        System.out.println("Warning: Menu yang Anda masukkan salah!");
			        System.out.println();
			        System.out.print("Silahkan pilih menu kembali: ");
			        itemChoice = scan.nextInt();
				}
				
				break;
			case 4 : 
				tr.setGame("Clash of Clans");
				Game4Item();
				System.out.print("Pilihan Anda : ");				itemChoice = scan.nextInt();
				switch (itemChoice) {
				case 1 :
					tr.setItem("80 Gems");
					tr.setPrice(30000);
					break;
				case 2 :
					tr.setItem("500 Gems");
					tr.setPrice(80000);
					break;
				case 3 : 
					tr.setItem("1200 Gems");
					tr.setPrice(165000);
					break;
				case 4 : 
					tr.setItem("2500 Gems");
					tr.setPrice(330000);
					break;
				case 0 : 
					System.exit(0);
					break;
				}
				
				while (!(itemChoice == 1 || itemChoice == 2 || itemChoice == 3 || itemChoice == 4 || itemChoice == 0)) {
			        System.out.println("Warning: Menu yang Anda masukkan salah!");
			        System.out.println();
			        System.out.print("Silahkan pilih menu kembali: ");
			        itemChoice = scan.nextInt();
				}
				
				break;
			case 0 : 
				System.exit(0);
				break;
			}
		} catch (Exception x) {
			System.out.println("Terjadi error : " + x.getMessage());
		}
		
		System.out.println();
		System.out.println("========================");
		System.out.println("          Menu          ");
		System.out.println("========================");
		System.out.println("1. ATM");
		System.out.println("2. E-Money");
		System.out.println("3. Retail");
		System.out.println();
		System.out.println("0. Cancel");
		System.out.println("------------------------");
		System.out.print("Pilihan Anda : ");				paymentChoice = scan.nextInt();
		
		while (!(paymentChoice == 1 || paymentChoice == 2 || paymentChoice == 3 || paymentChoice == 4 || paymentChoice == 0)) {
	        System.out.println("Warning: Menu yang Anda masukkan salah!");
	        System.out.println();
	        System.out.print("Silahkan pilih menu kembali: ");
	        paymentChoice = scan.nextInt();
		}
	
		scan.close();
		
		StructPrint.Struct(tr, email);
	}
	
	public static void Game1Item() {
		System.out.println();
		System.out.println("========================");
		System.out.println("          Menu          ");
		System.out.println("========================");
		System.out.println("1. 55 Diamonds");
		System.out.println("2. 275 Diamond");
		System.out.println("3. 550 Diamond");
		System.out.println("4. 1200 Diamond");
		System.out.println();
		System.out.println("0. Log out");
		System.out.println("------------------------");
	}
	
	public static void Game2Item() {
		System.out.println();
		System.out.println("========================");
		System.out.println("          Menu          ");
		System.out.println("========================");
		System.out.println("1. 56 Diamonds");
		System.out.println("2. 114 Diamonds");
		System.out.println("3. 440 Diamonds");
		System.out.println("4. 880 Diamonds");
		System.out.println();
		System.out.println("0. Log out");
		System.out.println("------------------------");
	}
	
	public static void Game3Item() {
		System.out.println();
		System.out.println("========================");
		System.out.println("          Menu          ");
		System.out.println("========================");
		System.out.println("1. 70 Diamonds");
		System.out.println("2. 120 Diamonds");
		System.out.println("3. 360 Diamonds");
		System.out.println("4. 720 Diamonds");
		System.out.println();
		System.out.println("0. Log out");
		System.out.println("------------------------");
	}
	
	public static void Game4Item() {
		System.out.println();
		System.out.println("========================");
		System.out.println("          Menu          ");
		System.out.println("========================");
		System.out.println("1. 80 Gems");
		System.out.println("2. 500 Gems");
		System.out.println("3. 1200 Gems");
		System.out.println("4. 2500 Gems");
		System.out.println();
		System.out.println("0. Log out");
		System.out.println("------------------------");
	}
}
