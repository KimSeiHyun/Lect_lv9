package lv.test_2;

public class lv2_18s {

	public static void main(String[] args) {
		// for �� ����ؼ� Ǯ��� 
		
		
		// ���� 1) 1���� 5���� ���
		// ���� 1) 1, 2, 3, 4, 5
		System.out.println("����1");
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// ���� 2) 1���� 10���� �ݺ���, 5~9���� ���
		// ���� 2) 5, 6, 7, 8, 9
		System.out.println("����2");
		for(int i=1; i<=10; i++ ) {
			if(i >= 5 && i<= 9) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// ���� 3) 1���� 10���� �ݺ��� 6~3���� ���
		// ���� 3) 6, 5, 4, 3
		
		System.out.println("����3 ");
		for(int i=10; i>=1; i--) {
			if(i>=3 && i<=6) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
		// ���� 4) 1, 2, 7, 8, 9, 10
		System.out.println("����4");
		for(int i=1; i<=10; i++) {
			if(i<3 || i>=7) {
				System.out.print(i + " ");
			}
		}
	}

}
