package lv1;

public class EX04_1 {

	public static void main(String[] args) {
		// �������� �̸� ��Ģ .
		// �ΰ� �̻��� Ű���尡 ���յ� ��� . 
		// 1. ī��ǥ��� myNameIs (���� �����ϴ� Ű���带 �빮�ڷ� ����. )
		// 2. �밡����  my_name_is (���� �����ϴ� Ű���忡 _(����ٸ�) ��� .)
		
		// ������ ����ؼ� ���� �ذ� . 
		
		// ������ 1000���ִ� . 200��¥�� ���� ���� �� , �ܵ� ���. 
		int money = 1000;
		int price = 200;
		int payback = money - price;
		System.out.println("�ܵ��� " + payback + "�� �Դϴ�.");
		
		// ����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		int month = 100;
		double  year = month * 12 * 0.9 ;
		System.out.println("���� = " + year);
		// ����2) ���������� 30, 50, 4�� �� �޾Ҵ�. �����?
		int a = 30;
		int b = 50;
		int c = 4;
		int avar = (a + b + c)/3 ;
		System.out.println("��� = " + avar);
		// ����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		int g = 3;
		int s = 6;
		int gs = (g*s) /2 ;
		System.out.println("���� = " + gs);
		// ����4) 100�ʸ� 1�� 40�ʷ� ���
		int m = 100 ;
		int se = m/60 ; 
		int se2 = m%60 ; 
		System.out.println(se + "��" + se2 + "��");
		// ����5) 800������ 500��¥�� ���� , 100��¥�� ����
		int big = 500 ;
		int small = 100;
		System.out.println("500�� = " + (800/big) + "��" );
		System.out.println("100�� = " + (800%big/100) +"��");
		// ����5) 500��(1��), 100��(3��)
		
		// ������ �� �Ѱ��� ���� ������ �� ����. 
		int x = 10;
		int y = 20;
		
	//	 x = y;
	//	 y = 10;
		int z = x;
		x = y;
		y = 10;
		
		System.out.println(x); //20
		System.out.println(y); //10
	}

}
