package lv.test_3;

public class lv3_10 {

	public static void main(String[] args) {
		// 문제1)  a의 값과 b의 값을 번갈아가면서 c에 저장
		// 예) c = {10,40,20,50,30,60}
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		int x = 0;
		for(int i=0; i<3; i++) {
			c[x] = a[i];
			x++;
			c[x] = b[i];
			x++;
		}
		
		System.out.println("문제1");
		for(int i=0; i<6; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		// 문제 2) aa 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 bb의  값을 저장 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// 예) aa = {20,30,40,50,90};
		System.out.println("문제2");
		for(int i=0; i<5; i++) {
			if(i == 4) {
				aa[i] = 90;
				break;
			}
			aa[i] = aa[i+1];
		}
		for(int i=0; i<5; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.println();
		// 문제 3) cc 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 dd의 값을 저장 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		// 예) cc[] = {60,10,20,30,40};
		System.out.println("문제3");
		for(int i=4; i>=0; i--) {
			if(i == 0) {
				cc[i] = dd;
				break;
			}
			cc[i] = cc[i-1];
		}
		for(int i=0; i<5; i++) {
			System.out.print(cc[i] + " ");
		}
		System.out.println();
		
	}

}
