package lv2;

public class Level_Test_22 {

	public static void main(String[] args) {
//		# ����1) 7�� ����� ���ʴ�� ��������� 8��° ����� ���

		//	���� : 10:37
		//	���� : 10:42
		//	�ҿ� : 5��
		
		int i = 1;
		int cnt =0;
		int j = 0;
		while (i < 100) {
			
			if(i%7 == 0) {
				cnt++;
				if(cnt == 8) {
					j = i;
				}
			}
			
			i++;
		}
		System.out.println("7�� ����� 8��° ����� : " + j );

	}

}
