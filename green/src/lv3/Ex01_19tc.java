package lv3;

import java.util.Random;

public class Ex01_19tc {

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
		int arr[] = { 10, 20 , 30, 40, 50 };
		
		Random rn = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		for(int i=0; i<1000; i++) {
			int rIdx = rn.nextInt(5); // 0~4
			
			int temp = arr[0];
			arr[0] = arr[rIdx];
			arr[rIdx] = temp;
		}
		
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		
		
	}

}
