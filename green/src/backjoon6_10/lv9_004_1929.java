package backjoon6_10;

import java.util.Scanner;

public class lv9_004_1929 {

	public static void main(String[] args) { // 1929
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int arr[] = new int[1000001];
		
		//�迭 �ε����� �°� ���ڸ� �־� �ʱ�ȭ . 
		for(int i=2; i<=y; i++) { 
			arr[i] = i;
		}
		
		//�� Ư�� ����� �迭���� �������� . 
		for(int i=2; i<= y; i++) {
			//���� �˻��Ϸ��� �ε����� 0 �̸� �ٷ� �����ɷ� �Ѿ�� �� 
			if(arr[i] == 0) continue;
			
			//2�� ������� �������� . j += i <<�� �� �����ؾ��� . 
			//�ڱ� �ڽ��� ������ ���� ����� ����°��� . 
			for(int j= 2*i; j<=y;  j+=i) {
				arr[j] = 0;
			}
		}
		
		for(int i=x; i<= y; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);				
			}
		}
		
		

		
		
		
    }
}