package lv5;

public class Ex03_09 {

	public static void main(String[] args) {
		//���ڿ���ȭ4����
		String data = "10001/��ö��/600\n";
		data += "10002/�̿���/800\n";
		data += "10001/��ö��/1400\n";
		data += "10003/���缮/780\n";
		data += "10002/�̿���/950\n";
		data += "10004/�ڸ��/330\n";
		data += "10001/��ö��/670\n";
		data += "10003/���缮/3300\n";
		data += "10002/�̿���/200\n";
		data += "10004/�ڸ��/6800\n";
		data = data.substring(0 , data.length()-1); // ������ �ۻ��� 
		System.out.println(data);
		System.out.println("=====================");
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;
		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		for(int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		for(int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("=====================");
		// ����1) �� ������ ��  ������ ȸ���� ������ �������������� ����� �����̴�.
		//		 �����͸� �Ʒ��� ���� ��� �Ͻÿ� (�� ȸ���� ���� ���� )	
		/*
		  =====================
			10001 ��ö�� 2670
			10002 �̿��� 1950
			10003 ���缮 4080
			10004 �ڸ�� 7130
		   =====================		  
		 */
		int max = 0;
		for(int i=0; i<numList.length; i++) { //10001���� ������� �ִ��� �𸥴ٴ� �����ϰ� ����ȣ ã��.
			if(max < numList[i]) {
				max = numList[i]%10000;
			}
		}
		
		int numList2[] = new int[max]; // max = 4;
		String nameList2[] = new String[max];
		int priceList2[] = new int[max];
		
		for(int i=0; i<max; i++) { //������� ��ȣ ���� 
			numList2[i] = 10001+i;
		}
		
		for(int i=0; i<max; i++) { //***List �迭���� �ε��� ã��
			String temp = "";
			int sum = 0;
			for(int j= 0; j<totalSize; j++) {
				if(numList2[i] == numList[j]) {
					temp = nameList[j];
					sum += priceList[j];
				}
			}
			priceList2[i] = sum;
			nameList2[i] = temp;
		}
		

		for(int i=0; i<max; i++) {
			System.out.println(numList2[i] + " " + nameList2[i] + " " + priceList2[i]+ " ");
		}
		

		
	}

}
