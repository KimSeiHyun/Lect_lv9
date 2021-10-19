package lv6;

import java.util.Scanner;

class Ex006 {
	
	int arr[] = { 0, 0, 1, 0, 0, 2, 0, 0, 1, 0, 0 };
	
	
}
public class Ex001_006 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[3단계] : 클래스 + 변수
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
		 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
		 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
		 * 예) 
		 *  0 0 0 0 0 0 0 2 
		 *  왼쪽(1) 오른쪽(2) : 2
		 *  
		 *  2 0 0 0 0 0 0 0 
		 */
		Ex006 ex = new Ex006();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i=0; i<ex.arr.length; i++) {
				if(ex.arr[i] == 1) {
					System.out.print("■ ");
				}
				else if (ex.arr[i] == 2) {
					System.out.print("옷 ");
				}
				else System.out.print(ex.arr[i] + " ");
			}System.out.println();
			
			System.out.println("1.왼쪽    2.오른쪽    3.격파   ");
			int sel = sc.nextInt();
			
			if( sel == 1) {
				for(int i=1; i<ex.arr.length; i++) {
					if(ex.arr[i] == 2 && ex.arr[i-1] == 0) {
						ex.arr[i-1] = 2;
						ex.arr[i] = 0;
					}
				}
			}
			else if (sel == 2) {
				for(int i=0; i<ex.arr.length-1; i++) {
					if(ex.arr[i] == 2 && ex.arr[i+1] == 0) {
						ex.arr[i+1] = 2;
						ex.arr[i] = 0;
						break;
					}
				}
			}
			else if (sel == 3) {
				for(int i=1; i<ex.arr.length-1; i++) {
					if(ex.arr[i] == 2 &&ex.arr[i+1] == 1) {
						ex.arr[i+1] = 0;
						System.out.println("격파 !! ");
					}
					if(ex.arr[i] == 2 &&ex.arr[i-1] == 1) {
						ex.arr[i-1] = 0;
						System.out.println("격파 !! ");
					}
					
				}
			}
			
			
		}//while(true)

	}

}
