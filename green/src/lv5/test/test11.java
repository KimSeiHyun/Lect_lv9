package lv5.test;

public class test11 {

	public static void main(String[] args) {
		//시작시간 02 : 35
		//종료시간 02 : 51
		//소요시간 00 : 16
		
		String [][] student = {// [4][3]
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} ,
				{"ddd" , "강동","1004"}};
		String[][] score = {
				{"번호" ,"과목" , "점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		
		int max = 0;
		String num = "";
		for(int i=0; i<4; i++) {
			num = student[i][2];
			int sum = 0;
			for(int j=1; j<score.length; j++) {
					if(score[j][0].equals(num)) {
						sum += Integer.parseInt(score[j][2]);
					}
			}
			if( max < sum ) {
				max = sum;
			}
		}
		
		for(int i=0; i<4; i++) {
			num = student[i][2];
			int sum = 0;
			for(int j=1; j<score.length; j++) {
				if(score[j][0].equals(num)) {
					sum += Integer.parseInt(score[j][2]);
				}
			}
			if(sum == max) {
				for(int k=0; k<4; k++) {
					for(int j=0; j<3; j++) {
						if(student[k][j].equals(num)) {
							System.out.println("1등 학생은 : " + student[k][0]);
						}
					}
				}
			}
		}

	}

}
