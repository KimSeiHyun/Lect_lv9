package lv1;

public class Ex13_2 {

	public static void main(String[] args) {
		// ����1) 1~5������ �� ���
		// ���� 1) 15
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		System.out.println("����1");
		int a = 1;
		int sum = 0;
		int count = 0;
		while( a < 6) {
			sum += a;
			a++ ; 
		}
		System.out.println("sum = " + sum);
		
		System.out.println("����2");
		int b = 1;
		while (b <= 10) {
			if (b < 3 || b >= 7) {
				System.out.println(b);
			sum += b;
			count ++;
			}
			b++;
		}
		System.out.println("����3");
		System.out.println("sum =" + sum);
		
		System.out.println("����4");
		System.out.println("count : " + count);
		}
	}


