package lv8.test;

//시작 09:22
//종료 09:42
//소요 00:20

import java.util.ArrayList;
import java.util.Scanner;

public class test003_02 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(Integer i : arr) {
				System.out.println(i);
			}
			System.out.println("1.추가\n2.삽입\n3.삭제(인덱스)\n4.삭제(값)\n5.정렬\n6.원하는인덱스출력\n7.수정\n8.사이즈출력\n9.전체출력\n10.전체삭제.");
			int sel = sc.nextInt();
			if(sel  == 1) {
				System.out.print("추가할 값 입력 : ");
				arr.add(sc.nextInt());
			}
			if(sel  == 2) {
				System.out.print("삽입할 인덱스 입력 : ");
				int idx  =sc.nextInt();
				System.out.print("삽입할 값 입력 : ");
				Integer x = sc.nextInt();
				if(idx >=0 && idx <=arr.size()) {
					arr.add(idx, x);					
				}
			}
			if(sel  == 3) {
				System.out.print("삭제할 인덱스 입력 : ");
				int idx = sc.nextInt();
				if(arr.size() != 0 && idx >= 0 && idx < arr.size()) {
					arr.remove(idx);					
				}
			}
			if(sel  == 4) {
				System.out.print("삭제할 값 입력 : ");
				Integer x = sc.nextInt();
				arr.remove(x);
			}
			if(sel  == 5) {
				arr.sort(null);
			}
			if(sel  == 6) {
				System.out.print("인덱스 입력 : ");
				int idx = sc.nextInt();
				if(arr.size() != 0 && idx >=0 && idx < arr.size()) {
					System.out.printf("%d인덱스의 값은 : %d" ,idx , arr.get(idx));
					System.out.println();	
				}
			}
			if(sel  == 7) {
				System.out.print("수정할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("수정할 값 입력 : ");
				Integer x = sc.nextInt();
				if(arr.size() != 0 && idx >=0 && idx <arr.size()) {
					arr.set(idx, x);					
				}
			}
			if(sel  == 8) {
				System.out.printf("arr의 size는 : %d\n",arr.size());
			}
			if(sel  == 9) {
				System.out.println(arr);
			}
			if(sel  == 10) {
				arr.clear();
			}
			
		}
	}

}
