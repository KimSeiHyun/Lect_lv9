package models;

public class Members {

	private String name;
	private String phoneNumber;
	private int stamp;
	
	public Members(String name , String phoneNumber , int stamp ) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.stamp = stamp;

	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public int getStamp() {
		return stamp;
	}
	public void setStamp(int stamp) {
		this.stamp = stamp;
	}

	
	
}
