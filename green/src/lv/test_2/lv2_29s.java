package lv.test_2;

public class lv2_29s {

	public static void main(String[] args) {
		//		# ����1) 7�� ����� ���ʴ�� ��������� 8��° ����� ���
		//
		System.out.println("����1");
		int cnt = 0;
		for(int i=1; i<100; i++) {
			if(i%7 == 0) {
				cnt ++;
			}
			if(cnt == 8) {
				System.out.println(i);
				break;
			}
		}
		//	# ����2) 6�� 8�� ������� ��� ���
		//	# ������� ������ �����ξ���� ���Ѵ�.
		//	# ��)  6 ==>  1 , 2, 3, 6
		//	#       8 ==> 1, 2, 4, 8
		//	# �������  1, 2
		//
		System.out.println("����2");
		int x = 0;
		int y = 0;
		int max = 0;
		for(int i=1; i<10; i++) {
			if(6%i == 0) {
				x = i;
			}
			if(8%i == 0) {
				y = i;
			}
			if(x == y) {
				max = x;
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		
		//	# ����3) �� ���� �ִ� ����� ���
		//	# �ִ������� ������߿��� ����ū�� 
		//
		System.out.println("����3");
		System.out.println(max);
		//	# ����4) 25 , 75 �� �ִ� ������� ���
		//
		System.out.println("����4");
		max = 0;
		for(int i=1; i<100; i++) {
			if(75%i == 0) {
				x= i;
			}
			if(25%i == 0) {
				y =i;
			}
			if(x == y) {
				max = y;
			}
		}
		System.out.println(max);
		//	# ����5) ���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� ������� �Ȱ��� ������ �ַ����մϴ�
		//	# ������ ������ �ټ��ִ��� ���
		System.out.println("����5");
		max = 0;
		for(int i=1; i<100; i++) {
			if(42%i == 0) {
				x = i;
			}
			if(28%i == 0) {
				y = i;
			}
			if(x == y) {
				max = y;
			}
		}
		System.out.println(max +"��");
		
	}

}
