package lv5;

public class Ex01_02 {

	public static void main(String[] args) {
		//���ڿ� 1���� ����
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		String result[] = str.split("/");
		System.out.println("����1 : arr�迭�� �� ������ �����ϰ� , ���� ��� ");
		for(int i=0; i<result.length;i ++) {
			arr[i] = Integer.parseInt(result[i]);
			System.out.println(arr[i]);
		}
		
		
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		System.out.println("����2 : score �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ���� ");
		for(int i=0; i<scores.length; i++) {
			text += scores[i] + "/";
		}
		System.out.println(text);
		

		
	}

}
