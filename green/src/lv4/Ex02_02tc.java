package lv4;

public class Ex02_02tc {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		// ���� 1) ��ü �� ���
		// ���� 1) 450
		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80
		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4

	}

}
