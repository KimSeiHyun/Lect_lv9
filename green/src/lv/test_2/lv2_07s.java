package lv.test_2;

public class lv2_07s {

	public static void main(String[] args) {
		//����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ���  # �� : 6 (54,63,72,81,90,99) 
		int x = 50;
		int cnt = 0;
		while ( x <= 100) {
			if(x%9 == 0) {
				cnt ++;
			}
			x++;
		}
		System.out.println("����1");
		System.out.println(cnt);
		//����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980 
		x = 0;
		int temp = 0;
		while(x < 1000) {
			if(x %28 == 0 ) {
				temp = x ;
			}
			x++;
		}
		System.out.println("����2");
		System.out.println(temp);
		
		//����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32
		x = 0;
		cnt = 0;
		System.out.println("����3");
		while (x < 1000) {
			if(x %8 == 0) {
				System.out.println(x);
				cnt++;
			}
			if(cnt == 5) {
				x = 1000;
			}
			x++;
		}

	}

}
