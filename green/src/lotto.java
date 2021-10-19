import java.util.Arrays;
import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		Random rn = new Random();
		
		int arr[][] = new int[5][6];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int check = 0;
				int rNum = rn.nextInt(45)+1;
				for(int k=0; k<6; k++) {
					if(arr[i][k] ==rNum) {
						check = 1;
						j--;
						break;
					}
				}
				if(check == 0) {
					arr[i][j] = rNum;
		
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ¹øÂ° " ,i+1);
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		

		
		
	}

}
