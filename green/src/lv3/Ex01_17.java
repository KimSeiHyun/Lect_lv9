package lv3;

public class Ex01_17 {

	public static void main(String[] args) {
		int arr[] = {
				0,0,0,
				3,3,3,
				0,0,0
		};
		//����1) �迭�� ���� ����3�پ� ���

		
		
		
		for ( int i =0; i<9; i++) {
			System.out.print(arr[i]);
			if ( i%3 == 2 ) {
				System.out.println();
			}

			}
		

		//����2) ���࿡ ���ο� 3�� �������� 3�������� "����" ���
		// 0,1,2 = �� 3�̰ų�  
		// 3,4,5 = �� 3�̰ų�
		// 6.7.8 = �� 3�̸�  ���� ��� . 
		int cnt = 0;
		for( int i=0; i<9; i++) {
			if(i < 3) {
				if ( arr[i] == 3) {
					cnt++;
				}
			}
			if(i < 6 && i >=3) {
				if ( arr[i] == 3) {
					cnt++;
				}
			}
			if(i < 9 && i >=6) {
				if ( arr[i] == 3) {
					cnt++;
				}
			}
		}
		
		if (cnt == 3 ) {
			System.out.println("����!");
		}
		
		
		
		
		
		
		
		
		
	}

}
