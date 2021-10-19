package lv.test_3;

public class lv3_15s {

	public static void main(String[] args) {
		/*
		 * # 4의 배수만 저장
		 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
		 * - 단! temp 의 길이를 4의 배수만큼만 설정한다. 
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
