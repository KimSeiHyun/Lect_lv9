package lv7.test;

import java.util.Random;

class RanNum {
	int x;
	
	
}
public class test001 {

	public static void main(String[] args) {
		// 시작시간 11 : 25
		// 종료시간 11 : 32
		// 소요시간 00 : 07
		
		// 클래스배열중복숫자암기
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		RanNum r[] = new RanNum[5];
		Random rn = new Random();
		for(int i=0; i<r.length; i++) {
			r[i] = new RanNum();
		}
		
		for(int i=0; i<r.length; i++) {
			int check = 0;
			int temp = rn.nextInt(5)+1;
			for(int j=0; j<r.length; j++) {
				if(r[j].x == temp) {
					check = 1;
				}
			}
			if(check == 1) {
				i--;
			}
			else r[i].x = temp;
		}
		
		for(int i=0; i<r.length; i++) {
			System.out.println(r[i].x);
		}
		
		
		
		
		
	}

}
