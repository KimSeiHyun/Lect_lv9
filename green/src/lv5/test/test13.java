package lv5.test;

public class test13 {

	public static void main(String[] args) {
		//���۽ð� 09 : 07
		//����ð� 09 : 33
		//�ҿ�ð� 00 : 26
		// ���ֱ���� ������ �����Ҽ�����. int �� long �� �����ʰ� �Ʒ��ձ��ϱ� 
		String data1 = "129999999999";
		String data2 = "88888888888888";
		//�� ���� ���� ���Ͻÿ� .
		//��Ʈ  : �迭�� ��������~
		
		
		System.out.println("data1�� ���� : " + data1.length());
		System.out.println("data2�� ���� : " + data2.length());
		int a = data1.length();
		int b = data2.length();
		int c = a-b;
		int max = 0 ;
		String t = "0";
		String temp = "";
		//���� ���ϰ� ���ϱ� ���� �ڸ����� �ľ��ϰ� 0�� ä���־ �Ȱ��� ������ . 
		if( c > 0) {
			for(int i=0; i<data1.length()-data2.length(); i++) {
				temp += t;
			}
			temp += data2;
			data2 = temp;
			max = a;
		}else if ( c < 0) {
			for(int i=0; i<data2.length()-data1.length(); i++) {
				temp += t;
			}
			temp += data1;
			data1 = temp;
			max = b;
		}else {
			max = a;
		}
		String temp1[] = new String[max];
		String temp2[] = new String[max];
		int temp3[] = new int[max];
		
		for(int i=0; i<temp1.length; i++) {//�迭�� �� ���� �ϳ��� �ϳ��� ���� . 
			temp1[i] = data1.charAt(i)+"";
			temp2[i] = data2.charAt(i)+"";
		}
		
		for(int i=temp1.length-1; i>=0; i--) {
			if(i > 0) {
				temp3[i] += Integer.parseInt(temp1[i]);
				temp3[i] += Integer.parseInt(temp2[i]);
				if(temp3[i] >= 10) { //10�� �Ѿ�� �ø�. 
					temp3[i-1] += 1;
					temp3[i] = temp3[i] % 10;
				}
			}
			if(i == 0) { 
				temp3[i] += Integer.parseInt(temp1[i]);
				temp3[i] += Integer.parseInt(temp2[i]);
			}
			
		}

		String sum = "";
		System.out.println();
		for(int i=0; i<max; i++) {
			sum += temp3[i]+"";
		}
		System.out.println(sum);

	}

}
