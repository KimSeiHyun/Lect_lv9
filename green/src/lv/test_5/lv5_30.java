package lv.test_5;

public class lv5_30 {

	public static void main(String[] args) {
		/*
		 * # ������ũ ����
		 * 1. 10x10 �迭�� 0���� ä���.
		 * 2. ������ũ�� 1234�� ǥ���Ѵ�.
		 * 3. �����¿�� �̵��� �����ϸ�, ������ ����´�.
		 * 4. �ڱ���ϰ� �ε�����, ����Ѵ�.
		 * 5. �������� �������� ������
		 *    �������� ������ ���� 1���� �ڶ���.
		 * 6. ������ �ִ� 8������ ������ �� �ִ�.
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