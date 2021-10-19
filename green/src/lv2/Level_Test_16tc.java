
package lv2;

public class Level_Test_16tc {

	public static void main(String[] args) {
//		# 문제3) 가게에 우유가 250개가 있다 그중에 오전에 84퍼센트가 팔렸고 나머지는 오후에 다팔렸다
//		# 오전에 팔린갯수 - 오후에 팔린갯수는 얼마인가
		
		double  milk = 250;
		
		double mor = 0;
		double aft = 0;
		
		while(mor / milk < 0.84) {
			mor ++;
		}
		aft = milk - mor;

//		System.out.println(mor);
//		System.out.println(aft);
		
		System.out.println(mor - aft);
		
		
		
		
		
		
	}

}
