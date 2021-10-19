package lv10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ex001_002s {

	public static void main(String[] args) {
		// 타이머 만들기
		// ㄴ 입력값을 받고 (제한 시간)
		// ㄴ Thread.slepp() 메소드 활용.
		// ㄴ 초단위로 콘솔에 흘려가는 현재시간(남은시간)을 출력 .
		// ㄴ 제한시간이 끝나면 -> 프로그램 종료 . 
		Scanner sc = new Scanner(System.in);
		// 변수명1.format(변수명2)는 String값으로 반환받기때문에 값을 비교하고 싶다면 equals를써야함 .
		
		int min = 0;
		int sec = 0;
		
		try {
			System.out.println("분 : ");
			String input = sc.next();
			//분
			min = Integer.parseInt(input);
			//초
			System.out.println("초 : ");
			input = sc.next();
			sec = Integer.parseInt(input);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int n = min*60 + sec;
		
		while(n > 0) {
			Calendar calendar = Calendar.getInstance();
			long time = calendar.getTimeInMillis();
			SimpleDateFormat TIME = new SimpleDateFormat("yyyy년 mm월 d일 H시 m분 s초 SS밀리초");
			System.out.println(TIME.format(time)); // 흘러가고 있는 1초 갱신된 현재시간.
			
			System.out.printf("%d초 남음\n",n);
			
			n--;
			
			try {
				Thread.sleep(1000); //1초 딜레이
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
