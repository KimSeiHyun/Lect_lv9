package lv3.test;

public class Test11 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int temp3[] = new int[5];
		
		//����3) arr �� ���� i�� ���Ѱ��� temp3 �� ������ ��� 
		// temp3 ==> {10,21,32,43,54}
		
		// ���� 11:40
		// ���� 11:41
		// �ҿ� 1��
		
		for(int i=0; i<5; i++) {
			if (temp3[i] == 0) {
				temp3[i] = arr[i];
				temp3[i] += i;
			}
			System.out.print(temp3[i] + " ");
		}
		
	}

}
