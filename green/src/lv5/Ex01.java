package lv5;

public class Ex01 {

	public static void main(String[] args) {
		//문자열
		//ㄴ 문자의 나열(배열)
		// ㄴchar 자료형의 배열 > String 클래스가 처리
		
		//형변환 
		//문자 > 숫자
		//문자 하나가 숫자하나는 형변환이 가능 .
		//숫자,문자든 각각 고유숫자값이 있음 . 
		//문자열은 숫자로만 이뤄졋을때만 숫자로 가능
		//ex ) String  b = "123";  > 숫자로 가능.
		//ex ) String  b = "abcd";  > 숫자로 불가능.
		
		char a = 'a';
		int num = a;
		System.out.println(num); //ascii > 구글검색 > 차트
		num = (int)a;
		System.out.println(num);
		
		//문자열>숫자
		String b = "123";
		num = Integer.parseInt(b);
		System.out.println(num);
		
		//숫자 > 문자
//		String str = String.valueOf(num);
		String str = num +""; // 위에 String.valueOf를 써서 숫자를 문자로 바꿀수도 있지만 
							  // 이렇게 뒤에 + ""를해줌으로서도 num 은 문자열처리가 될 수도 잇다 . (꼼수)
		str += "apple"; // 1이 문자열인지 확인하기 위해 추가해봄 
		System.out.println(str);
		
		System.out.println(1+"answ"); //
		
		
	}

}
