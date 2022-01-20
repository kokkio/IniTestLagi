package com.itenas.oop.uas.view;

import java.util.Scanner;

import com.itenas.oop.uas.bean.User;
import com.itenas.oop.uas.menu.TopUp;

public class MenuView {
	public static int mainMenu() {
		
		Scanner scan = new Scanner(System.in);
		int gameChoice;
		
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
		
		while (!(gameChoice == 1 || gameChoice == 2 || gameChoice == 3 || gameChoice == 4)) {
        	System.out.println("Warning: Menu yang Anda masukkan salah!");
        	System.out.println();
        	System.out.print("Silahkan pilih menu kembali: ");
        	gameChoice = scan.nextInt();
        }
		
		scan.close();
		
		return gameChoice;
	}
	
	public static void menuAdmin() {
		
		Scanner scan = new Scanner(System.in);
		int menuChoice;
		
		System.out.println();
		System.out.println("========================");
		System.out.println("          Menu          ");
		System.out.println("========================");
		System.out.println("1. Masukan Data ");
		System.out.println("2. Lihat Data ");
		System.out.println("3. Update Data ");
		System.out.println("4. Hapus Data");
		System.out.println();
		System.out.println("0. Log out");
		System.out.println("------------------------");
		System.out.print("Pilihan Anda : ");				menuChoice = scan.nextInt();
		while (!(menuChoice == 1 || menuChoice == 2 || menuChoice == 0)) {
        	System.out.println("Warning: Menu yang Anda masukkan salah!");
        	System.out.println();
        	System.out.print("Silahkan pilih menu kembali: ");
        	menuChoice = scan.nextInt();
        }
		switch (menuChoice) {
		case 1 :
			Form.registerForm();
		break;
		
		case 2 :
			TableView.execute();
		break;
		
		case 3 : 
			
		break;
		
		case 4 :
			Form.deleteForm();
		break;
		}
		
		scan.close();
	}
}
