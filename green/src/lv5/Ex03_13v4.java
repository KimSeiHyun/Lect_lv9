package lv5;

import java.util.Scanner;

public class Ex03_13v4 {

	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		int map[][] = {
				{0,0,0,0,0},
				{0,0,4,4,0},
				{0,0,9,9,0},
				{4,4,9,0,0},
				{9,0,9,4,0}
		};
		int cnt = 5; // ��ġ�� ��ź ���� 
		int bombs[][] = new int[5][2]; // {y,x} ��ġ������� ������ 
		bombs[0][0] = 2;
		bombs[0][1] = 2;
		bombs[1][0] = 3;
		bombs[1][1] = 2;
		bombs[2][0] = 2;
		bombs[2][1] = 3;
		bombs[3][0] = 4;
		bombs[3][1] = 0;
		bombs[4][0] = 4;
		bombs[4][1] = 2;
	
		while(true) {
			System.out.println(cnt);
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++) {
					if(map[i][j] == 9) {
						System.out.print("�� ");
					}
					else if(map[i][j] == 4) {
						System.out.print("�� ");
					}
					else {
						System.out.print("+ ");
					}
				}
				System.out.println();
			}
			System.out.println("����(5): ");
			int btn = sc.nextInt();
			if(btn == 5 && cnt > 0) {
				boolean check = false;
				int checkY = -1;
				int checkX = -1;
				while(!check) {
					checkY = -1;
					checkX = -1;
					int y = bombs[0][0];//3
					int x = bombs[0][1];//2

					// ���˻� & ���� 
					for(int i=-1; i<=1; i++) {
						if(y+i>=0 && y+i<5) {
							if(map[y+i][x]==9 && y+i != y) { // ���ΰ˻�
								checkY = y+i;
								checkX = x;
								System.out.println("���ΰ˻�");
							}
							map[y+i][x] = 0;
						}
						if(x+i>=0 && x+i<5) {
							if(map[y][x+i]==9 && x+i != x) { // ���ΰ˻�
								checkY = y;
								checkX = x+i;
								System.out.println("���ΰ˻�");
							}
							map[y][x+i] = 0;
						}
					}

					// �迭 ����
					for(int i=0; i<cnt-1; i++) {
						bombs[i][0] = bombs[i+1][0];
						bombs[i][1] = bombs[i+1][1];
					}
					bombs[cnt-1][0] = 0;
					bombs[cnt-1][1] = 0;
					cnt --;

					// ��ź �� ��ź
					int idx = -1;
					if(checkY != -1) {
						for(int i=0; i<cnt; i++) {
							if(bombs[i][0] == checkY && bombs[i][1] == checkX) {
								idx = i;
							}
						}
						int tempY = bombs[0][0];
						int tempX = bombs[0][1];
						bombs[0][0] = bombs[idx][0];
						bombs[0][1] = bombs[idx][1];
						bombs[idx][0] = tempY;
						bombs[idx][1] = tempX;
						System.out.println("��ź��");
					}
					else {
						check = true;
					}
				}//while
			}
		}//while
		
		
		
	}
}
