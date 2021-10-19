package lv2;

public class Level_Test_24 {

	public static void main(String[] args) {
//		6,8
//		# 문제3) 위 수의 최대 공약수 출력
//		# 최대공약수란 공약수중에서 가장큰수 
		
		//	시작 : 11:11
		//	종료 : 11:40
		//	소요 : 29분

		int max = 0;
		int j = 1;
		max = j;

		while (j <= 8) {
			if (6%j == 0 && 8%j == 0 && max < j) {
				max = j;
			}
			j++;
		}
		System.out.println("6과 8의 최대 공약수 : " + max );
	
		
	}

}
