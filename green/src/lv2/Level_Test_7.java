package lv2;

public class Level_Test_7 {

	public static void main(String[] args) {
//		#   ����1)
//	    #   ���ֳ� �� �л��� 31���Դϴ�.
//		#   ���߿��� ���л��� 12�� , ���л��� 14���� �����ҵ��� �Ͽ����ϴ�.
//		#   ���ֳ� �ݿ��� ����Ȱ���� �������� �л���
//		#   ������� ��� 
		//	���� : 01:02
		//	���� : 01:28
		//	�ҿ� : 26��
		
		int s = 31;
		int man = 12;
		int girl = 14; 
		int a = 1; 
		int b = 1;
		int ns = 0;
		while (a <= 31) {
			
			if (a == (man + girl)) {
				s -= a;
				System.out.println("����Ȱ���� ���� ���� �л��� ���� : " + s + "�Դϴ�");

				
			}

			a++;

		}



	}

}
