package lv.test_3;

public class lv3_01 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		System.out.println("����1");
		int a = 1;
		int sum = 0;
		for(int i=0; i<5; i++) {
			arr[i] = 10*a;
			a++;
			sum += arr[i];
		}
		for(int i =0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// ����2) ��ü �� ���
		// ����2) 150
		System.out.println("����2");
		System.out.println(sum);
	}

}
