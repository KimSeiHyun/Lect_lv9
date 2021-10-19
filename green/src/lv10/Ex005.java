package lv10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 자료구조 : 데이터를 어떤 규칙(조직)으로 저장하고 , 가져올것인가 
// Collection
// ㄴ ArrayList , Vector 

// ㄴ HashMap (key - value) : key 값이 인덱스의 역할을 하게됨 . 


public class Ex005 {

	public static void main(String[] args) {
		
		// 제네릭 <?> 은 : 객체의 자료형을 지정 
		// ㄴ 선언부에서 자료형(Type)을 정해주기 전까지는
		// ㄴ 결정되어지지 않은 열린 상태 . 
		
		
		
		
		// HashMap 선언 및 초기화 
		Map<String , Integer> users = new HashMap<>();
		
		// 추가
		// put() 메소드 사용
		// . 1쌍의 키 - 벨류가 들어가야 함.
		// . 중복키를 허용하지 않음.
		users.put("홍길동", 31);
		users.put("간장", 99);
		users.put("된장", 81);
		users.put("고추장가나다", 50);
		users.put("고추장가나다", 49); // 키가 중복이 되어서 들어가지 못함.  (중복키가 존재하는 경우 값을 갱신)
		users.put("초장", 325);
		
		System.out.println(users.size());
		
		// KeySey() 은 멥의 키값만 배열로 반환 . (Type : Object[최상위])
		for(Object ket : users.keySet()) {
			// 값 조회
			System.out.print(ket + ": ");
			System.out.println(users.get(ket));
		}
		users.remove("간장");
		for(Object val : users.values()) {
			System.out.println(val);
		}
		
		// 정렬
		Object keys[] = users.keySet().toArray();
		Arrays.sort(keys);
		
		System.out.println("keys");
		for(int i=0; i<keys.length; i++) {
			System.out.print(keys[i] +": ");
			System.out.println(users.get(keys[i]));
		}System.out.println("------------");
		

		System.out.println("temp============");
		Object temp[] = users.keySet().toArray();
		Arrays.sort(temp);
		for(int i=0; i<temp.length; i++) {
			for(int j=i; j<temp.length; j++) {
				if( users.get(temp[i]) > users.get(temp[j])) {
					Object temp2 = temp[i];
					temp[i] = temp[j];
					temp[j] = temp2;
				}
			}
		}
		
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" : ");
			System.out.println(users.get(temp[i]));
		}
		
		
		

	}

}
