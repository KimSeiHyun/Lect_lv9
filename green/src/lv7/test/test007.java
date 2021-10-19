package lv7.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;



//시작시간 11 : 06
//종료시간 12 : 48
//소요시간 01 : 42

class Student {
	String id;
	String pw;
	String subject[];
	int score[];
	int count;
	
}

class Manager {
	Scanner sc = new Scanner(System.in);
	
	File file = new File("test007");
	FileWriter fw = null;
	BufferedReader br = null;
	FileReader fr = null;
	Student student[];
	int cnt;
	
	
	void set() {
		student = new Student[this.cnt];
		for(int i=0; i<this.cnt; i++) {
			this.student[i] = new Student();
		}
	}
	void signUp() {
		System.out.println("아이디 입력 : ");
		String inId = sc.next();
		int check = 0;
		for(int i=0; i<this.cnt; i++) {
			if(inId.equals(this.student[i].id)) {
				check = 1;
			}
		}
		if(check == 0) {
			System.out.println("비밀번호 입력 : ");
			String inPw = sc.next();
			if(this.cnt ==0) {
				this.cnt ++;
				set();
				this.student[this.cnt-1].id = inId;
				this.student[this.cnt-1].pw = inPw;
			}else {
				String temp1[] = new String[this.cnt];
				String temp2[] = new String[this.cnt];
				for(int i=0; i<temp1.length; i++) {
					temp1[i] = this.student[i].id;
					temp2[i] = this.student[i].pw;
				}

				this.cnt ++;
				set();
				for(int i=0; i<temp1.length; i++) {
					this.student[i].id = temp1[i];
					this.student[i].pw = temp2[i];
				}
				this.student[this.cnt-1].id = inId;
				this.student[this.cnt-1].pw = inPw;
				
			}
			
		}else {
			System.out.println("이미 존재하는 아이디입니다 . ");
		}
	}
	
	void leave() {
		if(this.cnt != 0 ) {
			System.out.println("아이디 입력 : ");
			String delId = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(delId.equals(this.student[i].id)) {
					check = 1;
					idx = i;
				}
			}
			
			if(check == 1) {
				System.out.println("비밀번호 입력 : ");
				String delPw = sc.next();
				if(this.student[idx].pw.equals(delPw)) {
					String temp1[] = new String[this.cnt];
					String temp2[] = new String[this.cnt];
					for(int i=0; i<temp1.length; i++) {
						temp1[i] = this.student[i].id;
						temp2[i] = this.student[i].pw;
					}

					this.cnt --;
					set();
					int x = 0;
					for(int i=0; i<this.cnt+1; i++) {
						if(i != idx) {
							this.student[x].id = temp1[i];
							this.student[x].pw = temp2[i];
							x++;
						}
					}

				}
				else {
					System.out.println("비밀번가 맞지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디를 찾지 못했습니다 . ");
			}
		}else {
			System.out.println("회원탈퇴 할 아이디가 존재하지 않습니다 . ");
		}
	}
	
	void sort() {
		int x = 0;
		while (x < this.cnt) {
		for(int i=0; i<this.cnt; i++) {
			int max = 0;
			int idx = -1;
			int check = 0;
			for(int j=i; j<this.cnt; j++) {
				if(this.student[i].id.compareTo(this.student[j].id) > max) {
					check = 1;
					idx = j;
				}
			}
			if(check == 1) {
				String temp = this.student[i].id;
				this.student[i].id = this.student[idx].id;
				this.student[idx].id = temp;
				String temp2 = this.student[i].pw;
				this.student[i].pw = this.student[idx].pw;
				this.student[idx].pw = temp2;
			}
		}
		x++;
		}
	}
	
	void print() {
		System.out.print("id : ");
		for(int i=0; i<this.cnt; i++) {
			System.out.print(this.student[i].id + " ");
		}System.out.println();
		System.out.print("pw : ");
		for(int i=0; i<this.cnt; i++) {
			System.out.print(this.student[i].pw + " ");
		}System.out.println();
	}
	
