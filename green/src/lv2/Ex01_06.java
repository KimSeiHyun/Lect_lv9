package lv2;

public class Ex01_06 {

	public static void main(String[] args) {
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		int a= 0; 
		
		for ( a=0; a<100; a++)
			if ( a %9 == 0 && a /10 == 6) {
				System.out.println(a);
				a=100;
			}
	}

}
