package lv6;

import java.util.Random;

// Random , Scanner , File , FileWriter , FIleReader , BufferedReader , Integer , 
// String  
// Ŭ���� Class
// �� ���
// 	1) �ɹ�����
//	2) �޼���

// �� ����� ���� �ڷ��� 

// ��ü : ����
// ������� ) �ڵ���, ���(User) , å ... 

// Ŭ���� ���� 
// class Ŭ������ { }

// �޼��� ���� 
// ' ��� ' ������ �ڵ���� '��Ȱ��' �� �� �ְ� ���� ��
// Ŭ������ ������ �ִ� ��� .

// �������ڷ��� �޼����( �Ķ���� ����(�ʿ��) ) { 
// ���๮; return;  }



class Person {
	// Ŭ���� �ɹ�
	Long code;
	int gender; // 1 ���� 2 ����
	String name; //
	int age;
	int height;
	int weight;
	String address;
	int price;
	void printInfo() {
		System.out.printf("%s : %d \n" , this.name , this.price);
// return;		
	}
	
	void setInfo(String name, int price) {
		this.name = name;
		this.price = price;
	}
	int setPrice(int price) {
		this.price = price;
		return this.price;
		
	}
	
}
public class Ex001 {

	public static void main(String[] args) {
		
		Random rn = new Random(); // Ŭ���� �ʱ�ȭ ��� . 
		
		// Ŭ������ ������ (��ä�� ����)
		// Ŭ������ ������ = new Ŭ������();
		Person ps = new Person();
		System.out.println(ps); //lv6.Person@41a4555e    //lv6��Person �� Ŭ������� ��Ű����
		// �ż��� ���(ȣ��)
		
		ps.setInfo("�Ļ�", 3000);
		ps.printInfo();
		ps.setPrice(3500);
		ps.printInfo();
		// Ŭ���� ���� �̸��� ���� .(��)�� ��� ��Ʈ�� �����̽��� ������ �ɹ��� ���� . 
		ps.code = 1234L;
		ps.gender = 1;
		
		
		
		
	}

}
