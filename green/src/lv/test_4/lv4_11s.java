package lv.test_4;

public class lv4_11s {

	public static void main(String[] args) {
		int[] arr = {87, 100, 24, 11, 79};
		
		int[] temp = arr;
		temp[1] = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
