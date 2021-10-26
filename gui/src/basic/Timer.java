package basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Timer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int sec = 0;
		
		System.out.println("Ÿ�̸� ����>>");
		try {
			System.out.print("�� : ");
			String input = sc.next();
			
			min = Integer.parseInt(input);
			
			System.out.print("�� : ");
			input = sc.next();
			
			sec = Integer.parseInt(input);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int n = min*60 + sec;
		while(0 < n){
			Calendar cd = Calendar.getInstance();
			long time = cd.getTimeInMillis();
			
			SimpleDateFormat sdf = new SimpleDateFormat("hh�� mm�� ss�� ms�и���");
			System.out.println(sdf.format(time) + " (" + n + "�� ����)");
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
			n --;
		}
		System.out.println("Timeout!!!");
		
	}

}