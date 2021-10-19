package lv6;

class Test2 {
	void printSum(int[] arr) {
		System.out.println("����1. ��ü �� ���");
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	}
	void printSumMultiple4(int[] arr) {
		int sum = 0;
		int cnt =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %4 == 0) {
				sum += arr[i];
				cnt ++;
			}
		}
		System.out.println("����2. 4�� ����� �� ���");
		System.out.println("sum : " + sum);
		System.out.println("����3. 4�� ����� ���� ��� :");
		System.out.println("cnt : " +cnt);
	}
	void printCountMultiple4(int[] arr) {
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 == 0) {
				cnt ++;
			}
		}
		System.out.println("����4. ¦���� ���� ���");
		System.out.println("cnt : " + cnt);
	}
}

public class Ex003_004 {

	public static void main(String[] args) {
		int[] arr = { 87, 100, 11, 72, 92 };
		
		Test2 test = new Test2();
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		test.printSum(arr);
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		test.printSumMultiple4(arr);
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3

		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		test.printCountMultiple4(arr);
	}

}
