package lv.test_4;

import java.util.Scanner;

public class lv4_30s {

	public static void main(String[] args) {
		// ���� �̵����ڸ� �Է¹��������� �̵� �ϴµ� 
		// �ܰ����θ� �̵� �Ʒ��׸����� 
		
		/*
		 * # ������ ����
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� ��
		 */
		 //�Է� ==> 3 
		
		/*
		 * # ������ ����
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� ��
		 */
		 //�Է� ==> 3 
		
		/*
		 * # ������ ����
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� ��
		 */
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<4; j++) {
				if(i!=0 && i!=4) {
					arr[i][j] = 1;
				}
			}
		}
		arr[0][0] = 2;
		int pX = 0;
		int pY = 0;
		while(true) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(arr[i][j] == 1) System.out.print("�� ");
					if(arr[i][j] == 0) System.out.print("�� ");
					if(arr[i][j] == 2) System.out.print("�� ");
				}System.out.println();
			}
			System.out.println("������ ĭ �Է� : ");
			int move = sc.nextInt();
			
			while(move > 0) {
				int tempX = pX;
				int tempY = pY;
				int check = 0;
				if(pY == 0 && pX <4) check = 1;  
				if(pX == 4 && pY <4) check = 2;  
				if(pY == 4 && pX >0) check = 3;  
				if(pX == 0 && pY >0) check = 4;  
				
				if(check == 1) {
					tempX++;
				}
				if(check == 2) {
					tempY ++;
				}
				if(check == 3) {
					tempX --;
				}
				if(check == 4) {
					tempY --;
				}
				arr[tempY][tempX] = 2;
				arr[pY][pX] = 0;
				pY = tempY;
				pX = tempX;
				move--;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
