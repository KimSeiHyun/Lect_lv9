package lv3.test;

public class Test10 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int temp2[] = new int[5];
		
		//����2) arr �� ���� 2�踦 temp2�� ������ ��� 
		// temp2 ==> {20, 40, 60, 80 , 100}		
		
		// ���� 11:37
		// ���� 11:38
		// �ҿ� 1��
		
		for(int i = 0; i<5; i++) {
			if(temp2[i] == 0) {
				temp2[i] = arr[i]*2;
			}
			System.out.print(temp2[i] + " ");
		}
		
	
		
	}

}
