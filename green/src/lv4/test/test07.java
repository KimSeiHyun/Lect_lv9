package lv4.test;

public class test07 {

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		// 위 배열에서 중복안된숫자를 제거하시요 
		// 1) {1,2,1,2}
		// 2) {4,4}
		// 3) {1,1,1,1}
		
		// 시작 10:54
		// 종료 11:07 
		// 소요 00:13
		int count = 5;
		int x = 0;
		for(int i=0; i<5; i++) {
			int cnt = 0;
			for(int j=0; j<5; j++) {
				if(test1[i] == test1[j]) {
					cnt++;
				}
			}
			if(cnt == 1) {
				test1[i] = 0;
				count --;
			}
		}
		
		int temp[] = test1;
		test1 = new int[count];
		for(int i=0; i<5; i++) {
			if(temp[i] != 0) {
				test1[x] = temp[i];
				x++;
			}
		}
	
		System.out.println("count = " + count);
		for(int i=0; i<count; i++) {
			System.out.print(test1[i] + " ");
		}System.out.println();
		
		count = 5;
		x = 0;
		for(int i=0; i<5; i++) {
			int cnt = 0;
			for(int j=0; j<5; j++) {
				if(test2[i] == test2[j]) {
					cnt++;
				}
			}
			if(cnt == 1) {
				test2[i] = 0;
				count --;
			}
		}
		
		int temp2[] = test2;
		test2 = new int[count];
		for(int i=0; i<5; i++) {
			if(temp2[i] != 0) {
				test2[x] = temp2[i];
				x++;
			}
		}
	
		System.out.println("count = " + count);
		for(int i=0; i<count; i++) {
			System.out.print(test2[i] + " ");
		}System.out.println();
		
		count = 5;
		x = 0;
		for(int i=0; i<5; i++) {
			int cnt = 0;
			for(int j=0; j<5; j++) {
				if(test3[i] == test3[j]) {
					cnt++;
				}
			}
			if(cnt == 1) {
				test3[i] = 0;
				count --;
			}
		}
		
		int temp3[] = test3;
		test3 = new int[count];
		for(int i=0; i<5; i++) {
			if(temp3[i] != 0) {
				test3[x] = temp3[i];
				x++;
			}
		}
	
		System.out.println("count = " + count);
		for(int i=0; i<count; i++) {
			System.out.print(test3[i] + " ");
		}System.out.println();

	}

}
