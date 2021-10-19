package lv2;

public class Level_Test_14 {

	public static void main(String[] args) {
//		# 문제1 )  어떤수에 3을 곱하였더니 6.12 가되었습니다. 
//		          이수를 4로 나누면 얼마?
		
		//	시작 : 06:10
		//	종료 : 06:59
		//	소요 : 49분
		

		double x = 0;


		for(double i =0; i<=700; i+=1) {
			if(i*3 == 612) {
				x = i/400;
			}
		}
		System.out.println(x);
	
		
		
		
	}
}
