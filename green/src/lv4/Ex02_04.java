package lv4;

public class Ex02_04 {

	public static void main(String[] args) {
		int[][] arr = {	{101, 102, 103, 104},
						{201, 202, 203, 204},
						{301, 302, 303, 304}}; 
			int[] garo = new int[3];
			int[] sero = new int[4];
			
		// ���� 1) ���� �� ���
		// ���� 1) 410, 810, 1210
			System.out.print("����1 ���� �� ��� : ");
			for(int i=0; i<3; i++) {
				int sum1 = 0;				
				for(int j=0; j<4; j++) {
					sum1 += arr[i][j];
				}
				System.out.print(sum1 + " ");
			}
			
		// ���� 2) ���� �� ���
		// ���� 2) 603, 606, 609, 612
			
			for(int i =0; i<3; i++) {
				for(int j =0; j<4; j++) {
					sero[j] += arr[i][j];
				}
			}
			System.out.println();
			System.out.print("����2 ���� �� ��� : ");
			for(int i=0; i<4; i++) {
				System.out.print(sero[i] + " ");
			}
			
	}//clear

}
