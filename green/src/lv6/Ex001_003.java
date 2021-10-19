package lv6;

import java.util.Scanner;

class Ex05{	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}
//클래스 문제3
public class Ex001_003 {

	public static void main(String[] args) {

		Ex05 green = new Ex05();
		Scanner sc = new Scanner(System.in);
		green.name = "student";
		while(true) { 
			System.out.println("===" + green.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				for(int i=0; i<5; i++) {
					System.out.print(green.arScore[i] + " ");
				}System.out.println();
			}
			else if(sel == 2) {
				int max = 0;
				for(int i=0; i<5; i++) {
					if(max < green.arScore[i]) {
						max = green.arScore[i];
					}
				}
				System.out.println(max);
			}
			else if(sel == 3) {
				int min = 100;
				for(int i=0; i<5; i++) {
					if(min > green.arScore[i] ) {
						min = green.arScore[i];
					}
				}
				System.out.println(min);
			}
			else if(sel == 4) {
				System.out.println("학번을 입력해주세요 .");
				int inNum = sc.nextInt();
				int check = 0;
				for(int i=0; i<5; i++) {
					if(inNum == green.arHakbun[i]) {
						System.out.println(green.arScore[i]);
						check = 1;
					}
				}
				if(check == 0) System.out.println("학번이 검색되지 않았습니다.");
			}
			else if(sel == 5) {
				System.out.println("종료합니다.");
				break;
			}

		
		}//while(true)

	}

}
