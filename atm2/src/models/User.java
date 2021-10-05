package models;

import java.util.ArrayList;


public class User {
	public static User instance = new User();
	private int code;
	private String id;
	private String pw;
	private String name;
	public ArrayList<Account>acc = new ArrayList<>();
	
	public User() {
		
	}
	public User(int code , String id , String pw , String name ) {
		this.code = code;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public int getCode() {
		return this.code;
	}
	public String getId() {
		return this.id;
	}
	public String getPw() {
		return this.pw;
	}
	public String getName() {
		return this.name;
	}
	
	public void addAcc(Account newAcc) {
		this.acc.add(newAcc);
	}
	
	
}
