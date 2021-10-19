package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex03_10 {

	public static void main(String[] args) {
		//# ���� Ver2(�÷��̾� 2��)
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int maxNum = 5;
		int size = 50;
		int[][] me = new int[maxNum][maxNum];
		int[][] you = new int[maxNum][maxNum];
		
		int[][] meMark = new int[maxNum][maxNum];
		int[][] youMark = new int[maxNum][maxNum];
		
		int[] temp = new int[maxNum * maxNum];
		
		int win1 = 0;
		int win2 = 0;
		int temp1 = 0;
		int temp2 = 0;
		int sum = 0;
		
		while (sum < 25) { // me �迭�� �ߺ��� ���� ������ �ο�
			int ranNum = rn.nextInt(size) + 1;
			int check = -1;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (me[i][j] == ranNum) {
						check = 1;
						break;
					}
					if (me[i][j] == 0) {
						temp1 = i;
						temp2 = j;
						check = 2;
						break;
					}
				}
				if (check == 2 || check == 1) {
					break;
				}
			}
			if (check == 2) {
				me[temp1][temp2] = ranNum;
				sum++;
			}
		} // ù��°while

		sum = 0;
		while (sum < 25) { // you �迭�� �ߺ��� ���� ������ �ο�
			int ranNum = rn.nextInt(size) + 1;
			int check = -1;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (you[i][j] == ranNum) {
						check = 1;
						break;
					}
					if (you[i][j] == 0) {
						temp1 = i;
						temp2 = j;
						check = 2;
						break;
					}
				}
				if (check == 2 || check == 1) {
					break;
				}
			}
			if (check == 2) {
				you[temp1][temp2] = ranNum;
				sum++;
			}
		} // �ι�°while

		int turn = 1;
		while (true) {
			// ��¹�
			System.out.println("----me�� ������----");
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(me[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("---you�� ������---- ");
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(you[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("----------------");

			// ���� ǥ�� .
			if (win1 == 1 && win2 == 2) {
				System.out.println("�Ѵ� ���ÿ� ����.���º��Դϴ� . ");
				break;
			}
			if (win1 == 1) {
				System.out.println("me�� �̰���ϴ� . ");
				break;
			}
			if (win2 == 2) {
				System.out.println("you�� �̰���ϴ� . ");
				break;
			}
			int cnt = 0;
			if (turn % 2 == 1) {
				System.out.print("me�� �����Դϴ� ���ڸ� �Է����ּ��� . ");
			}
			if (turn % 2 == 0) {
				System.out.print("you�� �����Դϴ� ���ڸ� �Է����ּ��� . ");
			}
			int inNum = sc.nextInt();

			// ���� �Է½� ���ܰ� Ȯ�� .
			if (turn % 2 == 1) {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if (me[i][j] != inNum) {
							cnt++;
						}
					}
				}
				if (cnt == 25 || inNum > 50 || inNum <= 0) {
					System.out.println("���ڸ� �߸� �Է��ϼ˽��ϴ� .");
					continue;
				}
			}
			if (turn % 2 == 0) {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if (you[i][j] != inNum) {
							cnt++;
						}
					}
				}
				if (cnt == 25 || inNum > 50 || inNum <= 0) {
					System.out.println("���ڸ� �߸� �Է��ϼ˽��ϴ� .");
					continue;
				}
			}
			// ���ܰ��� ���� ��� �Է��� ���� 0���� ���� .
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (me[i][j] == inNum) {
						me[i][j] = 0;
					}
					if (you[i][j] == inNum) {
						you[i][j] = 0;
					}
				}
			}

			// ���� ����
			for (int i = 0; i < 5; i++) {
				int meCount = 0;
				int youCount = 0;
				for (int j = 0; j < 5; j++) {
					if (me[i][j] == 0) {
						meCount++;
					}
					if (you[i][j] == 0) {
						youCount++;
					}
				}
				if (meCount == 5) {
					win1 = 1;
				}
				if (youCount == 5) {
					win2 = 2;
				}
			}
			// ���� ����
			for (int i = 0; i < 5; i++) {
				int meCount = 0;
				int youCount = 0;
				for (int j = 0; j < 5; j++) {
					if (me[j][i] == 0) {
						meCount++;
					}
					if (you[j][i] == 0) {
						youCount++;
					}
				}
				if (meCount == 5) {
					win1 = 1;
				}
				if (youCount == 5) {
					win2 = 2;
				}
			}

			// �밢�� \ ����
			int meCount = 0;
			int youCount = 0;
			for (int i = 0; i < 5; i++) {
				if (me[i][i] == 0) {
					meCount++;
				}
				if (you[i][i] == 0) {
					youCount++;
				}
				if (meCount == 5) {
					win1 = 1;
				}
				if (youCount == 5) {
					win2 = 2;
				}
			}

			// �밢�� / ����
			int x = 0;
			meCount = 0;
			youCount = 0;
			for (int i = 0; i < 5; i++) {
				if (me[i][4 - x] == 0) {
					meCount++;
				}
				if (you[i][4 - x] == 0) {
					youCount++;
				}
				x++;
				if (meCount == 5) {
					win1 = 1;
				}
				if (youCount == 5) {
					win2 = 2;
				}
			}

			turn++;

		} // c

	}

}
