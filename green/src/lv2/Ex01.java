package lv2;

public class Ex01 {

	public static void main(String[] args) {
		// �ݺ��� : while , for
		
		// �ݺ��� �������� .
		// 1. �ʱ��
		// 2. ���ǽ�
		// 3. ������
		System.out.println("-------");
		int n = 0 ;
		while (n < 5) {
			System.out.println(n);
			n++;
		}
		System.out.println("-------");
		// for(�ʱ��; ���ǽ�; ������) { ���๮;}
		for (int i = 0; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------");
		// ������� : break, continue 
		// �� break : �ڽ��� ���� �ݺ����� ��� �����Ŵ.
		// �� continue : �ڽ��� ���� �ݺ����� ó��(Ű����)���� ���ư� 
		
		while (true) {
			System.out.println(1);
			break; //
		}
		int a = 1; 
		while (true) {
			System.out.println(1);
			while(true) {
				System.out.println(2);
				if ( a == 10) {
					continue; // ������ ��� ������ ���� .
				}
				break;
			}
			System.out.println(3);
			a++;
		}
//		System.out.println("end");
	}
}
