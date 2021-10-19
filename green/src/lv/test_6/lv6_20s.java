package lv.test_6;

class Calculations{
	double num1;
	double num2;
	double result;	
	
	// 매서드는 모두 독립공간이라서 갈색으로 표시된 변수들은 중복이되어도 전부 다른 변수이다.
	// double a, double b  은 4번이나 사용하지만 각각다른변수이다. 
	void plus(double a, double b) {
		result = a + b;
	}
	void minus(double a , double b) {
		result = a - b;
	}

	void multiply(double a , double b) {
		result = a * b;
	}
	void division(double a , double b) {
		result = a / b;
	}
	void printResult() {
		System.out.println(result);
	}
}

public class lv6_20s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
