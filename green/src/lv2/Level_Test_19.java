package lv2;

public class Level_Test_19 {

	public static void main(String[] args) {
//		# ����2) 24�� ����߿��� 2�� ��������
		//	���� : 10:22
		//	���� : 10:26
		//	�ҿ� : 4��
		
		int a = 24;
		int i = 1;
		int b = 0;
		System.out.print("24�� ����߿��� 2�� ����� : ");
		while (i <= a ) {
			
			if ( a%i == 0 ) {
				b = i;
				if (b%2 == 0) {
					System.out.print(b + " ");
				}
			}
			i++;
		}
	
	}

}
