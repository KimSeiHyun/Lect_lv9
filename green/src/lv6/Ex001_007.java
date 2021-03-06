package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex001_07 {
	
	final int SIZE = 10;
	int front[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int back[] = new int[SIZE];
	
}

public class Ex001_007 {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임 : 클래스 + 변수
		 * 1. front 배열 카드 10장을 섞는다.
		 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
		 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
		 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
		 */
		
		Ex001_07 ex = new Ex001_07();
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		//셔플
		int s = 0;
		while(s < 150) {
			int rIdx = rn.nextInt(ex.SIZE);
			int temp = ex.front[0];
			ex.front[0] = ex.front[rIdx];
			ex.front[rIdx] = temp;
			s++;
		}
		int cnt = 0;
		
		
		while(true) {
			System.out.println("front");
			for(int i=0; i<ex.SIZE; i++) {
				System.out.print(ex.front[i] + " ");
			}System.out.println();
			System.out.println("back");
			for(int i=0; i<ex.SIZE; i++) {
				System.out.print(ex.back[i] + " ");
			}System.out.println();
			
			if(cnt == 5) {
				System.out.println("모든 카드를 다 맞췃다 !! ");
				break;
			}
			System.out.print("카드의 위치 입력 :");
			int sel1 = sc.nextInt();
			int sel2 = sc.nextInt();
			if(sel1 == sel2) {
				System.out.println("같은 카드를 선택할 수 없습니다. ");
				continue;
			}
			if(sel1 <0 || sel1 >= ex.SIZE ||sel2 <0 || sel2 >= ex.SIZE ) {
				System.out.println("입력한 카드의 위치가 벗어났습니다.");
				continue;
			}
			if(sel1 != sel2 && ex.front[sel1] == ex.front[sel2]) {
				ex.back[sel1] = ex.front[sel1];
				ex.back[sel2] = ex.front[sel2];
				System.out.println("카드를 맞췃다 !");
				cnt ++;
			}

		}//while(true)

	}

}
