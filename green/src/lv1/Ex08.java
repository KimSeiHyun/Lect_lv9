package lv1;

public class Ex08 {

	public static void main(String[] args) {
		// if - else �� . 
		
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
		else if(false) { // else �� �������� ���� ó�� (����ó��) 
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
	}

}
