package lv3.test;

public class Test07 {

	public static void main(String[] args) {
		// for�� ����ؼ� Ǯ�����

		// ����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980
		
		// ���� 11:13
		// ���� 11:20
		// �ҿ� 7��
		
		int max = 0;
		
		for(int i=28; i<=999; i+=28) {
			if ( max < i) {
				max = i;
			}			
		}
		System.out.println(max);

		
	}
}
