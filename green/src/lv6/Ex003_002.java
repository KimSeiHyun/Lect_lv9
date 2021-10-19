package lv6;

import java.util.Scanner;

class Ex003_02 {
	Scanner sc = new Scanner(System.in);
	String ids[] = null;
	String pws[] = null;
	int moneys[] = null;
	int log = -1;
	int cnt = 0;
	void print( ) {
		if(cnt != 0) {
			System.out.print("id     ");
			for(int i=0; i<cnt; i++) {
				System.out.print(this.ids[i] + "\t");
			}System.out.println();
			System.out.print("pw     ");
			for(int i=0; i<cnt; i++) {
				System.out.print(this.pws[i] + "\t");
			}System.out.println();
			System.out.print("money  ");
			for(int i=0; i<cnt; i++) {
				System.out.print(this.moneys[i] + "\t");
			}System.out.println();
		}
		System.out.println("log : " + this.log);
		System.out.println("cnt : " + this.cnt);
        System.out.println("===ATM===");
		System.out.println("1.ȸ������");	
		System.out.println("2.ȸ��Ż��");
		System.out.println("3.�α���");
		System.out.println("4.�α׾ƿ�");
		System.out.println("5.�Ա��ϱ�");
		System.out.println("6.��ü�ϱ�");

	}
	
	
	void sign () {
			if(this.cnt ==0) {
				System.out.println("ȸ�������� ���̵� �Է����ּ��� . ");
				String inId = sc.next();
				System.out.println("ȸ�������� ��й�ȣ�� �Է����ּ��� . ");
				String inPw = sc.next();
				this.cnt++;
				this.ids = new String[this.cnt];
				this.pws = new String[this.cnt];
				this.moneys = new int[this.cnt];
				this.ids[0] = inId;
				this.pws[0] = inPw;
				this.moneys[0] = 1000;
			}else {
				System.out.println("ȸ�������� ���̵� �Է����ּ��� . ");
				String inId = sc.next();
				int check = 0;
				for(int i=0; i<this.cnt; i++) {
					if(inId.equals(this.ids[i])) {
						check = 1;
					}
				}
				if(check == 1) {
					System.out.println("�ߺ��� ���̵� �ֽ��ϴ� . ");
				}else {
					System.out.println("ȸ�������� ��й�ȣ�� �Է����ּ��� . ");
					String inPw = sc.next();
					cnt++;
					String temp1[] = this.ids;
					String temp2[] = this.pws;
					int temp3[] = this.moneys;
					this.ids = new String[this.cnt];
					this.pws = new String[this.cnt];
					this.moneys = new int[this.cnt];
					this.ids[this.cnt-1] = inId;
					this.pws[this.cnt-1] = inPw;
					this.moneys[this.cnt-1] = 1000;
					for(int i=0; i<this.cnt-1; i++) {
						this.ids[i] = temp1[i];
						this.pws[i] = temp2[i];
						this.moneys[i] = temp3[i];
					}
				}
				
			}

	}
	void signOut () {
		if(this.log != -1) {
			System.out.println("ȸ��Ż���� �ڽ��� ���̵� �Է����ּ��� . ");
			String inId = sc.next();
			if(inId.equals(this.ids[log])) {
				System.out.println("������ ȸ��Ż�� �Ͻðڽ��ϱ�? 1.yes  2.no");
				int sel = sc.nextInt();
				if(sel == 1) {
					String temp1[] = this.ids;
					String temp2[] = this.pws;
					int temp3[] = this.moneys;
					cnt--;
					this.ids = new String[cnt];
					this.pws = new String[cnt];
					this.moneys = new int[cnt];
					int x = 0;
					for(int i=0; i<cnt+1; i++) {
						if( i != log) {
							this.ids[x] = temp1[i];
							this.pws[x] = temp2[i];
							this.moneys[x] = temp3[i];
							x++;
						}
					}
					this.log = -1;
				}else System.out.println("ȸ��Ż�� ���� �ʽ��ϴ� .");
			}else System.out.println("���̵� �ٽ� Ȯ�����ּ���");
			
		}else System.out.println("�α����� ���� ���ּ��� . ");
			

	}
	void logIn () {
		if(this.log == -1) {
			System.out.println("���̵� �Է� :");
			String inId = sc.next();
			int check =0;
			int idx = 0;
			for(int i=0; i<cnt; i++) {
				if(inId.equals(this.ids[i])) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.println("��й�ȣ �Է� : ");
				String inPw = sc.next();
				if(inPw.equals(this.pws[idx])) {
					System.out.printf("�α��� ���� !  %s���� �α��� �ϼ˽��ϴ�.\n",this.ids[idx]);
					this.log = idx;
				}else System.out.println("��й�ȣ�� Ʋ���̽��ϴ�.");
			}else System.out.println("�Է��Ͻ� ���̵� ã�� �� �����ϴ�.");
		}else System.out.println("�̹� �α��� �����Դϴ�.");
			

	}
	void logOut () {
		if(this.log != -1) {
			System.out.println("�α׾ƿ��� �ƽ��ϴ�.");
			this.log = -1;
		}else System.out.println("�α����� ���� ���ּ��� . ");
		
		
	}
	void deposit () {
		System.out.println("�Ա��� ���̵� �Է����ּ��� .");
		String inId = sc.next();
		int check =0;
		int idx = -1;
		for(int i=0; i<this.cnt; i++) {
			if(inId.equals(this.ids[i])) {
				check = 1;
				idx = i;
			}
		}
		if(check == 1) {
			System.out.println("�Ա��� �ݾ� �Է� : ");
			int inMoney = sc.nextInt();
			moneys[idx] += inMoney;
			System.out.printf("%d���� �Ա��ϼ̽��ϴ�.\n",inMoney);
			
		}else System.out.println("�Ա��� ���̵� �ٽ� Ȯ�����ּ��� . ");

	}
	void transfer () {
		if(this.log != -1) {
			System.out.println("��ü�Ͻ� ���̵� �Է����ּ��� . ");
			String inId = sc.next();
			int check = 0;
			int idx = -1;
			for(int i=0; i<this.cnt; i++) {
				if(inId.equals(this.ids[i]) && i != log) {
					check = 1;
					idx = i;
				}
			}
			if(check == 1) {
				System.out.println("��ü�Ͻ� �ݾ� �Է� : ");
				int outMoney = sc.nextInt();
				if(outMoney > this.moneys[log]) {
					System.out.println("������ ��� �ݾ��� ��ü�Ͻ� �ݾ׺��� �۽��ϴ� . ");
				}
				else {
					this.moneys[log] -= outMoney;
					this.moneys[idx] += outMoney;
					System.out.printf("%s�Բ��� %s�Բ� %d���� ��ü�ϼ̽��ϴ�.\n"
							,this.ids[log],this.ids[idx],outMoney);
				}
			}else System.out.println("��ü�� ���̵� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("�α����� ���� ���ּ��� .");
		
		
	}
	
	

	public void run() {
		while(true) {
			print();
			int sel = sc.nextInt();
			if(sel == 1) {
				sign();
			}else if(sel == 2) {
				signOut();
			}else if(sel == 3) {
				logIn();
			}else if(sel == 4) {
				logOut();
			}else if(sel == 5) {
				deposit();
			}else if(sel == 6) {
				transfer();
			}
			
			
		}//while(true)
	}
	
	
}


public class Ex003_002 {

	public static void main(String[] args) {
		Ex003_02 ex = new Ex003_02();
		ex.run();
		
	}

}
