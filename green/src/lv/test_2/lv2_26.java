package lv.test_2;

public class lv2_26 {

	public static void main(String[] args) {

//		# 문제1)
//		#   운주네 반 학생은 31명입니다.
//		#   이중에서 남학생은 12명 , 여학생은 14명이 봉사할동을 하였습니다.
//		#   은주네 반에서 봉사활동을 하지않은 학생은
//		#   몇명인지 출력 
//
		System.out.println("문제1");
		int total = 31;
		int m =0;
		int w =0;
		for(int i =1; i<=12; i++) {
			m = i;
		}
		for(int j =1; j<=14; j++) {
			w = j;
		}
		System.out.println(total-m-w + "명") ;
//		# 문제2)
//		# 연필 7타를 여학생 2명과 남학생 4명에게 남김없이 똑같이 나누어 주었을때
//		# 한사람은 연필을 몇 자루 가지게 되는 지 출력 (연필 1타는 12자루)
//		# 힌트 ) 7 * 12 / 6 
		System.out.println("문제2 ");
		int x = 0;
		int y = 0;
		while (y <7) {
			y++;
			x +=12;
		}
		System.out.println("한사람이 가지계 되는 연필 갯수는 : "+x/6 );
//		# 문제3)
//		# 어느 공장에서 한사람이 1시간에 컴퓨터를 4대를 조립할수 있다고한다.
//		# 3명이 컴퓨터 96대를 조립혀면 몇시간이 걸리는가
		System.out.println("문제3");
		int a =0;
		int b = 4*3;
		while (b<=96) {
			if(b == 96) {
				a = b/12;
			}
			b+= 12;
		}
		System.out.println("3명이 컴퓨터 96대를 조립하는 시간은 : " + a);
//		# 문제4)
//		# 귤 6개의 무개는 840g, 사과 3개의 무게는 750g 입니다.
//		# 귤5개와 사과 4개의 무게는 몇g인지 출력 (단 각각의 귤끼리 무게는 같고  각각의 사과끼리는 무게가같다)
		
		System.out.println("문제4");
		x = 840/6;
		y = 750/3;
		int x1 =0;
		int x2 = 0;
		a = 1;
		b = 1;
		for(a=1; a<=5; a++) {
			x1+= x;
		}
		for(b=1; b<=4; b++) {
			x2+= y;
		}
		System.out.println("귤5개와 사과4개의 무게는  : " + (x1+x2)   );
		
		
	}

}
