package lv6;

//������ ��������
class Calculater {
	// 0. guide message (���)
	// 1. ���ϱ�
	// 2. ����
	// 3. ���ϱ�
	// 4. ������
	// 5. ������
	void guide() {
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("5. %");
	}
	int one(int num1 , int num2) {
		return num1+num2;
	}
	int two(int num1, int num2) {
		return num1-num2;
	}
	int three(int num1 , int num2) {
		return num1*num2;
	}
	int four(int num1 , int num2) {
		return num1/num2;
	}
	int five(int num1 , int num2) {
		return num1%num2;
	}
}

public class Ex002_001 {

	public static void main(String[] args) {
		Calculater cal = new Calculater();
		
		cal.guide();
		
		int a = 15;
		int b = 5;
		
		
		int one = cal.one(a, b);
		System.out.println(one);
		
		int two = cal.two(a, b);
		System.out.println(two);
		
		int three = cal.three(a, b);
		System.out.println(three);
		
		int four = cal.four(a, b);
		System.out.println(four);
		
		int five = cal.five(a, b);
		System.out.println(five);
		
		
	}

}
