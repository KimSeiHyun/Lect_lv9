package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex03_05 {

	public static void main(String[] args) {
		//����ATM����
		
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int count = 0;
		int log = -1;
		int loadcheck = 0;
		String[] accs = new String[0];
		String[] pws = new String[0];
		int[]  moneys = new int[0];
		String fileName = "atm.txt";
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		while(true) {
			for(int i=0; i<accs.length; i++) {
				System.out.print(accs[i] + " ");
			}System.out.println();
			for(int i=0; i<pws.length; i++) {
				System.out.print(pws[i] + " ");
			}System.out.println();
			for(int i=0; i<moneys.length; i++) {
				System.out.print(moneys[i] + " ");
			}System.out.println();
			System.out.println("log = " + log);
			System.out.println("[ATM]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա�");
			System.out.println("[6]���");
			System.out.println("[7]��ü");
			System.out.println("[8]�ܾ���ȸ");
			System.out.println("[9]����");
			System.out.println("[10]�ε�");
			System.out.println("[0]����");
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if(sel == 1) {//ȸ������
				System.out.println("ȸ������ ���̵� �Է����ּ��� ");
				String inId = sc.next();
				int check = 0;
				for (int i=0; i<accs.length; i++) {
					if(inId.equals(accs[i])) {
						check = 1;
					}
				}
				if(check == 0) {
					System.out.println("��й�ȣ�� �Է����ּ��� ");
					String inPw = sc.next();
					if(count == 0) {
						count ++;
						accs = new String[count];
						pws = new String[count];
						moneys = new int[count];
						accs[0] = inId;
						pws[0] = inPw;
					}
					else {
						count++;
						String temp1[] = accs;
						String temp2[] = pws;
						int temp3[] = moneys;
						
						accs = new String[count];
						pws = new String[count];
						moneys = new int[count];
						
						for(int i=0; i<temp1.length; i++) {
							accs[i] = temp1[i];
							pws[i] = temp2[i];
							moneys[i] = temp3[i];
						}
						accs[count-1] = inId;
						pws[count-1] = inPw;
						moneys[count-1] = 0;
						
					}

					
				}else System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
			}
			else if(sel == 2) {//Ż��
				if(log != -1) {
					System.out.println("ȸ��Ż�� �ϱ����� ���̵� �ٽ� �Է����ּ��� . ");
					String id = sc.next();
						if(id.equals(accs[log])) {
							accs[log] = null;
							pws[log] = null;
							moneys[log] = -1;
							count --;
							
							String temp1[] = accs;
							accs = new String[count];
							String temp2[] = pws;
							pws = new String[count];
							int temp3[] = moneys;
							moneys = new int[count];
							int x= 0;
							for(int i=0; i<temp1.length; i++) {
								if(temp1[i] != null) {
									accs[x] = temp1[i];
									pws[x] = temp2[i];
									moneys[x] = temp3[i];
									x ++;
								}
							}
							
							log = -1;
							System.out.println("ȸ��Ż�� �ϼ˽��ϴ�.");
						}else System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
				}else System.out.println("�α����� ���� ���ּ��� . ");
			}
			else if(sel == 3) {//�α���
				if(log == -1) {
					System.out.println("�α��� ���̵� �Է����ּ���");
					String id = sc.next();
					int check = 0;
					int x = 0 ;
					for(int i=0; i<accs.length; i++) {
						if(id.equals(accs[i])) {
							check = 1;
							x = i;
						}
					}
					if(check == 1) {
						System.out.println("�α��� ��й�ȣ�� �Է����ּ��� . ");
						String pw = sc.next();
						if(pws[x].equals(pw)) {
							System.out.println(accs[x] + "�Բ��� �α��ο� �����ϼ˽��ϴ� .");
							log = x;
						}else System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ��� . ");
					}else System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
				}else System.out.println("�̹� �α��� �����Դϴ�.");
				
			}
			else if(sel == 4) {//�α׾ƿ�
				if(log != -1 ) {
					System.out.println("�α׾ƿ��Ǿ����ϴ�.");
					log = -1;
				}else System.out.println("�̹� �α׾ƿ������Դϴ�. ");
				
			}
			else if(sel == 5) {//�Ա�
				if(log != -1) {
					System.out.println("�Ա��� ����(���̵�)�� �Է����ּ��� ");
					String id = sc.next();
					int check = 0;
					int x = 0;
					for(int i=0;i<accs.length; i++) {
						if(id.equals(accs[i])) {
							check = 1;
							x  = i;
						}
					}
					if(check == 1) {
						System.out.println("�Ա��� �ݾ��� �Է����ּ��� .");
						int money = sc.nextInt();
						moneys[x] += money;
					}else System.out.println("�Ա��� ����(���̵�)�� �ٽ� Ȯ�����ּ��� . ");
				}else System.out.println("�α����� ���� ���ּ��� .");
			}
			else if(sel == 6) {//���
				if(log != -1) {
					System.out.println("����� �ݾ��� �Է����ּ���");
					int outMoney = sc.nextInt();
					if(moneys[log] < outMoney) {
						System.out.println("�ܾ��� �����մϴ�.");
					}else {
						moneys[log] -= outMoney;
						System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					}
				}else System.out.println("�α����� ���� ���ּ��� .");
			
				
			}
			else if(sel == 7) {//��ü
				if(log != -1) {
					System.out.println("��ü�� ����(���̵�)�� �Է����ּ��� .");
					String id = sc.next();
					int check = 0;
					int x = 0;
					for(int i=0; i<accs.length; i++) {
						if(id.equals(accs[i])) {
							check = 1;
							x = i;
						}
					}
					if(check == 1) {
						System.out.println("��ü�� �ݾ��� �Է����ּ��� . ");
						int moveMoney = sc.nextInt();
						if(moveMoney < moneys[log]) {
							moneys[x] += moveMoney;
							moneys[log] -= moveMoney;
						}else System.out.println("�ܾ��� �����մϴ�.");
					}else System.out.println("��ü�� ����(���̵�)�� �ٽ� Ȯ�����ּ��� . ");
				}else System.out.println("�α����� ���� ���ּ��� . ");
			}
			else if(sel == 8) {//�ܾ���ȸ
				if(log != -1) {
					System.out.println("���� ������ ��� �ݾ��� : " + moneys[log] + "�� �Դϴ�.");
				}else System.out.println("�α����� ���� ���ּ��� ");
			}
			else if(sel == 9) {//����

					try {
						fw = new FileWriter(file);
						int save = 0;
						while(save < count) {
							fw.write(accs[save]+"/");
							fw.write(pws[save]+"/");
							fw.write(moneys[save]+"\n");
							save++;
						}
						fw.close();
						System.out.println("����Ϸ� ! ");
					} catch (Exception e) {
						e.printStackTrace();
					}

			}
			else if(sel == 10) {//�ε�
				if (file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						System.out.println("dat.txt�� ����� ��");
						int check = 0;
						int x = 0;
						count = 0;
						while (check < 1) {
							String datas = br.readLine();
							if(datas == null) {
								break;
							}
							System.out.println(datas); //dat.txt ������ ��� . 

								int y = 0;

								String arr[] = datas.split("/"); // �迭�� ���� �ε� .
								if(count ==  0) {
									accs = new String[1];
									pws = new String[1];
									moneys = new int[1];
									accs[x] = arr[y];
									y++;
									pws[x] = arr[y];
									y++;
									moneys[x] = Integer.parseInt(arr[y]);
									x++;
									count ++;
									
									x++;
								}else {
									
									String temp1[] = accs;
									accs = new String[count+1];
									String temp2[] = pws;
									pws = new String[count+1];
									int temp3[] = moneys;
									moneys = new int[count+1];
									
									for(int i=0; i<temp1.length; i++) {
										accs[i] = temp1[i];
										pws[i] = temp2[i];
										moneys[i] = temp3[i];
									}
									accs[count] = arr[y];
									y++;
									pws[count] = arr[y];
									y++;
									moneys[count] = Integer.parseInt(arr[y]);
									x++;
									count ++;
								}

						}
						fr.close();
						br.close();
						System.out.println("�ε�Ϸ�!");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			else if(sel == 0) {
				break;
			}
		}
	}

}
