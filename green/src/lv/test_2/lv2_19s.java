package lv.test_2;

public class lv2_19s {

	public static void main(String[] args) {
		// for�� ����ؼ� Ǯ����� 
		//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		System.out.println("����1");
		for(int i=0; i<100; i++) {
			if(i%9 ==0 && i%10 == 6) {
				System.out.println(i);
				i = 100;
			}
		}
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		System.out.println("����2");
		for(int i=0; i<100; i++) {
			if(i%9 == 0 && i/10 ==6) {
				System.out.println(i);
				i = 100;
			}
		}
		//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
		System.out.println("����4");
		int max = 0;
		for(int i=0; i<150; i++) {
			if(i%8 == 0) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
