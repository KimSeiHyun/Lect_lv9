package lv3;

public class Ex01_01 {

	public static void main(String[] args) {
		int[] arr = new int[5] ;
		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		int sum = 0;
		System.out.println("���� 1");
		arr[0] = 10;
		while ( arr[0] <= 50 ) {
			System.out.println(arr[0]);
			sum += arr[0];
			arr[0]+=10;

		}
		
		// ����2) ��ü �� ���
		// ����2) 150
		System.out.println("���� 2");
		System.out.println(sum);
	}

}
