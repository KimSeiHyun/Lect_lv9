package lv.test_4;

import java.util.Scanner;

public class lv4_15s {

	public static void main(String[] args) {
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		Scanner sc = new Scanner(System.in);
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		System.out.println("문제1 : 각층별 관리비 합 출력");
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<3; j++) {
				sum+= pay[i][j];
			}
			System.out.print(sum + " ");
		}System.out.println();
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.println("문제2 : 호를 입력하면 관리비 출력");
		System.out.print("호를 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == num) {
					System.out.println(pay[i][j]);
				}
			}
		}
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		System.out.println("문제3 : 관리비가 가장 많은집 , 적은집 출력. ");
		int max = 0;
		int min = pay[0][0];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(max < pay[i][j]) {
					max = pay[i][j];
					a = i;
					b = j;
				}
				if(min > pay[i][j]) {
					min = pay[i][j];
					c = i;
					d = j;
				}
			}
		}
		System.out.println("가장 많은 집 : " + apt[a][b]);
		System.out.println("가장 적은 집 : " + apt[c][d]);
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		System.out.println("문제4 : 호 2개를 입력하면 관리비 교체 .");
		System.out.println("첫번째 호를 입력해주세요 .");
		int num1 = sc.nextInt();
		System.out.println("두번째 호를 입력해주세요 .");
		int num2 = sc.nextInt();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == num1) {
					a=i;
					b=j;
				}
				if(apt[i][j] == num2) {
					c=i;
					d=j;
				}
			}
		}
		int temp = pay[a][b];
		pay[a][b] = pay[c][d];
		pay[c][d] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}

	}

}
