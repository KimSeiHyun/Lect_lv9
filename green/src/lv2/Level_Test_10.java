package lv2;

public class Level_Test_10 {

	public static void main(String[] args) {
//		# ����4)
//		# �� 6���� ������ 840g, ��� 3���� ���Դ� 750g �Դϴ�.
//		# ��5���� ��� 4���� ���Դ� ��g���� ��� (�� ������ �ֳ��� ���Դ� ����  ������ ��������� ���԰�����)
		//	���� : 11:40
		//	���� : 12:20
		//	�ҿ� : 40��
		
		
		
		int gyul6 = 840;
		int apple3 = 750;
		
		int gyul = gyul6/6;
		int apple = apple3/3;
		
		int a = 1;
		int b = 1;
		
		int g = 0;
		
		for(a = 1; a<=5; a++) {
			g+= gyul;
		}
		for(b = 1; b<=4; b++) {
			g+= apple;
		}
		
		System.out.println("��5���� ���4���� ������ : " + g );



	}

}
