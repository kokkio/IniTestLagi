package com.itenas.oop.uas.view;

import java.util.concurrent.atomic.AtomicLong;

import com.itenas.oop.uas.bean.Transaksi;
import com.itenas.oop.uas.dao.TransaksiDAO;
import com.itenas.oop.uas.dao.UserDAO;
import com.itenas.oop.uas.daoimpl.TransaksiDaoImpl;
import com.itenas.oop.uas.daoimpl.UserDaoImpl;

public class StructPrint {
	
	private static AtomicLong idCounter = new AtomicLong();
	//private static long idCounter = 0;
	
	public StructPrint() {
		
	}
	
	public static void Struct(Transaksi tr, String email) {
		
		UserDAO operation = new UserDaoImpl();
		TransaksiDAO operation1 = new TransaksiDaoImpl();
		//String uniqueID = UUID.randomUUID().toString();
		
		System.out.println("=================");
		System.out.println("Detail Pembayaran");
		System.out.println("-----------------");
		System.out.println("Order ID : TR-" + createID());
		System.out.println("Username : " + operation.getUserForStruct(email));
		System.out.println("Game     : " + tr.getGame());
		System.out.println("Item     : " + tr.getItem());
		System.out.println();
		System.out.println("Total    : " + tr.getPrice());
		System.out.println("-----------------");
		
		operation1.setTransaksi(operation.getUserForStruct(email), tr);
	}
	
	public static String createID()
	{
	    return String.valueOf(idCounter.getAndIncrement());
	}
	
}
