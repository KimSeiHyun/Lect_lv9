package lv2;

public class Level_Test_23 {

	public static void main(String[] args) {
//		# ����2) 6�� 8�� ������� ��� ���
//		# ������� ������ �����ξ���� ���Ѵ�.
//		# ��)  6 ==>  1 , 2, 3, 6
//		#       8 ==> 1, 2, 4, 8
//		# �������  1, 2
		
	//	���� : 10:43
	//	���� : 11:08
	//	�ҿ� : 25��
		
		int a = 1;
		int b = 1;
		
		int a2 = 0;
		int b2 = 0;
		System.out.print("6�� ����� : ");
		while (a <= 6 ) {
			if(6%a == 0) {
				a2 = a;
				System.out.print(a2 + " ");
			}
			
			a++;
		}
		System.out.println();
		System.out.print("8�� ����� : ");
		while (b <= 8 ) {
			if(8%b == 0) {
				b2 = b;
				System.out.print(b2 + " ");
			}
			
			b++;
		}
		System.out.println();
		System.out.print("������� ");
		for(int i =1; i<10; i++) {
			if(6%i == 0) {
				a2 = i;
			}
			if(8%i == 0 ) {
				b2 = i;
			}
			if(a2 == b2 ) {
				System.out.print(a2 + " ");
			}
		}
	
	}

}
