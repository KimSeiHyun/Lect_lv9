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
	int cnt = 0; // �л� ��

	void set() {
		for(int i=0; i<st.length; i++) {
			st[i] = new Student2();	
		}
		
	}
	
	void print() {
		for(int i=0; i<this.cnt; i++) {
			System.out.printf("%s : ����%d�� ",this.st[i].name,this.st[i].cnt);
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
			System.out.print("�߰��� �л��� �̸� �Է� : ");
			String s = sc.next();
			int check = 0;
			for(int i=0; i<this.cnt; i++) {
				if(this.st[i].name.equals(s)) {
					check = 1;
				}
			}
			if(check == 1) {
				System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
			}else {
				this.st[this.cnt].name = s;
				this.cnt++;
			}
		}
		else System.out.println("���̻� �߰� �� �� �����ϴ�. ");
	}
	
	void addSubject() {
		System.out.print("������ �߰��� �л��� �̸� �Է� : ");
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
			System.out.print("�߰��� ���� �Է� : ");
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
			else System.out.println("�ش� ������ �̹� �����մϴ� . ");
			}
			else System.out.println("���̻� �߰� �� �� �����ϴ�.");
			
		}
		else System.out.println("�ش� �л��� �̸��� �������� �ʽ��ϴ�.");
	}
	
	void addScore() {
		System.out.print("������ �߰��� �л��� �̸� �Է� : ");
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
			System.out.print("������ �߰��� �л��� ������ �Է����ּ��� . ");
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
				System.out.print("�߰��� ������ �Է����ּ��� : ");
				int score = sc.nextInt();
				this.st[idx1].score[idx2] = score;
				
			}else System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
			
		}else System.out.println("�ش� �л��� �̸��� �������� �ʽ��ϴ�.");
		
		
		
		
		
	}
}
public class Ex001_009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	// # �л� �߰� ���� ��Ʈ�ѷ�
	//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
	//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
	//   �̸��� : ����2�� ���� 20 ���� 30 
	//   �̿��� : ����1�� ���� 100
		Add ex = new Add();
		ex.set();
		while (true) {
			
			System.out.println("[1]�л� �߰��ϱ�"); // �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�"); // �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�"); // �̸��� ���� �׸��� ���� �Է¹޾� �߰�
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