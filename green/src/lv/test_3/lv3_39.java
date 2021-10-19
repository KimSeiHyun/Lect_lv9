package lv.test_3;

public class lv3_39 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};	
		int b[] = new int[5];
		
		// arr의 값중 4의 배수만 b에 거꾸로저장
		// 예) b = {0,0,0,40,20};
		int x = 4;
		for(int i=0; i<5; i++) {
			if(arr[i]%4 == 0) {
				b[x] = arr[i];
				x--;
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
