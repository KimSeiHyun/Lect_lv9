package lv2;

public class Level_Test_24 {

	public static void main(String[] args) {
//		6,8
//		# ����3) �� ���� �ִ� ����� ���
//		# �ִ������� ������߿��� ����ū�� 
		
		//	���� : 11:11
		//	���� : 11:40
		//	�ҿ� : 29��

		int max = 0;
		int j = 1;
		max = j;

		while (j <= 8) {
			if (6%j == 0 && 8%j == 0 && max < j) {
				max = j;
			}
			j++;
		}
		System.out.println("6�� 8�� �ִ� ����� : " + max );
	
		
	}

}
