package lv6;

// 클래스가 가질 수 있는 요소 두가지
// 1) 맴버변수
// 2) 메서드


// 메서드 오버로딩 Overloading
// ㄴ 같은 클래스 내에서 , 같은 이름의 메서드를 여러개 정의할 수 잇음 . 
// ㄴ 매개변수의 내용이 다르면 됨 .

// 변수의 Scope (지역, 생명주기)
// ㄴ 변수는 자신이 선언된 지역{}을 벗어날 수 없다.

class Overload {
	
	int a;
	int b;
	
	
	void myPrint(int i) {
		this.a = i;
		System.out.println(i);
	}
	void myPrint(char c) {
		this.b = c;
		System.out.println(c);
	}
	void myPrint(String s) {
		System.out.println(s);
	}
	void myPrint(boolean b) {
		System.out.println(b);
	}
	void myPrint(int i , int j) {
		System.out.println(i + " " + j);
	}
	
	
	
	
}



public class Ex003 {

	public static void main(String[] args) {

		Overload ex = new Overload();
		
		ex.myPrint(5);
		ex.myPrint('a');
		ex.myPrint("abc");
		ex.myPrint(false);
		ex.myPrint(1,2);
		

	}

}
