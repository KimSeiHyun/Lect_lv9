package test;

import java.util.Scanner;

public class LMS {

	public static void main(String[] args) {
//				. ���೻�� 
//				- �л��������� ���α׷� �����
//				- �й� �� ������ �Է� �޾� ������ ����� �� �ְ�,
//				- ��ϵ� �й��� �Է��ϸ� ������ �Բ� ����� ��µ�
//				- ��ޱ��� : 90�� �̻� A / 80�� �̻� B / 70�� �̻� C / 60�� �̸� F 
	
		// �л��� : �輼��
		// ���� 12:38
		// ���� 13:21
		// �ҿ� 00:43 
		
		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int score[] = new int[5];

		int cnt = 0;
		while (true) {

			System.out.print("�й� : ");
			for (int i = 0; i < 5; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			System.out.print("���� : ");
			for (int i = 0; i < 5; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();

			System.out.println("1.�й� �� ���� �Է�");
			System.out.println("2.���� ��ȸ");
			System.out.println("3.����");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (cnt >= 5) {
					System.out.println("������ �Է��� �� �ִ°����� �����ϴ�.");
					continue;
				}
				System.out.println("�Է��� �й��� �Է����ּ��� . ");
				int inNum = sc.nextInt();
				System.out.println("�Է��� ������ �Է����ּ��� . ");
				int inScore = sc.nextInt();

				if (cnt >= 0 && cnt < 5) {
					for (int i = 0; i < 5; i++) {
						if (num[i] == inNum) {
							System.out.println("�̹� ��ϵ� �й��Դϴ�. �ٽ� Ȯ�����ּ��� .");
							break;
						}
						if (inScore > 100 || inScore < 0) {
							System.out.println("������ 1~100������ �Է����ּ���.. �ٽ� Ȯ�����ּ��� . ");
							break;
						}
						if (num[i] == 0 && score[i] == 0) {
							num[i] = inNum;
							score[i] = inScore;
							cnt++;
							break;
						}
					}
				}

			}

			else if (sel == 2) {
				int check = -1;
				System.out.println("������ ��ȸ�� �й��� �Է����ּ��� . ");
				int inNum = sc.nextInt();
				for (int i = 0; i < 5; i++) {
					if (num[i] == inNum) {
						check = 1;
					}
				}
				if (check != 1) {
					System.out.println("��ȸ�� �й��� �������� �ʽ��ϴ�.");
					continue;
				}
				if (check == 1) {
					for (int i = 0; i < 5; i++) {
						if (num[i] == inNum) {
							if (score[i] >= 90) {
								System.out.println("���� : " + score[i] + "�� A���");
							} else if (score[i] >= 80 && score[i] < 90) {
								System.out.println("���� : " + score[i] + "�� B���");
							} else if (score[i] >= 70 && score[i] < 80) {
								System.out.println("���� : " + score[i] + "�� C���");
							} else if (score[i] >= 60 && score[i] < 70) {
								System.out.println("���� : " + score[i] + "�� D���");
							} else {
								System.out.println("���� : " + score[i] + "�� F���");

							}

						}
					}
				}
			} else if (sel == 3) {
				System.out.println("�����մϴ�.");
				break;
			}

		}//while

	}

}
