package lv3;

public class Ex01 {

	public static void main(String[] args) {
		// ���� 
		// �� �� �Ѱ��� ���� ������ �� ���� .
		// �� ���� �� �ִ� ��
		
		// �迭 array
		// �� ���� �ڷ����� ������(��)�� ������ ���� �� �� ���� .
		// �� 0���� �����ϴ� index(���ȣ)�� ������ ���� . (1�� ����)
		
		// ����� �ʱ�ȭ 
		// �ڷ���Ű���� �迭��[];
		// �ڷ���Ű����[] �迭��;
	
		// = {1,2,3,4}				// stack
		int arr[] = {1,2,3,4,5};
		//			 0 1 2 3 4 : index
	
		// = new �ڷ���Ű����[����];		// heap
		int arr2[] = new int[5]; 	// {0,0,0,0,0}
		// 0~4
		
		// ���
		// �迭��[index]
		
		System.out.println(arr); // [I@7637f22 ��� ���� �����µ� �̰� �迭�� ����� �ּ� . 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		System.out.println(arr[5]); //  Index 5 out of bounds for length 5
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		arr2[0] = 10;
		System.out.println(arr2[0]);
		
		// �迭�� ��ü���� �ݺ����� ���� ��� . (while , for)
		
//		while (arr[0] <= 5) {
//			System.out.println(arr[0]);
//			arr[0]++;
//		}
//		while (arr2[0] <=5 ) {
//			System.out.println(arr2[0]);
//			arr2[0]++;
//		}
		
		int n = 0; // index�� Ȱ��.
		System.out.println("while");
		while ( n < 5 ) {
			System.out.println(arr[n]);
			n++;
		}
		
		System.out.println("for");
		for(int i=0; i<5; i++) {
			System.out.println(arr2[i] );
		}
		
		

	}

}
