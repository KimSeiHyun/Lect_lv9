package lv2;

public class Level_Test_7tc {

	public static void main(String[] args) {
//		#   ����1)
//	    #   ���ֳ� �� �л��� 31���Դϴ�.
//		#   ���߿��� ���л��� 12�� , ���л��� 14���� �����ҵ��� �Ͽ����ϴ�.
//		#   ���ֳ� �ݿ��� ����Ȱ���� �������� �л���
//		#   ������� ��� 
		
		int total = 31;
		int boy = 12;
		int girl = 14;
		
		int none = 0; // ����� . 
		
		while (boy + girl > 0) {
			if ( boy > 0) {
				boy --;
			}
			else if (girl > 0) {
				girl --;
			}
			total --;
		}
		System.out.println(total);
		
		while(total >0) {
			total --;
			none ++;
		}
		
		
		
		
		
		
		
		
		
	}

}
