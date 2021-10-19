package lv.test_6;

import java.util.Scanner;
/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
 */

class Ex14s{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{0,0,1,1,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"�ҽ�������", "CU������", "������", "���õ��", "���θ���"};
	Scanner sc = new Scanner(System.in);
	public void print() {
		for(int i=0; i<5; i++) {
			System.out.print(" "+(i+1) + " ");
		}System.out.println();
		for(int i=0; i<this.ladder.length; i++) {
			for(int j=0; j<this.ladder[i].length; j++) {
				if(this.ladder[i][j] == 0 )System.out.print(" �� ");
				if(j != this.ladder[i].length-1 &&this.ladder[i][j] == 1 && this.ladder[i][j+1] == 1 )System.out.print(" ����");
				if(j != 0 && this.ladder[i][j] == 1 && this.ladder[i][j-1] == 1)System.out.print("���� ");
			}System.out.println();
		}
	}
	
	public void choice() {
		System.out.println("��ȣ�� �Է����ּ��� ");
		int sel = sc.nextInt()-1;
		if(sel >= 0 && sel < 5) {
			this.x = sel;
			while(true) {
				if(y == this.ladder.length-1) break;
				
				if(this.ladder[y][x] == 0) y++;
				if(x == 4 &&this.ladder[y][x] == 1 && this.ladder[y][x-1] == 1) {
					x--;
					y++;
					continue;
				}
				if(x == 0 &&this.ladder[y][x] == 1 && this.ladder[y][x+1] == 1) {
					x++;
					y++;
					continue;
				}
				if(x != 0 && x != 4 &&this.ladder[y][x] == 1) {
					if(this.ladder[y][x-1] == 1) {
						x --;
						y++;
						
						continue;
					}
					if(this.ladder[y][x+1] == 1) {
						x ++;
						y++;
						continue;
					}
					
				}
				
 			}
			result();
			
		}else System.out.println("��ȣ�� �ٽ� Ȯ��");
	}
	
	public void result() {
		System.out.println(this.menu[x]);
	}
	public void run() {
		print();
		choice();
		
	}
}
public class lv6_11s {

	public static void main(String[] args) {
		Ex14s e = new Ex14s();
		e.run();

	}

}
