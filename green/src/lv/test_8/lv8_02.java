package lv.test_8;

import java.util.ArrayList;
import java.util.Scanner;

public class lv8_02 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();		
		Scanner sc = new Scanner(System.in);
		while(true){
			for(int i : arr) System.out.println(i);
			// 1.�߰� 2.���� 3.���� 4.����
			System.out.println("1.�߰�\n2.����\n3.����\n4.����");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("�߰��� �� �Է� :");
				arr.add(sc.nextInt());
			}
			if(sel == 2) {
				System.out.println("1.�ε����� ����");
				System.out.println("2.������ ����");
				int sel2 = sc.nextInt();
				if(sel2 == 1) {
					System.out.print("������ �ε��� �Է� : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx <arr.size()) {
						
					}
					arr.remove(idx);
				}
				if(sel2 == 2) {
					System.out.print("������ �� �Է�: ");
					Integer temp = sc.nextInt();
					arr.remove(temp);
				}
			}
			if(sel == 3) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				int temp = sc.nextInt();
				arr.add(idx , temp);
				
			}
			if(sel == 4) {
				System.out.println("�����մϴ� .");
				break;
			}
			
		}//while


	}
}