package lv1;

public class EX05 {

	public static void main(String[] args) {
		// �񱳿����� (�������� ������� ��ȯ)
		// >  <  >=  <=   ==(����)   !=(�����ʴ�.)
		// ���α׷��� ���� !(����ǥ)�� ���� not�� �ǹ� .
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		
		boolean result;
		result = num1 == num2;
		System.out.println("num1�� num2�� ������ : " + result);
		
		// ��������
		// 1. and &&  ( �����߿� �ϳ��� �����̸� false)
		// 2. or  ||  ( �����߿� �ϳ��� ���̸� true)
		
		// num1�� num2�� ���ų�(or) num1�� �۴�.
		System.out.println(num1 == num2 || num1 < num2);
		
		//num1�� num2�� ����(and) num2�� �۴�.
		System.out.println(num1 == num2 && num1 < num2);
		
		// ��) 3�� ����̸鼭, ¦���̸� true ���
				int num = 12;
				System.out.println(num % 3 == 0 && num % 2 == 0);
				// ���� 1) ����
				// 3������ ����� 60�� �̻��̸�, true
				// ��, ��� �� �����̶� 50�� �̸��̸�, false
				int kor = 100;
				int eng = 87;
				int math = 41;
				
				double avg = (kor + eng + math) / 3.0;
				
				System.out.println((kor+eng+math)/3 >= 60 && kor < 50 && eng < 50 && math < 50);
				
				
				// ���� 2) Ű�� 200cm�̻��̰ų�
				// �����԰� 200kg �̻��̸�, ���� (true)
				int cm = 183;
				int kg = 75;
				
				boolean pass = cm >= 200 && kg >= 200;
			//	System.out.println(cm >= 200 || kg >= 200);
				System.out.println("pass : " + pass);
				
	}

}
