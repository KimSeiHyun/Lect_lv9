package lv.test_2;

public class lv2_09 {

	public static void main(String[] args) {
		/*
		 * # 369����[2�ܰ�]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */
		
		int x = 1;
		
		while (x <= 50) {
		int cnt = 0;	
			if(x/10 ==3){
				cnt ++;
			}
			if(x%10 == 3 || x%10 == 6 || x %10 == 9) {
				cnt ++;
			}
			
			if(cnt == 2) {
				System.out.println("¦¦");
			}
			else if(cnt == 1) {
				System.out.println("¦");
			}
			else {
				System.out.println(x);
			}
			
			x++;
		}//w
	}

}
