package lv5;

public class Ex03_07 {

	public static void main(String[] args) {
		//문자열심화1문제
		String [][] student = { // [4][3]
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , 
				{"ddd" , "강동","1004"}};
		String[][] score = { // [4][4]
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		int max = 0;
		int sum = 0;
		int x = -1;
		String maxName = "";
		for(int i=0; i<score.length; i++) {
			sum = 0;
			for(int j=1; j<4; j++) {
				sum += Integer.parseInt(score[i][j]);
			}
			if(max < sum ) {
				max = sum;
				x = i;
				maxName = score[i][0];
			}
		}

		for(int i=0; i<student.length; i++) {
			for(int j=0; j<student[i].length; j++) {
				if(maxName.equals(student[i][j])) {
					System.out.print("1등 성적의 이름 : ");
					System.out.println(student[i][0]);
				}
			}
		}
		

		
	}

}
