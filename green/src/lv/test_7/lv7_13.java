package lv.test_7;

import java.util.Scanner;

class Student1 {
	private String name;
	private String subject[] = new String[3];
	private int score[] = new int[3];
	private int cnt;
	public Student1(String name, String subject, int score) {
		this.name = name;
		for(int i=0; i<this.subject.length; i++) {
			this.subject[i] = subject;
		}
		for(int i=0; i<this.subject.length; i++) {
			this.score[i] = score;
		}
	}
	
	public int getSize() {
		return this.score.length;
	}
	public int getCnt() {
		return this.cnt;
	}
	public void setAddCnt() {
		this.cnt++;
	}
	public String getName() {
		return this.name;
	}
	public String getSubject(int idx) {
		return this.subject[idx];
	}
	public int getScore(int idx) {
		return this.score[idx];
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(int idx , String subject) {
		this.subject[idx] = subject;
	}
	public void setScore(int idx , int score) {
		this.score[idx] = score;
	}
}
public class lv7_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	// # �л� �߰� ���� ��Ʈ�ѷ�
	//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
	//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
	//   �̸��� : ����2�� ���� 20 ���� 30 
	//   �̿��� : ����1�� ���� 100

		Student1[] list = new Student1[3];
		int count = 0; // �л� ��
		for(int i=0; i<list.length; i++) {
			list[i] = new Student1("","",0);
		}
		while (true) {
			for(int i=0; i<count; i++) {
				System.out.println(list[i].getName());
				if(list[i].getCnt() >0) {
					System.out.print("���� : ");
					for(int j=0; j<list[i].getCnt(); j++) {
						System.out.print(list[i].getSubject(j) + "\t");
					}System.out.println();
					System.out.print("���� : ");
					for(int j=0; j<list[i].getCnt(); j++) {
						System.out.print(list[i].getScore(j) + "\t");
					}System.out.println();
				}
			}
			System.out.println("[1]�л� �߰��ϱ�"); // �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�"); // �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�"); // �̸��� ���� �׸��� ���� �Է¹޾� �߰�

			int choice = sc.nextInt();

			if (choice == 1) {
				if(count <3) {
					System.out.print("�߰��� �̸� �Է� : ");
					String name = sc.next();
					int check = 0;
					for(int i=0; i<list.length; i++) {
						if(name.equals(list[i].getName())) {
							check = 1;
						}
					}
					if(check == 0) {
						list[count].setName(name);
						count++;
					}else System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
					
				}else System.out.println("���̻� �߰��� �� �����ϴ�.");
				
			}
			else if (choice == 2) {
				if(count != 0) {
					System.out.print("������ �߰��� �л��� �̸� �Է� : ");
					String name = sc.next();
					int idx = -1;
					for(int i=0; i<count; i++) {
						if(list[i].getName().equals(name)) idx = i;
					}
					if(idx != -1) {
						if(list[idx].getCnt() < 3) {
							System.out.print("�߰��� ���� �Է� : ");
							String subject = sc.next();
							int idx2 = -1;
							for(int i=0; i<list[idx].getCnt(); i++) {
								if(list[idx].getSubject(i).equals(subject)) idx2 = i;
							}
							if(idx2 == -1) {
								list[idx].setSubject(list[idx].getCnt(), subject);
								list[idx].setAddCnt();
							}else System.out.println("�̹� �����ϴ� ������Դϴ�.");
						}else System.out.println("���̻� ������ �߰� �� �� �����ϴ�.");
					}else System.out.println("�л��� �̸� Ȯ�� ! ");
				}else System.out.println("�л��� ���� �߰����ּ��� . ");
			}
			else if (choice == 3) {
				if(count != 0) {
					System.out.print("������ �߰��� �л��� �̸� �Է� :");
					String name = sc.next();
					int idx = -1;
					for(int i=0; i<count; i++) {
						if(list[i].getName().equals(name)) idx = i;
					}
					if(idx != -1) {
						if(list[idx].getCnt() > 0) {
							System.out.print("������ �Է��� ���� �Է� : ");
							String subject = sc.next();
							int idx2 = -1;
							for(int i=0; i<list[idx].getCnt(); i++) {
								if(list[idx].getSubject(i).equals(subject)) idx2 = i;
							}
							if(idx2 != -1) {
								System.out.print("���� �Է� : ");
								list[idx].setScore(idx2, sc.nextInt());
							}else System.out.println("������ Ȯ�����ּ��� . ");
							
						}else System.out.println("������ ���� �߰����ּ��� . ");
						
						
					}else System.out.println("�л��� �̸� Ȯ�� ! ");
					
				}else System.out.println("�л��� ���� �߰����ּ��� .");
				
			}
			
		}//while

	}

}