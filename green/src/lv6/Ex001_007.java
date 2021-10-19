package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex001_07 {
	
	final int SIZE = 10;
	int front[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int back[] = new int[SIZE];
	
}

public class Ex001_007 {

	public static void main(String[] args) {
		/*
		 * # ���� ���� : Ŭ���� + ����
		 * 1. front �迭 ī�� 10���� ���´�.
		 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
		 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
		 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
		 */
		
		Ex001_07 ex = new Ex001_07();
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		//����
		int s = 0;
		while(s < 150) {
			int rIdx = rn.nextInt(ex.SIZE);
			int temp = ex.front[0];
			ex.front[0] = ex.front[rIdx];
			ex.front[rIdx] = temp;
			s++;
		}
		int cnt = 0;
		
		
		while(true) {
			System.out.println("front");
			for(int i=0; i<ex.SIZE; i++) {
				System.out.print(ex.front[i] + " ");
			}System.out.println();
			System.out.println("back");
			for(int i=0; i<ex.SIZE; i++) {
				System.out.print(ex.back[i] + " ");
			}System.out.println();
			
			if(cnt == 5) {
				System.out.println("��� ī�带 �� �­��� !! ");
				break;
			}
			System.out.print("ī���� ��ġ �Է� :");
			int sel1 = sc.nextInt();
			int sel2 = sc.nextInt();
			if(sel1 == sel2) {
				System.out.println("���� ī�带 ������ �� �����ϴ�. ");
				continue;
			}
			if(sel1 <0 || sel1 >= ex.SIZE ||sel2 <0 || sel2 >= ex.SIZE ) {
				System.out.println("�Է��� ī���� ��ġ�� ������ϴ�.");
				continue;
			}
			if(sel1 != sel2 && ex.front[sel1] == ex.front[sel2]) {
				ex.back[sel1] = ex.front[sel1];
				ex.back[sel2] = ex.front[sel2];
				System.out.println("ī�带 �­��� !");
				cnt ++;
			}

		}//while(true)

	}

}
