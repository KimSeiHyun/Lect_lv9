package lv.test_4;

public class lv4_22 {

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		int check[] = new int[5];
		// 위 배열에서 중복안된숫자를 제거하시요 
		// 1) {1,2,2,1}
		// 2) {4,4}
		// 3) {1,1,1,1}
		int size = test1.length;
		for(int i=0; i<test1.length; i++) {
			int cnt = 0 ;
			for(int j=0; j<5; j++) {
				if(test1[i] == test1[j]) {
					cnt ++;
				}
			}
			if(cnt == 1) {
				check[i] ++;
				size --; 
			}
		}
		
		int temp1[] = new int[size];
		int x = 0;
		for(int i=0; i<5; i++) {
			if(check[i] == 0) {
				temp1[x] = test1[i];
				x++;
			}
		}
		
		size = test1.length;
		check = new int[5];
		for(int i=0; i<test1.length; i++) {
			int cnt = 0 ;
			for(int j=0; j<5; j++) {
				if(test2[i] == test2[j]) {
					cnt ++;
				}
			}
			if(cnt == 1) {
				check[i] ++;
				size --; 
			}
		}
		
		int temp2[] = new int[size];
		x = 0;
		for(int i=0; i<5; i++) {
			if(check[i] == 0) {
				temp2[x] = test2[i];
				x++;
			}
		}
		size = test1.length;
		check = new int[5];
		for(int i=0; i<test1.length; i++) {
			int cnt = 0 ;
			for(int j=0; j<5; j++) {
				if(test3[i] == test3[j]) {
					cnt ++;
				}
			}
			if(cnt == 1) {
				check[i] ++;
				size --; 
			}
		}
		
		int temp3[] = new int[size];
		x = 0;
		for(int i=0; i<5; i++) {
			if(check[i] == 0) {
				temp3[x] = test3[i];
				x++;
			}
		}
		
		for(int i=0; i<temp1.length; i++) {
			System.out.print(temp1[i] + " ");
		}System.out.println();
		for(int i=0; i<temp2.length; i++) {
			System.out.print(temp2[i] + " ");
		}System.out.println();
		for(int i=0; i<temp3.length; i++) {
			System.out.print(temp3[i] + " ");
		}System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
