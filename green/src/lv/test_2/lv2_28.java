package lv.test_2;

public class lv2_28 {
	
	public static void main(String[] args) {
		//		# ����1) 36�� ��� �� ���� ���
		//	# �����  36�� ������ �������� 0�μ��� ���Ѵ�.
		//	# 1,2,4,6.....
		//
		System.out.println("����1");
		int x = 36;
		for(int i=1; i<=36; i++) {
			if(x % i == 0 ) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//	# ����2) 24�� ����߿��� 2�� ��������
		//
		System.out.println("����2");
		x = 24;
		for(int i=1; i<=24; i++) {
			if(x%i == 0 && i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//	# ����3) 18�� ����� ���� ���ϱ�  21�� ����� ������ ���
		//
		System.out.println("����3");
		x = 18;
		int y = 21;
		int cnt = 0;
		for(int i=1; i<=x; i++) {
			if(x % i == 0) {
				cnt ++;
			}
		}
		for(int i=1; i<=y; i++) {
			if(y %i == 0) {
				cnt ++;
			}
		}
		System.out.println(cnt );
		//	# ����4) 50 ���� 100 ������ �ڿ����߿��� 9�� ����� ��� �?
		System.out.println("����4");
		cnt = 0;
		for(int i =50; i<=100; i++) {
			if(i%9 == 0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
		
	}
}
