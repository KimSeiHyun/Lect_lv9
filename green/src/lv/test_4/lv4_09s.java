package lv.test_4;

import java.util.Scanner;

public class lv4_09s {

	public static void main(String[] args) {
		/*
		 * # 배열 컨트롤러[2단계] : 벡터(Vector)
		 * 1. 추가
		 * . 값을 입력받아 순차적으로 추가
		 * 2. 삭제(인덱스)
		 * . 인덱스를 입력받아 해당 위치의 값 삭제
		 * 3. 삭제(값)
		 * . 값을 입력받아 삭제
		 * . 없는 값 입력 시 예외처리
		 * 4. 삽입
		 * . 인덱스와 값을 입력받아 삽입
		 */

		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int[] datas = null;
		
		while(true) {
			if(datas != null) {
				for(int i=0; i<cnt; i++) {
					System.out.print(datas[i] + " ");
				}System.out.println();
			}
		System.out.println("cnt : "+ cnt);
		System.out.println("1.추가\n2.삭제(인덱스)\n3.삭제(값)\n4.삽입");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			System.out.println("추가할값을 입력해주세요 . ");
			int num = sc.nextInt();
			if(cnt == 0) {
				cnt++;
				datas = new int[cnt];
				datas[cnt-1] = num;
			}
			else {
				cnt++;
				int temp[] = datas;
				datas = new int[cnt];
				for(int i=0; i<temp.length; i++) {
					datas[i] = temp[i];
				}
				datas[cnt-1] = num;
			}
		}
		if(sel == 2) {
			if(cnt != 0) {
				int x = 0;
				int check = -1;
				System.out.println("삭제할 인덱스를 입력해주세요");
				int idx = sc.nextInt();
				for(int i=0; i<datas.length; i++) {
					if(i == idx) {
						x = i;
						check = 1;
					}
				}
				if (check == 1) {
					datas[x] = 0;
					cnt --;
					int temp[] = datas;
					datas = new int[cnt];
					int y = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i] != 0) {
							datas[y] = temp[i];
							y++;
						}
					}
				}
				else {
					System.out.println("인덱스를 다시 확인해주세요");
					continue;
				}
			}
			else {
				System.out.println("삭제할것이 없습니다.");
			}
		}
		if(sel == 3) {
			if(cnt != 0) {
				System.out.println("삭제할값을 입력해주세요 ");
				int num = sc.nextInt();
				int check = -1;
				for(int i=0; i<datas.length; i++) {
					if(datas[i] == num) {
						datas[i] = 0;
						cnt --;
						check = 1;
					}
				}
				if(check == 1) {
					int temp[] = datas;
					datas = new int[cnt];
					int y = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i] != 0) {
							datas[y] = temp[i];
							y++;
						}
					}
				}
				else {
					System.out.println("삭제할 값을 다시 확인해주세요 . ");
				}
				
			}
			else {
				System.out.println("삭제할것이 없습니다.");
			}
			
		}
		if(sel == 4) {
			if(cnt != 0) {
				System.out.println("삽입할 인덱스를 입력해주세요 . ");
				int idx = sc.nextInt();
				if(idx >= 0 && idx <cnt) {
					System.out.println("삽입할 값을 입력해주세요 ");
					int num = sc.nextInt();
					int temp[] = datas;
					cnt ++;
					datas = new int[cnt];
					datas[idx] = num;
					int y = 0;
					for(int i=0; i<datas.length; i++) {
						if(datas[i] == 0) {
							datas[i] = temp[y];
							y++;
						}
						else {
							y--;
							
						}
					}
				}
				else {
					System.out.println("인덱스의 범위를 다시 확인해주세요 . ");
				}
			}
			else {
				System.out.println("삽입할 공간이 없습니다.");
			}
		}


		}//w
		

	}

}
