package lv5;

public class Ex01_01 {

	public static void main(String[] args) {
		//�ֹε�ϰ˻繮�� 
		
		String jumin = "890101-2012932";
		// ���� 1) ���� ���
		// ���� 1) 30��
		int year = 2021;
		int a = Integer.parseInt(jumin.substring(0,2));
		System.out.println("����1");
		System.out.println(year-(1900+a)+"��") ;
		// ���� 2) ���� ���
		// ���� 2) ����
		System.out.println("����2");
		String x = jumin.substring(7,8);
		int y = Integer.parseInt(x);
		if(y == 2 || y == 4 || y == 6) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
			
		}
	}

}
