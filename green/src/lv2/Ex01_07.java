package lv2;

public class Ex01_07 {

	public static void main(String[] args) {
		//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
		
		int max = 0;
		int a= 0;
		
		for (a=0; a < 150; a++) {
			if (a%8 == 0 && max < a) {
				max = a;
			}
		}
		System.out.println("max : " + max );
	}

}
