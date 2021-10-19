package lv2;

public class Level_Test_7tc {

	public static void main(String[] args) {
//		#   문제1)
//	    #   운주네 반 학생은 31명입니다.
//		#   이중에서 남학생은 12명 , 여학생은 14명이 봉사할동을 하였습니다.
//		#   은주네 반에서 봉사활동을 하지않은 학생은
//		#   몇명인지 출력 
		
		int total = 31;
		int boy = 12;
		int girl = 14;
		
		int none = 0; // 결과값 . 
		
		while (boy + girl > 0) {
			if ( boy > 0) {
				boy --;
			}
			else if (girl > 0) {
				girl --;
			}
			total --;
		}
		System.out.println(total);
		
		while(total >0) {
			total --;
			none ++;
		}
		
		
		
		
		
		
		
		
		
	}

}
