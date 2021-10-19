package lv1;
import java.util.Scanner;
public class Ex12_6 {

	public static void main(String[] args) {
		/*
		 * # 놀이기구 이용제한
		 * 1. 키를 입력받는다.
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
		 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
		 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
		 *    시작 : 10 : 03
		 *    종료 : 10 : 11
		 *    소요시간 : 8분
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("놀이기구 이용제한 !");
		System.out.println("자신의 키를 입력하세요 !");
		int cm = sc.nextInt();
		
		
		if (cm > 120 ) {
			System.out.println("놀이기구를 이용할 수 있습니다.");
		}
		else if ( cm < 120) {
		System.out.println("놀이기구를 이욯불가.");
		System.out.println("부모님과 함께 오셧나요 ?  yes : 1  , no : 0");
		int to = sc.nextInt();
		 if ( to == 1 ) {
			 System.out.println("놀이기구 사용 가능 !");
		 }
		 else {
			 System.out.println("놀이기구 이용불가 !");
		 }
		
		}

	}

}
