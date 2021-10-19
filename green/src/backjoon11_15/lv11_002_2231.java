package backjoon11_15;

import java.util.Random;
import java.util.Scanner;

public class lv11_002_2231 {

	public static void main(String[] args) { // 2231
		Scanner sc= new Scanner(System.in);
		Random rn = new Random();
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		int temp = n;
		while(temp > 0) { // 10의 자리를 깍아가며 자릿수를 샘 . 
			temp = temp/10;
			cnt++;
		}
	//	System.out.println("cnt : " + cnt);
		for(int i=n-cnt*9; i<n; i++) { // 주어진수 - 자릿수*9부터 시작(이유는모름 검색하니깐 그렇게하램)
			sum = 0;
			temp = i;
			sum += i;
			while(temp >0) {
				sum += temp%10;
				temp = temp/10;
				
			}
			if(sum == n) { // 답을 찾으면 닶을 저장하고 반복문 바로 빠져나옴 
				sum = i;
			//	System.out.println(i);
				break;
			}
			if(i == n-1) { // for문이 다 돌떄가지 답을 못찾으면 sum을 0으로 초기화
				sum = 0;
				break;
			}
		}
		if(sum != 0) { // 답이있으면 출력 없으면 0 출력 
			System.out.println(sum);
		}
		else System.out.println(0);
		
		
    }
	
}