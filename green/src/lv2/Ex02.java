package lv2;

public class Ex02 {

	public static void main(String[] args) {
		//���
		// 1) ���ǹ� if 
		// 2) �ݺ��� while , for
		// 3) ������� break , continue
		
		// switch - case
		// switch(���Ǻ���) { } 
		// {
		//  case ������ : ���๮;
		//  case ������ : ���๮;
		//  case ������ : ���๮;
		// } 
		
		int grade = 3; //  1 vip , 2 gold , 3 silver
		
		
		// if - else  : ������ ���ǽ��� �켱�ȴ� . ( �켱���� �߻� )
		if (grade == 1 ) {
			System.out.println("vip ���Դϴ�.");
		}
		else if (grade == 2 ) {
			System.out.println("gold ���Դϴ�.");
		}
		else if (grade == 3 ) {
			System.out.println("silver ���Դϴ�.");
		}
		
		//switch - case : ����ó��. 
		switch(grade) {
		case 1 : 
			System.out.println("vip ���� �ο�. ");
	//		break; //
		case 2 : 
			System.out.println("gold ���� �ο�.");

		case 3 :
			System.out.println("silver ���� �ο�.");
		}
		
		// ���׿����� . (���� 3���̱� ������ ���׿�����.)
		// Ȧ¦ , ���� ��������©�� ���� .
		// ���ǽ� ? true�϶� ������(��ȯ��) ���� . : false�϶� ������(��ȯ��) ���� 
		
		int coin = 2; // 1:�� , 2:��
		
		if (coin == 1) {
			System.out.println("�ո��Դϴ�.");
		}
		else {
			System.out.println("�޸��Դϴ�.");
		}
		
		String msg = coin == 1 ? "�ո��Դϴ�." : "�޸��Դϴ�.";
		System.out.println(msg);
		int a = 10;
		int b = 20;
		int max = a > b ? 10 : 20 ; 
		
		System.out.println(max);
		
		
	}

}
