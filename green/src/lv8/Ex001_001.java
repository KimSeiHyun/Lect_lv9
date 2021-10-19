package lv8;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex001_001 {

	public static void main(String[] args) {
		// ArrayList를 활용한 컨트롤러 구현
		ArrayList<Integer> arr = new ArrayList<>();		
		Scanner sc = new Scanner(System.in);

		while(true){
			// 1.추가 2.삭제 3.삽입 4.수정 5.종료
			System.out.println(arr);
			for(Integer i : arr) {
				System.out.println(i);
			}
			System.out.println("1.추가\n2.삭제\n3.삽입\n4.수정\n5.종료");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("추가할 값 입력 : ");
				Integer x = new Integer (sc.nextInt());
				arr.add(x);
			}
			if(sel == 2) {
				System.out.println("1.인데스로 삭제\n2.값으로 삭제");
				int sel2 = sc.nextInt();
				if(sel2 == 1) {
					System.out.print("삭제할 인덱스 입력 : ");
					int idx = sc.nextInt();
					arr.remove(idx);
				}
				if(sel2 == 2) {
					System.out.println("삭제할 값 입력 : ");
					Integer data = sc.nextInt();
					arr.remove(data);
				}
			}
			if(sel == 3) {
				System.out.print("삽입할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("삽입할 값 입력 : ");
				Integer x = new Integer(sc.nextInt());
				arr.add(idx, x);
			}
			if(sel == 4) {
				System.out.print("수정할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("수정할 값 입력 : ");
				Integer x = new Integer(sc.nextInt());
				arr.set(idx, x);
			}
			if(sel == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}


	}
}