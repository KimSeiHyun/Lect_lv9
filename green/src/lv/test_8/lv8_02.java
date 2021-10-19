package lv.test_8;

import java.util.ArrayList;
import java.util.Scanner;

public class lv8_02 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();		
		Scanner sc = new Scanner(System.in);
		while(true){
			for(int i : arr) System.out.println(i);
			// 1.추가 2.삭제 3.삽입 4.종료
			System.out.println("1.추가\n2.삭제\n3.삽입\n4.종료");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("추가할 값 입력 :");
				arr.add(sc.nextInt());
			}
			if(sel == 2) {
				System.out.println("1.인덱스로 삭제");
				System.out.println("2.값으로 삭제");
				int sel2 = sc.nextInt();
				if(sel2 == 1) {
					System.out.print("삭제할 인덱스 입력 : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx <arr.size()) {
						
					}
					arr.remove(idx);
				}
				if(sel2 == 2) {
					System.out.print("삭제할 값 입력: ");
					Integer temp = sc.nextInt();
					arr.remove(temp);
				}
			}
			if(sel == 3) {
				System.out.print("삽입할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("삽입할 값 입력 : ");
				int temp = sc.nextInt();
				arr.add(idx , temp);
				
			}
			if(sel == 4) {
				System.out.println("종료합니다 .");
				break;
			}
			
		}//while


	}
}