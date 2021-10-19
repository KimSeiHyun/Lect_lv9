package lv.test_4;

public class lv4_17 {

	public static void main(String[] args) {
	    // arr 배열을 heap에 복제
		
			int [][] arr = {
					{10,20,30},
					{10,20,30,40,50},
					{10,20,30,40}
			};
			
			int temp[][] = new int[arr.length][];
			
			for(int i=0; i<arr.length; i++) {
				temp[i] = new int[arr[i].length];
				for(int j=0; j<arr[i].length; j++) {
					temp[i][j] = arr[i][j];
				}
			}
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(temp[i][j] + " ");
				}
				System.out.println();
			}
			
		
	}

}
