package test;

import java.util.Scanner;

public class LMS {

	public static void main(String[] args) {
//				. 수행내용 
//				- 학생성적관리 프로그램 만들기
//				- 학번 및 성적을 입력 받아 성적을 등록할 수 있고,
//				- 등록된 학번을 입력하면 성적과 함께 등급이 출력됨
//				- 등급기준 : 90점 이상 A / 80점 이상 B / 70점 이상 C / 60점 미만 F 
	
		// 학생명 : 김세현
		// 시작 12:38
		// 종료 13:21
		// 소요 00:43 
		
		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int score[] = new int[5];

		int cnt = 0;
		while (true) {

			System.out.print("학번 : ");
			for (int i = 0; i < 5; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			System.out.print("성적 : ");
			for (int i = 0; i < 5; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();

			System.out.println("1.학번 및 성적 입력");
			System.out.println("2.성적 조회");
			System.out.println("3.종료");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (cnt >= 5) {
					System.out.println("성적을 입력할 수 있는공간이 없습니다.");
					continue;
				}
				System.out.println("입력할 학번을 입력해주세요 . ");
				int inNum = sc.nextInt();
				System.out.println("입력할 성적을 입력해주세요 . ");
				int inScore = sc.nextInt();

				if (cnt >= 0 && cnt < 5) {
					for (int i = 0; i < 5; i++) {
						if (num[i] == inNum) {
							System.out.println("이미 등록된 학번입니다. 다시 확인해주세요 .");
							break;
						}
						if (inScore > 100 || inScore < 0) {
							System.out.println("성적은 1~100까지만 입력해주세요.. 다시 확인해주세요 . ");
							break;
						}
						if (num[i] == 0 && score[i] == 0) {
							num[i] = inNum;
							score[i] = inScore;
							cnt++;
							break;
						}
					}
				}

			}

			else if (sel == 2) {
				int check = -1;
				System.out.println("성적을 조회할 학번을 입력해주세요 . ");
				int inNum = sc.nextInt();
				for (int i = 0; i < 5; i++) {
					if (num[i] == inNum) {
						check = 1;
					}
				}
				if (check != 1) {
					System.out.println("조회할 학번이 존재하지 않습니다.");
					continue;
				}
				if (check == 1) {
					for (int i = 0; i < 5; i++) {
						if (num[i] == inNum) {
							if (score[i] >= 90) {
								System.out.println("성적 : " + score[i] + "점 A등급");
							} else if (score[i] >= 80 && score[i] < 90) {
								System.out.println("성적 : " + score[i] + "점 B등급");
							} else if (score[i] >= 70 && score[i] < 80) {
								System.out.println("성적 : " + score[i] + "점 C등급");
							} else if (score[i] >= 60 && score[i] < 70) {
								System.out.println("성적 : " + score[i] + "점 D등급");
							} else {
								System.out.println("성적 : " + score[i] + "점 F등급");

							}

						}
					}
				}
			} else if (sel == 3) {
				System.out.println("종료합니다.");
				break;
			}

		}//while

	}

}
