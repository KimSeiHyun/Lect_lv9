package lv.test_3;

import java.util.Scanner;

public class lv3_23 {

	public static void main(String[] args) {
		//����1) �߰� �� �����ϰ� ���� �Է��ϸ� 10 , 20 �ڿ� �����Ѵ�.
		// �ִ� 5������ ����
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {

			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			
			System.out.println("[1]�߰�");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(cnt == 5) {
					System.out.println("���̻� �߰��� ������ �����ϴ�.");
					break;
				}
				System.out.print("�߰��� �� �Է� : ");
				int data = sc.nextInt();
				arr[cnt] = data;
				cnt++;
			}
			
		}//w
		
	}


}