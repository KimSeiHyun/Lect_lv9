package lv7;


// Ŭ���� �迭

// Ŭ���� ��� 
// 1. ������� (�Ӽ�����)
// 2. �޼��� (���ɰ���)

// Ŭ������ ? 
// ����� ���� �ڷ��� (��ü�� ��� ��������� �̸� �����ص� ����, û����)

// Ŭ���� ����
// class Ŭ������{} (Ŭ������ ù������ ������ �빮��)

// ����������
// public (������Ʈ���� ������ ��밡���ϰ� ������ ��������)
// default (
// private (Ŭ�������� ������ ��밡���ϰ� ������ ��������)
// protected

class ExPerson {
	private String name;
	private int age;
	private int gender;
	
	// ������ ����
	// Ŭ������() {}
	ExPerson() { // �Ķ���Ͱ� �������� �ʴ� �����ڴ� �⺻������. ��� �θ���.
		System.out.println("����!");
	}
	// �����ε� (�޼��峪 �����ڵ� ����)
	// �Ȱ��� �̸����� ����� �ٸ� �������� ���°�. (������ ������� ex)�ŰԺ����� �شٰų�) 
	ExPerson(String name) {
		this.name = name;
		System.out.printf("%s�� ����! \n",this.name);
	}
	ExPerson(String name, int age , int gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// Getter
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	int getGender() {
		return this.gender;
	}
	// Setter
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setGender(int gender) {
		this.gender = gender;
	}
	
	// �޼��� ����
	// �������ڷ��� �޼����() { return;<���������� }
}
class Product{
	String name;
	int price;
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	void printData() {
		System.out.printf("%s : %d��\n" , this.name , this.price);
	}
}


public class Ex001 {

	public static void main(String[] args) {
		
		// ���ڿ� �迭 : Ŭ���� �迭
		String users[] = new String[100];
		for(int i=0; i<10; i++) {
			System.out.println(users[i]);
		}
		
		// Ŭ���� �ʱ�ȭ (��ü�� ����)
		// Ŭ������ ������ = new Ŭ������(); <<() �� ��ȣ�� �����ڶ�� �θ� . 
		
		// 'Ŭ���� �迭'�� ����� �ʱ�ȭ
		// Ŭ������ �迭��[] = new Ŭ������[����];
		
		// Ŭ���� �迭�ȿ� �������� int Ÿ���� 0���� �ڵ��ʱ�ȭ�ǰ�,
		// boolean �� false �� �ڵ� �ʱ�ȭ��.
		// �ٸ� Ÿ�Ե��� null�� �Ǿ����� .  
		
		Product cart[] = new Product[100]; //
		for(int i=0; i<10; i++) {
			cart[i] = new Product(); // �̰� �ؼ� null ���� Ǯ������� . 
			// 							�̷��� �ʱ�ȭ�� �ؾ��� .����� �ɹ������� Ȱ�� ����
			cart[i].setData("product" +(i+1), (i+1) * 1000);
//			System.out.println(cart[i]);
			cart[i].printData();
			
		}
		
		ExPerson gildong = new ExPerson("ȫ�浿");
		ExPerson dooly = new ExPerson("�Ѹ�",10,1);
		System.out.println(dooly.getName());
		System.out.println(dooly.getAge());
		System.out.println(dooly.getGender());
		
		int age = dooly.getAge();
		age = 11;
		System.out.println(dooly.getAge());
		dooly.setName("ȫ�Ѹ�");
		System.out.println(dooly.getName());
		
		
	}

}
