package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex12_5 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
		 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
		 * 3. ������ �յ޸��� ���ߴ� �����̴�.
		 * ���� : 9:47
		 * ���� : 9:59
		 * �ҿ�ð� : 12��
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �յ� ���߱� ���� ! ");
		System.out.println("���ڸ� �Է����ּ��� : �� : 0 , �� : 1");
		int coin = ran.nextInt(2);
		int incoin = sc.nextInt();
		
		if (coin == 1 && incoin == 1) {
			System.out.println("���� !");
		}
		else if (coin == 1 && incoin == 0) {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		else if (coin == 0 && incoin == 0) {
			System.out.println("���� ! ");
		}
		else if (coin == 0 && incoin == 1) {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		else {
			System.out.println("������ ��� �����Դϴ�. .");
		}
		

	}

}
