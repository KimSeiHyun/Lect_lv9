package lv10;
	
// 상속

// class 정의 -> 객체 생성 (instance) 
// 모든 클래스는 최상위 클래스인 Object를 상속을 받는다.(Object가 부모) : default
// 부모가 가진 모든 멤버는 자식이 모두 물려받는다 . 

class Sample {
	
}

class A {
	public int a;
	private String name;
	protected String info;
	
	void print() {
		System.out.println("a : " + this.a);
	}
}

class B extends A{ // 클래스 A로부터 상속을 받는 클래스 B. 
	int b;
}

class C {
	int c ;
}

// 별도의 패키지를 만들어서 -> 
// class C를 만들어서 A를 상속받게 만들어보기 . 
public class Ex002 {

	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample.toString());
		System.out.println(sample);
		
		A a = new A();
		a.a = 10;
		
		B b = new B(); //자식 클래스를 생성하는 순간 부모클래스 A가 먼저 생성된다 . 
						//클래스 B를 초기화 하는 순산 A도 초기화 되면서 a = 0 된다 . 
		b.b = 20;
//		b.a = 11;
		b.print();
		C c = new C();
		c.c = 30;
		
	}

}
