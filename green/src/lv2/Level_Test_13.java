package lv2;

public class Level_Test_13 {

	public static void main(String[] args) {
//		#����3) ���Կ��� 24600�� ¥�� ��������ϴ�.
//		# 1000��¥�� ����θ� �ʰ��� ���ٸ� ������ �ʿ��Ѱ���?
		//	���� : 12:54
		//	���� : 01:03
		//	�ҿ� : 9��
		
		int a = 24600;
		int won = 1000;
		int w = 0;
		int cnt = 0;
		
		boolean t = true;
		while (t ) {
			if( w > a) {
				break;
			}
			w += won;
			cnt ++;
		}
	System.out.println("24600��¥�� ���� 1000��¥�� ����θ� �����ϸ� " + cnt +"���� �ʿ��մϴ�.");
	
	
	}

}
