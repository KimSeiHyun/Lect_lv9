package lv10;

public class Vehicle {
	
	public String name;
//	protected String name; // 타 패키지의 자식 클래스까지만 참조할 수 있게 제한 . 
	String color; // default
	private int speed;
	
	// 생략되어있는 기본생성자
//	public Vehicle() {}
	
	public Vehicle(String name) {
		this.name = name;
	}
}
