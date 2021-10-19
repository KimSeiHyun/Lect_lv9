package lv1;

public class Ex08 {

	public static void main(String[] args) {
		// if - else 문 . 
		
		// case1
		System.out.println("case1");
		if(true) {
			System.out.println(1);
		}
		if(true) {
			System.out.println(2);
		}
		if(true) {
			System.out.println(3);
		}
		// case2
		System.out.println("case2");
		if(false) {
			System.out.println(1);
		}
		else if(false) { // else 는 나머지에 대한 처리 (예외처리) 
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
	}

}
