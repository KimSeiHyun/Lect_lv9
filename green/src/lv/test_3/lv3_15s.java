package lv.test_3;

public class lv3_15s {

	public static void main(String[] args) {
		/*
		 * # 4�� ����� ����
		 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
		 * - ��! temp �� ���̸� 4�� �����ŭ�� �����Ѵ�. 
		 */
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4 == 0) {
				cnt ++;
			}
		}
		
		temp = new int[cnt];
		int x =0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4 == 0) {
				temp[x] = arr[i];
				x++;
			}
		}
		for(int i=0; i<cnt; i++) {
			System.out.print(temp[i] + " ");
		}System.out.println();
	}

}
