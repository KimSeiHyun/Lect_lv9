package lv.test_5;

public class lv5_30 {

	public static void main(String[] args) {
		/*
		 * # 스네이크 게임
		 * 1. 10x10 배열을 0으로 채운다.
		 * 2. 스네이크는 1234로 표시한다.
		 * 3. 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
		 * 4. 자기몸하고 부딪히면, 사망한다.
		 * 5. 랜덤으로 아이템을 생성해
		 *    아이템을 먹으면 꼬리 1개가 자란다.
		 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
		 */

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			int size = 10;
			int[][] map = new int[size][size];
			
			int snake = 4;
			int[] x = new int[snake];
			int[] y = new int[snake];
			
			
			for(int i=0; i<snake; i++) {
				x[i] = i;
				y[i] = 0;
				map[y[i]][x[i]] = i + 1;
				
			}
			
			while(true) {
				
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						System.out.print(map[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				
				System.out.print("1)left 2)right 3)up 4)down : ");
				int sel = scan.nextInt();
				
				if(sel == 1) {}
				else if(sel == 2) {}
				else if(sel == 3) {}
				else if(sel == 4) {}
				
			}
			
		}

	}