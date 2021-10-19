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
		 * # 1 to 50[3�ܰ�] : 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
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
			
			System.out.print("�������ں��� ���ʴ�� ��ġ(�ε���) �Է� : ");
			
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
