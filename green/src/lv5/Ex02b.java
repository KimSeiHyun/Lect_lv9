package lv5;

public class Ex02b {

	public static void main(String[] args) {
		//����ó��2
		
		// ������ ����(�������Ʈ)
		// https://butter-shower.tistory.com/87
		
		// �ּ�ó�� �غ��鼭 �ϳ��� �����غ��� .
		
		int arr[] = new int[3];
		try {
			arr[100] = 100;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����1");
			System.out.println("�迭�� ������ ����� ��");
			e.printStackTrace();
		}
		
		// ---------------------------------
		
		int a = 10;
		try {
			int b = a/0;
		}catch(ArithmeticException e) {
			System.out.println("����2");
			System.out.println("���ڸ� 0���� ���� �� ���� ������");
			e.printStackTrace();
		}
		
		//-------------------------
		
		String str = "aaa";
		try {
			int num = Integer.parseInt(str);
		}catch (NumberFormatException e) {
			System.out.println("����3");
			System.out.println("aaa�� ���ڷ� ��ȯ�� �� ���� ������");
			e.printStackTrace();
		}

	}

}
