package lv.test_6;

import java.util.Scanner;

class Ex05{	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class lv6_04 {

	public static void main(String[] args) {
		/*
		 * System.out.println("=== " + mega.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
		 */
		Ex05 e = new Ex05();
		e.name = "����";
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=== " + e.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("�й� : ");
				for(int i=0; i<e.arHakbun.length; i++) {
					System.out.print(e.arHakbun[i] + "\t");
				}System.out.println();
				System.out.print("���� : ");
				for(int i=0; i<e.arHakbun.length; i++) {
					System.out.print(e.arScore[i] + "\t");
				}System.out.println();
			}
			if(sel == 2) {
				int max = 0;
				for(int i=0; i<e.arScore.length; i++) {
					if(max < e.arScore[i]) max = e.arScore[i];
				}
				System.out.println(max);
			}
			if(sel == 3) {
				int min = 100;
				for(int i=0; i<e.arScore.length; i++) {
					if(min > e.arScore[i]) min = e.arScore[i];
				}
				System.out.println(min);
			}
			if(sel == 4) {
				System.out.println("Ȯ���� �й� �Է� : ");
				int num = sc.nextInt();
				for(int i=0; i<e.arScore.length; i++) {
					if(num == e.arHakbun[i]) System.out.println(e.arScore[i]);
				}
			}
			if(sel == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
		}

	}
}