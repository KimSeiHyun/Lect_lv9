package lv2;

public class Level_Test_11 {

	public static void main(String[] args) {
//		#���� 1) ��Ʈ���� ���̸� 3���� ��� 1500���� �Ǵٰ� �Ѵ�
//		# ���̰� 14�� �ʿ��ϴ�. ���� ���ʿ��Ѱ�(���̴� �������θ� �Ǵ�)
	/*
	   ��Ʈ : 3�ǹ���� �ƴϸ� �ɶ����� ������Ų��. 
	    while(���� % 3  != 0){
	       ���� += 1;
	   }
	*/
		//	���� : 12:21
		//	���� : 12:40
		//	�ҿ� : 19��
		boolean t = true;
		int cost = 1500;
		int oi = 0;
		int noi = 14;
		int pay = 0;
		
		while (t) {
			if ( oi > 14) {
				break;
			}
			pay += 1500;
			oi += 3;
		}
		System.out.println("���̰� 14�� �ʿ��ϸ� " + pay + "���� �ʿ��ϴ�.");
		
		
		
	}

}
