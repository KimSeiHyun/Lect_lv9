package lv7;


// 클래스 배열

// 클래스 요소 
// 1. 멤버변수 (속성개념)
// 2. 메서드 (가능개념)

// 클래스란 ? 
// 사용자 정의 자료형 (객체가 어떻게 생겼는지를 미리 정의해둔 설계, 청사진)

// 클래스 정의
// class 클래스명{} (클래스명 첫번쨰는 무조건 대문자)

// 접근제어자
// public (프로젝트내부 에서만 사용가능하게 범위를 지정해줌)
// default (
// private (클래스내부 에서만 사용가능하게 범위를 지정해줌)
// protected

class ExPerson {
	private String name;
	private int age;
	private int gender;
	
	// 생성자 정의
	// 클래스명() {}
	ExPerson() { // 파라미터가 정해지지 않는 생성자는 기본생성자. 라고 부른다.
		System.out.println("응애!");
	}
	// 오버로드 (메서드나 생성자도 가능)
	// 똑같은 이름으로 만들고 다른 목적으로 쓰는것. (구분을 해줘야함 ex)매게변수를 준다거나) 
	ExPerson(String name) {
		this.name = name;
		System.out.printf("%s가 응애! \n",this.name);
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
	
	// 메서드 정의
	// 리턴할자료형 메서드명() { return;<생략되있음 }
}
class Product{
	String name;
	int price;
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	void printData() {
		System.out.printf("%s : %d원\n" , this.name , this.price);
	}
}


public class Ex001 {

	public static void main(String[] args) {
		
		// 문자열 배열 : 클래스 배열
		String users[] = new String[100];
		for(int i=0; i<10; i++) {
			System.out.println(users[i]);
		}
		
		// 클래스 초기화 (객체의 생성)
		// 클래스명 변수명 = new 클래스명(); <<() 이 괄호를 생성자라고 부름 . 
		
		// '클래스 배열'의 선언과 초기화
		// 클래스명 배열명[] = new 클래스명[개수];
		
		// 클래스 배열안에 변수들은 int 타입은 0으로 자동초기화되고,
		// boolean 은 false 로 자동 초기화됨.
		// 다른 타입들은 null로 되어있음 .  
		
		Product cart[] = new Product[100]; //
		for(int i=0; i<10; i++) {
			cart[i] = new Product(); // 이걸 해서 null 값을 풀어줘야함 . 
			// 							이렇게 초기화를 해야지 .을찍고 맴버변수를 활용 가능
			cart[i].setData("product" +(i+1), (i+1) * 1000);
//			System.out.println(cart[i]);
			cart[i].printData();
			
		}
		
		ExPerson gildong = new ExPerson("홍길동");
		ExPerson dooly = new ExPerson("둘리",10,1);
		System.out.println(dooly.getName());
		System.out.println(dooly.getAge());
		System.out.println(dooly.getGender());
		
		int age = dooly.getAge();
		age = 11;
		System.out.println(dooly.getAge());
		dooly.setName("홍둘리");
		System.out.println(dooly.getName());
		
		
	}

}
