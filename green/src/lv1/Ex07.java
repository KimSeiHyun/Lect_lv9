package lv1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// ��� : ���α׷��� ���� �帧�� ������. 
		// ���ǹ� , �ݺ��� , �������
		
		// ����� ����
		// Ű����(���ǽ�) {���๮;}    {} << ������ ���۰� ���� �ǹ�.
		
		// ���ǹ� if 
		if(true) { //���ǽ��� ����� true �̸� , ���� ������ ����
			System.out.println("hello");
		}
		
		if(false) {
			System.out.println("hi");
		}
			System.out.println("end");
			
			// ����� ���� ���� . 
			// 1. ������ �Ʒ��� 
			// 2. ����� ������ �� , ���ǽ��� ����� true �̸� -> ���� ������ ���� ���� . 
			
			System.out.println("���� �� �Ծ���?  (yes = 1 , no = 2) : ");
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			
			if(answer == 1 ) {
				System.out.println("�� ���߾�� .");
			}
			if(answer == 2) {
				System.out.println("���� ������� ���� .");
				

				}
				// ���� 1) ���, 0, ���� ���
				// ���� 2) 4�� ��� ���
				// ���� 3) �հ�, ���հ� ���
				
				
				int num1 = sc.nextInt(); 
				if(num1 > 0) {
					System.out.println("���");
				}
				if(num1 == 0) {
					System.out.println("0");
				}
				if(num1 < 0 ) {
					System.out.println("���� ");
				}
				
				int num2 = sc.nextInt();
				
				if(num2 % 4 == 0 )
					System.out.println("4�� ���");
				
				int num3 = sc.nextInt();
				if(num3 >= 80) { 
					System.out.println("�հ�");
				}
				if(num3 < 80 ) {
					System.out.println("���հ� ");
				}
				
				/* ���ٿ���ӹ��� . 
				 * # Up & Down ����[1�ܰ�]
				 * 1. com�� 8�̴�.
				 * 2. me�� ���ڸ� �ϳ��Է¹޴´�.
				 * 3. com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
				 * 1) me < com	: Up!
				 * 2) me == com : Bingo!
				 * 3) me > com  : Down!
				 */
				int com = 8;
				int me = sc.nextInt();
				
				System.out.println("���ٿ� �����Է� : ");
				if(me < com) {
					System.out.println("Up!");
				}
				if(me == com) {
					System.out.println("Bingo!");
				}
				if(me > com) {
					System.out.println("Down!");
				}
				
				/* �������������� 1���� �����.
				 * # ����(0)����(1)��(2) ����[1�ܰ�]
				 * 1. com�� ����(1)�� �� �� �ִ�.
				 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
				 * 3. com�� me�� ����,
				 * 		1) ����.
				 * 		2) ���� �̰��.
				 * 		3) ���� ����.			�� ����Ѵ�.
				 */
				int com1 = 1;
				System.out.println("���� 0 . ���� 1 . �� 2");
				int me1 = sc.nextInt();
				
				if(com1 == me1) {
				 System.out.println("����.");
				}
				
				if(me1 > com1) {
					System.out.println("���� �̰�� .");
				}
				if(me1 < com1) {
					System.out.println("���� ���� .");
				}
				
				/* �α��ι��� .
				 * # �α���[1�ܰ�]
				 * 1. Id�� Pw�� �Է¹޴´�.
				 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
				 * ��) �α��� ���� or �α��� ����
				 */
				
				int Id = sc.nextInt();
				int Pw = sc.nextInt();
				int dbId = 1234;
				int dbPw = 1111;
				if(Id == dbId && Pw == dbPw ) {
					System.out.println("�α��μ���");
				}
				if(Id == dbId || Pw == dbPw ) {
					System.out.println("�α��ν���");
				}
			
				/* ȸ�����Էα��ι��� .
				 * # �α���[2�ܰ�]
				 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
				 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
				 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
				 * ��) �α��� ���� or �α��� ����
				 */
				
				System.out.println("ȭ�������� ���̵� �Է� : ");
				int dbid2 = sc.nextInt();
				System.out.println("ȸ�������� ��й�ȣ �Է� : ");
				int dbpw2 = sc.nextInt();
				
				System.out.println("�α����� ���̵� �Է� : ");
				int inid2 = sc.nextInt();
				System.out.println("�α����� ��й�ȣ �Է� : ");
				int inpw2 = sc.nextInt();
				
				if(dbid2 == inid2) {
					if(dbpw2 == dbpw2)
					System.out.println("�α��� ���� !");
				}
				if(dbid2 != inid2) {
					if(dbpw2 != dbpw2)
					System.out.println("�α��� ���� !");
				}
				
				
					
					/*
					 * # �α���[3�ܰ�]
					 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
					 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
					 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
					 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
					 */
						//ȸ������
					int dbid;
					int dbpw;
					System.out.println("ȸ�������� ���̵� �Է� : ");
					dbid = sc.nextInt();
					System.out.println("ȸ�������� ��й�ȣ �Է� : ");
					dbpw = sc.nextInt();
					
					//�α���
					System.out.println("�α����� ���̵� �Է� : ");
					int inId = sc.nextInt();
					
					
					//�˻�
					if(dbid != inId) {
						System.out.println("id�� Ȯ�����ּ���.");
					}
					//��ø ��� (if �ȿ� if�� ��.  )
					else { //if(dbid == inId) {
						System.out.println("�α����� ��й�ȣ �Է� : ");
						int inPw = sc.nextInt();
						if(dbpw != inPw) {
							System.out.println("��й�ȣ�� Ȯ���ϼ��� !");
						}
						else {  // if(dbpw == inPw) {
							System.out.println("�α��� ���� ! ");
						}
					}
					
				
				
	}
}
