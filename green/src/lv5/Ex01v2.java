package lv5;

public class Ex01v2 {

	public static void main(String[] args) {
		//문자열
		//ㄴ 문자의 나열(배열)
		// ㄴchar 자료형의 배열 > String 클래스가 처리
		
		
		//문자열 메서드
		
		// substring() 
		// ㄴ 문자열.substring(index)  //index ~마지막 문자까지 추출. 
		// ㄴ 문자열.substring(start,end) // start~end-1 문자까지 추출
		String str = "Do not go gentle onto that good night.";
//					  0123456...
		System.out.println("[substring()]");
		System.out.println(str.substring(0));
		System.out.println(str.substring(0,1));
		
		
		// split()
		// ㄴ 문자열.split("구분자")   //구분자를 기준으로 잘라내기 > 문자열 배열로 반환 
		
		System.out.println("[split(구분자)]");
		String result[] = str.split(" ");
		System.out.println(result.length);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		//charAt()
		// ㄴ 문자열.charAt(index) // 지정한 인덱스의 문자 한 개를 char 타입으로 반환 
		System.out.println("[charAt(index)]");
		char a = str.charAt(1); // D
		System.out.println(a);
	}

}
