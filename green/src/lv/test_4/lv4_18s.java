package lv.test_4;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class lv4_18s {

	public static void main(String[] args) {
		// 문제 ) 사전 순으로 이름 정렬
		String[] names = { "마길동", "김유신", "나동석", "라바킹", "다동요" };
		
		
		Arrays.sort(names);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
