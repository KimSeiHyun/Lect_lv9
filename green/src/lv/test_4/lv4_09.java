package lv.test_4;

import java.util.Scanner;

public class lv4_09 {

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
			System.out.println("cnt = " + cnt);
			if(datas != null) {
			for(int i=0; i<datas.length; i++) {
				System.out.print(datas[i] + " ");
			}System.out.println();
			}
			System.out.println("1.추가 \n2.삭제(인덱스) \n3.삭제(값) \n4.삽입");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("추가할 값을 입력해주세요 .");
				int num = sc.nextInt();
				cnt++;
				if(cnt > 1) {
				int temp[] = datas;
				datas = new int[cnt];
				for(int i=0; i<temp.length; i++) {
					datas[i] = temp[i]; 
				}
				datas[cnt-1] = num;
				}
				else {
					datas= new int[cnt];
					datas[cnt-1] = num;
				}
			}
			if(sel == 2) {
				if(cnt > 0) {
				System.out.println("삭제할 인덱스 번호를 입력해주세요 . ");
				int idx= sc.nextInt();
				if(idx < cnt ) {
				datas[idx] = 0;
				cnt--;
				for(int i=0; i<datas.length-1; i++) {
					if(datas[i] == 0) {
						datas[i] =datas[i+1];
						datas[i+1] = 0;
					}
				}
				int temp[] = datas;
				datas = new int[cnt];
				for(int i=0; i<datas.length; i++) {
					datas[i] = temp[i];
				}
				}
				else {
					System.out.println("인덱스 범위를 벗어났습니다.");
				}
				}
				else {
					System.out.println("삭제할 값이 없습니다.");
				}
				
			}
			if(sel == 3) {
				if(cnt >0 ) {
					int cnt2 = 0;
					System.out.println("삭제할 값을 입력해주세요 .");
					int num = sc.nextInt();
					for(int i=0; i<datas.length; i++) {
						if(datas[i] == num) {
							datas[i] = 0;
							cnt--;
						}
						if(datas[i] != num) {
							cnt2++;
						}
					}
					int x = 0;
					while(x<100) {
					for(int i=0; i<datas.length-1; i++) {
						if(datas[i] == 0) {
							datas[i] = datas[i+1];
							datas[i+1] = 0;
						}
					}
					x++;
					}
					int temp[] = datas;
					datas = new int[cnt];
					for(int i=0; i<datas.length; i++) {
						datas[i] = temp[i];
					}
					if(cnt2 == cnt) {
						System.out.println("삭제 할 값이 존재하지 않습니다.");
						continue;
					}
				}
				else {
					System.out.println("삭제할 값이 없습니다.");
				}
			}
			if(sel == 4) {
				if(cnt >0) {
					System.out.println("삽입할 인덱스의 자리를 입력해주세요  .");
					int idx = sc.nextInt();
					if(idx <= cnt -1) {
					System.out.println("삽입할 값을 입력해주세요  .");
					int num = sc.nextInt();
					cnt++;
					int temp[] = datas;
					datas = new int[cnt];
					for(int i=0; i<= idx; i++) {
						datas[i] = temp[i];
					}
					for(int i=idx+1; i<temp.length; i++) {
						datas[i+1] = temp[i];
					}
					datas[idx+1] = num;
					}
					else {
						System.out.println("삽입할 인덱스의 범위를 벗어났습니다.");
					}
				}
					
				else {
					System.out.println("삽입할 공간이 없습니다. ");
				}
			}
			
			
		}//w
		

		
	}

}
