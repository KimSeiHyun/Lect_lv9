package lv7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Student{
	String id;
	String pw;
	String subject[];
	int score[];
	int count = 0;
}
class Manager{
	Scanner sc = new Scanner(System.in);
	File file = new File("ex10");
	FileWriter fw = null;
	BufferedReader br = null;
	FileReader fr = null;
	int cnt = 0;
	// "1.���� 2.Ż�� 3.���� 4.��� 5.���� 6.�ε�"
	Student arr[];
	
	void set() {
		for(int i=0; i<this.cnt; i++) {
			arr[i] = new Student();
		}
	}

	void join () {
		System.out.print("���̵� �Է� : ");
		String inId = sc.next();
		if(this.cnt == 0) {
			this.cnt ++;
			this.arr = new Student[this.cnt];
			set();
			System.out.print("��й�ȣ �Է� : ");
			String inPw = sc.next();
			this.arr[0].id = inId;
			this.arr[0].pw = inPw;
		}
		else {
			int check = 0;
			for(int i=0; i<this.cnt; i++) {
				if(inId.equals(this.arr[i].id)) {
					check = 1;
				}
			}
			if(check == 0) {
				System.out.print("��й�ȣ �Է� : ");
				String inPw = sc.next();
				this.cnt ++;
				String temp1[] = new String[this.cnt-1];
				String temp2[] = new String[this.cnt-1];
				for(int i=0; i<temp1.length; i++) {
					temp1[i] = this.arr[i].id;
					temp2[i] = this.arr[i].pw;
				}
				this.arr = new Student[cnt];
				set();
				for(int i=0; i<temp1.length; i++) {
					this.arr[i].id = temp1[i];
					this.arr[i].pw = temp2[i];
				}
				this.arr[cnt-1].id = inId;
				this.arr[cnt-1].pw = inPw;
				
			}else System.out.println("�ش� ���̵� �̹� �����մϴ� . ");
		}

	}
	
	
	void leave () {
		if(this.cnt != 0) {
			System.out.print("���̵� �Է� : ");
			String delId = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(delId.equals(this.arr[i].id)) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.print("��й�ȣ �Է� : ");
				String delPw = sc.next();
				if(delPw.equals(this.arr[idx].pw)) {
					this.arr[idx].id = null;
					this.arr[idx].pw = null;
					this.cnt --;
					String temp1[] = new String[this.cnt];
					String temp2[] = new String[this.cnt];
					int x = 0;
					for(int i=0; i<this.cnt+1; i++) {
						if(this.arr[i].id != null) {
							temp1[x] = this.arr[i].id;
							temp2[x] = this.arr[i].pw;
							x++;
						}
					}
					this.arr = new Student[cnt];
					set();
					for(int i=0; i<this.cnt; i++ ) {
						this.arr[i].id = temp1[i];
						this.arr[i].pw = temp2[i];
					}
					
				}else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}else System.out.println("�ش� ���̵� ã�� ���߽��ϴ�. ");
			
		}else System.out.println("Ż���� ���̵� �����ϴ�.");
	}
	
	void sort() {
		int x = 0;
		while (x < this.cnt) {
		for(int i=0; i<this.cnt; i++) {
			int max = 0;
			int idx = -1;
			int check = 0;
			for(int j=i; j<this.cnt; j++) {
				if(this.arr[i].id.compareTo(this.arr[j].id) > max) {
					check = 1;
					idx = j;
				}
			}
			if(check == 1) {
				String temp = this.arr[i].id;
				this.arr[i].id = this.arr[idx].id;
				this.arr[idx].id = temp;
				String temp2 = this.arr[i].pw;
				this.arr[i].pw = this.arr[idx].pw;
				this.arr[idx].pw = temp2;
			}
		}
		x++;
		}
	}
	
	void save() {
		System.out.println("���� ȸ�������� �����Ͻðڽ��ϱ� ?  1.yes  2.no");
		int sel = sc.nextInt();
		if(sel == 1) {
		try {
			fw = new FileWriter(file);
			for(int i=0; i<this.cnt; i++) {
				fw.write(this.arr[i].id+"/"+this.arr[i].pw+"\n");
				if(this.arr[i].count != 0) {
					for(int j=0; j<this.arr[i].count; j++) {
						fw.write(this.arr[i].subject[j]+",");
						fw.write(this.arr[i].score[j]+"\n");
					}
				}
			}
			fw.close();
			System.out.println("���� ȸ������ ����Ϸ�!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else if (sel == 2) System.out.println("save�� ����մϴ�. ");
	}
	void load() {
		System.out.println("���� �����Ϳ��� save������ load �Ͻðڽ��ϱ� ? 1.yes  2.no");
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
					//���̵� /�� ������ �����߱⶧���� /�� ���������� cnt ++; �ؼ� ����� ���̵� ���� ã��.
					if(data.charAt(i) == '/') { 
						this.cnt ++;
					}
				}
				x++;
			}
			fr.close();
			br.close();
			
			this.arr = new Student[this.cnt];
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
					//���������� ','�� �߱� ������ ���ο� ���̵� ã�� ���� ,�� ������ ���̵�ȿ� �ִ� 
					//���� �迭�̶� ���� �迭�� �ε��Ҽ��ְ� �ʱ�ȭ ���� 
					if(data.charAt(i) == ',') {
						this.arr[this.cnt-1].count ++;
						this.arr[this.cnt-1].subject = new String[this.arr[cnt-1].count];
						this.arr[this.cnt-1].score = new int[this.arr[cnt-1].count];
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
						//�����ð� ������ ���̵�� ��й�ȣ ����. 
						arr++;
						sub = 0;
						String temp[] = data.split("/");
						this.arr[arr].id = temp[0];
						this.arr[arr].pw = temp[1];
					}
					if(data.charAt(j) == ',') {
						//�����ð� ������ ���� ,�� ������ ���� ���Ӵ� ���̵� ����,������ �����ؼ� ���� 
						String temp[] = data.split(",");
						this.arr[arr].subject[sub] = temp[0];
						this.arr[arr].score[sub] = Integer.parseInt(temp[1]);
						sub ++;
					}
					
				}
			}
			fr.close();
			br.close();
			System.out.println("�ε� �Ϸ� ! ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else if (sel == 2) System.out.println("�ε带 ����մϴ� .");
	}
	
	void addSubject () {
		if(this.cnt != 0) {
			System.out.print("������ �߰��� ���̵� �Է� : ");
			String inId = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(inId.equals(this.arr[i].id)) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.println("�߰��� ���� �Է� : ");
				String s = sc.next();
				int subjectCheck = 0;
				
				for(int i=0; i<this.arr[idx].count; i++) {
					if(s.equals(this.arr[idx].subject[i])) {
						subjectCheck = 1;
					}
				}
				if(subjectCheck == 1) {
					System.out.println("�ش� ������ �̹� �����մϴ�.");
				}
				else {
					this.arr[idx].count ++;
					String temp[] = this.arr[idx].subject;
					int temp2[] = this.arr[idx].score;
					this.arr[idx].subject = new String[this.arr[idx].count];
					this.arr[idx].score = new int[this.arr[idx].count];
					if(this.arr[idx].count != 1) {
					for(int i=0; i<temp.length; i++) {
						this.arr[idx].subject[i] = temp[i];
						this.arr[idx].score[i] = temp2[i];
					}
					}
					this.arr[idx].subject[this.arr[idx].count-1] = s;
				}
			}else System.out.println("���̵� ã�� ���߽��ϴ�.");
		}else System.out.println("�����߰��� �� ���̵� �������� �ʽ��ϴ�.");
	}
	void addScore() {
		if(this.cnt != 0) {
			System.out.print("������ �߰��� ���̵� �Է� : ");
			String inId = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(this.arr[i].id.equals(inId)) {
					check = 1;
					idx = i;
				}
			}
			
			if(check ==1 ) {
				if(this.arr[idx].count != 0) {
					System.out.print("������ �߰��� ���� �Է� : ");
					String sub = sc.next();
					int check2 = 0;
					int idx2 = -1;
					for(int i=0; i<this.arr[idx].count; i++) {
						if(this.arr[idx].subject[i].equals(sub)) {
							check2 = 1;
							idx2 = i;
						}
					}
					if(check2 == 1) {
						System.out.print("���� �Է� : ");
						int s = sc.nextInt();
						this.arr[idx].score[idx2] = s;
					}else {
						System.out.println("�ش� ������ ã�� ���߽��ϴ�.");
					}
				}else {
					System.out.println("������ �߰��� ������ �������� �ʽ��ϴ� .");
				}
			}else {
				System.out.println("���̵� ã�� ���߽��ϴ�.");
			}
		} else {
			System.out.println("������ �߰��� ���̵� �������� �ʽ��ϴ�.");
		}
	}
	void scorePrint() {
		if(this.cnt != 0) {
			System.out.print("������ ������� ���̵� �Է� : ");
			String s = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(this.arr[i].id.equals(s)) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				if(this.arr[idx].count != 0) {

					
				System.out.print("���� : ");
				for(int i=0; i<this.arr[idx].subject.length; i++) {
					System.out.print(this.arr[idx].subject[i] + "\t");
				}System.out.println();
				
				System.out.print("���� : ");
				for(int i=0; i<this.arr[idx].score.length; i++) {
					System.out.print(this.arr[idx].score[i] + "\t");
				}System.out.println();
				
				} else System.out.println("��ȸ�� ������ �����ϴ�.");
			}else System.out.println("���̵� ã���������ϴ�.");
		}else System.out.println("��ȸ�� ���̵� �����ϴ� . ");
		
	}
	
	void print() {
		System.out.print("id : ");
		for(int i=0; i<this.cnt; i++) {
			System.out.print(this.arr[i].id + "\t");
		}System.out.println();
		System.out.print("pw : " );
		for(int i=0; i<this.cnt; i++) {
			System.out.print(this.arr[i].pw + "\t");
		}System.out.println();
	}
	
	public void run () {
		while(true) {
			System.out.println("1.����\n2.Ż��\n3.����\n4.���\n5.����\n6.�ε�\n7.�����߰�\n8.�����߰�\n9.�Է��� ���̵��� �������");
			System.out.println("this.cnt : " + this.cnt);
			int sel = sc.nextInt();
			if(sel == 1) {
				join();
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


public class Ex001_010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ex = new Manager();
		ex.run();
	}

}
