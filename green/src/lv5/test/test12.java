package lv5.test;

public class test12 {

	public static void main(String[] args) {
		//���۽ð� 02 : 57
		//����ð� 03 : 07
		//�ҿ�ð� 00 : 00
		
		String data = "123+46";
		//�� ���� ���� ���Ͻÿ� .
		
		int sum = 0;
		String temp[] = data.split("[+]");
		for(int i=0; i<temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		System.out.println(sum);
		
	}

}
