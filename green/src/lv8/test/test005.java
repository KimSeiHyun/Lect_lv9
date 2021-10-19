package lv8.test;

import java.util.ArrayList;
import java.util.Scanner;

//시작 11:21
//종료 11:57
//소요 00:36

class Student{
	private String name;
	private int size;
	private String subject[];
	private int score[];
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public int getSize() {
		return this.size;
	}
	public String getSubject(int idx) {
		return this.subject[idx];
	}
	public int getScore(int idx) {
		return this.score[idx];
	}
	public void addSubject(String subject) {
		String temp[] = this.subject;
		int scoreTemp[] = this.score;
		this.size ++;
		this.subject = new String[this.size];
		this.score = new int[this.size];
		if(temp != null) {
			for(int i=0; i<temp.length; i++) {
				this.subject[i] = temp[i];
				this.score[i] = scoreTemp[i];
			}
		}
		this.subject[this.size-1] = subject;
	}
	public void setScore(int idx , int score) {
		this.score[idx] = score;
	}

}

class SMS{
	ArrayList<Student> student = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public void addStudent() {
		System.out.print("추가할 학생의 이름 입력 : ");
		String name = sc.next();
		Student a = new Student(name);
		this.student.add(a);
	}
	
	public void addSubject() {
		if(this.student.size() != 0) {
			System.out.print("과목을 추가할 학생 입력 : ");
			String name = sc.next();
			int check = 0;
			int idx = 0;
			for(int i=0; i<this.student.size(); i++) {
				if(this.student.get(i).getName().equals(name)) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.print("추가할 과목 입력 : ");
				String subject = sc.next();
				int check2 = 0;
				for(int i=0; i<this.student.get(idx).getSize(); i++) {
					if(this.student.get(idx).getSubject(i).equals(subject)) {
						check2 = 1;
					}
				}
				if(check2 == 0) {
					this.student.get(idx).addSubject(subject);
				}else System.out.println("해당 과목이 이미 존재합니다.");
			}else System.out.println("학생의 이름이 존재하지 않습니다.");
		}else System.out.println("학생을 먼저 추가해주세요 . ");
	}
	
	public void addScore() {
		if(this.student.size() != 0) {
			System.out.print("성적을 추가할 학생 입력 : ");
			String name = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.student.size(); i++) {
				if(this.student.get(i).getName().equals(name)) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.print("성적을 추가할 과목 입력 : ");
				String subject = sc.next();
				int check2 = 0;
				int idx2 = -1;
				for(int i=0; i<this.student.get(idx).getSize(); i++ ) {
					if(this.student.get(idx).getSubject(i).equals(subject)) {
						check2 = 1;
						idx2 = i;
					}
				}
				if(check2 == 1) {
					System.out.print("추가할 성적 입력 :");
					int score = sc.nextInt();
					this.student.get(idx).setScore(idx2, score);
				}else System.out.println("해당 과목은 존재하지 않습니다. ");
			}else System.out.println("해당 학생은 존재하지 않습니다.");
		}else System.out.println("학생을 먼저 추가해주세요 / ");
	}
	public void print() {
		for(int i=0; i<this.student.size(); i++) {
			System.out.println("이름 : " +this.student.get(i).getName());
			System.out.print("과목 : ");
			for(int j=0; j<this.student.get(i).getSize(); j++) {
				System.out.print(this.student.get(i).getSubject(j)+"\t");
			}System.out.println();
			System.out.print("성적 : ");
			for(int j=0; j<this.student.get(i).getSize(); j++) {
				System.out.print(this.student.get(i).getScore(j)+"\t");
			}System.out.println();
		}
	}
    public void run(){
    	while(true) {
    		print();
    		System.out.println("1.학생추가\n2.과목추가\n3.성적추가");
    		int sel = sc.nextInt();
    		if(sel ==1) {
    			addStudent();
    		}
    		if(sel ==2) {
    			addSubject();
    		}
    		if(sel ==3) {
    			addScore();
    		}
    	}
    }
}

public class test005 {

	public static void main(String[] args) {
		SMS e = new SMS();
		e.run();

	}

}
