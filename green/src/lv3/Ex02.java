package lv3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		char code[] = {'a','b','c','d','e'};
		
		Scanner sc = new Scanner(System.in);
				
		// arr �迭���� �Է¹��� ���� ã���� -> �ش� �ڵ带 ���. 
		
		System.out.print("���� �Է� :");
		int data = sc.nextInt();
		
//		int idx = 0; // �ε��� ������ �����ϴ� ������ 0�̾ƴ� ������ �ʱ�ȭ�� ���� . 
		int idx = -1; // �ε��� ���� 0���� �����ϱ� ������ > ������ ���� �߸� ������ �� ���� . 
		for(int i=0; i<5; i++) {
			if(data == arr[i]) {
				idx = i;
			}
		}
		
		// idx Ȱ�� > code ��� . 
		System.out.println(code[idx]);
		
		if ( idx == -1 ) {
			System.out.println("�������� �ʴ� �� �Դϴ�.");
		}
		else {
			System.out.println(code[idx]);
			
		// �迭
		// �� �ڷ����� ���� �������� ��(������)�� ������ �� �ִ� . 
		// �� 0���� 1�� �����ϴ� �ε����� �����Ѵ�. !!
		
			// ����
			// �ڷ���Ű���� �迭�̸�[];
			
			// �ʱ�ȭ 
			// 1) = {}; // stack�̶�� ������ �����
			// 2) = new �ڷ���Ű����[����]; // heap�̶�� ������ �����.
			
			// �����
			// �迭��[index]
			
			
			
		}
		
	}

}
