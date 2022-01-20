package com.itenas.oop.uas.bean;

public class Transaksi {
	private String orderId;
	private String game;
	private String paymentMethod;
	private String item;
	private double price;
	
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
}
