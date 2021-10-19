package lv.test_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Students1{
	private String id;
	private String pw;
	
	public Students1(String id , String pw) {
		this.id = id;
		this.pw = pw;
	}
	public String getId () {
		return this.id;
	}
	public String getPw () {
		return this.pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
class Managers1{
	public static Scanner sc = new Scanner(System.in);
	private int cnt = 0;
	private Students1 list[];
	private File file = new File("lv7");
	private FileWriter fw = null;
	private FileReader fr = null;
	private BufferedReader br = null;
	public void printMenu() {
		System.out.println("1.����\n2.Ż��\n3.����\n4.���\n5.����\n6.�ε�");
	}
	public void set() {
		for(int i=0; i<cnt; i++) {
			list[i] = new Students1("","");
		}
	}
	
	public void signUp () {
		System.out.print("ȸ������ id �Է� : ");
		String id = sc.next();
		int check = 0;
		for(int i=0; i<this.cnt; i++) {
			if(this.list[i].getId().equals(id)) check = 1;
		}
		if(check == 0 ) {
			System.out.print("ȸ������ pw �Է� : ");
			String pw = sc.next();
			Students1 temp[] = this.list;
			this.cnt ++;
			this.list = new Students1[cnt];
			set();
			for(int i=0; i<this.cnt-1; i++) {
				this.list[i] = temp[i];
			}
			
			this.list[cnt-1].setId(id);
			this.list[cnt-1].setPw(pw);
			
		}else System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
	}
	
	public void leave() {
		if(this.cnt != 0) {
			System.out.print("Ż���� id �Է� : ");
			String id = sc.next();
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(this.list[i].getId().equals(id)) idx = i;
			}
			if(idx != -1) {
				System.out.print("Ż���� pw �Է� : ");
				String pw = sc.next();
				if(this.list[idx].getPw().equals(pw)) {
					this.list[idx].setId(null);
					Students1 temp[] = this.list;
					this.cnt --;
					this.list = new Students1[this.cnt];
					int x = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i].getId() != null) {
							this.list[x] = temp[i];
							x++;
						}
					}
					
				}else System.out.println("��й�ȣ Ȯ�� ! ");
				
			}else System.out.println("���̵� Ȯ�� ! ");
		}else System.out.println("Ż���� ���̵� �����ϴ�.");
	}
	
	public void sort() {
		for(int i=0; i<this.cnt; i++) {
			for(int j=0; j<this.cnt; j++) {
				if(i != j && this.list[i].getId().compareTo(this.list[j].getId()) <0) {
					Students1 temp = this.list[i];
					this.list[i] = this.list[j];
					this.list[j] = temp;
				}
			}
		}
	}
	
	public void save() {
		try {
			this.fw = new FileWriter(this.file);
			for(int i=0; i<this.cnt; i++) {
				fw.write(this.list[i].getId()+"/");
				fw.write(this.list[i].getPw()+"\n");
			}
			fw.close();
			System.out.println("���强��!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void load() {
		try {
			this.cnt = 0;
			this.fr = new FileReader(file);
			this.br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				this.cnt ++;
				
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("cnt  : "+this.cnt);
		list = new Students1[this.cnt];
		set();
		try {
			this.fr = new FileReader(file);
			this.br = new BufferedReader(fr);
			int x = 0;
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String temp[] = data.split("/");
				this.list[x].setId(temp[0]);
				this.list[x].setPw(temp[1]);
				x++;
			}
			fr.close();
			br.close();
			System.out.println("����Ϸ�!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void print() {
		System.out.print("id : ");
		for(int i=0; i<this.cnt; i++) {
			System.out.print(this.list[i].getId() + "\t");
		}System.out.println();
		System.out.print("pw : ");
		for(int i=0; i<this.cnt; i++) {
			System.out.print(this.list[i].getPw() + "\t");
		}System.out.println();
	}
	public void run() {
		set();
		while(true) {
			printMenu();
			int sel = sc.nextInt();
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
			
		}
		
	}
	
	// "1.���� 2.Ż�� 3.���� 4.��� 5.���� 6.�ε�"
	
}

public class lv7_14 {

	public static void main(String[] args) {
		Managers1 e = new Managers1();
		e.run();

	}

}
