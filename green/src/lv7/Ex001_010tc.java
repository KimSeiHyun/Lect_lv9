package lv7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

class Subject2 {
	String title;
	int score;
	
	void setInfo(String title) {
		this.title = title;
	}
	void printInfo() {
		System.out.printf("����� : %s / ���� : %d\n", this.title , this.score);
	}
	void setScore(int score) {
		this.score = score;
	}
}
class Student3{
	int stuCode;
	String name;
	
	int subCnt;
	Subject2 subjects[];
	
	void setInfo(String name , int stuCode) {
		this.name = name;
		this.stuCode = stuCode;
	}
	
	void printInfo() {
		System.out.println(this.stuCode + " " + this.name);
		if(this.subjects != null) {
			for(int i=0; i<this.subjects.length; i++) {
				this.subjects[i].printInfo();
			}
		}
	}
}

class Manager2{
	String filename = "cms.txt";
	File file = new File(filename);
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	// "1.���� 2.Ż�� 3.���� 4.��� 5.���� 6.�ε�"
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	
	int cnt;
	Student3 students[];
	
	void setDefault() {
		this.cnt = 0;
		this.students = null;
	}
	void printMenu() {
		System.out.println("1.����\n2.Ż��\n3.����\n4.���\n5.�����߰�\n6.�����Է�\n7.����\n8.�ε�");
		System.out.print("�޴� : ");
		int sel = sc.nextInt();
			runMenu(sel);
	}
	
	void runMenu(int select) {
		if(select == 1) {
			joinStudent();
		}
		else if(select == 2) {
			removeStudent();
			
		}
		else if(select == 3) {
			alignStudents();
		}
		else if(select == 4) {
			printStudents();
		}
		else if(select == 5) {
			addSubject();
		}
		else if(select == 6) {
			addScore();
		}
		else if(select == 7) {
			save();
		}
		else if(select == 8) {
			load();
		}
	}
	
	void alignStudents() {
		for(int i=0; i<this.cnt; i++) {
			String first = this.students[i].name;
			int idx = i;
			for(int j=0; j<this.cnt; j++) {
				if(first.compareTo(this.students[j].name) > 0) {
					first = this.students[j].name;
					idx = j;
				}
			}
			
			Student3 temp = this.students[i];
			this.students[i] = this.students[idx];
			this.students[idx] = temp;
		}
	}
	void joinStudent() {
		System.out.print("�л��� : ");
		String name = sc.next();
		
		Student3 temp[] = this.students;
		this.students = new Student3[this.cnt + 1];
		if(this.cnt > 0) {
			for(int i=0; i<this.cnt; i++) {
				this.students[i] = temp[i];
			}
		}
		
		this.students[this.cnt] = new Student3();
		this.students[this.cnt].setInfo(name, ranCode());
		this.cnt ++;
	}
	
	int studentIndex() {
		int idx = -1;
		System.out.print("�л��� : ");
		String name = sc.next();
		
		for(int i=0; i<this.cnt; i++) {
			if(name.equals(this.students[i].name)) {
				System.out.println(this.students[i].stuCode);
			}
		}
		
		System.out.print("�й� �Է� : ");
		int code = sc.nextInt();
		for(int i=0; i<this.cnt; i++) {
			if(this.students[i].stuCode == code) {
				idx = i;
			}
		}
		return idx;
	}
	void removeStudent() {
		
		int delIdx = studentIndex();
		
		
		if(delIdx != -1) {
			Student3 temp[] = this.students;
			this.students = new Student3[this.cnt -1];
			
			int idx = 0;
			for(int i=0; i<this.cnt; i++) {
				if( i != delIdx) {
					this.students[idx] = temp[i];
					idx ++;
				}
			}
			System.out.println("Ż��Ϸ�");
			this.cnt --;
		}
	}
	
