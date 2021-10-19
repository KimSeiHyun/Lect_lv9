package lv6;

import java.util.Random;

// Random , Scanner , File , FileWriter , FIleReader , BufferedReader , Integer , 
// String  
// 클래스 Class
// ㄴ 요소
// 	1) 맴버변수
//	2) 메서드

// ㄴ 사용자 정의 자료형 

// 객체 : 단위
// 예를들면 ) 자동차, 사람(User) , 책 ... 

// 클래스 정의 
// class 클래스명 { }

// 메서드 정의 
// ' 기능 ' 단위의 코드들을 '재활용' 할 수 있게 만든 것
// 클래스가 가지고 있는 기능 .

// 리턴할자료형 메서드명( 파라미터 변수(필요시) ) { 
// 실행문; return;  }



class Person {
	// 클래스 맴버
	Long code;
	int gender; // 1 남자 2 여자
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
		
		Random rn = new Random(); // 클래스 초기화 방법 . 
		
		// 클래스명 변수명 (객채를 생성)
		// 클래스명 변수명 = new 클래스명();
		Person ps = new Person();
		System.out.println(ps); //lv6.Person@41a4555e    //lv6와Person 은 클래스명과 패키지명
		// 매서드 사용(호출)
		
		ps.setInfo("식빵", 3000);
		ps.printInfo();
		ps.setPrice(3500);
		ps.printInfo();
		// 클래스 변수 이름을 쓰고 .(점)을 찎어서 컨트롤 스페이스바 눌러서 맴버에 접근 . 
		ps.code = 1234L;
		ps.gender = 1;
		
		
		
		
	}

}
