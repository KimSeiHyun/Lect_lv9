package lv7;

import java.util.Random;
class RanNum{
	int num;
	boolean check;
	
	void set(int num) {
		this.num = num;
	}
	void print() {
		System.out.println(this.num);
		
	}
	
	
	
	
	
}

	


public class Ex001_001 {

	public static void main(String[] args) {
		Random ran = new Random();
		// 클래스배열중복숫자암기
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		
		RanNum num[] = new RanNum[5];
		
		for(int i=0; i<num.length; i++) {
			int r = ran.nextInt(5)+1;
			num[i] = new RanNum();
			int check = 0;
			for(int j=0; j<=i; j++) {
				if(num[j].num == r) {
					check = 1;
				}
			}
			if(check == 0) {
				num[i].set(r);
				num[i].print();
				
			}else {
				i--;
			}
			
		}
		
	
		
	}
}