package lv.test_8;

import java.util.Vector;

class Aa{
	int a;
	Aa(int a){
		this.a = a;
	}
}
class AaManager{
	Vector<Aa> Aalist = new Vector<Aa>();
}

public class lv8_08 {

	public static void main(String[] args) {
		AaManager am = new AaManager();
		
		
		for(int i = 0; i < 10; i++) {
			am.Aalist.add(new Aa(i));
		}
		
		Vector<Aa> test = new Vector<Aa>(); //또다른 객체 배열의 선언 . 
		
		for(int i = 0; i < 4; i++) {
			test.add(am.Aalist.get(i)); // 기생성된 객체 배열에서 get() 메소드를 통해 Aa 객체의 '주소'를 가져옴 . 
		}
		
		System.out.println(am.Aalist.get(0));
		test.get(0).a  = 100; // 수정은  test배열에서 함.  
		
		test.add(new Aa(99));
		// print am.Aalist
		for(int i = 0; i < 10; i++) {
			System.out.print(am.Aalist.get(i) + " "); // am.Aalist 를 출력
		}System.out.println("--");
		for(int i = 0; i < 10; i++) {
			System.out.print(am.Aalist.get(i).a + " "); // am.Aalist 를 출력
		}
		System.out.println("==");
		// print test
		for(int i=0; i<test.size(); i++) {
			System.out.print(test.get(i) + " ");
		}System.out.println();
		
		
		for(int i=0; i<test.size(); i++) {
			System.out.print(test.get(i).a + " ");
		}System.out.println();
		
		
	}
}