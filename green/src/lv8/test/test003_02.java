package lv8.test;

//���� 09:22
//���� 09:42
//�ҿ� 00:20

import java.util.ArrayList;
import java.util.Scanner;

public class test003_02 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(Integer i : arr) {
				System.out.println(i);
			}
			System.out.println("1.�߰�\n2.����\n3.����(�ε���)\n4.����(��)\n5.����\n6.���ϴ��ε������\n7.����\n8.���������\n9.��ü���\n10.��ü����.");
			int sel = sc.nextInt();
			if(sel  == 1) {
				System.out.print("�߰��� �� �Է� : ");
				arr.add(sc.nextInt());
			}
			if(sel  == 2) {
				System.out.print("������ �ε��� �Է� : ");
				int idx  =sc.nextInt();
				System.out.print("������ �� �Է� : ");
				Integer x = sc.nextInt();
				if(idx >=0 && idx <=arr.size()) {
					arr.add(idx, x);					
				}
			}
			if(sel  == 3) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				if(arr.size() != 0 && idx >= 0 && idx < arr.size()) {
					arr.remove(idx);					
				}
			}
			if(sel  == 4) {
				System.out.print("������ �� �Է� : ");
				Integer x = sc.nextInt();
				arr.remove(x);
			}
			if(sel  == 5) {
				arr.sort(null);
			}
			if(sel  == 6) {
				System.out.print("�ε��� �Է� : ");
				int idx = sc.nextInt();
				if(arr.size() != 0 && idx >=0 && idx < arr.size()) {
					System.out.printf("%d�ε����� ���� : %d" ,idx , arr.get(idx));
					System.out.println();	
				}
			}
			if(sel  == 7) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				Integer x = sc.nextInt();
				if(arr.size() != 0 && idx >=0 && idx <arr.size()) {
					arr.set(idx, x);					
				}
			}
			if(sel  == 8) {
				System.out.printf("arr�� size�� : %d\n",arr.size());
			}
			if(sel  == 9) {
				System.out.println(arr);
			}
			if(sel  == 10) {
				arr.clear();
			}
			
		}
	}

}
