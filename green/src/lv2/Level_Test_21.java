package lv2;

public class Level_Test_21 {

	public static void main(String[] args) {
//		# ����4) 50 ���� 100 ������ �ڿ����߿��� 9�� ����� ��� �?

		//	���� : 10:35
		//	���� : 10:36
		//	�ҿ� : 1��
		
		int a = 50;
		int cnt = 0;
		
		while ( a <= 100) {
			
			if(a%9 == 0 ) {
				cnt++;
			}
			a++;
		}
		
		System.out.println("50���� 100������ 9�� ����� ������ : " + cnt + "��");

	}

}
