package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		//���۽ð� 09 : 07
		//����ð� 10 : 15
		//�ҿ�ð� 01 : 08
		
		
		// # �渶 ����
		// 5������ ���� �������� �ѹ��� �����Ÿ� �̵������ϴ� 
		// �̵��ѰŸ��� ���� 20�̻��̸� ���� 
		// ��� ��� 
		// ����) ��! ���õ��� ����ó��
		
		int horse[][] = new int[5][20];
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int max = 20;
		int rank[] = new int[5];
		int total[] = new int[5];
		int y = 1 ;
		
		int start = 0;
		while(true) {
			//���
			for(int i=0; i<5; i++) { 
				for(int j=0; j<20; j++) {
					System.out.print(horse[i][j] + " ");
				}
				System.out.println();
			}System.out.println();
			
			System.out.println("rank");
			for(int i=0; i<5; i++) {
				System.out.print(rank[i] + " ");
			}System.out.println();
			System.out.println("total");
			for(int i=0; i<5; i++) {
				System.out.print(total[i] + " ");
			}System.out.println();
			System.out.print("�����̷��� �ƹ� ���ڳ� �Է� :");
			int rrrr = sc.nextInt();
			int x = 0 ;
			int rankCheck = 0;
			while(x < 5) {
				int ran = rn.nextInt(5);
				System.out.println("ran : " + ran);
					for(int j=0; j<20; j++) {
						if(start == 0 ) { //ó�������Ҷ�
							horse[x][ran] = x+1;
							total[x] += ran+1;
							break;
						}
						else {
							if(rankCheck == 1 && horse[x][j] == x+1 && j+ran >= 19) {//���õ��� ����ó��
								x--;
								break;
							}
							if(horse[x][j] == x+1 && j+ran >=20) {
								horse[x][j] = 0;
								horse[x][19] = x+1;
								total[x] = 20;
								rank[x] = y;
								y++;
								rankCheck = 1;
								break;
							}
							if(horse[x][j] == x+1 && j+ran <= 19) {
								horse[x][j] = 0;
								horse[x][j+ran] = x+1;
								total[x] += ran;
								if(j+ran == 19) {
									rank[x] = y;
									y++;
									rankCheck = 1;
								}
								break;
							}
							if(horse[x][19] == x+1) {
								break;
							}
						}
					}
					
					x++;
				
			}//while (x < 5 )
			start = 1;

		}//while

		
	}

}
