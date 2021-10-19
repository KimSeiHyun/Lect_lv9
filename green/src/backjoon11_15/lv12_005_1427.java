package backjoon11_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class lv12_005_1427 {

	public static void main(String[] args) { // 1427
		Scanner sc= new Scanner(System.in);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String x = sc.next();
		String arr[] = new String[x.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = x.charAt(i)+"";
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
    }
	
}
