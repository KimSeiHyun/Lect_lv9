package lv.test_3;

public class lv3_37 {

	public static void main(String[] args) {
		// for�� ����ؼ� Ǯ�����
		// ����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ��� # �� : 6 (54,63,72,81,90,99)
		System.out.println("����4");
		int cnt = 0;
		for(int i=50; i<=100; i++) {
			if(i %9 == 0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
		// ����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980
		System.out.println("����5");
		int max = 0;
		for(int i=0; i<1000; i++) {
			if(i%28 == 0) {
				max =i;
			}
		}
		System.out.println(max);
		// ����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32
		System.out.println("����6");
		cnt = 0;
		for(int i=0; i<100; i++) {
			if(i%8 == 0) {
				System.out.println(i);
				cnt ++;
			}
			if(cnt == 5) {
				break;
			}
		}
		
	}

}
