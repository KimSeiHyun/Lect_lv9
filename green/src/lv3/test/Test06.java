package lv3.test;

public class Test06 {

	public static void main(String[] args) {
		// for를 사용해서 풀어보세요
		// 문제4) 50에서 100까지 자연수중에서 
		//       9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)

		// 시작 11:10
		// 종료 11:13
		// 소요 3분
		
		int cnt = 0;
		
		for(int i=50; i<=100; i++) {
			if(i%9 == 0) {
				cnt ++;
			}
		}
		System.out.println("9의 배수의 개수는 : " + cnt);

	}

}
