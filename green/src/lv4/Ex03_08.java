package lv4;

import java.util.Scanner;

public class Ex03_08 {

	public static void main(String[] args) {
		
		//문제1) 1~1.000.000(백만) 사이의 숫자를 입력받고 가운데 숫자 출력 
        //(단 ! 짝수자리의 수는 짝수자리라고 출력)
		// 예)  123 ==> 2
		// 예)  1234 ==> 짝수의 자리이다
		// 예)  1 ==> 1
		// 예)  1234567 ==> 4
		// 힌트 자리수를 구하고 배열을 만든다음 하나씩 저장 
		// 예) ==> 123 ==> 3 ==> arr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		double num = sc.nextInt();
		double b = 10;
		int cnt = 0;
		double a = 0;
		while(t) {
			
			a = num/b;
			b *= 10;
			cnt++;
			System.out.println(a);
			if (a < 1) {
				break;
			}
		}
		System.out.println("자릿수는 : " + cnt);
		if(cnt%2 == 0) {
			System.out.println(num + " 은 짝수의 자리수이다 .");
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr[] = new int[num];
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		if(num%2 == 0) {
//			System.out.println("짝수이다 . ");
//		}
//		System.out.println();
//		if(num%2 == 1) {
//		int a = num /2;
//		System.out.printf("중간에 있는 숫자는 %d 이다 .",arr[a]);
//		}
	}

}
