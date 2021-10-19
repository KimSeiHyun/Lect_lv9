package lv7;

import java.util.Scanner;

class Student2 {
	String name;
	String subject[];
	int score[];
	int cnt = 0;
}

class Add {
	Scanner sc = new Scanner(System.in);
	Student2[] st = new Student2[3];
	Student2[] list = new Student2[3];
	int cnt = 0; // 학생 수

	void set() {
		for(int i=0; i<st.length; i++) {
			st[i] = new Student2();	
		}
		
	}
	
	void print() {
		for(int i=0; i<this.cnt; i++) {
			System.out.printf("%s : 과목%d개 ",this.st[i].name,this.st[i].cnt);
			for(int j=0; j<this.st[i].cnt; j++) {
				if(this.st[i].subject[j] != null ) {
				System.out.print(this.st[i].subject[j] + " " +this.st[i].score[j]);
				}
			}
			System.out.println();

		}
	}
	void addStudent() {
		if(this.cnt <this.st.length) {
			System.out.print("추가할 학생의 이름 입력 : ");
			String s = sc.next();
			int check = 0;
			for(int i=0; i<this.cnt; i++) {
				if(this.st[i].name.equals(s)) {
					check = 1;
				}
			}
			if(check == 1) {
				System.out.println("이미 존재하는 이름입니다.");
			}else {
				this.st[this.cnt].name = s;
				this.cnt++;
			}
		}
		else System.out.println("더이상 추가 할 수 없습니다. ");
	}
	
	void addSubject() {
		System.out.print("과목을 추가할 학생의 이름 입력 : ");
		String s = sc.next();
		int check = 0;
		int idx = -1;
		for(int i=0; i<this.cnt; i++) {
			if(this.st[i].name.equals(s)) {
				check = 1;
				idx = i;
			}
		}
		if(check == 1) {
			if(this.st[idx].cnt < 3) {
			System.out.print("추가할 과목 입력 : ");
			String subject = sc.next();
			int check2 = 0;
			for(int i=0; i<this.st[idx].cnt; i++) {
				if(subject.equals(this.st[idx].subject[i])) {
					check2 = 1;
				}
			}
			if(check2 == 0) {
				if(this.st[idx].cnt == 0) {
					this.st[idx].cnt ++;
					this.st[idx].subject = new String[this.st[idx].cnt];
					this.st[idx].score = new int[this.st[idx].cnt];
					this.st[idx].subject[this.st[idx].cnt-1] = subject;
				}
				else {
					String temp[] = this.st[idx].subject;
					int temp2[] = this.st[idx].score;
					this.st[idx].cnt ++;
					this.st[idx].subject = new String[this.st[idx].cnt];
					this.st[idx].score = new int[this.st[idx].cnt];
					this.st[idx].subject[this.st[idx].cnt-1] = subject;


					for(int i=0; i<this.st[idx].cnt-1; i++) {
						this.st[idx].subject[i] = temp[i];
						this.st[idx].score[i] = temp2[i];
					}
				}
			}
			else System.out.println("해당 과목은 이미 존재합니다 . ");
			}
			else System.out.println("더이상 추가 할 수 없습니다.");
			
		}
		else System.out.println("해당 학생의 이름은 존재하지 않습니다.");
	}
	
	void addScore() {
		System.out.print("성적을 추가할 학생의 이름 입력 : ");
		String s = sc.next();
		int check = 0;
		int idx1 = -1;
		for(int i=0; i<this.cnt; i++) {
			if(this.st[i].name.equals(s)) {
				check = 1;
				idx1 = i;
			}
		}
		
		if(check == 1) {
			System.out.print("성적을 추가할 학생의 과목을 입력해주세요 . ");
			check = 0;
			s = sc.next();
			int idx2= -1;
			for(int i=0; i<this.st[idx1].cnt; i++) {
				if(this.st[idx1].subject[i].equals(s)) {
					check = 1;
					idx2 = i;
				}
			}
			if(check == 1) {
				System.out.print("추가할 성적을 입력해주세요 : ");
				int score = sc.nextInt();
				this.st[idx1].score[idx2] = score;
				
			}else System.out.println("해당 과목은 존재하지 않습니다.");
			
		}else System.out.println("해당 학생의 이름은 존재하지 않습니다.");
		
		
		
		
		
	}
}
public class Ex001_009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	// # 학생 추가 삭제 컨트롤러
	//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
	//   김철수 : 과목3개 수학 50 국어50 영어 60 
	//   이만수 : 과목2개 수학 20 국어 30 
	//   이영희 : 과목1개 수학 100
		Add ex = new Add();
		ex.set();
		while (true) {
			
			System.out.println("[1]학생 추가하기"); // 이름 입력받아 추가
			System.out.println("[2]과목 추가하기"); // 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기"); // 이름과 과목 그리고 성적 입력받아 추가
			ex.print();
			int choice = sc.nextInt();
			if (choice == 1) {
				ex.addStudent();
			} else if (choice == 2) {
				ex.addSubject();
			} else if (choice == 3) {
				ex.addScore();
			}
		}//while(true)

	}

}