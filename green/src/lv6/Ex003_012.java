package lv6;

import java.util.Random;
import java.util.Scanner;



class Ex003_12 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int size = 10;
	int arr[][];
	String answer[];
	int p;
	int x;
	int y;
	void setting() {
		System.out.print("������ �ο� : ");
		this.p = sc.nextInt();
		this.arr = new int[this.size][this.p];
		for(int i=1; i<this.size-1; i++) {
			for(int j=0; j<this.p-1; j++) {
				int rNum = rn.nextInt(this.p-1);
				int x = rn.nextInt(2);
				if(x == 1 && this.arr[i][rNum] == 0 && this.arr[i][rNum +1] == 0) {
					this.arr[i][rNum] = 1;
					this.arr[i][rNum+1] = 2;
					
				}
			}
			
		}
		
		
	}
	
	void answerSetting() {
		System.out.println("������ �ο�����ŭ �������� ����� �����ּ��� . ");
		answer = new String[this.p];
		for(int i=0; i<this.answer.length; i++) {
			String str = sc.next();
			answer[i] = str;
		}
		
	}
	void print() {
		for(int i=0; i<this.arr.length; i++) {
			for(int j=0; j<this.arr[i].length; j++) {
				if(this.arr[i][j] == 1) {
					System.out.print("����");
				}
				else if (this.arr[i][j] == 2) {
					System.out.print("�� ");						
				}
				else {
					System.out.print("�� ");												
				}
			}System.out.println();
		}System.out.println();
		

		
		for(int i=0; i<this.answer.length;i ++) {
			System.out.printf("%d. %s  \n",i+1,answer[i]);
		}
	}
	
	void choice() {
		System.out.println("���° ������ �����Ͻðڽ��ϱ� ? ");
		int sel = sc.nextInt()-1;
		this.x = sel;
		this.y = 0;
		while(true) {
		if(this.arr[y][this.x]== 1 ) {
			this.x++;
			this.y++;
		}
		else if(this.arr[y][this.x]== 2 ) {
			this.x--;
			this.y++;
		}
		else {
			this.y++;
		}
		if(this.y == this.size-1) {
			System.out.printf("%d��°�� ��ٸ�Ÿ�� ���� %d.%s �Դϴ�." ,sel+1,this.x+1,this.answer[x]);
			break;
		}
		}
	}
	public void run() {
		setting();
		answerSetting();
		print();
		choice();
	}
}
public class Ex003_012 {

	public static void main(String[] args) {
		// ��ٸ� ����
		Ex003_12 ex = new Ex003_12();
		ex.run();
	}

}
