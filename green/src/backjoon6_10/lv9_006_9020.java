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
			
			for(int i=2; i<=x; i++) { //에라토스테네스의 체로 소수만 골라냄 
				if(arr[i] == 0) continue;
				
				for(int j=i*2; j<=x; j+=i) {
					arr[j] = 0;
				}
			}
			
			int cnt = 0;
			for(int i=2; i<x; i++) { //주어진 숫자에 따라서 소수의 갯수를 추출함 
				if(arr[i] != 0) {
					cnt ++;
				}
			}
			
			int arr2[] = new int[cnt];
//			System.out.println("cnt : " + cnt);
			int t = 0;
			for(int i=0; i<x; i++) { //  소수의 갯수만큼 새로운 배열을 만들어 안에 소수를 삽입.
				if(arr[i] != 0) {
					arr2[t] = arr[i];
					t++;
				}
			}
			int a = 0;

			a = 0;
			//골드바흐의 파티션에서는 x = a + b 일때 첫번째 소수(a)가 x/2 보다 작거나 같으므로 
			//a를 최대한 x/2보다 작거나 같게 설정함 . 
			while(true) {
				if(arr2[a] <= x/2) {
					a++;
				}
				else if(arr2[a] > x/2) {
					break;
				}
				
			
			}//while(true)2
			
			a--; //마지막에 넘어가서 while이 꺠지니깐 다시 a-- 를 해줌 . 
			
//			System.out.println("a : " + a);
			int temp = 0;
			
			// a + b = x 에서 
			// a가 -되면서 b가 소수인지 판별만 하면됨.
			// 굳이 b를 소수 2부터 max까지 반복문을 돌릴 필요가 없음 . 
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