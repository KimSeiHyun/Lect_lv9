package lv6.test;

import java.util.Scanner;

class Ex06_test001 {
	Scanner sc = new Scanner(System.in);
	String arr[][];
	String block[];
	int ySize;
	int xSize;
	void setting(String data , String block) {
		String str[] = data.split("\n");
		this.ySize = data.split("\n").length;
		String x[] = str[0].split(",");
		this.xSize = x.length;
		this.arr = new String[this.ySize][this.xSize];
		

		for(int i=0; i<this.ySize; i++) {
			x = str[i].split(",");
			for(int j=0; j<this.xSize; j++) {
				this.arr[i][j] = x[j];
			}
		}
		this.block = block.split(",");
		
	}
	void print() {
		System.out.println("data");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		System.out.println("block");
		for(int i=0; i<this.block.length; i++) {
			System.out.print(this.block[i] + " ");
		}System.out.println();
		
	}
	void sel() {
		System.out.println("block �� ������ ��ǥ �Է� : ");
		System.out.print("y : ");
		int y = sc.nextInt();
		System.out.print("x : ");
		int x = sc.nextInt();
		if(y >= 0 && y < this.ySize && x >= 0 && x < this.xSize-3) {
			int check = 0;
				for(int j=x; j<x+4; j++) {
					if(this.arr[y][j].equals("1")) {
						check = 1;
					}
				}
				
				if(check == 0) {
					for(int j=x; j<x+4; j++) {
						this.arr[y][j] = "2";
					}
				}else System.out.println("�����Ҽ������ڸ��Դϴ�.");
		}else System.out.println("��ǥ�� ������ ������ϴ�.");
	}
	public void run() {
		while(true) {
		print();
		sel();
		}
	}
			
}

public class test001 {

	public static void main(String[] args) {
		// ���� 02:36
		// ���� 03:25
		// �ҿ� 00:49
		Ex06_test001 ex = new Ex06_test001();
		
		String data ="";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,1,1,1,1,1,1,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		
//		System.out.println(data);
		
		String block = "";
		block += "2,2,2,2";
//		System.out.println(block);
		
		// ��ǥ y , x �� �Է¹ް� block �� �մ� ������ data �� ���� 
		// ��) 1, 1
		/*
		    "0,0,0,0,0,1,0,0,0,0\n";
			"0,2,2,2,2,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,1,1,1,1,1,1,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
		 */
		// ����) �� ! ���࿡ 2222�� 1�� ������ "�����Ҽ������ڸ��Դϴ�" ��� 
		// ��) 2, 3 ==> ���ڸ���2222 ��  3��° �ڸ��� 1�̱⶧���� �����Ҽ� ����.
		/*
	    "0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,2,2,2,2,0,0,0\n";  // 1�� ����Ƿ� �ȵǴ�. 
		"0,0,1,1,1,1,1,1,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,0,0,0,0,0\n";
	 */
		ex.setting(data,block);
		ex.run();
	}

}
