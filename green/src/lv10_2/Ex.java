package lv10_2;

import lv10.Bike;
import lv10.Vehicle;

public class Ex {

	public static void main(String[] args) {
		Car car = new Car("동차1");
		Bike bike = new Bike("동차이");
		
		Vehicle vehicle = new Vehicle("no String");
		
		System.out.println(car.toString());
		System.out.println(car);
		
		System.out.println(bike.toString());
		System.out.println(bike);
		
		System.out.println(vehicle.toString());
		System.out.println(vehicle);
	}

}
