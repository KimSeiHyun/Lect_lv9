package lv2;

public class Level_Test_tc {

	public static void main(String[] args) {
//		#���� 1) ��Ʈ���� ���̸� 3���� ��� 1500���� �Ǵٰ� �Ѵ�
//	    # ���̰� 14�� �ʿ��ϴ�. ���� ���ʿ��Ѱ�(���̴� �������θ� �Ǵ�)
	/*
	   ��Ʈ : 3�ǹ���� �ƴϸ� �ɶ����� ������Ų��. 
	    while(���� % 3  != 0){
	       ���� += 1;
	   }
	*/
		int oi = 14;
		int bun = 3;
		int price = 1500;
		
		int cash = 0; // ����� 
		
		while (oi > 0) {
			oi -= bun;
			cash += price;
		}
		System.out.println("������ " + cash + "�� �ּ˴� . ");
		
		
		
		
		
		
		
		
		
		
	}

}
