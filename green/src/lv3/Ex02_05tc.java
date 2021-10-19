package lv3;

import java.util.Scanner;

public class Ex02_05tc {

	public static void main(String[] args) {
		/*
		 * [반복문 심화예제]
		 * 
		 * 1. -1이 나올 때까지 일련의 수를 입력받는다.
		 * 2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
		 * 3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
		 * 4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
		 * 
		 * 예) 
		 * result 값 입력 : 99
		 * 
		 * 입력 : 10
		 * 입력 : 99
		 * 입력 : 20
		 * 입력 : 99
		 * 입력 : 30
		 * 입력 : 99
		 * 입력 : 10
		 * 입력 : -1
		 * 
		 * 결과 : key값 99가 첫번재 나타난 것은 2번째 이다.
		 */

		Scanner sc = new Scanner(System.in);
        int result = 99;

        // 경우의 수 ==> -1 ==> 키는 입력받은적없다.
        // 경우의 수 ==> 99 , 77 , -1 ==> 키는 1번이다 
        // 경우의 수 ==> 55, 99 , 99, 99, 99, 3 , -1 ==> 키는 2번이다

        System.out.println("키값 설정 : ");
        int key = sc.nextInt();
        
        int cnt = 1;
        
        int check = -1;
        
		boolean  isRun = true;
		while(isRun) {
			System.out.println("입력 : ");
			int input = sc.nextInt();
			
			if(input == -1) {
				isRun = false;
			}
			else {
				if(input == key && check == -1) {
					check = cnt ;
				}
			}
			
			cnt ++;
		}
		if(check == -1) {
			System.out.println("키값을 입력받은 적이 없습니다 . ");
		}
		else { 
			System.out.printf("키값이 %d번째에서 등장했습니다 .",check);
		}
		
		
		
		
		
	}

}
