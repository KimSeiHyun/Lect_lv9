package lv.test_6;

class Ex03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class lv6_02 {

	public static void main(String[] args) {
		Ex03 e = new Ex03();
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		int sum = 0;
		System.out.println("����1 ��ü�� ");
		for(int i=0; i<e.arr.length; i++) {
			sum += e.arr[i];
		}
		System.out.println(sum);
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		System.out.println("����2  4�� ����� ��");
		sum = 0;
		int cnt = 0;
		int cnt2 = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i] %4 == 0 ) {
				sum +=e.arr[i];
				cnt++;
			}
			if(e.arr[i]%2 == 0 )cnt2 ++;
		}
		System.out.println(sum);
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		System.out.println("����3 4�� ����� ����");
		System.out.println(cnt);

		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		System.out.println("����4 ¦���� ����");
		System.out.println(cnt2);

	}
}