package lv6;

import java.util.Scanner;

class Ex001_10 {
	int arr[][] =        {{0,0,0,0,0} , 
						  {1,1,0,1,1} ,
						  {0,0,1,1,0} ,
						  {1,1,0,0,0} ,
						  {0,1,1,0,0} ,
						  {0,0,1,1,0} ,
						  {1,1,0,0,0} ,
						  {0,0,0,1,1} ,
						  {0,0,0,1,1} ,
						  {0,0,0,0,0}};
	
	int x = 0;
	int y = 0;
}
public class Ex001_010 {

	public static void main(String[] args) {
		/*
		 * # ��ٸ� ����
		 * 1. 0�� ������ �Ʒ��� ��������.
		 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
		 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.

		 */
		
		Ex001_10 ex = new Ex001_10();
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<ex.arr.length; i++) {
			for(int j=0; j<ex.arr[i].length; j++) {
				System.out.print(ex.arr[i][j] + " ");
			}System.out.println();
		}
		System.out.print("����� ���� ����ּ��� (0~4) : ");
		int x = sc.nextInt();
		
		ex.x = x;
		while(true) {
			if(ex.arr[ex.y][ex.x] == 0) {
				ex.y++;
			}
			if(ex.arr[ex.y][ex.x] == 1) {
				if(ex.x == 0) {
					ex.x++;
				}
				else if (ex.x == 4) {
					ex.x--;
				}
				else {
					if(ex.arr[ex.y][ex.x-1] == 1) {
						ex.x--;
					}
					else if(ex.arr[ex.y][ex.x+1] == 1) {
						ex.x++;
					}
				}
				ex.y++;
			}
			
			if(ex.y == 9) {
				ex.arr[ex.y][ex.x] = 2; 
				System.out.printf("x�� %d�ٿ��� �������ϴ�.\n",ex.x+1);
				break;
			}

			
		}//while(true)
		for(int i=0; i<ex.arr.length; i++) {
			for(int j=0; j<ex.arr[i].length; j++) {
				System.out.print(ex.arr[i][j] + " ");
			}System.out.println();
		}
		
	}

}
