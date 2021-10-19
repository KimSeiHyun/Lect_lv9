package backjoon6_10;

import java.util.Scanner;

public class lv8_008_10757 {

	public static void main(String[] args) { // 10757
		Scanner sc= new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String temp = "";
		String temp2 = "";
		int r1 = a.length(); 
		int r2 = b.length(); 
		int arr1[];
		int arr2[];
		if(r1 > r2) { //길이가 다를경우 0으로 공백을 채워 길이를 맞춰준다 . 
			arr1 = new int[r1];
			arr2 = new int[r1];
			
			for(int i=0; i<r1-r2; i++) {
				temp += "0";
			}
			temp += b;
			b = temp;
		}else if(r1 < r2) {
			arr1 = new int[r2];
			arr2 = new int[r2];
			
			for(int i=0; i<r2-r1; i++) {
				temp += "0";
			}
			temp += a;
			a = temp;
		}else {
			arr1 = new int[r2];
			arr2 = new int[r2];
		}
		for(int i=0; i<arr1.length; i++) {
			arr1[i] =Integer.parseInt(a.charAt(i)+"");
			arr2[i] =Integer.parseInt(b.charAt(i)+"");
		}
		
		//수를 더할때 왼쪽 끝에서 하지말고 오른쪽 끝부터 더해나가야함 . 
		for(int i=arr1.length-1; i>=0; i--) {
			arr1[i] += arr2[i];
			if(i != 0 && arr1[i] >= 10) {
				arr1[i-1] += 1;
				arr1[i] = arr1[i]%10;
			}
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"");
		}

		
    }
}