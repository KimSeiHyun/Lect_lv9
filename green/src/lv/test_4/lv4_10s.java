package lv.test_4;

public class lv4_10s {

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
		 int cnt = 0;
		 int x = 0;
		 int y = 0;
		 int min = arr.length;
		 int cnt2 = 0;
		 for(int i=0; i<arr.length; i++) {
			 cnt = 0;
			 cnt2 = 0;
			 for(int j=0; j<arr.length; j++) {
				 if(arr[i] == arr[j]) {
					 cnt ++ ;
					 cnt2 ++;
				 }
			 }
			 if(max < cnt ) {
				 max = cnt;
				 x = arr[i];
			 }
			 if(min > cnt2 ) {
				 min = cnt2;
				 y = arr[i];
			 }
		 }
		 
		 System.out.printf("가장 많은 숫자는 %d이고 갯수는 %d이다 .  ",x,max);
		 System.out.printf("가장 적은 숫자는 %d이고 갯수는 %d이다 .  ",y,min);

	}

}
