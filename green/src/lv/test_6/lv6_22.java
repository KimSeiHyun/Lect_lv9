package lv.test_6;

class TestReturn3{
	int num;
	void setNum(int a) {
		num = a;
	}
	
	int getNum() {
		return num;
	}
}

public class lv6_22 {

	public static void main(String[] args) {
		TestReturn3 t1 = new TestReturn3();
		t1.setNum(10);
		int result = t1.getNum();
		System.out.println(result);
				
	}
}