package lv4;

import java.util.Scanner;

public class Ex03_14 {

	public static void main(String[] args) {
		/*
		 * # ������
		 * 1	2	3	4	5	
		 * 16	17	18	19	6	
		 * 15	24	25	20	7	
		 * 14	23	22	21	8	
		 * 13	12	11	10	9
		 */
		// ���� 02:59
		// ���� 03:34
		// �ҿ� 00:35
		
		int arr[][] = new int[5][5];
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int x = 3;
		while(x<50) { // 1~25 ���� .
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(arr[i][j] == 0 && cnt <=4) {//���� + 1~4
					arr[i][j] = cnt;
					cnt++;
					j= 0;
				}
				if(arr[i][j] == 0 && cnt >=17 && cnt <20) {//���� + 17~19
					arr[i][j] = cnt;
					cnt++;
					j= 0;
				}
				if(arr[i][j] == 0 && cnt >=24 ) {//���� + 24~25
					arr[i][j] = cnt;
					cnt++;
					j= 0;
				}
				if(arr[j][4] == 0 && cnt >=5 && cnt <10) {//���� + 5~9
					arr[j][4] = cnt;
					cnt++;
					j=0;
				}
				if(arr[j][3] == 0 && cnt >=20 && cnt <22) {//���� + 20~21
					arr[j][3] = cnt;
					cnt++;
					j=0;
				}

			}
		}
		for(int i=4; i>=0; i--) {
			for(int j=4; j>=0; j--) {
				if(arr[4][j] == 0 && cnt >=10 && cnt <14) { //���� - 10~13
					arr[4][j] = cnt;
					cnt++;
				}
				if(arr[3][j] == 0 && cnt >=22 && cnt <24) { //���� - 22~23
					arr[3][j] = cnt;
					cnt++;
				}
				if(arr[i][0] == 0 && cnt >=14 && cnt <17) {// ���� - 14~16
					arr[i][0] = cnt;
					cnt++;
				}
			}
		}
		x++;
		}//w
		
		cnt = 1; // �����̰� 1���� ���� . 
	//	cnt = 0; //< �����̰� 0���� ���� .
		while(true) {
		System.out.println("cnt = "+ cnt);
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(arr[i][j] == cnt) {//cnt �� @�� ��ȯ 
					System.out.print("@\t");
				}
				else {
					
					System.out.print(arr[i][j] +"\t ");
				}
			}
			System.out.println();
		}
			System.out.println("1.��  2.��");
			int z = sc.nextInt();
			if(cnt <25) {
			if(z == 1) {
				cnt++;
				
			}
			}
			if(cnt >= 1) {
			if(z == 2) {
				cnt--;
			}
			}

		}//w2

		
	}//c

}
