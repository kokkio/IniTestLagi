package com.itenas.oop.uas.menu;

import java.util.Scanner;

import com.itenas.oop.uas.bean.Customer;
import com.itenas.oop.uas.bean.Transaksi;
import com.itenas.oop.uas.view.StructPrint;

public class TopUp{
	
	public TopUp(int gameChoice, Customer cs) {
		int itemChoice;
		Scanner scan = new Scanner(System.in);
		Transaksi tr = new Transaksi();
		
		switch (gameChoice) {
		case 1 :
			tr.setGame("Game 1");
			break;
		case 2 :
			tr.setGame("Game 2");
			break;
		case 3 : 
			tr.setGame("Game 3");
			break;
		case 4 : 
			tr.setGame("Game 4");
			break;
		case 0 : 
			System.exit(0);
			break;
		}
		
		System.out.println();
		System.out.println("========================");
		System.out.println("          Menu          ");
		System.out.println("========================");
		System.out.println("1. 25 Crystal");
		System.out.println("2. 50 Crystal");
		System.out.println("3. 100 Crystal");
		System.out.println("4. 200 Crystal");
		System.out.println();
		System.out.println("0. Log out");
		System.out.println("------------------------");
		System.out.print("Pilihan Anda : ");				itemChoice = scan.nextInt();
		
		switch (itemChoice) {
		case 1 :
			tr.setItem("25");
			tr.setPrice(25000);
			break;
		case 2 :
			tr.setItem("50");
			tr.setPrice(50000);
			break;
		case 3 : 
			tr.setItem("100");
			tr.setPrice(100000);
			break;
		case 4 : 
			tr.setItem("200");
			tr.setPrice(200000);
			break;
		case 0 : 
			System.exit(0);
			break;
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
		System.out.print("Pilihan Anda : ");				itemChoice = scan.nextInt();
	
		scan.close();
		
		StructPrint.Struct(tr, cs);
	}
	
	
}
