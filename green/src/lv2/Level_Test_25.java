package lv2;

public class Level_Test_25 {

	public static void main(String[] args) {
//		# ����4) 25 , 75 �� �ִ� ������� ���

		//	���� : 11:41
		//	���� : 11:45
		//	�ҿ� : 4��
		
		int i = 1;
		int max = 0 ;
		
		while(i <= 75 ) {
			if (25%i == 0 && 75%i == 0 && max < i) {
				max = i;
			}
			i++;
		}
		System.out.println("25�� 75�� �ִ������� : " + max );
		
	}

}