	void addScore() {
		int stuIdx = studentIndex();
		if(stuIdx != -1) {
			for(int i=0; i<this.students[stuIdx].subCnt; i++) {
				System.out.print(i+1 + ") ");
				this.students[stuIdx].subjects[i].printInfo();
			}
//			System.out.print("������ �Է��� ����� : ");
//			sc.nextLine();
//			String titel = sc.nextLine();
			System.out.print("���� : ");
			int num = sc.nextInt()-1;
			
			System.out.println("���� :");
			int score = sc.nextInt();
			
//			this.students[stuIdx].subjects[num].score = score;
			this.students[stuIdx].subjects[num].setScore(score); // �� ������ �ڵ� (���� �ڵ庸��)
		}
	}
	void addSubject() {
		int stuIdx = studentIndex();
		
		if(stuIdx != -1 ) {
			int cnt = this.students[stuIdx].subCnt;
			
			sc.nextLine();
			System.out.print("����� : ");
			String title = sc.nextLine();
			// next(); - " " 
			// nextLine(); - "\n"
			// �ؽ�Ʈ������ ����� \n�� ���۶��ο� �����ձ⶧���� �տ��� �ѹ� ��ȸ���� ��������� .
			int check = 1;
			for(int i=0; i<cnt; i++) {
				if(title.equals(this.students[stuIdx].subjects[i].title)) {
					check = -1;
				}
			}
			if(check == 1) {
				Subject2 temp[] = this.students[stuIdx].subjects;
				this.students[stuIdx].subjects = new Subject2[cnt +1];
				if(cnt > 0) {
					for(int i=0; i<cnt; i++) {
						this.students[stuIdx].subjects[i] = temp[i];
					}
				}
				this.students[stuIdx].subjects[cnt] = new Subject2();
				this.students[stuIdx].subjects[cnt].setInfo(title);
				this.students[stuIdx].subCnt ++;
			}
		}
	}
	
	
	int ranCode() { // 1000 ~ 9999
		int rCode;
		int check = 1;
		while(true) {
			rCode = rn.nextInt(8998) + 1000;
			for (int i = 0; i < this.cnt; i++) {
				if (this.students[i].stuCode == rCode) {
					check = -1;
				}
			}
			if (check == 1) {
				break;
			}
		}
		return rCode;
	}
	
	void save() {
		
		// 1111/ȫ�浿/2/title1/score1/titel2/score2
		// 1112/ȫ�Ѹ�/1/titel1/score1
		
		String data= "";
		
		for(int i=0; i<this.cnt; i++) {
			String info = "";
			info += this.students[i].stuCode + "/";
			info += this.students[i].name + "/";
			info += this.students[i].subCnt + "/";
			
			for(int j=0; j<this.students[i].subCnt; j++) {
				info += this.students[i].subjects[j].title + "/";
				info += this.students[i].subjects[j].score;
				if(j != this.students[i].subCnt-1) {
					info += "/";
				}
			}
			data += info;
			if(i != this.cnt -1) {
				data += "\n";
			}
			
			try {
				fw = new FileWriter(file);
				fw.write(data);
				fw.close();
				System.out.println("����Ϸ�");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("�������");
			}
		}
		
	}
	
	void load() {
		setDefault();
		String data = "";
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String info = br.readLine();
			while(info != null) {
				data += info +"\n";
				this.cnt ++;
				info = br.readLine();
			}
			
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// �о�� ������(���ڿ�)�� > �Ľ��ؼ� > �迭�� �־��ֱ� . 
		
		// 1111/ȫ�浿/2/title1/score1/titel2/score2
		// 1112/ȫ�Ѹ�/1/titel1/score1
		
		String temp[] = data.split("\n");
		this.students = new Student3[this.cnt];
		
		for(int i=0; i<temp.length; i++) {
			this.students[i] = new Student3();
			
			String[] info = temp[i].split("/");
			this.students[i].setInfo(info[1], Integer.parseInt(info[0]));
			this.students[i].subCnt = Integer.parseInt(info[2]);
			this.students[i].subjects = new Subject2[this.students[i].subCnt];
			
			int k = 0;
			for(int j=0; j<this.students[i].subCnt; j++) {
				this.students[i].subjects[j] = new Subject2();
				
				this.students[i].subjects[j].setInfo(info[3+j*k]);
				this.students[i].subjects[j].setScore(Integer.parseInt(info[3+j*k+1]));
				k += 2;
				
			
			}
		}
		
	}
	
	void printStudents() {
		for(int i=0; i<this.cnt; i++) {
			this.students[i].printInfo();
		}
	}
	
	void run() {
		while(true) {
			printStudents();
			printMenu();
			
		}
	}
	
}

public class Ex001_010tc {

	public static void main(String[] args) {
		
		Manager2 m = new Manager2();
		m.run();
	}

}
