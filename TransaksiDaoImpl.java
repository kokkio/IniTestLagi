package com.itenas.oop.uas.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itenas.oop.uas.bean.Transaksi;
import com.itenas.oop.uas.bean.User;
import com.itenas.oop.uas.dao.TransaksiDAO;
import com.itenas.oop.uas.dao.UserDAO;
import com.itenas.oop.uas.utils.DatabaseUtil;

public class TransaksiDaoImpl implements TransaksiDAO{
	public void setTransaksi(String username, Transaksi transaksi) {
		DatabaseUtil db = new DatabaseUtil();
		//User user = new User();
		try {
			db.connect();

			String query = "INSERT INTO Transaksi VALUES ("
					+ "'" + username + "',"
					+ "'" + transaksi.getGame() + "',"
					+ "'" + transaksi.getItem() + "',"
					+ "'" + transaksi.getPrice() + "');";
			
			db.executeQuery(query);
			System.out.println("Data Transaksi berhasil disimpan!");
		} catch (Exception ex) {
			System.out.println("The following error has occured : " + ex.getMessage());
		}

	}
}
