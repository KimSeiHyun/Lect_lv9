package lv10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ex001_002 {

	public static void main(String[] args) {
		// 타이머 만들기
		// ㄴ 입력값을 받고 (제한 시간)
		// ㄴ Thread.slepp() 메소드 활용.
		// ㄴ 초단위로 콘솔에 흘려가는 현재시간(남은시간)을 출력 .
		// ㄴ 제한시간이 끝나면 -> 프로그램 종료 . 
		Scanner sc = new Scanner(System.in);
		// 변수명1.format(변수명2)는 String값으로 반환받기때문에 값을 비교하고 싶다면 equals를써야함 .
		System.out.println("타이머를 몇초후에 멈추시겠습니까?(원하시는 초단위만큼 입력해주세요)");
		int n = sc.nextInt();
		int m = 0;
		while( m <= n) {
			
			m++;
			Calendar calendar = Calendar.getInstance();
			long time = calendar.getTimeInMillis();
//			System.out.println(time);
			SimpleDateFormat TIME = new SimpleDateFormat("yyyy년 mm월 d일 H시 m분 s초 SS밀리초");
			System.out.println("현재시간 : "+TIME.format(time));
			System.out.println("타이머 종료까지 남은 초 : " + (n-m+1));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		


	}

}
