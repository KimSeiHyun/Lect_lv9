package lv.test_2;

public class lv2_02 {

	public static void main(String[] args) {
		// ����1) 1~5������ �� ���
		// ���� 1) 15
		System.out.println("����1");
		int a = 1;
		int sum = 0;
		while (a <=5) {
			sum += a;
			a++;
		}
		System.out.println("1~5������ ���� : " + sum);
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		System.out.println("����2 ");
		a = 1;
		sum = 0;
		int cnt = 0;
		while (a <=10) {
			if(a < 3 || a >=7) {
				System.out.print(a + " ");
				sum += a;
				cnt ++;
			}
			a++;
		}
		System.out.println();
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		System.out.println("����3 ");
		System.out.println("����2�� ���ǿ� �´� ������ ���� : " + sum);
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		System.out.println("����4");
		System.out.println("����2�� ���ǿ� �´� ������ ������ : " + cnt );

	}

}
