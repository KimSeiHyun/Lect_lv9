package lv.test_6;

class Test1s {
	void printEvenOrOdd(int x) {
		if(x %2 == 0) System.out.println("¦��");
		else System.out.println("Ȧ��");
	}
	void sumBetweenValues(int x, int y) {
		int sum = 0;
		for(int i=x; i<=y; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	void printPrimeNums(int primeNumber) {
		for(int i=2; i<=primeNumber; i++) {
			int cnt = 0;
			for(int j=1; j<=primeNumber; j++) {
				if(i %j ==0) cnt ++;
			}
			if(cnt == 2) System.out.println(i);
		}
	}
}

public class lv6_30s {

	public static void main(String[] args) {
		Test1s test = new Test1s();
		// ���� 1) a �� Ȧ������ ¦������ ��� 
		int a = 19;
		test.printEvenOrOdd(a);

		// ���� 2) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		// ����3) ���� 1���� ���ڷ� ����ؼ� 2���� ���ڱ�����  �Ҽ� ���� ��� 
		int primeNumber = 20;
		test.printPrimeNums(primeNumber);
	
	}
}