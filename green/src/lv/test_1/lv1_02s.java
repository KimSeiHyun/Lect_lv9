package lv.test_1;

public class lv1_02s {

	public static void main(String[] args) {
		// ��) ������ 1000���ִ�. 200��¥�� ���� ���� ��, �ܵ� ���
		int ���� = 1000;
		int ���� = 200;
		int �ܵ� = ���� - ����;
		System.out.println("�ܵ� = " + �ܵ� + "��");

		// ����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		int ���� = 100;
		int ���� = ����*12;
		int ���� = ����/10;
		int ���Ŀ��� = ���� - ����;
		System.out.println("���Ŀ��� :" +���Ŀ���+"��");
		// ����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		int total = score1+score2+score3;
		int avr = total/3; 
		System.out.println("����� : " + avr+"��");
		// ����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		int x = 3;
		int y = 6;
		int z = x*y/2;
		System.out.println("���̴� : " + z);
		
		// ����4) 100�ʸ� 1�� 40�ʷ� ���
		int time = 100;
		int m = time/60;
		int s = time%60;
		System.out.println("100�� : " + m +"��" + s +"��");
		// ����5) 800������ 500��¥�� ���� , 100��¥�� ����
		// ����5) 500��(1��), 100��(3��)
		int money = 800;
		int fives = money/500;
		int ones = money%500/100;
		System.out.println("500��¥�� : " + fives +"��\n" + "100��¥�� : " + ones + "��");
		
		
	}

}
