package lv.test_5;

public class lv5_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
   		
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "���", "�ٳ���", "����" };

		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		String fileName = "jang.txt";

		int count = 0;
		int log = -1;

		while (true) {

			System.out.println("[SHOP]");
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[4]��ٱ���");
			System.out.println("[5]����");
			System.out.println("[6]�ε�");
			System.out.println("[0]����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 4) {
			} else if (sel == 5) {
			} else if (sel == 6) {
			} else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}
}