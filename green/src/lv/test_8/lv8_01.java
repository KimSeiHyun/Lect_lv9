package lv.test_8;

import java.util.ArrayList;

public class lv8_01 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		// 추가
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		// 출력
		System.out.println(arr);
		
		for(int i : arr)
			System.out.println(i);
		
		// 삭제(인덱스)
		arr.remove(0);
		
		// 삭제(값)
		arr.remove(new Integer(20));
		arr.remove(new Integer(30));
		
		System.out.println("\n>>");
		for(Integer i : arr)
			System.out.println(i);
		
		// 삽입 
		arr.add(1, 100);
		
		System.out.println("\n>>");
		for(int i : arr)
			System.out.println(i);
		
		// 값 가져오기
		System.out.println("\n>>");
		System.out.println(arr.get(1));
		
		// 배열의 크기
		System.out.println(arr.size());


	}
}