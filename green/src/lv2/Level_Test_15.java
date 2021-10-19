package lv2;

public class Level_Test_15 {

	public static void main(String[] args) {
//		# 문제2) 지웅이가 1시간 20분동안 일정한 빠르기로 주은 밤의 무게가 9 키로이다
//		# 		3분동안 주은밤은 몇키로인가 ?
		//	시작 : 07:02
		//	종료 : 09:02
		//	소요 : 2시간

		double today = 80;
		double bam = 9;
		double avr = bam/today;
		double x = 0;
		double y = avr*80;
		System.out.println("1분동안 주은 밤의 무게 : " + avr + "kg");

		int i = 1;
		while (i <= 3) {
			x += avr;
			i ++;
		}
		System.out.println("3분동안 주은 밤의 무게 : " + x +"kg" );


	}

}
