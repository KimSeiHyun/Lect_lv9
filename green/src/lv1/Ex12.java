package lv1;

public class Ex12 {

	public static void main(String[] args) {
		// 직접구현 1. 가위바위보 3단계 
		// 시작 9:28
		// 종료 9:30
		// 소요 2분 
		
		// 포매터의 사용 ( 출력문 ) 
		// ㄴ 출력의 양식
		// ㄴ 문자열 안에 약속된 포매터키를 입력 -> 맵핑 
		
		// print()
		// println()  // new lint (줄바꿈 포함) 
		// printf() // formatter 
		
		// 자료형
		// 1. 정수 integer -> int			: "%d" decimal
		// 2. 실수 float   -> double		: "%f" float
		// 3. 문자 char    -> char		: "%c" char
		// 4. 문자영 String -> String 	: "%s" String
		
		// ** 학생의 성적은 ** 점 입니다 . 
		String stu = "김세현";
		int score = 100;
		
		System.out.println(stu + "학생의 성적은 " + score + "점 입니다 .");
		System.out.printf("%s 학생의 성적은 %d 입니다.", stu , score);
	}

}
