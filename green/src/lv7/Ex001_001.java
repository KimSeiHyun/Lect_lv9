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
		// Ŭ�����迭�ߺ����ھϱ�
		
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ��� 
		//      num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
		
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