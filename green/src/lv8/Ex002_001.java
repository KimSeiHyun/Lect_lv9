package lv8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex002_001 {

	public static void main(String[] args) {
		//ƽ���� 2���� �迭���� 
		ArrayList<int[]> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			arr.add(new int[3]);
		}
		
		int turn = 1;
		int win = 0;
		
		while (true ) {
			System.out.println("------------");
			System.out.println("   0   1   2");
			for(int i=0; i<arr.size(); i++) {
				System.out.print(i+" ");
				for(int j=0; j<arr.get(i).length; j++) {
					if(arr.get(i)[j] == 1) {
						System.out.print("[O] ");
					}
					else if(arr.get(i)[j] == 2) {
						System.out.print("[X] ");
					}else {
						System.out.print("[ ] ");
					}
				}System.out.println();				
			}
			System.out.println("------------");
			if(win != 0 ) {
				System.out.printf("p%d�� �¸��Դϴ�!! ",win);
				break;
			}
			System.out.printf("p%d�� �����Դϴ�.\n",turn);
			System.out.print("x��ǥ�� �Է����ּ��� . ");
			int x= sc.nextInt();
			System.out.print("y��ǥ�� �Է����ּ��� . ");
			int y= sc.nextInt();
			if(x >= 0 && x<arr.size() && y>=0 && y<3) {
				if(arr.get(x)[y] == 0) {
					arr.get(x)[y] = turn;
				}
				else {
					System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
					continue;
				}
				
			}else {
				System.out.println("��ǥ�� ������ ������ϴ� .");
				continue;
			}
			
			while(win == 0 ) {
				//����
				for(int i=0; i<arr.size(); i++) {
					if(arr.get(i)[0] == turn && arr.get(i)[1] == turn
							&& arr.get(i)[2] == turn) {
						win = turn;
						break;
					}
				}
				if(win != 0 ) {
					break;
				}
				//����
				for(int i=0; i<3; i++) {
					if(arr.get(0)[i] == turn && arr.get(1)[i] == turn
							&& arr.get(2)[i] == turn) {
						win = turn;
						break;
					}
				}
				if(win != 0 ) {
					break;
				}
				//�밢\
				if(arr.get(0)[0] == turn && arr.get(1)[1] == turn
						&& arr.get(2)[2] == turn) {
					win = turn;
					break;
				}
				//�밢/
				if(arr.get(0)[2] == turn && arr.get(1)[1] == turn
						&& arr.get(2)[0] == turn) {
					win = turn;
					break;
				}
				
			}

			turn = turn == 2? 1 : 2;
		}//whiel (True) 

	}

}
