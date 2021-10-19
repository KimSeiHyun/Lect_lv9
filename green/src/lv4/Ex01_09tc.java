package lv4;

import java.util.Scanner;

public class Ex01_09tc {

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
			System.out.println("1.추가\n2.삭제(인덱스)\n3.삭제(값)\n4.삽입");
			for(int i=0; i<cnt; i++) {
				System.out.print(datas[i] + " ");
			}
			System.out.println();
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("추가할 값");
				int data = sc.nextInt();
				
				if(cnt > 0) { // 보존할 값이 존재하는 경우
					int temp[] = datas;		// {1,2,3}
					datas = new int[cnt+1]; // {0,0,0,0}
					for(int i=0; i<temp.length; i++) {
						datas[i] = temp[i];
					}
				}
				else { // 처음 값 등록 .  
					datas = new int[1];
				}
				datas[cnt] = data; //마지막 인덱스에 값 저장 . 
				cnt ++;
			}
			else if(sel == 2) {
				
			}
			else if(sel == 3) {
				
			}
			else if(sel == 4) {
				
			}
			
		}//whiel 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
