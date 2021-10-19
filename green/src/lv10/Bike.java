package lv10;

public class Bike extends Vehicle{
	public Bike(String name) {
		super(name);
		name = "name";
		color = "Black";
	}
	
	@Override
	public String toString() {
		return "바이크의 이름은 : " + name;
	}
}
