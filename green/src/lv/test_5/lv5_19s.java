package lv.test_5;

public class lv5_19s {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vector = null;
		int count = 0;

		String fileName = "vector.txt";

		while (true) {

			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
			} else if (sel == 2) {
			} else if (sel == 3) {
			} else if (sel == 4) {
			} else if (sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}
}