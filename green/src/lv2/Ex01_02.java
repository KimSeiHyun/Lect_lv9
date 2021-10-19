package lv2;

public class Ex01_02 {

	public static void main(String[] args) {
		// 문제 2) 1부터 10까지 반복해, 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		int c = 1;
		int d = 1;
		System.out.println("문제2 while");
		while (c <= 10) {
			if (c > 4 && c < 10) {
			System.out.println(c);
			}
			c++;
		}
		System.out.println("문제2 for");
		for(d =1; d <=10; d++) {
			if (d > 4 && d < 10) {
				System.out.println(d);
			}
		}

	}

}
