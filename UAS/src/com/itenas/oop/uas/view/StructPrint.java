package com.itenas.oop.uas.view;

import com.itenas.oop.uas.bean.Customer;
import com.itenas.oop.uas.bean.Transaksi;

public class StructPrint {
	
	public StructPrint() {
		
	}
	
	public static void Struct(Transaksi tr, Customer cs) {
		
		System.out.println("=================");
		System.out.println("Detail Pembayaran");
		System.out.println("-----------------");
		System.out.println("Order ID : " );
		System.out.println("Username : " + cs.getUsername());
		System.out.println("Game     : " + tr.getGame());
		System.out.println("Item     : " + tr.getItem());
		System.out.println();
		System.out.println("Total    : " + tr.getPrice());
		System.out.println("-----------------");
	}
}
