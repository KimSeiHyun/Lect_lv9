package lv3.test;

public class Test06 {

	public static void main(String[] args) {
		// for�� ����ؼ� Ǯ�����
		// ����4) 50���� 100���� �ڿ����߿��� 
		//       9�� ����� ������ ��� # �� : 6 (54,63,72,81,90,99)

		// ���� 11:10
		// ���� 11:13
		// �ҿ� 3��
		
		int cnt = 0;
		
		for(int i=50; i<=100; i++) {
			if(i%9 == 0) {
				cnt ++;
			}
		}
		System.out.println("9�� ����� ������ : " + cnt);

	}

}
