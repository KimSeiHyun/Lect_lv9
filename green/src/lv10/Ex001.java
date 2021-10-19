package lv10;

import java.text.SimpleDateFormat;
import java.util.Calendar;


class UserManager {
	
	// 디자인 패턴 중 Singleton Pattern : 프로그램 안에서 단 하나의(유일한) instance 를 허용하게끔 처리하는 것 .
	
	// 1. 생성한 객체를 instance 변수에 담아 private 처리 
	private static UserManager instance = new UserManager();
	// 2. 기본 생성자를 다른곳에서 함부로 쓰지 못하게 private 처리 . (타 클래스에서 1개를 초과하는 생성을 X)
	private UserManager() {}
	// 3. 유일한 instance를 -> getter를 통해 참조할 수 있도록 제공 . 
	public static UserManager getInstance() {
		return instance;
	}
}

class MainControl {
	
	UserManager um = UserManager.getInstance();
//	UserManager um = UserManager.instance;
//	UserManager instance = new UserManager();
	
}
public class Ex001 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance(); // new Calendar();
		long time = calendar.getTimeInMillis(); 
		// 현재 시간을 반환 : 1970년 1월 1일 00시 00분 00초 를 기준으로 ~ 흘러간 ms초를 반환 . 
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html
		System.out.println(time);
		SimpleDateFormat TIME = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 H시 m분 s초 S밀리초");
		System.out.println(TIME.format(time));
		SimpleDateFormat year = new SimpleDateFormat("yyyy년");// 년 월 일 요일 시 분 초 밀리초
		System.out.println(year.format(time));
		SimpleDateFormat month = new SimpleDateFormat("MM월");
		System.out.println(month.format(time));
		SimpleDateFormat day = new SimpleDateFormat("dd일");
		System.out.println(day.format(time));
		SimpleDateFormat  dayName = new SimpleDateFormat("E요일");
		System.out.println(dayName.format(time));
		SimpleDateFormat hour = new SimpleDateFormat("H시");
		System.out.println(hour.format(time));
		SimpleDateFormat minute = new SimpleDateFormat("m분");
		System.out.println(minute.format(time));
		SimpleDateFormat second = new SimpleDateFormat("s초");
		System.out.println(second.format(time));
		SimpleDateFormat milliSecond = new SimpleDateFormat("S밀리초");
		System.out.println(milliSecond.format(time));
		System.out.println("------------------------------------");
		System.out.println(calendar.get(Calendar.YEAR)+"년");			// 년
		System.out.println(calendar.get(Calendar.MONTH)+1+"월");			// 월 : +1 해야함 
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"일");	// 일 
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)+"요일");	// 요일 : (일 월 화 수 목 금 토)
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)+"시");		// 시
		System.out.println(calendar.get(Calendar.MINUTE)+"분");			// 분 
		System.out.println(calendar.get(Calendar.SECOND)+"초");			// 초 
		System.out.println(calendar.get(Calendar.MILLISECOND)+"밀리초");	// 밀리초
		//변수명1.format(변수명2)는 String값으로 반환받기때문에 값을 비교하고 싶다면 equals를써야함 .

		
	}

}
