package lv7.test;

import java.util.Random;

class RanNum {
	int x;
	
	
}
public class test001 {

	public static void main(String[] args) {
		// ���۽ð� 11 : 25
		// ����ð� 11 : 32
		// �ҿ�ð� 00 : 07
		
		// Ŭ�����迭�ߺ����ھϱ�
		
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ��� 
		//      num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
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
