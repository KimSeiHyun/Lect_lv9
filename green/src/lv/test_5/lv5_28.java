package lv.test_5;

public class lv5_28 {

	// �÷��̾ ���ƴٴϸ鼭 ��ź ���������� �������� ��ġ �� ���Ϸ� ���� ��,
	// �ܼ����� �� ����� �ÿ��� �� ������ �̾ �� �ְ� ��������

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
				System.out.println("[1]���ڹ� ����Ŀ");
				System.out.println("[2]���� �����ϱ�"); // ����� ���� ������ -> �ҷ��ͼ� ���ӽ���
				System.out.println("[0]�����ϱ�");

				int choice = scan.nextInt();

				if (choice == 1) {

					while (true) {
						for (int i = 0; i < SIZE; i++) {
							for (int j = 0; j < SIZE; j++) {
								if (map[i][j] != 0 && maker[i][j] == PLAYER) {
									System.out.print("*\t");
								} else if (maker[i][j] == PLAYER) {
									System.out.print("��\t");
								} else if (map[i][j] == WALL) {
									System.out.print("��\t");
								} else if (map[i][j] == BALL) {
									System.out.print("��\t");
								} else if (map[i][j] == GOAL) {
									System.out.print("��\t");
								} else {
									System.out.print(map[i][j] + "\t");
								}
							}
							System.out.println("\n");
						}
						System.out.println();

						System.out.println("[�̵�] ��  ��(1)��(2)��(3)��(4)");
						System.out.println("[��ġ] �� ��(5)��(6)��(7) ");
						System.out.println("[����] �� 0");

						int move = scan.nextInt();

						

		}

	}