package lv.test_6;

class Calculations{
	double num1;
	double num2;
	double result;	
	
	// �ż���� ��� ���������̶� �������� ǥ�õ� �������� �ߺ��̵Ǿ ���� �ٸ� �����̴�.
	// double a, double b  �� 4���̳� ��������� �����ٸ������̴�. 
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
