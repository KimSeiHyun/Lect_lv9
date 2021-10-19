package lv8;

import java.util.ArrayList;
import java.util.Collections;

// Java 컬렉션
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
		
//		Person1 group[] = new Person1[10]; // 클래스 배열 ( 고정된 크기 ) 
		// 래퍼클래스 : 기본자료형 > 객체화 한 것 . 
		ArrayList<Person1> group2 = new ArrayList<Person1>();
		System.out.println(group2); // 내용물(리스트의) 전체 출력 
		
		//정렬 메서드
	//	Collections.sort(group2);
		// 1. 추가
		Person1 jiyeon = new Person1("김지연", 2 , 100);
		group2.add(jiyeon);
		System.out.println(group2);
		System.out.println(group2.size());
		
		Person1 gildong = new Person1("홍길동", 1 , 30);
		group2.add(gildong);
		System.out.println(gildong);
		
		Person1 dooly = new Person1 ("둘리" , 1 , 10);
		group2.add(dooly);
		group2.add(dooly);
		group2.add(dooly);
		System.out.println(dooly);
		
		System.out.println(group2);
		System.out.println(group2.size());
		// 2. 삽입
		group2.add(0, jiyeon);
		System.out.println(">>");
		for(int i=0;i <group2.size(); i++) {
			group2.get(i).print();
		}
		// 3. 삭제(인덱스)
		group2.remove(0);
		System.out.println(">>");
		for(int i=0;i <group2.size(); i++) {
			group2.get(i).print();
		}
		// 3-2 삭제(값)
		group2.remove(dooly);
		System.out.println(">>>");
		for(int i=0;i <group2.size(); i++) {
			group2.get(i).print();
		}
		
		// 4. 크기
		System.out.println(">>");
		System.out.println(group2.size());
		// 5. 수정
		group2.set(0, dooly);
		
		// 6. 값 가져오기 get();
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
