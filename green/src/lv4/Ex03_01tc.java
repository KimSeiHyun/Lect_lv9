package lv4;

public class Ex03_01tc {

	public static void main(String[] args) {
		// 문제 ) 사전 순으로 이름 정렬
		String[] names = { "나나나", "김김", "하하", "마마", "사사" };

		String a = "가";
		String b = "나";
		String c = "가";
		
		System.out.println(a.compareTo(b)); // 음수 > a가 b보다 앞이다.
		System.out.println(b.compareTo(c)); // 양수 > b가 c보다 뒤이다 . 
		System.out.println(a.compareTo(c)); // 0   > a랑 c가  같다.
		
		for(int i=0; i<names.length; i++) {
			String first = names[i];
			int idx = i;
			for(int j =i; j<names.length; j++) {
				if(first.compareTo(names[j]) > 0) { // i번째 값의 순서가 더 뒤로 가야하는 경우
					first = names[j];
					idx = j;
				}
			}
			
			String temp = names[i];
			names[i] = names[idx];
			names[idx] = temp;
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
