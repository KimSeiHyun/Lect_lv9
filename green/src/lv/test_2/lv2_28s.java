package lv.test_2;

public class lv2_28s {

		public static void main(String[] args) {
		//		# ����1) 36�� ��� �� ���� ���
		//	# �����  36�� ������ �������� 0�μ��� ���Ѵ�.
		//	# 1,2,4,6.....
		//
			System.out.println("����1");
			for(int i=1; i<37; i++) {
				if(36%i == 0) {
					System.out.print(i+ " ");
				}
			}
			System.out.println();
		//	# ����2) 24�� ����߿��� 2�� ��������
		//
			System.out.println("����2");
			for(int i=1; i<=24; i++) {
				if(24%i == 0 && i%2 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		//	# ����3) 18�� ����� ���� ���ϱ�  21�� ����� ������ ���
		//
			System.out.println("����3");
			int cnt = 0;
			
			for(int i=1; i<=18; i++) {
				if(18%i == 0) {
					cnt ++;
				}
			}
			for(int i=1; i<=21; i++) {
				if(21%i == 0) {
					cnt ++;
				}
			}
			System.out.println(cnt);
		//	# ����4) 50 ���� 100 ������ �ڿ����߿��� 9�� ����� ��� �?
			System.out.println("����4");
			cnt = 0;
			for(int i=50; i<=100; i++) {
				if(i%9 == 0) {
					cnt ++;
				}
			}
			System.out.println(cnt);
	}

}
