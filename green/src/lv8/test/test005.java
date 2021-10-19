package lv8.test;

import java.util.ArrayList;
import java.util.Scanner;

//���� 11:21
//���� 11:57
//�ҿ� 00:36

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
		System.out.print("�߰��� �л��� �̸� �Է� : ");
		String name = sc.next();
		Student a = new Student(name);
		this.student.add(a);
	}
	
	public void addSubject() {
		if(this.student.size() != 0) {
			System.out.print("������ �߰��� �л� �Է� : ");
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
				System.out.print("�߰��� ���� �Է� : ");
				String subject = sc.next();
				int check2 = 0;
				for(int i=0; i<this.student.get(idx).getSize(); i++) {
					if(this.student.get(idx).getSubject(i).equals(subject)) {
						check2 = 1;
					}
				}
				if(check2 == 0) {
					this.student.get(idx).addSubject(subject);
				}else System.out.println("�ش� ������ �̹� �����մϴ�.");
			}else System.out.println("�л��� �̸��� �������� �ʽ��ϴ�.");
		}else System.out.println("�л��� ���� �߰����ּ��� . ");
	}
	
	public void addScore() {
		if(this.student.size() != 0) {
			System.out.print("������ �߰��� �л� �Է� : ");
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
				System.out.print("������ �߰��� ���� �Է� : ");
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
					System.out.print("�߰��� ���� �Է� :");
					int score = sc.nextInt();
					this.student.get(idx).setScore(idx2, score);
				}else System.out.println("�ش� ������ �������� �ʽ��ϴ�. ");
			}else System.out.println("�ش� �л��� �������� �ʽ��ϴ�.");
		}else System.out.println("�л��� ���� �߰����ּ��� / ");
	}
	public void print() {
		for(int i=0; i<this.student.size(); i++) {
			System.out.println("�̸� : " +this.student.get(i).getName());
			System.out.print("���� : ");
			for(int j=0; j<this.student.get(i).getSize(); j++) {
				System.out.print(this.student.get(i).getSubject(j)+"\t");
			}System.out.println();
			System.out.print("���� : ");
			for(int j=0; j<this.student.get(i).getSize(); j++) {
				System.out.print(this.student.get(i).getScore(j)+"\t");
			}System.out.println();
		}
	}
    public void run(){
    	while(true) {
    		print();
    		System.out.println("1.�л��߰�\n2.�����߰�\n3.�����߰�");
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
