package lv.test_1;

public class lv1_06s {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("���� O");
		}
		
		if(a != b) {
			System.out.println("���� X");
		}
		
		// ���� 1) ���, 0, ���� ���
		int num1 = -10;
				
		if(num1 > 0 ) {
			System.out.println(num1+"�� ����̴� ! ");
		}
		if(num1 == 0 ) {
			System.out.println(num1+"�� 0�̴� ! ");
		}
		if(num1 < 0 ) {
			System.out.println(num1+"�� �����̴� ! ");
		}
		// ���� 2) 4�� ��� ���
		int num2 = 12;
				
		if(num2 %4 ==0 ) {
			System.out.println(num2 +"�� 4�� ����̴�.");
		}
		if(num2 %4 !=0 ) {
			System.out.println(num2 +"�� 4�� ����� �ƴϴ�.");
		}
		// ���� 3) �հ�, ���հ� ���
		int score = 87;	
		if(score >= 70 && score <=100) {
			System.out.println(score+"���� �հ� !");
		}
		if(score >= 0 && score <70) {
			System.out.println(score+"���� ���հ� !");
		}
		
	}

}
