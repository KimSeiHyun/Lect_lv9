package lv2;

public class Ex01_03 {

	public static void main(String[] args) {
		// 문제 3) 1부터 10까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		int a = 10;
		int b = 10;
		
		System.out.println("문제3 while");
		while (a >0) {
			if (a <7 && a >2)
			System.out.println(a);
			a--;
		}
		
			System.out.println("문제3 for");
		for(b =10; b >0; b--) {
			if (b <7 && b >2) {
				System.out.println(b);
			}
			
			
		}
		//주하은
		System.out.println("주하운");
		int n= 1;
		int j =0;
		while (n <= 10) {
			j = 10 - n;
			if (6>= j && j >=3) {
				System.out.println(j + " ");
			}
			n++;
		}
		System.out.println();
		j = 0;
	}

}
