package lv4;

import java.util.Scanner;

public class Ex01_09 {

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
			System.out.println("cnt :" + cnt);
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("추가할 값");
				int data = sc.nextInt();
				if(cnt >0 ) {
					int temp[] = datas;
					datas = new int[cnt+1];
					for(int i=0; i<temp.length; i++) {
						datas[i] = temp[i];
					}
		
				}
				else {
					datas = new int[1];
				}
				datas[cnt] = data;
				cnt++;

			}
			
			else if(sel == 2) {
				if(cnt == 0) {
					System.out.println("삭제할 인덱스가 없습니다.");
					continue;
				}
				System.out.print("삭제할 값(인덱스)");
				int idx = sc.nextInt();
				if(idx >= cnt || idx < 0) {
					System.out.println("잘못된 인덱스 값 입니다 . ");
					continue;
				}
				int temp[] = datas;
				datas = new int[cnt-1];
				for(int i=0; i<temp.length; i++) {
					if(i== idx &&  idx == cnt-1) {
						for(int j =0; j<datas.length; j++) {
							datas[j] = temp[j];
						}
					}
					if( i == idx && idx  < cnt ) {

						for(int j=0; j<i; j++) {
							datas[j] = temp[j];
						}
						for(int k=i; k<datas.length; k++) {
							datas[k] = temp[k+1];
						}
					}
				}
				cnt--;				
			}
			else if(sel == 3) {
				if (cnt == 0) {
					System.out.println("삭제할 값이 없습니다.");
					continue;
				}
				int a = 0;
				System.out.println("삭제할 인덱스의 값을 입력해주세요 . ");
				int delNum = sc.nextInt();
				while (a <1) {
					int b = 0;
				int check = 0;
				for(int i =0; i<datas.length; i++) {
					if ( datas[i] != delNum) {
						check ++;
					}
				}
				if(check == cnt) {
					System.out.println("없는 값 입니다.");
					break;
				}
				int temp[] = datas;
				datas = new int[cnt-1];
				for(int i=0; i<temp.length; i++) {
					if(temp[i] == delNum &&  i == cnt-1) {
						for(int j =0; j<datas.length; j++) {
							datas[j] = temp[j];
						}
					}
					if( temp[i] == delNum && i  < cnt ) {

						for(int j=0; j<i; j++) {
							datas[j] = temp[j];
						}
						for(int k=i; k<datas.length; k++) {
							datas[k] = temp[k+1];
						}
					}
				}
				cnt --;
				for(int i=0; i<datas.length; i++) {
					if( datas[i] == delNum) {
						b = 1;
					}
				}
				if( b == 1 ) {
					continue;
				}
				a++;
			}
			}
			else if(sel == 4) { //삽입
				if(cnt == 0) {
					System.out.println("삽입할 공간이 없습니다.\n먼저 인덱스를 생성해주세요 .");
					continue;
				}
				
				System.out.println("삽입할 인덱스 번호를 입력해주세요.");
				int idx2 = sc.nextInt();
				System.out.println("삽입할 값을 입력해주세요 . ");
				int num = sc.nextInt();
				
				int check =0;
				for(int i=0; i<datas.length; i++) {
					if (i != idx2) {
						check ++;
					}
				}
				if(check == cnt) {
					System.out.println("인덱스 값이 올바르지 않습니다.");
					continue;
				}
				
				int temp[] = datas;
				datas = new int[cnt+1];
				for(int i =0; i<temp.length; i++) {
					if ( i == idx2) {
						for(int j=0; j<i; j++) {
							datas[j] = temp[j];
						}
						datas[i] = num;
						for(int j=i+1; j<datas.length; j++) {
							datas[j] = temp[j-1];
						}
					}
				}
				cnt++;
			}

		}//clear

	}

}
