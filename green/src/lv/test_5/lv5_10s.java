package lv.test_5;

public class lv5_10s {

	/*
	 * # 단어 교체하기(replace)
	 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
	 * 2. 교체해주는 기능을 구현한다.
	 * 예)
	 * 		Life is too short.
	 * 		변경하고 싶은 단어입력 : Life
	 * 		바꿀 단어입력 : Time
	 * 
	 * 		Time is too short.
	 */
	
	// replace() 메서드 사용 X
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();


		
	}

}