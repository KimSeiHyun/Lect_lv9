package lv4;

import java.util.Scanner;

public class Ex01_09tc2 {

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
		
		while (true) {
			System.out.println("cnt : " + cnt);
			if(datas != null) {
				for(int i =0; i<datas.length; i++) {
					System.out.print(datas[i] + " ");
				}
				System.out.println();
			}
			System.out.println("1. 추가");
			System.out.println("2. 삭제(인덱스)");
			System.out.println("3. 삭제(값)");
			System.out.println("4. 삽입");
			System.out.print("메뉴 : ");
			int sel = sc.nextInt();
			
			if(sel ==1 ) {
				System.out.print("추가할 값 입력 : ");
				int data = sc.nextInt();
				
				int temp[] = datas;
				datas = new int[cnt+1];
				if(cnt >0) {
					for(int i=0; i<temp.length; i++) { // 값 올리기 
						datas[i] = temp[i];
					}
				}
				datas[cnt] = data;
				cnt++;
			}
			
			else if(sel == 2) {
				System.out.print("삭제할 인덱스 입력 : ");
				int delIdx = sc.nextInt();
				
				if(datas != null && delIdx >= 0 && delIdx < cnt ) {
					if(cnt == 1) {
						datas = null;
					}
					else {
						int temp[] = datas;
						datas = new int[cnt-1];
						
						int idx=0; // datas의 인덱스 
						for(int i =0; i<temp.length; i++) {
							if(i != delIdx) {
								datas[idx] = temp[i];
								idx ++;
							}
						}
					}
					cnt --;
				}
			}
			
			else if(sel == 3) {
				if(datas != null) {
				System.out.print("삭제할 값 입력 : ");
				int delData = sc.nextInt();
				
				int delCnt = 0;
				for(int i=0; i<datas.length; i++) {
					if(delData == datas[i]) {
						delCnt ++;
					}
				}
				
				int temp[] = datas;
				datas = new int[cnt-delCnt];
				
				int idx = 0;
				for(int i=0; i<temp.length; i++) {
					if(temp[i] != delData) {
						datas[idx] = temp[i];
						idx ++;
					}
				}
				cnt -= delCnt;
				//temp == null; // temp의 메모리 해제 > 생략가능 (G.C 존재하기 때문 ) 
				// [자바의 기능으로 인해 자동으로 정리됬음]
				}
				else {
					System.out.println("존재하는 값이 없습니다 . ");
				}
			}
			else if(sel == 4) {
				System.out.println("삽입할 인덱스 입력 :");
				int idx = sc.nextInt();
				
				if(datas != null && idx >= 0 && idx < cnt-1) {
					System.out.println("삽입할 값 입력 : ");
					int data = sc.nextInt();
					
					int temp[] = datas;
					datas = new int[cnt+1];
					
					for(int i=0; i<temp.length; i++) {
						if(i < idx) {
							datas[i] = temp[i];
						}
						else {
							datas[i+1] = temp[i];
						}
					}
					datas[idx] = data;
					cnt++;
				}
			}
			
			
		}//while 

		
	}

}
