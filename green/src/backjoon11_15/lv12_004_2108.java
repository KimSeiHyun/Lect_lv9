package backjoon11_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class lv12_004_2108 {

	public static void main(String[] args) { // 2108
			Scanner sc= new Scanner(System.in);
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int t = sc.nextInt();
			int arr[] = new int[t];
			int check[] = new int[8001];
			int check2[] = new int[8001];
			//
			double sum = 0;
			for(int i=0; i<t; i++ ) {
				int num = sc.nextInt();
				arr[i] = num;
				sum += num;
			}
			Arrays.sort(arr);
		//	for(int i=0; i<arr.length; i++) {
		//		System.out.println(arr[i]);
		//	}
		//	System.out.println("1.»ê¼úÆò±Õ");
			System.out.println(Math.round(sum/t));
			int temp = t/2;
		//	System.out.println("2.Áß¾Ó°ª");
			System.out.println(arr[temp]);
		//	System.out.println("3.ÃÖºó°ª");
			
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] < 0) {
					check2[arr[i]+4000] ++;
				}else if(arr[i] > 0) {
					check2[arr[i]+4000] ++;
				}else {
					check2[4000] ++;
				}
			}
			
			int max = 0;
			for(int i=0; i<check2.length;i ++) {
				if(check2[i] > max ) {
					max = check2[i];
				}
			}
			int c = 0;
			int c1 = 0;
			int idx = -1;
			for(int i=0; i<check2.length; i++) {
				if(check2[i] == max && c == 1) {
					System.out.println(i-4000);
					c1 = 1;
					break;
				}
				if(check2[i] == max && c == 0) {
					c = 1;
					idx = i;
				}
				
			}
			if(c1 == 0) {
				System.out.println(idx - 4000);
			}
		//	System.out.println("4.¹üÀ§");
			System.out.println(arr[arr.length-1] - arr[0]);
			
	    }
		
	}
