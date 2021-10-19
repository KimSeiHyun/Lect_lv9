package lv.test_1;

import java.util.Scanner;

public class lv1_30 {

	public static void main(String[] args) {
		/*
		 * # 놀이기구 이용제한
		 * 1. 키를 입력받는다.
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
		 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
		 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력해주세요 ! ");
		int x = sc.nextInt();
		
		if(x >= 120 ) {
			System.out.println("놀이기구 이용가능 !! ");
		}else {
			System.out.println("놀이기구 이용 불가능 ! ");
			System.out.println("단 , 부모님과 함께 오셧나요 ? yes:1  no:0");
			int y = sc.nextInt();
			if (y == 1) {
				System.out.println("놀이기구 이용 가능 !! ");
			}
			else {
				System.out.println("놀이기구 이용 불가능 ..");
			}
		}
			
		
		
		
		
	}

}
