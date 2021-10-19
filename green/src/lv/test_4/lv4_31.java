package lv.test_4;

public class lv4_31 {

	public static void main(String[] args) {
		/*
		 * # 달팽이
		 * 1	2	3	4	5	
		 * 16	17	18	19	6	
		 * 15	24	25	20	7	
		 * 14	23	22	21	8	
		 * 13	12	11	10	9
		 */
		//문제1) 위와 같이 출력해보세요 
		
		int arr[][] = new int[5][5];
		int temp = 1;
		int x = 0;
		int y = 0;
		while(true) {
			if(temp == 26) break;
			if(temp <= 4) {
				arr[y][x] = temp;
				x++;
			}
			else if ( temp >= 5 && temp <= 8) {
				arr[y][x] = temp;
				y++;
			}
			else if ( temp >= 9 && temp <= 12) {
				arr[y][x] = temp;
				x--;
			}
			else if( temp >= 13 && temp <= 15) {
				arr[y][x] = temp;
				y --;
			}
			else if ( temp >= 16 && temp <= 18) {
				arr[y][x] = temp;
				x++;
			}
			else if ( temp >= 19 && temp <= 20) {
				arr[y][x] = temp;
				y++;
			}
			else if ( temp >= 21 && temp <= 22) {
				arr[y][x] = temp;
				x--;
			}
			else if(temp == 23) {
				arr[y][x] = temp;
				y--;
			}
			else if(temp == 24 ||temp == 25){
				arr[y][x] = temp;
				x++;
			}
			
			temp++;
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
		
		
		
		
		
	}

}
