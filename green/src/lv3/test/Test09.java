package lv3.test;

public class Test09 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int temp1[] = new int[5];

		//����1) arr �� ���� temp1 ��  ������ ��� 
		// temp1 ==> {10, 20, 30, 40, 50}

		// ���� 11:31
		// ���� 11:34
		// �ҿ� 3��
		
		for(int i=0; i<5; i++) {
			if (temp1[i] == 0) {
				temp1[i] = arr[i];
			}
			System.out.print(temp1[i]+ " ");
		}
		
	
	}

}
