package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex001_09 {
	final int SIZE = 9;
	int front[] = new int[SIZE];
	int back[] = new int[SIZE];
	
}
public class Ex001_009 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50[3단계] : 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */
		
		Ex001_09 ex = new Ex001_09();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int s = 0;
		while(s < ex.SIZE) {
			int check = 0;
			int rNum = rn.nextInt(9)+1;
			for(int i=0; i<ex.SIZE; i++) {
				if(rNum == ex.front[i]) {
					check = 1;
				}
			}
			if(check == 0) {
				ex.front[s] = rNum;
				s++;
			}
			
		}
		s = 0;
		while(s < ex.SIZE) {
			int check = 0;
			int rNum = rn.nextInt(9)+10;
			for(int i=0; i<ex.SIZE; i++) {
				if(rNum == ex.back[i]) {
					check = 1;
				}
			}
			if(check == 0) {
				ex.back[s] = rNum;
				s++;
			}
			
		}
		
		
		int x = 1;
		while(true) {
			System.out.println("front");
			for(int i=0; i<ex.SIZE; i++) {
				System.out.print(ex.front[i] + " ");
				if(i%3 == 2) {
					System.out.println();
				}
			}
//			System.out.println("back");
//			for(int i=0; i<ex.SIZE; i++) {
//				System.out.print(ex.back[i] + " ");
//				if(i%3 == 2) {
//					System.out.println();
//				}
//			}
			if(x == 19) {
				System.out.println("game clear !! ");
				break;
			}
			
			System.out.print("작은숫자부터 차례대로 위치(인덱스) 입력 : ");
			
			int sel = sc.nextInt();
			if(x <10 && ex.front[sel] == x) {
				ex.front[sel] = ex.back[sel];
				x++;
				continue;
			}
			if(x > 9 && ex.front[sel] == x) {
				ex.front[sel] = 0;
				x++;
			}
			
		}//while(true)

	}

}
