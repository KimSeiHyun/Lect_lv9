package lv.test_5;

public class lv5_28 {

	// 플레이어가 돌아다니면서 폭탄 내려놓듯이 구조물을 설치 → 파일로 저장 후,
	// 콘솔종료 후 재실행 시에도 → 게임을 이어갈 수 있게 만들어보세요

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Random ran = new Random();

			final int SIZE = 9;
			final int PLAYER = 2;
			final int WALL = 3;
			final int BALL = 4;
			final int GOAL = 5;

			int pY = 0;
			int pX = 0;

			int[][] map = new int[SIZE][SIZE];
			int[][] maker = new int[SIZE][SIZE];

			String fileName = "maker.txt";

			maker[pY][pX] = PLAYER;

			while (true) {
				System.out.println("[1]소코반 메이커");
				System.out.println("[2]게임 시작하기"); // 저장된 맵이 있으면 -> 불러와서 게임시작
				System.out.println("[0]종료하기");

				int choice = scan.nextInt();

				if (choice == 1) {

					while (true) {
						for (int i = 0; i < SIZE; i++) {
							for (int j = 0; j < SIZE; j++) {
								if (map[i][j] != 0 && maker[i][j] == PLAYER) {
									System.out.print("*\t");
								} else if (maker[i][j] == PLAYER) {
									System.out.print("옷\t");
								} else if (map[i][j] == WALL) {
									System.out.print("벽\t");
								} else if (map[i][j] == BALL) {
									System.out.print("공\t");
								} else if (map[i][j] == GOAL) {
									System.out.print("골\t");
								} else {
									System.out.print(map[i][j] + "\t");
								}
							}
							System.out.println("\n");
						}
						System.out.println();

						System.out.println("[이동] ▶  상(1)하(2)좌(3)우(4)");
						System.out.println("[설치] ▶ 벽(5)공(6)골(7) ");
						System.out.println("[종료] ▶ 0");

						int move = scan.nextInt();

						

		}

	}