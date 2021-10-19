package lv8;

import java.util.ArrayList;
import java.util.Collections;

// Java �÷���
// List > ArrayList

class Person1 {
	private String name;
	private int age;
	private int gender;
	
	public Person1(String name, int age, int gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void print() {
		System.out.printf("%s %d %d\n",this.name , this.age, this.gender);
	}
}
public class Ex001 {

	public static void main(String[] args) {
		
//		Person1 group[] = new Person1[10]; // Ŭ���� �迭 ( ������ ũ�� ) 
		// ����Ŭ���� : �⺻�ڷ��� > ��üȭ �� �� . 
		ArrayList<Person1> group2 = new ArrayList<Person1>();
		System.out.println(group2); // ���빰(����Ʈ��) ��ü ��� 
		
		//���� �޼���
	//	Collections.sort(group2);
		// 1. �߰�
		Person1 jiyeon = new Person1("������", 2 , 100);
		group2.add(jiyeon);
		System.out.println(group2);
		System.out.println(group2.size());
		
		Person1 gildong = new Person1("ȫ�浿", 1 , 30);
		group2.add(gildong);
		System.out.println(gildong);
		
		Person1 dooly = new Person1 ("�Ѹ�" , 1 , 10);
		group2.add(dooly);
		group2.add(dooly);
		group2.add(dooly);
		System.out.println(dooly);
		
		System.out.println(group2);
		System.out.println(group2.size());
		// 2. ����
		group2.add(0, jiyeon);
		System.out.println(">>");
		for(int i=0;i <group2.size(); i++) {
			group2.get(i).print();
		}
		// 3. ����(�ε���)
		group2.remove(0);
		System.out.println(">>");
		for(int i=0;i <group2.size(); i++) {
			group2.get(i).print();
		}
		// 3-2 ����(��)
		group2.remove(dooly);
		System.out.println(">>>");
		for(int i=0;i <group2.size(); i++) {
			group2.get(i).print();
		}
		
		// 4. ũ��
		System.out.println(">>");
		System.out.println(group2.size());
		// 5. ����
		group2.set(0, dooly);
		
		// 6. �� �������� get();
		System.out.println(">>");
		for(int i=0;i <group2.size(); i++) {
			group2.get(i).print();
		}
		
		System.out.println("--------------");
		for(Person1 e : group2) {
			e.print();
		}

	}

}
