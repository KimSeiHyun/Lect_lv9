package lv4;

public class Ex02_01tc {

	public static void main(String[] args) {
		// 2���� �ݺ����� ����ؼ� > datas �迭�� ��ü ���� 1���� 6���� �ʱ�ȭ.
		int datas[][] = new int[3][2];
		int x = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
					datas[i][j] = x;
					x++;
				System.out.println(datas[i][j]);
			}
		}
		
		
		
	}

}
