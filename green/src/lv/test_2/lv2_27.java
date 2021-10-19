package lv.test_2;

public class lv2_27 {

	public static void main(String[] args) {
		//		#문제 1) 마트에서 오이를 3개씩 묶어서 1500원에 판다고 한다
		//	# 오이가 14개 필요하다. 돈이 얼마필요한가(오이는 묶음으로만 판다)
		//	/*
		//	   힌트 : 3의배수가 아니면 될때까지 증가시킨다. 
		//	    while(오이 % 3  != 0){
		//	       오이 += 1;
		//	   }
		//
		//	*/
		System.out.println("문제1 ");
		int x = 3;
		int y = 1;
		while(x <=14) {
			y++;
			x+=3;
		}
		System.out.println("오이 14개를 사려면 돈이 " + y*1500 +"원 필요하다.");
		
		//	# 문제 2) 민수네 반 학생은 26명입니다
		//	# 민수네반 학생들에게 도화지를 2 장씩 나누어 주려고합니다.
		//	# 도화지는 10장씪 묶음으로만 판매하고 10장에 1200원입니다.
		//	# 총얼마가 필요한가요?
		System.out.println("문제2");
		x = 10;
		y = 26;
		while(x<52) {
			x+= 10;
		}
		System.out.println("도화지를 구매하는데 총 필요한 금액은 " + x/10*1200 + "원");
		//	#문제3) 가게에서 24600원 짜리 옷을샀습니다.
		//	# 1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?
		x = 1000;
		int cnt = 1;
		while (x < 24600) {
			cnt ++;
			x +=1000;
		}
		System.out.println("문제3");
		System.out.println("1000짜리가 총 "+cnt +"장 필요하다.");
		
		//	# 문제1 )  어떤수에 3을 곱하였더니 6.12 가되었습니다. 이수를 4로 나누면 얼마? 
		//            (반복문을 활용한 정수화 -> 연산 후 되돌려 놓기)
		System.out.println("문제1");
		double a1 = 0;
		while (a1*300 <= 612) {
			
			a1+=0.01;
		}
		double a2 = (a1*100)/4;
		int a3 = (int)a2;
		System.out.println(a3*0.01);
		//	# 문제2) 지웅이가 1시간 20분동안 일정한 빠르기로 주은 밤의 무게가 9 키로이다
		//	# 3분동안 주은밤은 몇키로인가 ?
		double temp1 = 9;
		double temp2 = 80;
		double avr = temp1/temp2;
		double a = 0;
		double temp = 0;
		while(a <3) {
			temp += avr; 
			a++;
		}
		System.out.println("문제2 ");
		System.out.println(avr);
		System.out.println("3분동안 주은 밤은 : " + temp);
		
		
		//	# 문제3) 가게에 우유가 250개가 있다 그중에 오전에 84퍼센트가 팔렸고 나머지는 오후에 다팔렸다
		//	# 오전에 팔린갯수 - 오후에 팔린갯수는 얼마인가
		System.out.println("문제3");
		double total = 250;
		double m = total*0.84;
		double e = 0;
		while(e < m) {
			e++;
		}
		System.out.println("오전에 팔린 갯수 : " +m);
		System.out.println("오후에 팔린 갯수 : "+(total-m));
		System.out.println("오전 - 오후 : " + (m-(total-m)));
		
		//	# 문제4) 어느도시에 전체 인구가 400000 명인데 나이가 19세 이하 인구는 35퍼센트
		//	#  40세 이상인구는 25퍼센트일때
		//	# 19세이하인구 - 40세이상인구 수를 구하시요
		System.out.println("문제4");
		double l = 400000*0.35;
		double h = 400000*0.25;
		double p1 = 0;
		double p2 = 0;
		while (p1 < l) {
			p1++;
		}
		while(p2<h) {
			p2++;
		}
		System.out.println("19세이하인구 - 40세 이하인구 : " +(p1-p2));
		
		
		
	}

}
