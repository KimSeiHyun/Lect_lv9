package lv.test_5;

public class lv5_25 {

	// �ı� ���Ǳ� ���α׷� 		
	// 1) ������   2) ����� 
	//������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
	//����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
    //	       2)�ڷΰ���
	// ���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7����� 
	//ȭ�� 
	// �ı� ���� : 3200�� 
	// �ı� 	  : ??��  (������ ����) 
	// 50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
	// 1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// �ı� ����
		int price = 3200;		// �ı� ����
		
		while(true) {
			
			System.out.println("[1]������");
			System.out.println("[2]�����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) {}
					else if(choice == 2) {}
					else if(choice == 3) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) {}
					else if(choice == 2) {
						break;
					}
				}
			}
		}
	}


}