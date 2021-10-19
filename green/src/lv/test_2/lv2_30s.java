package lv.test_2;

public class lv2_30s {

	public static void main(String[] args) {
		//		#문제 1) 8 과 12 의 최소 공배수를 구하시요
		//	# 최소 공배수란 각 수의 배수를 나열한다음 처음으로 같은숫자를 말한다.
		//	# 예) 8 16 24... 
		//	# 예) 12 24....
		//	# 여기서 24가 최소공배수이다.
		//	
		System.out.println("문제1");
		for(int i=1; i<100; i++) {
			if(i%8 ==0 && i%12 == 0) {
				System.out.println(i);
				break;
			}
		}
		//	# 문제2) 수인이는 4일 마다 수영장을 가고 형주는 6일마다 수영장에간다
		//	# 두사람이  4월 3일에 만났다면 다음에 만날날은 언제인가?
		//
		System.out.println("문제2");
		for(int i=1;i <100; i++) {
			if(i%4 == 0 && i%6 == 0) {
				System.out.println("4월 "+(3+i) + "일");
				break;
			}
		}
		//	# 문제3) 가로가 12 이고 세로가 8인 직사각형모양의 종이를 늘어놓아
		//	# 만들수있는 가장작은 정사각형을 만들려고한다. 직사각형은몇장이 필요한가?
		System.out.println("문제3");
		int cnt1 = 0;
		int cnt2 = 0;
		int temp = 0;
		for(int i=1; i<100; i++) {
			if(i%12 == 0 && i%8 == 0) {
				temp = i;
				break;
			}
		}
		cnt1 = temp/12;
		cnt2 = temp/8;
		
		System.out.println(cnt1*cnt2);
		

		
	}

}
