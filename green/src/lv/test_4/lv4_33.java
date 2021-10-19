package lv.test_4;

import java.util.Scanner;

public class lv4_33 {

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
		
		int arr[] = null;
		int size = 0;
		while(true) {
			if(arr != null) {
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}System.out.println();				
			}
			System.out.println("1.추가");
			System.out.println("2.삭제(인덱스)");
			System.out.println("3.삭제(값)");
			System.out.println("4.삽입");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("추가할 값 입력 : ");
				int x = sc.nextInt();
				int temp[] = arr;
				size ++;
				arr = new int[size];
				if(temp != null) {
					for(int i=0; i<temp.length; i++) {
						arr[i] = temp[i];
					}					
				}
				arr[size-1] = x;
			}
			if(sel == 2) {
				if(size != 0) {
					System.out.print("삭제할 인덱스 입력 : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx < size) {
						int temp[] = arr;
						size --;
						arr = new int[size];
						int x = 0;
						for(int i=0; i<temp.length; i++) {
							if(idx != i) {
								arr[x] = temp[i];
								x++;
							}
						}
					}
				}else System.out.println("삭제할 인덱스가 없습니다.");
			}
			if(sel == 3) {
				if(size != 0) {
					System.out.print("삭제할 값 입력 : ");
					int value = sc.nextInt();
					int temp[] = arr;
					for(int i=0; i<arr.length; i++) {
						if(arr[i] == value) {
							size --;
						}
					}
					arr = new int[size];
					int x = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i] != value) {
							arr[x] = temp[i];
							x++;
						}
					}
				}else System.out.println("삭제할 인덱스가 없습니다.");
			}
			if(sel == 4) {
				if(size != 0) {
					System.out.print("삽입할 인덱스 입력 : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx < size) {
						System.out.print("삽입할 값 입력 : ");
						int value = sc.nextInt();
						int temp[] = arr;
						size ++;
						arr = new int[size];
						int x = 0;
						for(int i=0; i<arr.length; i++) {
							if(i != idx ) {
								arr[i] = temp[x];
								x++;
							}
						}
						arr[idx] = value;
					}
				}
			}
		}
	}

}
