package lv5;

public class Ex01 {

	public static void main(String[] args) {
		//���ڿ�
		//�� ������ ����(�迭)
		// ��char �ڷ����� �迭 > String Ŭ������ ó��
		
		//����ȯ 
		//���� > ����
		//���� �ϳ��� �����ϳ��� ����ȯ�� ���� .
		//����,���ڵ� ���� �������ڰ��� ���� . 
		//���ڿ��� ���ڷθ� �̷������ ���ڷ� ����
		//ex ) String  b = "123";  > ���ڷ� ����.
		//ex ) String  b = "abcd";  > ���ڷ� �Ұ���.
		
		char a = 'a';
		int num = a;
		System.out.println(num); //ascii > ���۰˻� > ��Ʈ
		num = (int)a;
		System.out.println(num);
		
		//���ڿ�>����
		String b = "123";
		num = Integer.parseInt(b);
		System.out.println(num);
		
		//���� > ����
//		String str = String.valueOf(num);
		String str = num +""; // ���� String.valueOf�� �Ἥ ���ڸ� ���ڷ� �ٲܼ��� ������ 
							  // �̷��� �ڿ� + ""���������μ��� num �� ���ڿ�ó���� �� ���� �մ� . (�ļ�)
		str += "apple"; // 1�� ���ڿ����� Ȯ���ϱ� ���� �߰��غ� 
		System.out.println(str);
		
		System.out.println(1+"answ"); //
		
		
	}

}
