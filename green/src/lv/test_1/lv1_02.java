package lv.test_1;

public class lv1_02 {

	public static void main(String[] args) {
		// ��) ������ 1000���ִ�. 200��¥�� ���� ���� ��, �ܵ� ���
		int ���� = 1000;
		int ���� = 200;
		int �ܵ� = ���� - ����;
		System.out.println("�ܵ� = " + �ܵ� + "��");

		// ����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		
		int ���� = 100;
		int ���� = ����*12;
		System.out.println("���� : " + ����*0.9 + "��");
		// ����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
		int a = 30;
		int b = 50;
		int c = 4;
		int avr = (a+b+c)/3;
		System.out.println("����� : " + avr+"��");
		// ����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		int x = 3;
		int y = 6;
		int z = x*y/2;
		System.out.println("���� : " + z);
		// ����4) 100�ʸ� 1�� 40�ʷ� ���
		int s = 100;
		int m = 60;
		System.out.println("100�� : " + s/m +"��" + s%m + "��");
		// ����5) 800������ 500��¥�� ���� , 100��¥�� ����
		// ����5) 500��(1��), 100��(3��)
		int a1 = 800;
		int b1 = 500;
		int c1 = 100;
		System.out.println("500��¥�� : " + a1/b1 + "��\n" + "100��¥�� : " + a1%b1/c1 + "��");
		
	}

}
