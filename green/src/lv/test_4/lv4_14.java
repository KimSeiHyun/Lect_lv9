package lv.test_4;

public class lv4_14 {

	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
			System.out.println("문제1");
			for(int i=0; i<3; i++) {
				int sum = 0;
				int sum2 =0;
				for(int j=0; j<4; j++) {
					sum += arr[i][j];
				}
				System.out.println(sum);
			}
			
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
			System.out.println("문제2");
			for(int i=0; i<4; i++) {
				int sum2 =0;
				for(int j=0; j<3; j++) {
					sum2 += arr[j][i];
				}
				System.out.println(sum2);
			}
			
			
			
	}

}
