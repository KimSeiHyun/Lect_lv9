package lv3;

public class Ex01_11tc {

	public static void main(String[] args) {
		// ����1)  a�� ���� b�� ���� �����ư��鼭 c�� ����
		// ��) c = {10,40,20,50,30,60}
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		
		for (int i=0; i<3; i++) { // i : 0(01) 1(23) 2(45)
			c[i*2] = a[i];
			c[i*2 +1] = b[i];
		}
		System.out.println("����1");
		for (int i=0; i<6; i++) {
			System.out.print(c[i] + "  ");
		}
		System.out.println();
		
		
		
		
		
		// ���� 2) aa �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� bb��  ���� ���� 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// ��) aa = {20,30,40,50,90};
		
		
		for ( int i=0; i<5; i++) { // i : 0~[4]
			//aa[i] = aa[i+1] ; //out bounds ... �� �����⶧���� if�� ������ �ɾ���. 	
			if(i+1 < 5) {
				aa[i] = aa[i+1] ;
			}
		}
		aa[4] = 90;
		System.out.println("����2");
		for(int i=0; i<5; i++) System.out.print(aa[i] + "  ");
		
		// ���� 3) cc �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� dd�� ���� ���� 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		// ��) cc[] = {60,10,20,30,40};

//		for(int i=0; i<5; i++) {
//			cc[i] = cc[i-1] ;  // ��� ���� 10���� ���ϵ�.
//		}
		
		
		for (int i=4; i>0; i--) {		// i : 4~1
			cc[i] = cc[i-1];			
		}
		cc[0] = dd;
		System.out.println();
		System.out.println("����3");
		for(int i=0; i<5; i++) {
			System.out.print(cc[i] + "  ");
		}
			
		
		
		
		
		
	}
}