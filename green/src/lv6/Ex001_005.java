package lv6;

import java.util.Scanner;

class Ex07 {
	
	int seat[] = new int[7];
	int pay = 0;
	
}
public class Ex001_005 {

	public static void main(String[] args) {
		
		/*
		 * # ��ȭ�� �¼����� : Ŭ���� + ����
		 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
		 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
		 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
		 * 4. �� �¼��� ���� ������ 12000���̴�.
		 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
		 * ��)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * �¼����� : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
		 * ----------------------
		 * ����� : 24000��
		 */
		
		
		Scanner sc = new Scanner(System.in);
		Ex07 ex = new Ex07();
		while(true) {
			for(int i=0; i<7; i++) {
				System.out.print(ex.seat[i] + " ");
			}System.out.println();
			System.out.println("1.�����ϱ�");
			System.out.println("0.�����ϱ�");
			int sel2 = sc.nextInt();
			
			if(sel2 == 1) {

				System.out.println("�����Ͻ� �¼��� �Է����ּ��� .");
				int sel = sc.nextInt()-1;
				
				if(sel >=0 && sel < 7) {
					if(ex.seat[sel] == 0) {
						ex.seat[sel] = 1;	
						ex.pay += 12000;
					}else System.out.println("�̹� ����� �¼��Դϴ�.");
				}else System.out.println("�¼��� ������ �ٽ� Ȯ�����ּ��� . ");
				
			}
			if(sel2 == 0) {
				System.out.println("���α׷��� �����մϴ�");
				System.out.println("����� : "  + ex.pay);
				break;
			}
			
			
		}//while(true)

		
	}

}
