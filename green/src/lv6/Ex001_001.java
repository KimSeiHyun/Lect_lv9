package lv6;

class Ex03 {
	int[] arr = { 87, 100, 11, 72, 92 };
	String str;
}
//Ŭ���� ����1
public class Ex001_001 {

	public static void main(String[] args) {
		
		Ex03 ex = new Ex03();
		
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		System.out.println("����1");
		int sum = 0;
		int sum2 = 0;
		int cnt = 0;
		int cnt2 = 0;
		for(int i=0; i<ex.arr.length; i++) {
			sum += ex.arr[i];
			if(ex.arr[i] %4 == 0) {
				sum2 += ex.arr[i];
				cnt ++;
			}
			if(ex.arr[i] %2 == 0) {
				cnt2 ++;
			}
		}
		System.out.println(sum);
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		System.out.println("����2");
		System.out.println(sum2);
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		System.out.println("����3");
		System.out.println(cnt);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3	
		System.out.println("����2");
		System.out.println(cnt2);
		
		
	}

}
