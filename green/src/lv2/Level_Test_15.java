package lv2;

public class Level_Test_15 {

	public static void main(String[] args) {
//		# ����2) �����̰� 1�ð� 20�е��� ������ ������� ���� ���� ���԰� 9 Ű���̴�
//		# 		3�е��� �������� ��Ű���ΰ� ?
		//	���� : 07:02
		//	���� : 09:02
		//	�ҿ� : 2�ð�

		double today = 80;
		double bam = 9;
		double avr = bam/today;
		double x = 0;
		double y = avr*80;
		System.out.println("1�е��� ���� ���� ���� : " + avr + "kg");

		int i = 1;
		while (i <= 3) {
			x += avr;
			i ++;
		}
		System.out.println("3�е��� ���� ���� ���� : " + x +"kg" );


	}

}
