package lv.test_5;

public class lv5_24 {

	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.

		while (true) {
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			for (int i = 0; i < size; i++) {
				System.out.print("*");

			}
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = scan.next();
		}

	}
}