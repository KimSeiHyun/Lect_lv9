package models;

public class Members {

	private String name;
	private String phoneNumber;
	private int stamp;
	private int point;
	
	public Members(String name , String phoneNumber , int stamp , int point) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.stamp = stamp;
		this.point = point;
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
