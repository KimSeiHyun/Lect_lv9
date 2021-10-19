package lv3;

import java.util.Scanner;

public class Ex01_10tc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// 예) 30 ==> b[] = {10,20,40,50,0};
		
		for(int i=0; i<5; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("갑 입력 : ");
		int data = sc.nextInt();
		int bIdx = 0; // 인덱스 분리 .
		for(int i=0; i<5; i++) { // a배열 순환
			if(a[i] != data) {
				b[bIdx] = a[i];
				bIdx ++;
			}
		}
		for(int i=0; i<5; i++) 
			System.out.print(b[i]+ " ");
		
		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};

		System.out.println("\n학번 또는 점수 입력 1001,40,1002,65,1003,70");
		data = sc.nextInt();
		
		int delIdx = -1; // 학번 기준 . 
		for(int i=0; i<6; i++) {
			if(data == c[i]) { // 인덱스 i 값에 대한 홀짝 확인  > 식별 가능 .
				//학번
				if (i % 2 == 0) {
					// i , i + 1
					delIdx = i;
				}
				//점수
				else {
					// i , i - 1 
					delIdx = i-1;
				}
			}
		}
		
		//처리
		int dIdx = 0;
		for(int i=0; i<6; i+=2) { // 학번기준 값 가져오기 +=2;
			if(i != delIdx) {
				d[dIdx] = c[i]; // 학번 
				d[dIdx+1] = c[i+1]; // 점수
				dIdx += 2;
			}
		}
		//출력
		for(int i = 0; i<6; i++) {
			System.out.print(d[i] + "  ");
		}

	}

}