	void save() {
		System.out.println("save 하시겠습니까 ?  1.yes  2.no");
		int sel = sc.nextInt();
		if(sel == 1) {
		try {
			fw = new FileWriter(file);
			for(int i=0; i<this.cnt; i++) {
				fw.write(this.student[i].id+"/"+this.student[i].pw+"\n");
				if(this.student[i].count != 0) {
					for(int j=0; j<this.student[i].count; j++) {
						fw.write(this.student[i].subject[j]+",");
						fw.write(this.student[i].score[j]+"\n");
					}
				}
			}
			fw.close();
			System.out.println("save성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else if (sel == 2) System.out.println("save를 취소합니다. ");
	}
	
	void load() {
		System.out.println("현재 데이터에서 load 하시겠습니까 ? 1.yes  2.no");
		int sel = sc.nextInt();
		if(sel == 1) {
		this.cnt = 0;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			int x = 0;
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				for(int i=0; i<data.length(); i++) {
					if(data.charAt(i) == '/') { 
						this.cnt ++;
					}
				}
				x++;
			}
			fr.close();
			br.close();
			
			this.student = new Student[this.cnt];
			set();
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			this.cnt = 0;
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				for(int i=0; i<data.length(); i++) {
					if(data.charAt(i) == '/') {
						this.cnt ++;
					}
					if(data.charAt(i) == ',') {
						this.student[this.cnt-1].count ++;
						this.student[this.cnt-1].subject = new String[this.student[cnt-1].count];
						this.student[this.cnt-1].score = new int[this.student[cnt-1].count];
					}
				}
			}
			fr.close();
			br.close();
			

			fr = new FileReader(file);
			br = new BufferedReader(fr);
			int arr = -1;
			int sub = 0;
			for(int i=0; i<x; i++) {
				String data = br.readLine();
				for(int j=0; j<data.length(); j++) {
					if(data.charAt(j) == '/') {
						arr++;
						sub = 0;
						String temp[] = data.split("/");
						this.student[arr].id = temp[0];
						this.student[arr].pw = temp[1];
					}
					if(data.charAt(j) == ',') {
						String temp[] = data.split(",");
						this.student[arr].subject[sub] = temp[0];
						this.student[arr].score[sub] = Integer.parseInt(temp[1]);
						sub ++;
					}
					
				}
			}
			fr.close();
			br.close();
			System.out.println("load 성공 . ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else if (sel == 2) System.out.println("로드를 취소합니다 .");
	}
	
	void addSubject () {
		if(this.cnt != 0) {
			System.out.print("아이디 입력 : ");
			String inId = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(inId.equals(this.student[i].id)) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.println("과목 입력 : ");
				String s = sc.next();
				int subjectCheck = 0;
				
				for(int i=0; i<this.student[idx].count; i++) {
					if(s.equals(this.student[idx].subject[i])) {
						subjectCheck = 1;
					}
				}
				if(subjectCheck == 1) {
					System.out.println("해당 과목이 이미 존재합니다.");
				}
				else {
					this.student[idx].count ++;
					String temp[] = this.student[idx].subject;
					int temp2[] = this.student[idx].score;
					this.student[idx].subject = new String[this.student[idx].count];
					this.student[idx].score = new int[this.student[idx].count];
					if(this.student[idx].count != 1) {
					for(int i=0; i<temp.length; i++) {
						this.student[idx].subject[i] = temp[i];
						this.student[idx].score[i] = temp2[i];
					}
					}
					this.student[idx].subject[this.student[idx].count-1] = s;
				}
			}else System.out.println("아이디를 찾지 못했습니다.");
		}else System.out.println("과목추가를 할 아이디가 존재하지 않습니다.");
	}
	
	void addScore() {
		if(this.cnt != 0) {
			System.out.print("아이디 입력 : ");
			String inId = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(this.student[i].id.equals(inId)) {
					check = 1;
					idx = i;
				}
			}
			
			if(check ==1 ) {
				if(this.student[idx].count != 0) {
					System.out.print("과목 입력 : ");
					String sub = sc.next();
					int check2 = 0;
					int idx2 = -1;
					for(int i=0; i<this.student[idx].count; i++) {
						if(this.student[idx].subject[i].equals(sub)) {
							check2 = 1;
							idx2 = i;
						}
					}
					if(check2 == 1) {
						System.out.print("성적 입력 : ");
						int s = sc.nextInt();
						this.student[idx].score[idx2] = s;
					}else {
						System.out.println("해당 과목을 찾지 못했습니다.");
					}
				}else {
					System.out.println("성적을 추가할 과목이 존재하지 않습니다 .");
				}
			}else {
				System.out.println("아이디를 찾지 못했습니다.");
			}
		} else {
			System.out.println("성적을 추가할 아이디가 존재하지 않습니다.");
		}
	}
	
	void scorePrint() {
		if(this.cnt != 0) {
			System.out.print("성적을 보고싶은 아이디를 입력 : ");
			String s = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(this.student[i].id.equals(s)) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				if(this.student[idx].count != 0) {

					
				System.out.print("과목 : ");
				for(int i=0; i<this.student[idx].subject.length; i++) {
					System.out.print(this.student[idx].subject[i] + "\t");
				}System.out.println();
				
				System.out.print("성적 : ");
				for(int i=0; i<this.student[idx].score.length; i++) {
					System.out.print(this.student[idx].score[i] + "\t");
				}System.out.println();
				
				} else System.out.println("조회할 성적이 없습니다.");
			}else System.out.println("아이디를 찾을수없습니다.");
		}else System.out.println("조회할 아이디가 없습니다 . ");
		
	}
	
	public void run() {
		while(true) {
			System.out.println("1.가입\n2.탈퇴\n3.정렬\n4.출력\n5.저장\n6.로드\n7.과목추가\n8.성적추가\n9.성적확인");
			int sel =sc.nextInt();
			if(sel == 1) {
				signUp();
			}
			if(sel == 2) {
				leave();
			}
			if(sel == 3) {
				sort();
			}
			if(sel == 4) {
				print();
			}
			if(sel == 5) {
				save();
			}
			if(sel == 6) {
				load();
			}
			if(sel == 7) {
				addSubject();
			}
			if(sel == 8) {
				addScore();
			}
			if(sel == 9) {
				scorePrint();
			}
		}
		
	}
}

public class test007 {

	public static void main(String[] args) {
		// "1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.과목추가 8.성적추가 9.성적확인"
		Manager ex = new Manager();
		ex.run();
	}

}
