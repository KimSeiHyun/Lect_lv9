package lv4;

import java.util.Scanner;

public class Ex03_13 {

	public static void main(String[] args) {
		/*
		 * # ������ ����
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� ��
		 */
		
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
		// ���� 12:17
		// ���� 02:50
		// �ҿ� 02:33
		
		int arr[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i >0 && i < 4) {
					arr[i][1] = 1;
					arr[i][2] = 1;
					arr[i][3] = 1;
				}
			}
		}
		arr[0][0] = 2;
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(arr[i][j] == 0) {
						System.out.print("�� ");
					}
					if(arr[i][j] == 1) {
						System.out.print("�� ");
					}
					if(arr[i][j] == 2) {
						System.out.print("�� ");
					}
				}
				System.out.println();
			}
			
			System.out.println("������ ĭ�� �Է����ּ��� . ");
			int move = sc.nextInt();
			if(move >= 1 && move <= 4) {
			for(int i=0; i<5 ; i++) {
				for(int j=0; j<5; j++) {
					if(arr[0][j] == 2 && j+move <=4) {//���ٿ��� �Ѿ�� ���� ���
						arr[0][j] = 0;
						arr[0][j+move] = 2;
						break;
					}
					if(arr[0][j] == 2 && j+move>4) {//���ٿ��� �Ѿ��
						if(move >= 6 ) {
		
						}
						arr[0][j] = 0;
						arr[move-(4-j)][4] = 2;
						break;
					}
					if(arr[j][4] == 2 && j+move<=4) {//�����ʿ��� �Ѿ�� �������
						arr[j+move][4] = 2;
						arr[j][4] = 0;
						break;
					}
					if(arr[j][4] == 2 && j+move>4) {//�����ʿ��� �Ѿ��
						arr[4][(4-j)+(4-move)] = 2;
						arr[j][4] = 0;
						break;
					}
					if(arr[4][j] == 2 && j-move >=0) {//�Ʒ����� �Ѿ�� ���� ���
						arr[4][j] = 0;
						arr[4][j-move] = 2;
						break;
					}
					if(arr[4][j] == 2 && j-move <0) {//�Ʒ����� �Ѿ��
						arr[4][j] = 0;
						arr[4-(move-j)][0] = 2;
						break;
					}
					if(arr[j][0] == 2 && j-move>=0) {//�޿��� �Ѿ�� �������
						arr[j-move][0] = 2;
						arr[j][0] = 0;
						break;
					}
					if(arr[j][0] == 2 && j-move <0) {//���ʿ��� �Ѿ��
						arr[j][0] = 0;
						arr[0][(move-j)] = 2;
						break;
					}

				}
				break;
			}
		}
			else {
				System.out.println("1~4���ڸ� �Է����ּ��� . ");
			}
		}//w/c

	}

}
