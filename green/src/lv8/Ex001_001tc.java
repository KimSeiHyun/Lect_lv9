package lv8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex001_001tc {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			// print
			System.out.println("size : " + arr.size());
			for(Integer i : arr) {
				System.out.print(i + " ");
			}System.out.println();
			
			System.out.println("1.추가");
			System.out.println("2.삽입");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.수정");
			System.out.println("6.종료");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("추가할 값 :");
				Integer data = sc.nextInt();
				if(arr.add(data)) {
					System.out.println("추가완료");
				}else {
					System.out.println("실패");
				}
			}
			if(sel == 2) {
				System.out.print("삽입할 인덱스 : ");
				int idx = sc.nextInt();
				System.out.print("삽입할 값 : ");
				Integer data = new Integer(sc.nextInt());
				arr.add(idx, data);
			}
			if(sel == 3) {
				System.out.print("삽입할 인덱스 : ");
				int delIdx = sc.nextInt();
				arr.remove(delIdx);
				
			}
			if(sel == 4) {
				System.out.print("삭제할 값 : ");
				Integer delData = new Integer(sc.nextInt());
				
				if(arr.remove(delData)) {
					System.out.println("삭제완료");
				}
				else {
					System.out.println("삭제할 값 다시 확인 . ");
				}
			}
			if(sel == 5) {
				System.out.print("수정할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("수정할 값 입력 : ");
				Integer data = new Integer(sc.nextInt());
				arr.set(idx, data);
			}
			if(sel == 6) {
				break;
			}
		}

	}
}