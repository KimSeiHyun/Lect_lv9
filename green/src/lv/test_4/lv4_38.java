package lv.test_4;

public class lv4_38 {

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		
		// 위 배열에서 중복안된숫자를 제거하시요 
		// 1) {1,2,2,1}
		// 2) {4,4}
		// 3) {1,1,1,1}
		int cnt = 0;
		for(int i=0; i<5; i++) {
			int check = 0;
			for(int j=0; j<5; j++) {
				if( i != j && test1[i] == test1[j]) {
					check = 1;
				}
			}
			if(check == 0) {
				test1[i] = -1;
				cnt ++;
			}
		}
		int temp1[] = new int[test1.length-cnt];
		int x = 0;
		for(int i=0; i<test1.length; i++) {
			if(test1[i] != -1) {
				temp1[x] = test1[i];
				x++;
			}
		}
		for(int i=0; i<temp1.length; i++) {
			System.out.print(temp1[i] + " ");
		}System.out.println();
	}

}
