package lv4;

public class Ex01 {

	public static void main(String[] args) {
		
		//�迭�� �ּҰ��� . 
		
		int[] arr = {87, 100, 24, 11, 79};
//		int[] temp = arr; // arr �迭�� ���� ��(�ּ�)���� �ʱ�ȭ �� . (�ּҸ� ����)
						  // �ǹ��� �ϳ��ε� �޹��� ���� ���� . 
		int[] temp = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		// �� for �ݺ������� i<5 ��� i<�����Ǹ�.length; �� ��������
		// �����Ǹ�.length �� �迭�� ���� �������� . 
		// �����δ� �迭�� ���̰� ������ ����� �ֱ� ���� . 
		
		System.out.println(arr);
		System.out.println(temp);
		
		temp[1] = 0;
		
		//��¹� . 
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
