package lv4;

public class Ex01_10 {

	public static void main(String[] args) {
		/*
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		위 배열에서 똑같은 숫자의 개수가 가장 적은 숫자와 가장 많은 숫자 의  개수를  출력 
		예) 개수가 가장적은숫자 ==> 100
		예) 개수가 가장많은숫자 ==> 3
		가장 많은 갯수 출력 : 3 ===> 5개 
		가장 적은 갯수 출력 : 100 ===> 1개
		*/
		
		 int [] arr = {1,1,3,3,3,100,2,2,3,1,3};
		 
		 int max = 0;
		 int min = arr.length;
		 int a = 0;
		 int b = 0;
		 for(int i=0; i<arr.length; i++) {
			 int cnt = 0;
			 
			 for(int j =i; j<arr.length; j++) {
				 if(arr[i] == arr[j]) {
					 cnt ++;
				 }
			 }
			 if( cnt > max ) {
				 max = cnt;
				 a = arr[i];
			 }
			 if( cnt < min ) {
				 min = cnt;
				 b = arr[i];
			 }
		 }
		 
		 System.out.printf("갯수가 가장 많은 숫자는 %d이며 갯수는 %d입니다.\n",a,max);
		 System.out.printf("갯수가 가장 적은 숫자는 %d이며 갯수는 %d입니다.",b,min);

		 
 
		 
		 
		 
	} //clear

}
