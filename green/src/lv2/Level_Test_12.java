package lv2;

public class Level_Test_12 {

	public static void main(String[] args) {
//		# ���� 2) �μ��� �� �л��� 26���Դϴ�
//		# �μ��׹� �л��鿡�� ��ȭ���� 2 �徿 ������ �ַ����մϴ�.
//		# ��ȭ���� 10�坼 �������θ� �Ǹ��ϰ� 10�忡 1200���Դϴ�.
//		# �Ѿ󸶰� �ʿ��Ѱ���?
		//	���� : 12:44
		//	���� : 12:53
		//	�ҿ� : 9��
		
		int man = 26;
		
		int paper = 2;
		int paper2 = 10;
		int p = 0;
		
		int cost = 1200;		
		int pay = 0;
		boolean t = true;
		while (t) {
			if ( p >  man*paper) {
				break;
			}
			pay += cost;
			p += paper2;
		}
		
		System.out.println("��ȭ���� �����ϴµ� �ʿ��� �ݾ��� " + pay + "�� �Դϴ�.");
		

	}

}
