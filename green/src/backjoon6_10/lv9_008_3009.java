package backjoon6_10;

import java.util.Scanner;

public class lv9_008_3009 {

	public static void main(String[] args) { // 3009
		Scanner sc= new Scanner(System.in);
		//���簢���� ������ �� ��ǥ x�� y���� ���� �� 2���� ǥ�õ� . �װ� �̿��ϸ�� 
		int arr[][] = new int[4][2];
		for(int i=0; i<3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i][0] = x;
			arr[i][1] = y;
		}
		
		int cnt2 =0;
		for(int i=0; i<4; i++) {
		//	System.out.println(arr[i][0] +" " + arr[i][1]);
		}
		for(int x = 0; x<2; x ++) {
			
			for(int i=0; i<3; i++) {
				int temp = arr[i][x];
				int cnt = 0;
				for(int j=0; j<3; j++) {
					if(temp == arr[j][x]) {
						cnt ++;
					}
				}
				if(cnt == 1) {
					//System.out.println(arr[i][x]);
					arr[3][cnt2] = arr[i][x];
					cnt2++;
				}
			}
		}


			System.out.println(arr[3][0] +" " + arr[3][1]);


		
		
    }
}