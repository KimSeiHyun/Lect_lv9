package lv.test_5;

public class lv5_29 {

	public static void main(String[] args) {
		/*
		 * # �ܼ� �Խ���
		 * 1. [����] �Ǵ� [����] ��ư�� ������ ������ ��ȣ�� ����ȴ�.
		 * 2. ���� ������ ��ȣ�� �ش�Ǵ� �Խñ۸� �� �� �ִ�.
		 * 3. 2���� �迭 board�� 0������ ������ 1������ �Խñ��� ������ �����Ѵ�.
		 * 4. �Խñ��� �߰��ϰ� ������ ������ ����������� ���� �����Ͱ� �ٷιٷ� ����ȴ�.
		 * 5. ����� ����Ǿ� �ִ� ������ �����Ѵٸ�, �ٷ� ������ �ҷ������� �����Ѵ�.
		 */


		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
	        String fileName = "board.txt";

			String[][] board = null;
			int count = 0;				// ��ü �Խñ� ��
			int pageSize = 5;			// �� �������� ������ �Խñ� ��
			int curPageNum = 1;			// ���� ������ ��ȣ
			int pageCount = 0;			// ��ü ������ ����
			int startRow = 0;			// ���� �������� �Խñ� ���� ��ȣ
			int endRow = 0;				// ���� �������� �Խñ� ������ ��ȣ
			
			while(true) {
				System.out.println("[1]����");
				System.out.println("[2]����");
				System.out.println("[3]�߰��ϱ�");
				System.out.println("[4]�����ϱ�");
				System.out.println("[5]����Ȯ��");

				int choice = scan.nextInt();
				
				if(choice == 1) {}
				else if(choice == 2) {}
				else if(choice == 3) {}
				else if(choice == 4) {}
				else if(choice == 5) {}
			}



		}

	}
