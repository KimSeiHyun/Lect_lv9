
package lv2;

public class Level_Test_16tc {

	public static void main(String[] args) {
//		# ����3) ���Կ� ������ 250���� �ִ� ���߿� ������ 84�ۼ�Ʈ�� �ȷȰ� �������� ���Ŀ� ���ȷȴ�
//		# ������ �ȸ����� - ���Ŀ� �ȸ������� ���ΰ�
		
		double  milk = 250;
		
		double mor = 0;
		double aft = 0;
		
		while(mor / milk < 0.84) {
			mor ++;
		}
		aft = milk - mor;

//		System.out.println(mor);
//		System.out.println(aft);
		
		System.out.println(mor - aft);
		
		
		
		
		
		
	}

}
