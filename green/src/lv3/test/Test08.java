package lv3.test;

public class Test08 {

	public static void main(String[] args) {
		// for�� ����ؼ� Ǯ�����
		// ����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32
		
		// ���� 11:21
		// ���� 11:27
		// �ҿ� 6��
		
		for(int i=0; i<40; i+=8) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		int cnt = 0;
		for(int i=0; i<100; i++) {
			if (i % 8 == 0) {
				cnt++;
				System.out.print(i + " ");
			}
			if (cnt == 5) {
				break;
			}
		}

	}

}
