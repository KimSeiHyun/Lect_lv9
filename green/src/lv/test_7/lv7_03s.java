package lv.test_7;

import java.util.Random;

class RanNums{
	private int num;
	private boolean check;
	
	RanNums (int num) {
		this.num = num;
	}
	
	public int getNum () {
		return this.num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

public class lv7_03s {

	public static void main(String[] args) {
		Random rn = new Random();
		
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ��� 
		//      num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
		RanNums arr[] = new RanNums[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new RanNums(0);
		}
		
		int x = 0;
		while(x < 5 ) {
			int check = 0;
			int rNum = rn.nextInt(5)+1;
			for(int i=0; i<arr.length; i++) {
				if(arr[i].getNum() == rNum) check = 1;
			}
			
			if(check ==0 ) {
				arr[x].setNum(rNum);
				x++;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i].getNum());
		}
		
		
	}
}