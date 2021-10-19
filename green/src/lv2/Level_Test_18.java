package lv2;

public class Level_Test_18 {
public static void main(String[] args) {
	
//		# 문제1) 36의 약수 를 전부 출력
//		# 약수는  36과 나눠서 나머지가 0인수를 말한다.
//		# 1,2
	
	//	시작 : 10:08
	//	종료 : 10:21
	//	소요 : 13분
	
	int a = 36;
	
	int i = 1;
	System.out.print("36의 약수는 : ");
	while (i <= a) {
		if(a%i == 0) {
			System.out.print(+ i + ", ");
		}
		i++;
	}
	

	
}
}
