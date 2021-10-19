package lv4.test;

import java.util.Scanner;

public class test03 {

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
		// 시작 10:56
		// 종료 11:11
		// 소요 00:15
		
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		System.out.println("문제1");
		
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<3; j++) {
				sum += pay[i][j];
			}
			System.out.print(sum + " ");
		}System.out.println();
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.println("문제2");
		System.out.println("호를 입력하면 관리비 출력");
		System.out.print("호를 입력  : ");
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
		System.out.println("문제3");
		int max = 0;
		int min = pay[0][0];
		
		int a = -1;
		int b = -1;
		int c = -1;
		int d = -1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if( max < pay[i][j]) {
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
		
		
		System.out.println("관리비가 가장 많이 나온 집 : " + apt[a][b]);
		System.out.println("관리비가 가장 적게 나온 집 : " + apt[c][d]);
		// 문제 4) 호 2개를 입력하면 관리비 교체
		System.out.println("문제4");
		System.out.println("호2개를 입력하면 관리비 교체 .");
		System.out.println("첫번째 호 입력 ");
		int x = sc.nextInt();
		System.out.println("두번째 호 입력 ");
		int y = sc.nextInt();
		int temp = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == x) {
					a = i;
					b = j;
				}
				if(apt[i][j] == y) {
					c = i;
					d = j;
				}
			}
		}
		
		temp = pay[a][b];
		pay[a][b] = pay[c][d];
		pay[c][d] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		
	}//c

}
