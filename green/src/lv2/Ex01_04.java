package lv2;

public class Ex01_04 {

	public static void main(String[] args) {
		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		
		int a = 1;
		int b = 1;
		
		System.out.println("문제4 while");
		while (a <= 10) {
			if ( a <3 || a >=7)
				System.out.println(a);
			a++;
		}
		System.out.println("문제4 for");
			for( b=1; b <=10; b++) {
				if ( b <3 || b >= 7) {
					System.out.println(b);
				}
			}
		
	}

}
