package lv.test_5;

public class lv5_13s {

	public static void main(String[] args) {
		// ������ ���� (�������Ʈ) 
		// https://butter-shower.tistory.com/87
	
		// ������ ������ �ʹ� ���� ������ 
		// ��翡���� ������ִ�  Exception �� ���� ����Ѵ�. 
		
		int arr[] = new int[3];
		try {
			arr[100] = 100;
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
				
		int a = 10;
		try {
			int b = a/0;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String str = "aaa";
		try {
			int num = Integer.parseInt(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}