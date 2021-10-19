package backjoon6_10;

import java.util.Scanner;

public class lv9_004_1929 {

	public static void main(String[] args) { // 1929
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int arr[] = new int[1000001];
		
		//배열 인덱스에 맞게 숫자를 넣어 초기화 . 
		for(int i=2; i<=y; i++) { 
			arr[i] = i;
		}
		
		//각 특정 배수를 배열에서 지워나감 . 
		for(int i=2; i<= y; i++) {
			//만약 검사하려는 인덱스가 0 이면 바로 다음걸로 넘어가게 함 
			if(arr[i] == 0) continue;
			
			//2의 배수부터 지워나감 . j += i <<를 잘 생각해야함 . 
			//자기 자신은 지우지 말고 배수를 지우는거임 . 
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