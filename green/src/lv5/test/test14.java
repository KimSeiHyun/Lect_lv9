package lv5.test;

public class test14 {

	public static void main(String[] args) {
		
		//���۽ð� 09 : 38
		//����ð� 10 : 40
		//�ҿ�ð� 00 : 58
		
		
		int[][] data = {{12345678},{4005},{230055},{1},{200}};
		// �� ���ڿ� �ѱ۴������� �߰� �ؼ� ��� 
		// ��) 1234��5õ6��7��8
		// ��) 4õ5
		// ��) 23��5��5
		// ��) 1
		// ��) 2��	



		for(int i=0; i<data.length; i++) {
			if(data[i][0] / 10000 > 0) {
				System.out.print(data[i][0] / 10000+"��");
				int x = (data[i][0] / 10000) * 10000;
				data[i][0] -= x;
			}
			if(data[i][0] / 1000 > 0) {
				System.out.print(data[i][0] / 1000 +"õ");
				int x = data[i][0] / 1000 * 1000;
				data[i][0] -= x;
			}
			if(data[i][0] / 100 > 0) {
				System.out.print(data[i][0] / 100 +"��");
				int x = data[i][0] / 100 * 100;
				data[i][0] -= x;
			}
			if(data[i][0] / 10 > 0) {
				System.out.print(data[i][0] / 10 +"��");
				int x = data[i][0] / 10 * 10;
				data[i][0] -= x;
			}
			if(data[i][0] != 0) {
				System.out.print(data[i][0]);				
			}
			System.out.println();
		}

	}

}
