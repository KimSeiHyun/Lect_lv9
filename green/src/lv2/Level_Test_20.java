package lv2;

public class Level_Test_20 {

	public static void main(String[] args) {
//		# ����3) 18�� ����� ���� ���ϱ�  21�� ����� ������ ���

		//	���� : 10:28
		//	���� : 10:34
		//	�ҿ� : 6��
		
		int a = 18;
		int b = 21;
		
		int i = 1;
		int j = 1;
		int cntA = 0;
		int cntB = 0;
		
		while (i <= a ) {
			if (a%i ==0) {
				cntA ++;
			}
				i++;
		}
		
		while (j <= b) {
			if (b%j == 0) {
				cntB ++;
			}
			j ++;
		}
		
		System.out.println("18�� ����� ���� : " + cntA);
		System.out.println("21�� ����� ���� : " + cntB);
		System.out.println("18�� ����� ���� + 21�� ����� ���� : " + (cntA+cntB));

	}

}
