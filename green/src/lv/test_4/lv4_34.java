package lv.test_4;

import java.util.Scanner;

public class lv4_34 {

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
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<3; j++) {
				sum += pay[i][j];
			}
			System.out.println(sum);
		}
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.print("호 입력 : ");
		int ho = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == ho) {
					System.out.println(pay[i][j]);
				}
			}
		}
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int max = 0 ;
		int min = 9999;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(pay[i][j] > max ) {
					max = pay[i][j];
				}
				if(pay[i][j] < min) {
					min = pay[i][j];
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(max == pay[i][j]) {
					System.out.println("가장 많이 나온 집 : " + apt[i][j]);
				}
				if(min == pay[i][j] ) {
					System.out.println("가장 적게 나온 집 : " + apt[i][j]);
				}
			}
		}
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		System.out.println("문제4 : 호 2개를 입력하면 관리비 교체 . ");
		System.out.print("첫번쨰 호 : ");
		int ho1 = sc.nextInt();
		int ho1Idx1 = -1;
		int ho1Idx2 = -1;
		System.out.print("두번쨰 호 : ");
		int ho2 = sc.nextInt();
		int ho2Idx1 = -1;
		int ho2Idx2 = -1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == ho1) {
					ho1Idx1 = i;
					ho1Idx2 = j;
				}
				if(apt[i][j] == ho2) {
					ho2Idx1 = i;
					ho2Idx2 = j;
				}
			}
		}
		int temp = pay[ho1Idx1][ho1Idx2];
		pay[ho1Idx1][ho1Idx2] = pay[ho2Idx1][ho2Idx2];
		pay[ho2Idx1][ho2Idx2] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(pay[i][j] + " ");
			}System.out.println();
		}
	}

}
