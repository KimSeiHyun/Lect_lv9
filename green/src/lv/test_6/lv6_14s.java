package lv.test_6;

class Test2s{	
	
	void printSum() {
		int total = 0;
		for(int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println(total);
	}
}

public class lv6_14s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t2 = new Test2();
		// 1~5의 합을 출력하는함수
		t2.printSum();
		
	}

}
