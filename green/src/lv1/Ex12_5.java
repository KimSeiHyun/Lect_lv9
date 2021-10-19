package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex12_5 {

	public static void main(String[] args) {
		/*
		 * # 코인 게임
		 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
		 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		 * 3. 동전의 앞뒷면을 맞추는 게임이다.
		 * 시작 : 9:47
		 * 종료 : 9:59
		 * 소요시간 : 12분
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("동전 앞뒤 맞추기 게임 ! ");
		System.out.println("숫자를 입력해주세요 : 앞 : 0 , 뒤 : 1");
		int coin = ran.nextInt(2);
		int incoin = sc.nextInt();
		
		if (coin == 1 && incoin == 1) {
			System.out.println("정답 !");
		}
		else if (coin == 1 && incoin == 0) {
			System.out.println("틀렸습니다.");
		}
		else if (coin == 0 && incoin == 0) {
			System.out.println("정답 ! ");
		}
		else if (coin == 0 && incoin == 1) {
			System.out.println("틀렸습니다.");
		}
		else {
			System.out.println("범위를 벗어난 숫자입니다. .");
		}
		

	}

}
