package lv.test_6;

class Ex01{
	int x;
	int y;
}
class Ex02 {
	String name;
	int score;
}
public class lv6_01 {

	/*
	 * # Ŭ����
	 * 1. ����(���赵)
	 * 	1) class	: Ű����
	 * 	2) Ex01		: Ŭ������
	 * 	3) {}		: �ڷ����� ����(�⺻ �ڷ����� ������ ����)
	 * 2. ����
	 * 	1) �ڷ���	 ������  = new �ڷ���();	
	 *  2) Ex01  e    = new Ex01(); 
	 */
public static void main(String[] args) {
				
		Ex01 e = new Ex01();	// Ŭ���� : ����� ���� �ڷ���(�����ڰ� ���� ����)
		e.x = 10;
		e.y = 20;
		
		System.out.println(e);	// �ּҰ����´�. Ŭ������ �ּҺ����̴�. 
		System.out.println(e.x);
		System.out.println(e.y);
		// �Ʒ� �迭�� ������������ ����ϸ�ȴ�. 
		
		//----------------------------------------------------
		int arr[] = new int[3];
		System.out.println(arr);
		
		
		
		Ex02 hgd = new Ex02();
		hgd.name = "ȫ�浿";
		hgd.score = 100;

		System.out.println(hgd.score);

		// ���� ��Ű�� ���� Ŭ������ �ٸ� Ŭ�������� ����� �����ϴ�.
		Ex01 e1 = new Ex01();
		e1.x = 10;
		e1.y = 20;
		
	}



}