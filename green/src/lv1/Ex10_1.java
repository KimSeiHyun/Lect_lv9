package lv1;

import java.util.Random;
import java.util.Scanner;
public class Ex10_1 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
		 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
		 * 3. ������ �յ޸��� ���ߴ� �����̴�.
		 */
		
		Random ran = new Random();
		
		int r  = ran.nextInt();
		
		r = ran.nextInt(2);
		
		if(r == 1) { 
			System.out.println("�޸��Դϴ�.");
		}
		else  if(r !=1 ) { // = else
			System.out.println("�ո��Դϴ�.");
		}
			
		
			/*
			 * # Ȧ¦ ����
			 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
			 * 2. ����� ���� ���ڸ� �����ְ�,
			 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
			 */
		 Scanner sc = new Scanner(System.in);
		 
		 int r2 = ran.nextInt();
		 
		 r2 = ran.nextInt(100) +1 ;
		 
		 if (r2 %2 == 0) {
			 System.out.println("¦���Դϴ�.");
		 }
		 else if (r2 %2 != 0 ) {
			 System.out.println("Ȧ���Դϴ�.");
		 }
		 
		 
			/*
			 * # ����(0)����(1)��(2) ����[2�ܰ�] 
			 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
			 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�. 
			 * 3. com�� me�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
			 */
		 System.out.println("������������ �Է��ϼ��� . ");
		 int com = sc.nextInt();
		 int me = ran.nextInt(3);
		 
//       �����Ѱ� 
//		 System.out.println("������������ �Է��ϼ��� . ");
//		 if(me == com) {
//			 System.out.println("���� ! ");
//		 }
//		 else if (me == 0 && com == 1) {
//			 System.out.println("���� ���� ...");
//		 }
//		 else if (me ==0 && com == 2 ) {
//			 System.out.println("���� �̰�� !");
//		 }
//		 else if ( me == 1 && com == 0 ) {
//			 System.out.println("���� �̰�� !");
//		 }
//		 else if (me == 1 && com == 2 ) {
//			 System.out.println("���� ���� ...");
//		 }
//		 else if ( me == 2 && com == 0) {
//			 System.out.println("���� ���� ...");
//		 }
//		 else if (me ==2 && com ==1) {
//			 System.out.println("���� �̰�� !");
//		 }
//		 else {
//			 System.out.println("�߸� �Է��߽��ϴ� . ");
//		 }
//		 
		 //
		 int win = 0; // me(1) , com(2)
		 
		 if(me == com) {
			 System.out.println("���� ! ");
		 }
		 else if (me == 0 && com == 1) {
			 System.out.println("��ǻ�� : �ָ�");
			 System.out.println("�� : ���� ");
			 win = 2;
		 }
		 else if (me ==0 && com == 2 ) {
			 System.out.println("�� : ����");
			 System.out.println("��ǻ�� : ���ڱ�");
			 win = 1;
		 }
		 else if ( me == 1 && com == 0 ) {
			 win = 1;
			 System.out.println("�� : �ָ�");
			 System.out.println("��ǻ�� : ����");
		 }
		 else if (me == 1 && com == 2 ) {
			 win = 2;
			 System.out.println("�� : �ָ�");
			 System.out.println("��ǻ�� : ���ڱ�");
		 }
		 else if ( me == 2 && com == 0) {
			 win = 2;
			 System.out.println("�� : ���ڱ�");
			 System.out.println("��ǻ�� : �ָ�");
		 }
		 else if (me ==2 && com ==1) {
			 win = 1;
			 System.out.println("�� : ���ڱ�");
			 System.out.println("��ǻ�� : �ָ�");
		 }
		 else {
			 System.out.println("�߸� �Է��߽��ϴ� . ");
		 }
		 if(win == 1 ) {
			 System.out.println("�̰�� !!");
		 }
		 else if(win == 2){
			 System.out.println("��ǻ�Ͱ� �̰�� !!");
		 }

		 

	}

}
