package lv.test_2;

public class lv2_06s {

	public static void main(String[] args) {
		//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		int x = 0;
		System.out.println("����1");
		while (x <100) {
			if(x %10 == 6) {
				System.out.println(x);
				x = 100;
			}
			
			x+=9;
		}	
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		x = 0;
		System.out.println("����2");
		while (x < 100) {
			if(x /10 == 6 ) {
				System.out.println(x);
				x = 100;
			}
			
			x+=9;
		}
		//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
		x = 0;
		int temp = 0;
		while (x < 1000) {
			if(x <150) {
				temp = x;
			}
			x+=8;
		}
		System.out.println("����3");
		System.out.println(temp);
		
		
		
		
		
	}

}
