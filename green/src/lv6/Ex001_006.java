package lv6;

import java.util.Scanner;

class Ex006 {
	
	int arr[] = { 0, 0, 1, 0, 0, 2, 0, 0, 1, 0, 0 };
	
	
}
public class Ex001_006 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[3�ܰ�] : Ŭ���� + ����
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
		 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
		 * ��) 
		 *  0 0 0 0 0 0 0 2 
		 *  ����(1) ������(2) : 2
		 *  
		 *  2 0 0 0 0 0 0 0 
		 */
		Ex006 ex = new Ex006();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i=0; i<ex.arr.length; i++) {
				if(ex.arr[i] == 1) {
					System.out.print("�� ");
				}
				else if (ex.arr[i] == 2) {
					System.out.print("�� ");
				}
				else System.out.print(ex.arr[i] + " ");
			}System.out.println();
			
			System.out.println("1.����    2.������    3.����   ");
			int sel = sc.nextInt();
			
			if( sel == 1) {
				for(int i=1; i<ex.arr.length; i++) {
					if(ex.arr[i] == 2 && ex.arr[i-1] == 0) {
						ex.arr[i-1] = 2;
						ex.arr[i] = 0;
					}
				}
			}
			else if (sel == 2) {
				for(int i=0; i<ex.arr.length-1; i++) {
					if(ex.arr[i] == 2 && ex.arr[i+1] == 0) {
						ex.arr[i+1] = 2;
						ex.arr[i] = 0;
						break;
					}
				}
			}
			else if (sel == 3) {
				for(int i=1; i<ex.arr.length-1; i++) {
					if(ex.arr[i] == 2 &&ex.arr[i+1] == 1) {
						ex.arr[i+1] = 0;
						System.out.println("���� !! ");
					}
					if(ex.arr[i] == 2 &&ex.arr[i-1] == 1) {
						ex.arr[i-1] = 0;
						System.out.println("���� !! ");
					}
					
				}
			}
			
			
		}//while(true)

	}

}
