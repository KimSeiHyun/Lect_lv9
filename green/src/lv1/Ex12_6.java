package lv1;
import java.util.Scanner;
public class Ex12_6 {

	public static void main(String[] args) {
		/*
		 * # ���̱ⱸ �̿�����
		 * 1. Ű�� �Է¹޴´�.
		 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
		 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
		 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
		 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
		 *    ���� : 10 : 03
		 *    ���� : 10 : 11
		 *    �ҿ�ð� : 8��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���̱ⱸ �̿����� !");
		System.out.println("�ڽ��� Ű�� �Է��ϼ��� !");
		int cm = sc.nextInt();
		
		
		if (cm > 120 ) {
			System.out.println("���̱ⱸ�� �̿��� �� �ֽ��ϴ�.");
		}
		else if ( cm < 120) {
		System.out.println("���̱ⱸ�� �̟G�Ұ�.");
		System.out.println("�θ�԰� �Բ� ���˳��� ?  yes : 1  , no : 0");
		int to = sc.nextInt();
		 if ( to == 1 ) {
			 System.out.println("���̱ⱸ ��� ���� !");
		 }
		 else {
			 System.out.println("���̱ⱸ �̿�Ұ� !");
		 }
		
		}

	}

}
