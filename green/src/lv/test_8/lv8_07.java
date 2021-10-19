package lv.test_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private  String id;
	private  String pw;
	
	public Student(String id , String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return this.id;
	}
	public String getPw() {
		return this.pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
class Manager{
	ArrayList<Student> group = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	private int cnt = 0;
	File file = new File("lv8_07");
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	public void add() {
		System.out.print("회원가입 id 입력 : ");
		String id = sc.next();
		int check = 0;
		for(int i=0; i<this.group.size(); i++) {
			if(this.group.get(i).getId().equals(id)) check = 1;
		}
		if(check == 0) {
			System.out.print("회원가입 pw 입력 : ");
			String pw = sc.next();
			Student a = new Student(id,pw);
			group.add(a);
			
		}else System.out.println("중복된 id입니다.");
	}
	
	public void remove() {
		System.out.print("탈퇴할 id 입력 : ");
		String id = sc.next();
		System.out.print("탈퇴할 pw 입력 : ");
		String pw = sc.next();
		int idx = -1;
		for(int i=0; i<this.group.size(); i++) {
			if(this.group.get(i).getId().equals(id) && this.group.get(i).getPw().equals(pw)) {
				idx = i;
			}
		}
		if(idx != -1) {
			group.remove(idx);		
			
		}
	}
	
	public void sort() {
		for(int i=0;i <this.group.size(); i++) {
			for(int j=0; j<this.group.size(); j++) {
				if(i != j && this.group.get(i).getId().compareTo(this.group.get(j).getId()) < 0 ) {
					String id = this.group.get(i).getId();
					String pw = this.group.get(i).getPw();
					this.group.get(i).setId(this.group.get(j).getId());
					this.group.get(i).setPw(this.group.get(j).getPw());
					this.group.get(j).setId(id);
					this.group.get(j).setPw(pw);
				}
			}
		}
	}
	public void print( ) {
		System.out.print("id : ");
		for(int i=0; i<group.size(); i++) {
			System.out.print(this.group.get(i).getId() + "\t");
		}System.out.println();
		System.out.print("pw : ");
		for(int i=0; i<group.size(); i++) {
			System.out.print(this.group.get(i).getPw() + "\t");
		}System.out.println();
	}
	
	public void save() {
		try {
			fw = new FileWriter(file);
			for(int i=0; i<this.group.size(); i++) {
				fw.write(this.group.get(i).getId()+"/");				
				fw.write(this.group.get(i).getPw()+"\n");				
			}
			fw.close();
			System.out.println("저장완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void load() {
		try {
			this.group.clear();
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String temp[] = data.split("/");
				Student a = new Student(temp[0],temp[1]);
				this.group.add(a);
			}
			System.out.println("로드성공 ! ");
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class lv8_07 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		boolean run  = true;
		while(run) {
			manager.print();
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드");
			int sel = sc.nextInt();
			if(sel == 1) {
				manager.add();
			}
			if(sel == 2) {
				manager.remove();
			}
			if(sel == 3) {
				manager.sort();
			}
			if(sel == 4) {
				
			}
			if(sel == 5) {
				manager.save();
			}
			if(sel == 6) {
				manager.load();
			}
		}
	}
}