package lv.test_4;

import java.util.Scanner;

public class lv4_24s {

	public static void main(String[] args) {
		//����1) 1~�鸸 ������ ���ڸ� �Է¹ް� ��� ���� ��� 
        //(�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
		// ��)  123 ==> 2
		// ��)  1234 ==> ¦���� �ڸ��̴�
		// ��)  1 ==> 1
		// ��)  1234567 ==> 4
		
		// ��Ʈ �ڸ����� ���ϰ� �迭�� ������� �ϳ��� ���� 
		// ��) ==> 123 ==> 3 ==> arr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int arr[] = new int[x.length()];
		
		for(int i=0; i<arr.length; i++) {
			String a = x.charAt(i)+"";
			arr[i] = Integer.parseInt(a);
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		if(arr.length%2 == 0) {
			System.out.println("¦���� �ڸ��̴�.");
		}else {
			System.out.println(arr[x.length()/2]);
		}
	
	}

}
