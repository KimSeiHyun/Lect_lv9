package backjoon6_10;

import java.util.Scanner;

public class lv9_006_9020 {

	public static void main(String[] args) { // 9020
		Scanner sc= new Scanner(System.in);
		int q = sc.nextInt();
		for(int i2= 0; i2<q; i2++) {
			int x = sc.nextInt();
			int arr[] = new int[10001];
			int A[] = new int[10000];
			int B[] = new int[10000];
			for(int i=2; i<10001; i++) {
				arr[i] = i;
			}
			
			for(int i=2; i<=x; i++) { //�����佺�׳׽��� ü�� �Ҽ��� ��� 
				if(arr[i] == 0) continue;
				
				for(int j=i*2; j<=x; j+=i) {
					arr[j] = 0;
				}
			}
			
			int cnt = 0;
			for(int i=2; i<x; i++) { //�־��� ���ڿ� ���� �Ҽ��� ������ ������ 
				if(arr[i] != 0) {
					cnt ++;
				}
			}
			
			int arr2[] = new int[cnt];
//			System.out.println("cnt : " + cnt);
			int t = 0;
			for(int i=0; i<x; i++) { //  �Ҽ��� ������ŭ ���ο� �迭�� ����� �ȿ� �Ҽ��� ����.
				if(arr[i] != 0) {
					arr2[t] = arr[i];
					t++;
				}
			}
			int a = 0;

			a = 0;
			//�������� ��Ƽ�ǿ����� x = a + b �϶� ù��° �Ҽ�(a)�� x/2 ���� �۰ų� �����Ƿ� 
			//a�� �ִ��� x/2���� �۰ų� ���� ������ . 
			while(true) {
				if(arr2[a] <= x/2) {
					a++;
				}
				else if(arr2[a] > x/2) {
					break;
				}
				
			
			}//while(true)2
			
			a--; //�������� �Ѿ�� while�� �����ϱ� �ٽ� a-- �� ���� . 
			
//			System.out.println("a : " + a);
			int temp = 0;
			
			// a + b = x ���� 
			// a�� -�Ǹ鼭 b�� �Ҽ����� �Ǻ��� �ϸ��.
			// ���� b�� �Ҽ� 2���� max���� �ݺ����� ���� �ʿ䰡 ���� . 
			while(true) {
				 temp = x-arr2[a];
				 int cnt2 = 0;
				for(int i=1; i<=temp; i++) {
					if(temp%i == 0) {
						cnt2 ++;
					}
				}
				if(cnt2 == 2) {
					break;
				}
				if(a>= 1) {
					a--;					
				}
			}
//			System.out.println("a : " + a);
//			System.out.println("arr2[a] : " + arr2[a]);
//			System.out.println("temp : " + temp);
			System.out.println(arr2[a] + " " + temp);
		}

    }
}