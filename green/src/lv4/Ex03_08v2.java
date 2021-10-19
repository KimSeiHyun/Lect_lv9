package lv4;

import java.util.Scanner;

public class Ex03_08v2 {

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
		int num = sc.nextInt();
		double b = 10;
		double cnt = 0;
		double a = 0;
		while(t) {
			
			a = num/b;
			b *= 10;
			cnt++;
			if (a < 1) {
				break;
			}
		}
		int arr[] = new int[(int)cnt];
		System.out.println("자릿수는 : " + cnt);
		while (t) {
			double x2 = a*10;
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(a*10)%10;
				a *= 10;
			}
			break;
		}
		int y = (int)cnt/2;
		if(cnt %2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		}
		else {
		System.out.println(num + "의 자리수의 가운데 숫자는 :" + arr[y] );
		}
		
		
	}//c

}
