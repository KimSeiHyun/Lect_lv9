package lv5;

public class Ex02c {

	public static void main(String[] args) {
		// ������ ���� (�������Ʈ)
		// https://butter-shower.tistory.com/87
		
		// ������ ������ �ʹ� ���� ������
		// ��� ������ �� ����ִ� Exception �� ���� ����� .
		
		int arr[] = new int[3];
		
		try {
			arr[100] = 100;
		}
		catch(Exception e) {
			System.out.println("����1");
			e.printStackTrace();
		}
		
		int a = 10;
		try {
			int b = a/0;
		} catch (Exception e) {
			System.out.println("����2");
			e.printStackTrace();
		}
		
		String str = "aaa";
		
		try {
			int num = Integer.parseInt(str);
		}catch (Exception e) {
			System.out.println("����3");
			e.printStackTrace();
		}
		

		
	}

}
