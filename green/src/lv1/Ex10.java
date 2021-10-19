package lv1;

// 1. Random 클래스를 import  항상 임폴트는 메인패키지 바로 밑에 . 
import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		// 랜덤의 사용
		// Random : 임의의 난수 . 

		Random ran = new Random();
		
		// 1~10까지의 정수 중에서 랜덤값을 추출 후, 출력.  
		int rNum = ran.nextInt();
		System.out.println((rNum));
		
		rNum = ran.nextInt(10); // 0~9
		System.out.println(rNum);
		
		rNum = ran.nextInt(10) +1 ; // 1~10 
		System.out.println(rNum);
	}

}
