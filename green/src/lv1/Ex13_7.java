package lv1;

import java.util.Scanner;

public class Ex13_7 {

	public static void main(String[] args) {
		/*
		 * # ����Ų���31
		 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
		 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
		 * 3. br�� 31�� ������ ������ ����ȴ�.
		 * 4. �¸��ڸ� ����Ѵ�.
		 * 
		 * ��) 
		 * 1�� : p1(2)	br(2)
		 * 2�� : p2(1)	br(3)
		 * 3�� : p1(3)	br(6)
		 * ...
		 */
		Scanner sc = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 1;

		boolean a = true;
		System.out.println("����Ų��󽺰���! ");
		System.out.println("p1 �����Դϴ�. ���ڸ� �Է����ּ��� .");
		while (a) {
			turn ++; 

			br = p1 + p2 ;
			if (turn %2 == 1 ) {
				p1 = sc.nextInt();
				System.out.println(turn+"�� : "+ "p1("+p1  +")   br(" + br+ ")" );
			}
			else    {
				p2 = sc.nextInt();
				System.out.println(turn+"�� : "+ "p2("+p2  +")   br(" + br+ ")" );
				}

			}
		
		}
		}
	

