package lv2;

public class Level_Test_17 {

	public static void main(String[] args) {
//		# ����4) ������ÿ� ��ü �α��� 400000 ���ε� ���̰� 19�� ���� �α��� 35�ۼ�Ʈ
//		#  40�� �̻��α��� 25�ۼ�Ʈ�϶�
//		# 19�������α� - 40���̻��α� ���� ���Ͻÿ�
		//	���� : 09:48
		//	���� : 10:06
		//	�ҿ� : 18��
		
		int total = 400000;
		int young = 35;
		int old = 25; 
		
		int totalP = 0;
		int youngP = 0;
		int oldP = 0;
		int i = 0;
		while (i < 100) {
			if (i == young) {
				youngP = totalP;
			}
			if (i == old) {
				oldP = totalP;
			}
			

			totalP += total/100;
			i++;
		}
		
		
		System.out.println("19�� ������ �α� : " + youngP);
		System.out.println("40�� �̻��� �α� : " + oldP);
		System.out.println("19�������α� - 40���̻��α� : " + (youngP - oldP));
		
	
	}

}
