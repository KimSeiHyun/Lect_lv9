package lv5;

public class Ex02 {

	public static void main(String[] args) {
		//����ó��1
		
		int num = 10;
		//System.out.println(num / 0);  // � ���ڸ� 0���� ������ ���� �߻� . 
		
		//try , catch
		//�ڹٴ� �Ϲ������� ������ �߻��ϸ� ���α׷��� ��� �����.
		//try , catch �� ������ �߻��ص� ���α׷��� ������� �ʰ� 
		//������ �κи� �������� �ʰ� ���α׷��� ��� ���� �ǵ��� ������ش�.(�ſ����� ! )
		
		// 1) try {} ==> �߰�ȣ �ȿ� �ڵ带 �ۼ��ϸ� �����߻��ص� �����Ѵ�.
		// 2) catch(Exception e){} ==> ������ �߻��ϸ� �ѹ� �۵��ȴ� . 
		
		try {	//try {} ��ȣ�ȿ��� ������ �߻��ϸ� ������ �߻��ϱ� ������ �����۵��� �����߻����Ĵ� �������� ���� .
			System.out.println("abcd");
			System.out.println(num / 0);
			System.out.println("1234");
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�."); // ���� ����ص� �ǰ� �Ʒ�ó�� �ص��ȴ�.
			e.printStackTrace(); // �ڹٿ��� �����ϴ� ��¹� (� �������� �˷��ش�.)
		}
		System.out.println("���α׷� ���� ");

	}

}
