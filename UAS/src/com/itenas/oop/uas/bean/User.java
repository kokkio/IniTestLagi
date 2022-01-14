package com.itenas.oop.uas.bean;

public class User {
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String password;
	private int isAdmin;
	private int isActive = 1;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String phone, String email,
			String password, int isAdmin, int isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.isAdmin = isAdmin;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int isAdmin() {
		return isAdmin;
	}

	public void setAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public int isActive() {
		return isActive;
	}

	public void setActive(int isActive) {
		this.isActive = isActive;
	}

	private String[][] accounts = {{"jeje@gmail.com", "1234"}, {"balmonana@gmail.com", "1234"}};
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public boolean isAuth(String email, String password) {
		return ((email.equals(accounts[0][0])) && (password.equals(accounts[0][1])));
	}
}
