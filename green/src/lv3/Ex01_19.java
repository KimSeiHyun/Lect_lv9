package lv3;

import java.util.Random;

public class Ex01_19 {

	public static void main(String[] args) {
		//����
		//���� ==> �迭���� ������ �������� ���°�
		// ��� ==> 1) �����ε��� 1~ 4��  �̴´�.
		// 2) �����ε����� ���� 0���ε��� ���� ��ȯ 
		// 3) �� ���� 100���ݺ� 
		// int arr[5] = {10, 20, 30, 40, 50};
		// �� ) �����ε��� --> 3 ==>  {40, 20, 30, 10, 50};
		// �� ) �����ε��� --> 1 ==>  {20, 40, 30, 10, 50};
		// �� ) �����ε��� --> 4 ==>  {50, 40, 30, 10, 20};
		int arr[] = { 10, 20, 30, 40, 50 };
		
		Random rn = new Random();
		int t= 0;
		int x = arr[0];
		int y = 0;
		while (t < 100) {
			int a = rn.nextInt(5);
			for(int i=0; i<5; i++) {
				if (a == 0 ) {
					
				}
				else if ( a== 1) {
					arr[a] =  x;
					arr[0] = arr[a];
				}
				else if ( a== 2) {
					
				}
				else if ( a== 3) {
					
				}
				else if ( a== 4) {
					
				}
				System.out.print(arr[i]+ " ");
			}
			System.out.println();

			

			t++;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
