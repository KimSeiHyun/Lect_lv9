package lv2;

public class Ex01_05 {

	public static void main(String[] args) {
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		
		int a = 0;
		int b = 0;
		
		boolean t = true;
		boolean t2 = true;
		System.out.println("문제1 while");
		while (t) {
			if (a %9 == 0 && a%10 ==  6 ) {
				System.out.println(a);
				t = false;
			}
			a++;
		}
		System.out.println("문제2 for ");
		for (b =0; b<100; b++) {
			if (b %9 == 0 && b%10 ==  6 ) {
				System.out.println(b);			
			}
		}
		System.out.println("teacher");
		for(int i=0; i<100; i+=9) {
			int ten = i / 10;
			int one = i % 10;
			
			if(one == 6) {
				System.out.println(i);
				i = 100;
			}
		}


		

	}

}
