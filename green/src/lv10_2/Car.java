package lv10_2;

import lv10.Vehicle;

public class Car extends Vehicle {
	
	public Car(String name) {
		super(name); // �θ� Ŭ������ ������ ȣ�� .
	//	super.color = "blue";
		//protected�� ������ Ȯ���ϱ� ���� ������ �ẽ , 
	}
	
	// �������̵� :  ��ӹ��� �θ��� �޼ҵ带 ������ �ϴ� �� . 
	@Override
	public String toString() {
		return "�ڵ����� �̸��� : " + name;
	}
}
