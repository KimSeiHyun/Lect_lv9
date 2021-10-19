package lv.test_2;

public class lv2_01s {

	public static void main(String[] args) {
		// 문제1) 1~10까지 반복해 5~9 출력
		// 정답1) 5, 6, 7, 8, 9
		System.out.println("문제1");
		int a = 1;
		while (a <=10) {
			if(a>=5 && a<=9) {
				System.out.print(a + " ");
			}
			a++;
		}
		System.out.println();
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		// 정답2) 6, 5, 4, 3
		System.out.println("문제2");
		a = 10;
		while (a>=1) {
			if(a>=3 && a<=6) {
				System.out.print(a + " ");
			}
			a--;
		}
		System.out.println();
		// 문제3) 1~10까지 반복해 짝수만 출력
		// 정답3) 2, 4, 6, 8, 10
		System.out.println("문제3 ");
		a =1 ;
		while (a <=10) {
			if(a%2 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
	}

}
