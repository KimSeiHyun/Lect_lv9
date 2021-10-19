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
		System.out.printf("과목명 : %s / 성적 : %d\n", this.title , this.score);
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
	
	// "1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드"
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	
	int cnt;
	Student3 students[];
	
	void setDefault() {
		this.cnt = 0;
		this.students = null;
	}
	void printMenu() {
		System.out.println("1.가입\n2.탈퇴\n3.정렬\n4.출력\n5.과목추가\n6.성적입력\n7.저장\n8.로드");
		System.out.print("메뉴 : ");
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
		System.out.print("학생명 : ");
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
		System.out.print("학생명 : ");
		String name = sc.next();
		
		for(int i=0; i<this.cnt; i++) {
			if(name.equals(this.students[i].name)) {
				System.out.println(this.students[i].stuCode);
			}
		}
		
		System.out.print("학번 입력 : ");
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
			System.out.println("탈퇴완료");
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
//			System.out.print("성적을 입력할 과목명 : ");
//			sc.nextLine();
//			String titel = sc.nextLine();
			System.out.print("선택 : ");
			int num = sc.nextInt()-1;
			
			System.out.println("성적 :");
			int score = sc.nextInt();
			
//			this.students[stuIdx].subjects[num].score = score;
			this.students[stuIdx].subjects[num].setScore(score); // 더 안전한 코드 (위에 코드보다)
		}
	}
	void addSubject() {
		int stuIdx = studentIndex();
		
		if(stuIdx != -1 ) {
			int cnt = this.students[stuIdx].subCnt;
			
			sc.nextLine();
			System.out.print("과목명 : ");
			String title = sc.nextLine();
			// next(); - " " 
			// nextLine(); - "\n"
			// 넥스트라인을 쓸경우 \n이 버퍼라인에 남아잇기때문에 앞에서 한번 공회전을 시켜줘야함 .
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
		
		// 1111/홍길동/2/title1/score1/titel2/score2
		// 1112/홍둘리/1/titel1/score1
		
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
				System.out.println("저장완료");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("저장실패");
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
		
		// 읽어온 데이터(문자열)을 > 파싱해서 > 배열에 넣어주기 . 
		
		// 1111/홍길동/2/title1/score1/titel2/score2
		// 1112/홍둘리/1/titel1/score1
		
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
