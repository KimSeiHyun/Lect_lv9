package lv.test_4;

public class lv4_10 {

	public static void main(String[] args) {
		/*
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		위 배열에서 똑같은 숫자의 개수가 가장 적은 숫자와 가장 많은 숫자 의  개수를  출력 
		예) 개수가 가장적은숫자 ==> 100
		예) 개수가 가장많은숫자 ==> 3
		가장 많은 갯수 출력 : 3 ===> 5개 
		가장 적은 갯수 출력 : 100 ===> 1개
		*/
		
		 int [] arr = {1,1,3,3,3,100,3,2,3,1,1};
		 
		 int temp =0;
		 int temp2 = 0;
		 int max2 = 0;
		 int min = 20;
		 int temp3 = 0;
		 for(int i=0; i<arr.length;i ++) {
			 int max= 0;
				 temp = arr[i];
			 for(int j=0; j<arr.length; j++) {
				 if(temp == arr[j]) {
					 max ++;
				 }
				 
			 }
			 if(max2 <max) {
				 max2 = max;
				 temp2 = arr[i];
			 }
			 if(max < min) {
				 min = max;
				 temp3 = arr[i];
			 }
		 }
		 System.out.println("개수가 가장 많은 숫자와 갯수는 : " + temp2 + "," + max2);
		 System.out.println("개수가 가장 적은 숫자와 갯수는 : " + temp3 + "," + min);
		 
		 
	}

}
