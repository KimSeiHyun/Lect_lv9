package lv2;

public class Level_Test_20 {

	public static void main(String[] args) {
//		# 문제3) 18의 약수의 갯수 더하기  21의 약수의 갯수를 출력

		//	시작 : 10:28
		//	종료 : 10:34
		//	소요 : 6분
		
		int a = 18;
		int b = 21;
		
		int i = 1;
		int j = 1;
		int cntA = 0;
		int cntB = 0;
		
		while (i <= a ) {
			if (a%i ==0) {
				cntA ++;
			}
				i++;
		}
		
		while (j <= b) {
			if (b%j == 0) {
				cntB ++;
			}
			j ++;
		}
		
		System.out.println("18의 약수의 갯수 : " + cntA);
		System.out.println("21의 약수의 갯수 : " + cntB);
		System.out.println("18의 약수의 갯수 + 21의 약수의 갯수 : " + (cntA+cntB));

	}

}
