package lv.test_5;

public class lv5_08s {

	/*
	 * # 문자열 비교
	 * . equals() 또는 compareTo() 메서드 사용없이 문자의 일치여부 비교
	 * 예)
	 * 코끼리
	 * 입력 = 티라노사우루스
	 * 출력 = false
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();
		
	}
}