package lv.test_6;

import java.util.Scanner;

class Ex05{	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class lv6_04 {

	public static void main(String[] args) {
		/*
		 * System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
		 */
		Ex05 e = new Ex05();
		e.name = "공공";
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=== " + e.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("학번 : ");
				for(int i=0; i<e.arHakbun.length; i++) {
					System.out.print(e.arHakbun[i] + "\t");
				}System.out.println();
				System.out.print("성적 : ");
				for(int i=0; i<e.arHakbun.length; i++) {
					System.out.print(e.arScore[i] + "\t");
				}System.out.println();
			}
			if(sel == 2) {
				int max = 0;
				for(int i=0; i<e.arScore.length; i++) {
					if(max < e.arScore[i]) max = e.arScore[i];
				}
				System.out.println(max);
			}
			if(sel == 3) {
				int min = 100;
				for(int i=0; i<e.arScore.length; i++) {
					if(min > e.arScore[i]) min = e.arScore[i];
				}
				System.out.println(min);
			}
			if(sel == 4) {
				System.out.println("확인할 학번 입력 : ");
				int num = sc.nextInt();
				for(int i=0; i<e.arScore.length; i++) {
					if(num == e.arHakbun[i]) System.out.println(e.arScore[i]);
				}
			}
			if(sel == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}

	}
}