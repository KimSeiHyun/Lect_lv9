package lv.test_3;

public class lv3_02 {

	public static void main(String[] args) {
//		int[] arr = new int[5];
	
		int arr[] = {10,20,30,40,50};
		// ����1) 4�� ����� ���
		// ����1) 20 40
		System.out.println("����1");
		int sum =0;
		int cnt =0;
		for(int i=0; i<5; i++) {
			if(arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
				cnt++;
			}
		}
		System.out.println();
		// ����2) 4�� ����� �� ���
		// ����2) 60
		System.out.println("����2");
		System.out.println(sum);
		// ����3) 4�� ����� ���� ���
		// ����3) 2
		System.out.println("����3 ");
		System.out.println(cnt);
	}

}
