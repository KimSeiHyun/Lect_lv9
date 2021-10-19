package lv.test_7;

import java.util.Scanner;

class Student1 {
	private String name;
	private String subject[] = new String[3];
	private int score[] = new int[3];
	private int cnt;
	public Student1(String name, String subject, int score) {
		this.name = name;
		for(int i=0; i<this.subject.length; i++) {
			this.subject[i] = subject;
		}
		for(int i=0; i<this.subject.length; i++) {
			this.score[i] = score;
		}
	}
	
	public int getSize() {
		return this.score.length;
	}
	public int getCnt() {
		return this.cnt;
	}
	public void setAddCnt() {
		this.cnt++;
	}
	public String getName() {
		return this.name;
	}
	public String getSubject(int idx) {
		return this.subject[idx];
	}
	public int getScore(int idx) {
		return this.score[idx];
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(int idx , String subject) {
		this.subject[idx] = subject;
	}
	public void setScore(int idx , int score) {
		this.score[idx] = score;
	}
}
public class lv7_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	// # 학생 추가 삭제 컨트롤러
	//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
	//   김철수 : 과목3개 수학 50 국어50 영어 60 
	//   이만수 : 과목2개 수학 20 국어 30 
	//   이영희 : 과목1개 수학 100

		Student1[] list = new Student1[3];
		int count = 0; // 학생 수
		for(int i=0; i<list.length; i++) {
			list[i] = new Student1("","",0);
		}
		while (true) {
			for(int i=0; i<count; i++) {
				System.out.println(list[i].getName());
				if(list[i].getCnt() >0) {
					System.out.print("과목 : ");
					for(int j=0; j<list[i].getCnt(); j++) {
						System.out.print(list[i].getSubject(j) + "\t");
					}System.out.println();
					System.out.print("성적 : ");
					for(int j=0; j<list[i].getCnt(); j++) {
						System.out.print(list[i].getScore(j) + "\t");
					}System.out.println();
				}
			}
			System.out.println("[1]학생 추가하기"); // 이름 입력받아 추가
			System.out.println("[2]과목 추가하기"); // 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기"); // 이름과 과목 그리고 성적 입력받아 추가

			int choice = sc.nextInt();

			if (choice == 1) {
				if(count <3) {
					System.out.print("추가할 이름 입력 : ");
					String name = sc.next();
					int check = 0;
					for(int i=0; i<list.length; i++) {
						if(name.equals(list[i].getName())) {
							check = 1;
						}
					}
					if(check == 0) {
						list[count].setName(name);
						count++;
					}else System.out.println("이미 존재하는 이름입니다.");
					
				}else System.out.println("더이상 추가할 수 없습니다.");
				
			}
			else if (choice == 2) {
				if(count != 0) {
					System.out.print("과목을 추가할 학생의 이름 입력 : ");
					String name = sc.next();
					int idx = -1;
					for(int i=0; i<count; i++) {
						if(list[i].getName().equals(name)) idx = i;
					}
					if(idx != -1) {
						if(list[idx].getCnt() < 3) {
							System.out.print("추가할 과목 입력 : ");
							String subject = sc.next();
							int idx2 = -1;
							for(int i=0; i<list[idx].getCnt(); i++) {
								if(list[idx].getSubject(i).equals(subject)) idx2 = i;
							}
							if(idx2 == -1) {
								list[idx].setSubject(list[idx].getCnt(), subject);
								list[idx].setAddCnt();
							}else System.out.println("이미 존재하는 과목명입니다.");
						}else System.out.println("더이상 과목을 추가 할 수 없습니다.");
					}else System.out.println("학생의 이름 확인 ! ");
				}else System.out.println("학생을 먼저 추가헤주세요 . ");
			}
			else if (choice == 3) {
				if(count != 0) {
					System.out.print("성적을 추가할 학생의 이름 입력 :");
					String name = sc.next();
					int idx = -1;
					for(int i=0; i<count; i++) {
						if(list[i].getName().equals(name)) idx = i;
					}
					if(idx != -1) {
						if(list[idx].getCnt() > 0) {
							System.out.print("성적을 입력할 과목 입력 : ");
							String subject = sc.next();
							int idx2 = -1;
							for(int i=0; i<list[idx].getCnt(); i++) {
								if(list[idx].getSubject(i).equals(subject)) idx2 = i;
							}
							if(idx2 != -1) {
								System.out.print("성적 입력 : ");
								list[idx].setScore(idx2, sc.nextInt());
							}else System.out.println("과목을 확인해주세요 . ");
							
						}else System.out.println("과목을 먼저 추가해주세요 . ");
						
						
					}else System.out.println("학생의 이름 확인 ! ");
					
				}else System.out.println("학생을 먼저 추가해주세요 .");
				
			}
			
		}//while

	}

}