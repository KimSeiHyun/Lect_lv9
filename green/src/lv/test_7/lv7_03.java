package lv.test_7;

import java.util.Random;

class RanNum{
	private int num;
	private boolean check;
	
	public RanNum (int num , boolean check) {
		this.num = num;
		this.check = check;
	}
	public int getNum() {
		return this.num;
	}
	
	public boolean getCheck() {
		return this.check;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
}

public class lv7_03 {

	public static void main(String[] args) {
		Random rn = new Random();
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		RanNum arr[] = new RanNum[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new RanNum(0,false);
		}
		
		int x = 0;
		while(x < 5) {
			int check = 0;
			int rNum = rn.nextInt(5)+1;
			for(int i=0; i<arr.length; i++) {
				if(arr[i].getNum() == rNum) check = 1;
			}
			
			if(check == 0) {
				arr[x].setNum(rNum);
				arr[x].setCheck(true);
				x++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getNum());
			System.out.println(arr[i].getCheck());
		}
		
	}
}