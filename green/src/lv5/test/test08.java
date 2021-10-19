package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		
		//시작시간 10 : 15
		//종료시간 18 : 14
		//소요시간 07 : 59
		
		//시직시간 00 : 01
		//종료시간 00 : 41
		//소요시간 00 : 40
		
		//총 소요시간 08:39
		
		
		/*
		 * # 크레이지 아케이드
		 * 1. 맵의 크기는 7 x 7 이다. 
		 * 2. 상(1)하(2)좌(3)우(4)로 이동이 가능하며,
		 *    폭탄설치(5), 폭파(6)로 설정한다. 
		 * 3. 벽(3), 플레이어(2), 폭탄(9), 아이템(4)로 설정한다.
		 * 4. 단, 폭탄이 설치된 순서대로 터져야 하며,
		 *    폭파 시 십자가 형태로 터진다.
		 * 5. 벽 파괴시 아이템이 랜덤하게 생성되어,
		 *    아이템을 먹으면 설치할 수 있는 폭탄의 개수가 증가된다.
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int map[][] = new int[7][7];
		int arr[][] = new int[30][2];
		int arr2[][] = new int[30][2];
		final int W = 3;
		final int P = 2;
		final int B = 9;
		final int I = 4;
		int maxBomb = 0;
		int bomb = 0;
		int a = -1;
		int b = -1;
		
		System.out.println("최대 폭탄 갯수를 지정해주세요 . ");
		int bb = sc.nextInt();
		
		maxBomb = bb;
		map[0][0] = P;
		System.out.println("벽의 갯수를 입력 : ");
		int wall = sc.nextInt();
		int wallCount = 0;
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(map[i][j] == 0) {
					if(wall == wallCount ) break;
					map[i][j] = W;
					wallCount ++;
				}
			}
			if(wall == wallCount ) break;
		}
		int s = 0;
		int sCheck = 0;
		while(sCheck == 0) {
			while(s < 300) {
				int r1 = rn.nextInt(7);
				int r2 = rn.nextInt(7);
				int temp = map[0][0];
				map[0][0] = map[r1][r2];
				map[r1][r2] = temp;
				s++;
			}
			for(int i=1; i<6; i++) {
				for(int j=1; j<6; j++) {
					if(map[i][j] == 2 &&map[i][j-1] == 0 && map[i][j+1] == 0 && map[i-1][j] == 0 && map[i+1][j] == 0) {
						sCheck = 1;
					}
				}
			}
			if(sCheck == 0) s = 0;
			else break;
		}
		
		
		
		while(true) {
			//폭탄의 좌표 그리고 설치된 순서 표시 
			for(int i=0; i<bomb; i++) {
				for(int j=0; j<2; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}System.out.println();
			//맵출력
			for(int i=0; i<7; i++) {
				for(int j=0; j<7; j++) {
					if(map[i][j] == W) {
						System.out.print("■ ");
					}
					if(map[i][j] == P) {
						System.out.print("옷 ");
					}
					if(map[i][j] == B) {
						System.out.print("● ");
					}
					if(map[i][j] == I) {
						System.out.print("☆ ");
					}
					if(map[i][j] == 0) {
						System.out.print(map[i][j] + " ");
					}

				}System.out.println();
			}System.out.println();
			System.out.println("최대 폭탄설치 갯수 : " + maxBomb);
			System.out.println("현재 폭탄설치 갯수 : " + bomb);
			System.out.println("1.상  2.하  3.좌  4.우   5.폭탄설치   6.폭탄폭파!");
			int sel = sc.nextInt();
			if(sel == 1) {// 위로 이동 
				if(a != -1 && b != -1 &&  a != 0 &&  map[a][b] == B && map[a-1][b] == 0) { //폭탄설치 후 이동 
					map[a-1][b] = P;
					a = -1;
					b = -1;
					continue;
				}
				if(a != -1 && b != -1 && a != 0 && map[a][b] == B && map[a-1][b] == I) {	//폭탄설치 후 이동
					map[a-1][b] = P;
					maxBomb ++;
					a = -1; 
					b = -1;
					continue;
				}
				for(int i=1; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] == P && map[i-1][j] == 0) { // 위가 0일때 이동
							map[i][j] = 0;
							map[i-1][j] = P;
						}
						if(map[i][j] == P && map[i-1][j] == I) { // 위가 아이템일때 이동후 폭탄증가 
							map[i][j] = 0;
							map[i-1][j] = P;
							maxBomb ++;
						}
					}
				}
			}//sel == 1
			if(sel == 2) {
				if(a != -1 && b != -1 &&  a != 6 &&  map[a][b] == B && map[a+1][b] == 0) { //폭탄 설치 후 이동
					map[a+1][b] = P;
					a = -1;
					b = -1;
					continue;
				}
				if(a != -1 && b != -1 && a != 6 && map[a][b] == B && map[a+1][b] == I) { //폭탄 설치 후 이동
					map[a+1][b] = P;
					maxBomb ++;
					a = -1; 
					b = -1;
					continue;
				}
				int moveCheck = 0;
				for(int i=0; i<6; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] == P && map[i+1][j] == 0) { // 아래가 0일때 이동
							map[i][j] = 0;
							map[i+1][j] = P;
							moveCheck = 1;
							break;
						}
						if(map[i][j] == P && map[i+1][j] == I) { // 아래가 아이템일때 이동후 폭탄증가
							map[i][j] = 0;
							map[i+1][j] = P;
							maxBomb ++;
							moveCheck = 1;
							break;
						}
					}
					if(moveCheck == 1) break;
				}
			}//sel == 2
			if(sel == 3) {
				if(a != -1 && b != -1 &&  b != 0 &&  map[a][b] == B && map[a][b-1] == 0) {//폭탄 설치 후 이동
					map[a][b-1] = P;
					a = -1;
					b = -1;
					continue;
				}
				if(a != -1 && b != -1 && b != 0 && map[a][b] == B && map[a][b-1] == I) {//폭탄 설치 후 이동
					map[a][b-1] = P;
					maxBomb ++;
					a = -1; 
					b = -1;
					continue;
				}
				for(int i=0; i<7; i++) {
					for(int j=1; j<7; j++) {
						if(map[i][j] == P && map[i][j-1] == 0) {//왼쪽이 0일때 이동
							map[i][j] = 0;
							map[i][j-1] = P;
						}
						if(map[i][j] == P && map[i][j-1] == I) {//왼쪽이 아이템일때 이동후 최대 폭탄 증가
							map[i][j] = 0;
							map[i][j-1] = P;
							maxBomb ++;
						}
					}
				}
			}//sel == 3
			if(sel == 4) {
				if(a != -1 && b != -1 &&  b != 6 &&  map[a][b] == B && map[a][b+1] == 0) { //폭탄 설치 후 이동
					map[a][b+1] = P;
					a = -1;
					b = -1;
					continue;
				}
				if(a != -1 && b != -1 && b != 6 && map[a][b] == B && map[a][b+1] == I) { //폭탄 설치 후 이동
					map[a][b+1] = P;
					maxBomb ++;
					a = -1; 
					b = -1;
					continue;
				}
				int moveCheck = 0;
				for(int i=0; i<7; i++) {
					for(int j=0; j<6; j++) {
						if(map[i][j] == P && map[i][j+1] == 0) { //오른쪽이 0일때 이동
							map[i][j] = 0;
							map[i][j+1] = P;
							moveCheck = 1;
							break;
						}
						if(map[i][j] == P && map[i][j+1] == I) { //오른쪽이 폭탄일때 이동 후 최대 폭탄 증가 
							map[i][j] = 0;
							map[i][j+1] = P;
							maxBomb ++;
							moveCheck = 1;
							break;
						}
					}
					if(moveCheck == 1) break;
				}
				
			}
			if(sel == 5) { //폭탄 설치
				if(bomb < maxBomb) {
					for(int i=0; i<7; i++) {
						for(int j=0; j<7; j++) {
							if(map[i][j] == P) {
								map[i][j] = B;
								a = i;
								b = j;
								arr[bomb][0] = a;
								arr[bomb][1] = b;
								bomb ++;
							}
						}
					}
				}else System.out.println("폭탄을 더이상 설치 할 수 없습니다.");
			}//sel == 5
			if(sel == 6 && bomb > 0) { // 폭탄 폭파 
				int playerCheck = 0; // 폭탄을 설치하고 상하좌우 아무곳이나 움직이지 않고 폭탄폭파를 하면 사람도 없어지기 때문에 체크를 함. 
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] ==P) {
							playerCheck = 1;
						}
					}
				}
				if(playerCheck == 1) {
				int y = arr[0][0];
				int x = arr[0][1];
				int Y = -1;
				int X = -1;
				int temp1 = -1;
				int temp2 = -1;
				int temp3 = y;
				int temp4 = x;
				
				
				int cnt = 0;
				while(true) {
					 y = arr[0][0];
					 x = arr[0][1];
					 map[y][x] = B;
					int check = 0;
					int check3 = 0;
				if(check == 0  && map[y][x] == B) {
						for(int i=-1; i<=1; i++) {
							if(y+i >= 0 && y+i <7 && map[y+i][x] == I && i != 0 ) { //아이템이 폭탄 범위에 있으면 0으로 만듬
								map[y+i][x] = 0;
							}
							if(x+i >= 0 && x+i <7 && map[y][x+i] == I && i != 0 ) {//아이템이 폭탄 범위에 있으면 0으로 만듬
								map[y][x+i] = 0;
							}
							if(y+i >= 0 && y+i <7 && map[y+i][x] == W && i != 0 ){ //벽을 폭탄으로 부수면 50프로 확률로 아이템 생성
								int r = rn.nextInt(2);
								if(r == 0) map[y+i][x] = I;
								else map[y+i][x] = 0;
							}
							if(x+i >= 0 && x+i <7 && map[y][x+i] == W && i != 0 ) { //벽을 폭탄으로 부수면 50프로 확률로 아이템 생성
								int r = rn.nextInt(2);
								if(r == 0) map[y][x+i] = I;
								else map[y][x+i] = 0;
							}
						}
						check = 1;
						map[y][x] = 0;
						for(int i=0; i<bomb; i++) { //폭탄을 부수고 배열 댕겨오기 
							if(i == bomb-1) break;
							arr[i][0] = arr[i+1][0];
							arr[i][1] = arr[i+1][1];
							
						}
						bomb--;
						check3 = 1;
				}
				
				int check2 = 0;
				for(int i=-1; i<=1; i++) {//폭탄을 상 하 좌 우 검사해서 연쇄폭파할것이 있는지 체크 . 
					if(y+i >= 0 && y+i < 7 ) {
						if(map[y+i][x] == B && i != 0) {
							Y = y+i;
							X = x;
							check2 = 1;
							break;
						}
					}
					if(x+i >= 0 && x+i < 7 ) {
						if(map[y][x+i] == B && i != 0) {
							Y = y;
							X = x+i;
							check2 = 1;
							break;
						}
					}
				}
				if(check2 == 1) { // 연쇄폭파할 폭탄이 있으면 그 배열을 첫번째로 떙겨옴 . 
					for(int i=0; i<bomb; i++) {
						for(int j=0; j<2; j++) {
							if(arr[i][0] == Y && arr[i][1] == X) {
								temp1 = arr[0][0];
								temp2 = arr[0][1];
								arr[0][0] = arr[i][0];
								arr[0][1] = arr[i][1];
								arr[i][0] = temp1;
								arr[i][1] = temp2;
							}
						}
					}
					y = Y;
					x = X;
				}
				if(check2 == 0) { // map[y][x]자리에 폭탄이 터지면 map[y][x]의 위 방향으로 검사하고 위의 더이상 폭탄이 없으면 다시 map[y][x] 의 아래 방향 그다음 왼쪽 오른쪽으로 검사 할 수 있게 map[y][x]를 계속 기억해줌 .  
					y = temp3;
					x = temp4;
					int cnt2 = 0;
					int cnt3 = 0;
					for(int i=-1; i<2; i++) { //그리고 map[y][x] 주변에 더이상 폭탄이 없으면 6.폭탄폭파의 반복문을 끝내기 위해 조건을 만들어줌 . 
						if(y+i >= 0 && y+i <7) {
							if(map[y+i][x] != B && i != 0) { // map[y][x] 위 아래에 폭탄이 없으면 카운트 수 증가
								cnt2 ++;
							}
						}
						if(x+i >= 0 && x+i <7) {
							if(map[y][x+i] != B && i != 0) { // map[y][x] 왼쪽 오른쪽에 폭탄이 없으면 카운트 수 증가
								cnt2 ++;
							}
						}
					}
					if(y == 0 || y == 6 || x == 0 || x == 6) { //모서리가 아닌 벽에 폭탄이 붙엇을때 3방향이 폭탄이 아니면 6.폭탄폭파 의 반복문 종료 . 
						if(cnt2 == 3) break;
					}
					if(y == 0 && x == 0 && cnt2 == 2) { //모서리에 폭탄이 터졋을때 2방향이  폭탄이 아니면 반복문 종료 . 
						break;
					}
					if(y == 0 && x == 6 && cnt2 == 2) {
						break;
					}
					if(y == 6 && x == 0 && cnt2 == 2) {
						break;
					}
					if(y == 6 && x == 6 && cnt2 == 2) {
						break;
					}
					if(cnt2 ==4 ) break; //map[y][x] 의 4방향이 폭탄이 아니면 반복문 종료 . 
				}
				}//while(true)
				}
			}//sel == 6

		}//while(true)

	}//clear

}
