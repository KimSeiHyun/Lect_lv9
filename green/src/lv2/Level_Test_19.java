package lv2;

public class Level_Test_19 {

	public static void main(String[] args) {
//		# 문제2) 24의 약수중에서 2의 배수만출력
		//	시작 : 10:22
		//	종료 : 10:26
		//	소요 : 4분
		
		int a = 24;
		int i = 1;
		int b = 0;
		System.out.print("24의 약수중에서 2의 배수는 : ");
		while (i <= a ) {
			
			if ( a%i == 0 ) {
				b = i;
				if (b%2 == 0) {
					System.out.print(b + " ");
				}
			}
			i++;
		}
	
	}

}
