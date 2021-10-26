package basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Timer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int sec = 0;
		
		System.out.println("타이머 설정>>");
		try {
			System.out.print("분 : ");
			String input = sc.next();
			
			min = Integer.parseInt(input);
			
			System.out.print("초 : ");
			input = sc.next();
			
			sec = Integer.parseInt(input);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int n = min*60 + sec;
		while(0 < n){
			Calendar cd = Calendar.getInstance();
			long time = cd.getTimeInMillis();
			
			SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분 ss초 ms밀리초");
			System.out.println(sdf.format(time) + " (" + n + "초 남음)");
			
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