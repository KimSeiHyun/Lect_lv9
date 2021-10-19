package lv10;

// 상속 < 추상화 < 인터페이스
// "메소드" 강제성을 부여할 수 있게됨 . 

class A2 {
	int a;
	void methodA() {
		
	}
}

// 추상 클래스
// 클래스 앞에 abstract
abstract class B2 {
	int b;
	
	// 강제할 메소드 앞에 abstract 키워드 붙임.
	void methodB() {
		
	}
	abstract void methodBB(); // 추상 메소드는 정의부만 있어야 함 .

}

// 인터페이스
// interface 인터페이스명{}
// 인터페이스는 메소드의 군집 . 
// 상수와 메소드만 정의할 수 있다 . 
interface C2 {
	final int c = 10; //파이널은 무조건 초기값이 존재해야함 . 
	int a = 5;
	void methodC();

}

// 일반 클래스를 상속받을떄는 부모의 메소드들을 선택적으로 사용가능함 . 
class D2 extends A2 {
	
	void methodA() {
		super.methodA();
	}
}

// 추상 클래스를 상속받은 자식 클래슨는 
// 추상클래스를 상속받은 자식 클래스는 부모 클래스의 abstract 붙은 메소드들을 강제로 써야함 . 
// 부모가 정해놓은(강제하는) 메소드를 받드시 재정의 해야 한다.
class E2 extends B2 {

	@Override
	void methodBB() {
		// TODO Auto-generated method stub
		
	}
	
}

interface EE {
	void methodEE();
	void methodEEE();
	void methodEEEE();
}
// 인터페이스에 대한 상속은 여러개를 할 수 있다 . 
// 인터페이스를 상속받은 자식클래스는 무조건 부모클래스의 모든 메소드를 써야한다.
class F2 implements C2 , EE {

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodEE() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodEEE() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodEEEE() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex003 {

	public static void main(String[] args) {
		F2 f = new F2();
		

	}

}
