package lv8;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex001_001 {

	public static void main(String[] args) {
		// ArrayList�� Ȱ���� ��Ʈ�ѷ� ����
		ArrayList<Integer> arr = new ArrayList<>();		
		Scanner sc = new Scanner(System.in);

		while(true){
			// 1.�߰� 2.���� 3.���� 4.���� 5.����
			System.out.println(arr);
			for(Integer i : arr) {
				System.out.println(i);
			}
			System.out.println("1.�߰�\n2.����\n3.����\n4.����\n5.����");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("�߰��� �� �Է� : ");
				Integer x = new Integer (sc.nextInt());
				arr.add(x);
			}
			if(sel == 2) {
				System.out.println("1.�ε����� ����\n2.������ ����");
				int sel2 = sc.nextInt();
				if(sel2 == 1) {
					System.out.print("������ �ε��� �Է� : ");
					int idx = sc.nextInt();
					arr.remove(idx);
				}
				if(sel2 == 2) {
					System.out.println("������ �� �Է� : ");
					Integer data = sc.nextInt();
					arr.remove(data);
				}
			}
			if(sel == 3) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				Integer x = new Integer(sc.nextInt());
				arr.add(idx, x);
			}
			if(sel == 4) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				Integer x = new Integer(sc.nextInt());
				arr.set(idx, x);
			}
			if(sel == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
		}


	}
}