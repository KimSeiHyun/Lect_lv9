package lv4;

public class Ex03_06 {

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		// 위 배열에서 중복안된숫자를 제거하시요 
		// 1) {1,2,1,2}
		// 2) {4,4}
		// 3) {1,1,1,1}
		
		int temp = 0;
		int cnt2 =0;
		for(int i=0; i<5; i++) {
			int cnt = 0;
			temp = test1[i];
			for(int j=0; j<5; j++) {
				if(test1[j] == temp) {
					cnt++;
				}
			}
			if(cnt == 1 ) {
				test1[i] = 0;
				cnt2 ++;
			}
			
		}
		System.out.println("중복된 숫자 개수 "  + cnt2);
		for(int i =0; i<5; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println();
		int temp1[] = new int[5-cnt2];
		int idx2 = 0;
		for(int i=0; i<5; i++) {
			int idx = 0;
			if(test1[i] != 0) {
				idx = i;
				for(int j=0; j<temp1.length; j++) {
					temp1[idx2] = test1[idx];
					idx2 ++;
					break;
				}
			}
		}
	
		for(int i=0; i<temp1.length; i++) {
			System.out.print(temp1[i] + " ");
		}
		System.out.println();
		//---------------------------------------------
		
		 temp = 0;
		 cnt2 =0;
		for(int i=0; i<5; i++) {
			int cnt = 0;
			temp = test2[i];
			for(int j=0; j<5; j++) {
				if(test2[j] == temp) {
					cnt++;
				}
			}
			if(cnt == 1 ) {
				test2[i] = 0;
				cnt2 ++;
			}
			
		}
		System.out.println("중복된 숫자 개수 "  + cnt2);
		for(int i =0; i<5; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println();
		int  temp2[] = new int[5-cnt2];
		int idx3 = 0;
		for(int i=0; i<5; i++) {
			int idx = 0;
			if(test2[i] != 0) {
				idx = i;
				for(int j=0; j<temp2.length; j++) {
					temp2[idx3] = test2[idx];
					idx3 ++;
					break;
				}
			}
		}
		
		for(int i=0; i<temp2.length; i++) {
			System.out.print(temp2[i] + " ");
		}
		System.out.println();
		//---------------------------------
		
		 temp = 0;
		 cnt2 =0;
		for(int i=0; i<5; i++) {
			int cnt = 0;
			temp = test3[i];
			for(int j=0; j<5; j++) {
				if(test3[j] == temp) {
					cnt++;
				}
			}
			if(cnt == 1 ) {
				test3[i] = 0;
				cnt2 ++;
			}
			
		}
		System.out.println("중복된 숫자 개수 "  + cnt2);
		for(int i =0; i<5; i++) {
			System.out.print(test3[i] + " ");
		}
		System.out.println();
		int  temp3[] = new int[5-cnt2];
		int idx4 = 0;
		for(int i=0; i<5; i++) {
			int idx = 0;
			if(test3[i] != 0) {
				idx = i;
				for(int j=0; j<temp3.length; j++) {
					temp3[idx4] = test3[idx];
					idx4 ++;
					break;
				}
			}
		}
		
		for(int i=0; i<temp3.length; i++) {
			System.out.print(temp3[i] + " ");
		}
		System.out.println();

	}//c

}
