package lv2;

public class Level_Test_16 {

	public static void main(String[] args) {
//		# ����3) ���Կ� ������ 250���� �ִ� ���߿� ������ 84�ۼ�Ʈ�� �ȷȰ� �������� ���Ŀ� ���ȷȴ�
//		# ������ �ȸ����� - ���Ŀ� �ȸ������� ���ΰ�
		//	���� : 09:03
		//	���� : 09:46
		//	�ҿ� : 43��
		
		double milk = 250;
		
		double m = 250 *0.84;
		double i = 0;
		
		while (i < m  ) {
			i ++;
		}
		System.out.println("������ �ȸ� ���� :" + i);
		System.out.println("���Ŀ� �ȸ� ���� :" + (milk-i));
		System.out.println("������ �ȸ����� - ���Ŀ� �ȸ� ���� : " + (i -(milk-i)));
		


		
	}

}
