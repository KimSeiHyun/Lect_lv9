package lv2;

public class Level_Test_8 {

	public static void main(String[] args) {
//		# ����2)
// 	    # ���� 7Ÿ�� ���л� 2��� ���л� 4���� ������� �Ȱ��� ������ �־�����
//	    # �ѻ���� ������ �� �ڷ� ������ �Ǵ� �� ��� (���� 1Ÿ�� 12�ڷ�)
//		# ��Ʈ ) 7 * 12 / 6 
		//	���� : 01:29
		//	���� : 02:57
		//	�ҿ� : 1�ð� 28��
		
		int man = 4;
		int girl = 2;

		boolean t = true;

		int turn = 0;
		
	while (t) {					//1
		if (84 / (man+girl) <= turn) {
		
			break;
		}


		turn++;
	}
	System.out.println("�ѻ���� ������ �Ǵ� ���� ���� : " + turn);
	

		
	}

}
