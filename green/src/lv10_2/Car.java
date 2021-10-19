package lv10_2;

import lv10.Vehicle;

public class Car extends Vehicle {
	
	public Car(String name) {
		super(name); // 부모 클래스의 생성자 호출 .
	//	super.color = "blue";
		//protected의 범위를 확인하기 위해 예제를 써봄 , 
	}
	
	// 오버라이딩 :  상속받은 부모의 메소드를 재정의 하는 것 . 
	@Override
	public String toString() {
		return "자동차의 이름은 : " + name;
	}
}
