package lv.test_4;

import java.util.Scanner;

public class lv4_33 {

	public static void main(String[] args) {
		/*
		 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)
		 * 1. �߰�
		 * . ���� �Է¹޾� ���������� �߰�
		 * 2. ����(�ε���)
		 * . �ε����� �Է¹޾� �ش� ��ġ�� �� ����
		 * 3. ����(��)
		 * . ���� �Է¹޾� ����
		 * . ���� �� �Է� �� ����ó��
		 * 4. ����
		 * . �ε����� ���� �Է¹޾� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = null;
		int size = 0;
		while(true) {
			if(arr != null) {
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}System.out.println();				
			}
			System.out.println("1.�߰�");
			System.out.println("2.����(�ε���)");
			System.out.println("3.����(��)");
			System.out.println("4.����");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("�߰��� �� �Է� : ");
				int x = sc.nextInt();
				int temp[] = arr;
				size ++;
				arr = new int[size];
				if(temp != null) {
					for(int i=0; i<temp.length; i++) {
						arr[i] = temp[i];
					}					
				}
				arr[size-1] = x;
			}
			if(sel == 2) {
				if(size != 0) {
					System.out.print("������ �ε��� �Է� : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx < size) {
						int temp[] = arr;
						size --;
						arr = new int[size];
						int x = 0;
						for(int i=0; i<temp.length; i++) {
							if(idx != i) {
								arr[x] = temp[i];
								x++;
							}
						}
					}
				}else System.out.println("������ �ε����� �����ϴ�.");
			}
			if(sel == 3) {
				if(size != 0) {
					System.out.print("������ �� �Է� : ");
					int value = sc.nextInt();
					int temp[] = arr;
					for(int i=0; i<arr.length; i++) {
						if(arr[i] == value) {
							size --;
						}
					}
					arr = new int[size];
					int x = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i] != value) {
							arr[x] = temp[i];
							x++;
						}
					}
				}else System.out.println("������ �ε����� �����ϴ�.");
			}
			if(sel == 4) {
				if(size != 0) {
					System.out.print("������ �ε��� �Է� : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx < size) {
						System.out.print("������ �� �Է� : ");
						int value = sc.nextInt();
						int temp[] = arr;
						size ++;
						arr = new int[size];
						int x = 0;
						for(int i=0; i<arr.length; i++) {
							if(i != idx ) {
								arr[i] = temp[x];
								x++;
							}
						}
						arr[idx] = value;
					}
				}
			}
		}
	}

}
