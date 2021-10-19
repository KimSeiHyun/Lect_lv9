package lv.test_7;

class MyInteger {
	int a;
	MyInteger(int a) {
		this.a = a;
	}
}
/*
* # 래퍼 클래스(wrapper class)
* - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
* [기본형]          [래퍼 클래스]
* byte             Byte
* short            Short
* int              Integer
* long             Long
* float            Float
* double           Double
* char             Character
* boolean          Boolean
*/
public class lv7_23 {

	public static void main(String[] args) {
		int a = 10;
		Integer i = new Integer(10);
		
		
		float b = 10.1f;
		Float f = new Float(10.1);

		double d = 10.1;
		Double dd = new Double(10.11);
		
		MyInteger ii = new MyInteger(100);
		
	}

}