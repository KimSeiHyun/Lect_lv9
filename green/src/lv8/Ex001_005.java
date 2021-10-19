package lv8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Student{
	String id;
	String pw;
	
	Student(String id , String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	
}
class Manager{
	private Student arr[];
	private int size;
	File file = new File("Ex001_005");
	public boolean sign(Student s) {
		try {
			if(this.size == 0) {
				this.size ++;
				arr = new Student[this.size];
				arr[this.size-1] = s;
			}else {
				int check = 0;
				for(int i=0; i<this.size; i++) {
					if(s.id.equals(arr[i].id)) {
						check = 1;
					}
				}
				if(check == 0) {
					Student temp[] = arr;
					this.size ++;
					arr = new Student[this.size];
					for(int i=0; i<temp.length; i++) {
						this.arr[i] = temp[i];
					}
					arr[this.size-1] = s;
				}else System.out.println("중복된 아이디입니다.");
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean leave(Student s) {
		try {
			if(this.size != 0) {
				int idx = -1;
				for(int i=0; i<this.size; i++) {
					if(this.arr[i].id.equals(s.id) && this.arr[i].pw.equals(s.pw)) {
						idx = i;
					}
				}
				if(idx != -1) {
					Student temp[] = arr;
					this.size --;
					arr = new Student[this.size];
					int x = 0;
					for(int i=0; i<temp.length; i++) {
						if(i != idx) {
							this.arr[x] = temp[i];
							x++;
						}
					}
					
				}else System.out.println("회원정보를 다시 확인해주세요 . ");
				
			}else System.out.println("탈퇴할 아이디가 없습니다.");
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void sort() {
		for(int i=0; i<this.size; i++) {
			for(int j=i; j<this.size; j++) {
				if(j != i && this.arr[i].id.compareTo(this.arr[j].id) > 0) {
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public void save() {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for(int i=0; i<this.size; i++) {
				fw.write(arr[i].id+"/");
				fw.write(arr[i].pw+"\n");
			}
			fw.close();
			System.out.println("save성공");
		} catch (Exception e) {
			System.out.println("save실패");
		}
	}
	
	public void load() {
		FileReader fr = null;
		BufferedReader br = null;
		int check = 0;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				check ++;
			}
			fr.close();
			br.close();
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			for(int b = 0; b <check; b++) {
				if(this.size == 0) {
					String data = br.readLine();
					String temp[] = data.split("/");
					this.size ++;
					arr = new Student[this.size];
					Student a = new Student(temp[0],temp[1]);
					arr[0] = a; 
					
				}else {
						Student temp[] = arr;
						String data = br.readLine();
						String temp2[] = data.split("/");
						this.size++;
						arr = new Student[this.size];
						for(int j=0; j<temp.length; j++) {
							arr[j] = temp[j];
						}
						Student a = new Student(temp2[0],temp2[1]);
						arr[this.size-1] = a;
				}
				
			}

			System.out.println("load성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("load실패");
		}
	}
	
	
	
	public void print() {
		System.out.print("id : ");
		for(int i=0; i<this.size; i++) {
			System.out.print(arr[i].id + "\t");
		}System.out.println();
		System.out.print("pw : ");
		for(int i=0; i<this.size; i++) {
			System.out.print(arr[i].pw + "\t");
		}System.out.println();
	}
}

public class Ex001_005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		boolean run  = true;
		while(run) {
			manager.print();
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드");
			int sel = sc.nextInt();
			if(sel == 1 ) {
				System.out.print("id 입력 : ");
				String id = sc.next();
				System.out.print("pw 입력 : ");
				String pw = sc.next();
				Student a = new Student(id,pw);
				manager.sign(a);
			}
			if(sel == 2 ) {
				System.out.print("id 입력 : ");
				String id = sc.next();
				System.out.print("pw 입력 : ");
				String pw = sc.next();
				Student a = new Student(id,pw);
				manager.leave(a);
			}
			if(sel == 3 ) {
				manager.sort();
			}
			if(sel == 4 ) {
				manager.print();
			}
			if(sel == 5 ) {
				manager.save();
			}
			if(sel == 6 ) {
				manager.load();
			}
		}
	}
}