package lv8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex001_001tc {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			// print
			System.out.println("size : " + arr.size());
			for(Integer i : arr) {
				System.out.print(i + " ");
			}System.out.println();
			
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����(�ε���)");
			System.out.println("4.����(��)");
			System.out.println("5.����");
			System.out.println("6.����");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("�߰��� �� :");
				Integer data = sc.nextInt();
				if(arr.add(data)) {
					System.out.println("�߰��Ϸ�");
				}else {
					System.out.println("����");
				}
			}
			if(sel == 2) {
				System.out.print("������ �ε��� : ");
				int idx = sc.nextInt();
				System.out.print("������ �� : ");
				Integer data = new Integer(sc.nextInt());
				arr.add(idx, data);
			}
			if(sel == 3) {
				System.out.print("������ �ε��� : ");
				int delIdx = sc.nextInt();
				arr.remove(delIdx);
				
			}
			if(sel == 4) {
				System.out.print("������ �� : ");
				Integer delData = new Integer(sc.nextInt());
				
				if(arr.remove(delData)) {
					System.out.println("�����Ϸ�");
				}
				else {
					System.out.println("������ �� �ٽ� Ȯ�� . ");
				}
			}
			if(sel == 5) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				Integer data = new Integer(sc.nextInt());
				arr.set(idx, data);
			}
			if(sel == 6) {
				break;
			}
		}

	}
}