package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex03_04 {

	public static void main(String[] args) {
		//������Ʈ�ѷ�1����
		Scanner sc = new Scanner(System.in);
		int vector[] = null;
		int cnt = 0;
		int load = 0;
		int loadCheck = 0;
		String fileName = "vector.txt";
		
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		while (true) {
			System.out.print("���ͺ��� : ");
			for(int i=0; i<cnt; i++) {
				System.out.print(vector[i] + " ");
			}System.out.println();
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if (sel == 1) { // �迭�� ���ϴ� �� �߰� . 
				System.out.println("�߰��� ���� �Է����ּ��� ");
				int inNum = sc.nextInt();
				if(cnt == 0) {
					vector = new int[1];
					vector[0] = inNum;
					cnt++;
				}
				else {
					int temp[] = vector;
					vector = new int[cnt+1];
					vector[cnt] = inNum;
					for(int i=0; i<temp.length; i++) {
						vector[i] = temp[i];
					}
					cnt++;
				}
				System.out.println("�߰��Ϸ� !");
			}
			else if (sel == 2) { // �迭�� ���ϴ� �� ���� . 
				if (cnt !=0) {
				System.out.println("������ ���� �Է����ּ��� ");
				int delNum = sc.nextInt();
				int check = 0;
				for(int i=0; i<cnt; i++) {
					if(vector[i] == delNum) {
						vector[i] = 0;
						cnt--;
						check = 1;
					}
				}
				if(check == 1) {
					int temp[] = vector;
					vector = new int[cnt];
					int x = 0;
					for(int i=0; i<temp.length; i++) {
						if(temp[i] != 0) {
							vector[x] = temp[i];
							x++;
						}
					}
					System.out.println("�����Ϸ� ");
				}else System.out.println("������ ���� �ٽ� Ȯ�����ּ��� . ");
				
				}else System.out.println("������ ���� �����ϴ� .");
			} 
			else if (sel == 3) { // ���Ͽ� �迭���� ���� ���� 
				try {
					fw = new FileWriter(file);
					for(int i=0; i<cnt; i++) {
						fw.write(vector[i]+"\n");
					}
					fw.close();
					System.out.println("����Ϸ� ! ");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} 
			else if (sel == 4) {
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					int check = 0;
					load = 0;
					cnt = 0;
					while(check == 0) {
						String data = br.readLine();
						if(data == null) { // �ִ°��� ��� 
							break;
						}
						load ++;
						if(loadCheck == 0) { //���� ������ �ε带 �ϸ� file�� ���� vector�迭�� �߰�
											// �̹� ���͹迭�� ��� ���� ������ �ִ� file���� �ε��� . 
						while(cnt < load) {
							if(cnt == 0) {
								vector = new int[load];
								vector[0] = Integer.parseInt(data);
								cnt ++;

							}else {
								int temp[] = vector;
								vector = new int[load];
								for(int i=0; i<temp.length; i++) {
									vector[i] = temp[i];
								}
								vector[cnt] =Integer.parseInt(data);
								cnt++;
								
							}
						}
						}
						System.out.println(data);
					}
					loadCheck = 1;
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				
			} 
			else if (sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}//w

	}

}
