package lv7.test;

//���۽ð� 12 : 49
//����ð� 01 : 49
//�ҿ�ð� 01 : 00

class Library {
	int bookNumber;
	int memberNumber;
	String bookName;
	String rentalDate[] = new String[3];
	int rentDay;
}

public class test008 {

	public static void main(String[] args) {
		String rentalData = "";
		rentalData += "å��ȣ/å����/�뿩��¥/ȸ����ȣ\n";
		rentalData += "20122/���ʷξ���/2020-11-25/1001\n";
		rentalData += "40143/�ܱ��� ������ ����/2020-11-27/1003\n";
		rentalData += "54321/��ǻ��Ȱ��ɷ�/2020-11-27/1041\n";
		rentalData += "26543/�ƹ�ư,�ܱ���/2020-12-01/1034";

		String userData = "";
		userData += "ȸ����ȣ/å��ȣ/�뿩�ϼ�(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		int cnt = 0;
		int totay = 4;
		// �� �����ʹ� ������ å �뿩 �������̴�.
		// ������ 12��4�� �̶�������� ��ü�� �̸� ��� (1���� �ʰ� ��, ��ü)
		// 11���� 30�ϱ��� ���� . 7���ʰ� = 8��° , 11�� 26�Ϻ��� ��ü��

		String temp[] = rentalData.split("\n");
		Library library[] = new Library[temp.length - 1];
		for (int i = 0; i < library.length; i++) {
			library[i] = new Library();
		}

		for (int i = 1; i < temp.length; i++) {
			String temp2[] = temp[i].split("/");

			library[i - 1].bookNumber = Integer.parseInt(temp2[0]);
			library[i - 1].bookName = temp2[1];
			library[i - 1].memberNumber = Integer.parseInt(temp2[3]);
			String temp3[] = temp2[2].split("-");

			for (int k = 0; k < temp3.length; k++) {
				library[i - 1].rentalDate[k] = temp3[k];

			}

		}
		temp = userData.split("\n");

		for (int i = 1; i < temp.length; i++) {
			String temp2[] = temp[i].split("/");
			library[i - 1].rentDay = Integer.parseInt(temp2[2]);
		}

		for (int i = 0; i < library.length; i++) {
			System.out.println("å��ȣ : " + library[i].bookNumber);
			System.out.println("å�̸� : " + library[i].bookName);
			System.out.println("ȸ����ȣ : " + library[i].memberNumber);
			System.out.println("�뿩�ϼ� : " + library[i].rentDay);
			System.out.print("�뿩��¥ : ");
			for (int j = 0; j < 3; j++) {
				System.out.print(library[i].rentalDate[j] + " ");
			}
			System.out.println("\n");
		}

		for (int i = 0; i < library.length; i++) {
			if (Integer.parseInt(library[i].rentalDate[1]) == 11) {
				if(30-Integer.parseInt(library[i].rentalDate[2]) +totay >= 8) {
					System.out.printf("ȸ����ȣ %d�� ��ü���Դϴ� . ",library[i].memberNumber);
				}
			}
		}
	}

}
