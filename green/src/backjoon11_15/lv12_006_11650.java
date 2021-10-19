package backjoon11_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class lv12_006_11650 {
								¹ÌÇØ°á
	public static void main(String[] args) { // 11650
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		int arr[][] = new int[t][2];
		for(int i=0; i<t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i][0] = x;
			arr[i][1] = y;
		}

		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(i != j && arr[i][0]  == arr[j][0] && arr[i][1] > arr[j][1]) {
					int temp1 = arr[i][0];
					int temp2 = arr[i][1];
					
					arr[i][0] = arr[j][0];
					arr[i][1] = arr[j][1];
					
					arr[j][0] = temp1;
					arr[j][1] = temp2;
				}
				if(i != j && arr[i][0]  > arr[j][0]) {
					int temp1 = arr[i][0];
					int temp2 = arr[i][1];
					
					arr[i][0] = arr[j][0];
					arr[i][1] = arr[j][1];
					
					arr[j][0] = temp1;
					arr[j][1] = temp2;
				}
			}
		}

		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		
    }
	
}