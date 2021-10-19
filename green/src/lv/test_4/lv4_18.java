package lv.test_4;

public class lv4_18 {

	public static void main(String[] args) {
		// 문제 ) 사전 순으로 이름 정렬
		String[] names = { "라길동", "다유신", "마동석", "니바킹", "가동요" };
		
		
		System.out.println(names[0].equals(names[1]));
		System.out.println(names[1].compareTo(names[0])); 
		System.out.println(names[1].compareTo(names[2])); 
		System.out.println(names[0].compareTo(names[1]));
		System.out.println(names[0].compareTo(names[4]));
		
		int max = 0;
		
		for(int i=0; i<5; i++) {
			max = 0;
			int check = 0;
			int  a = 0;
			int  b = 0;
			for(int j =i; j<5; j++) {
				if(names[i].compareTo(names[j]) > max) {
					max = names[i].compareTo(names[j]);
					check = 1;
					a = i;
					b = j;
				}
			}
			if(check == 1) {
				String temp = names[a];
				names[a] = names[b];
				names[b] = temp;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(names[i] + " ");
		}
	}

}
