package lv6;

import java.util.Random;

// Ŭ���� : ����� ���� �ڷ���
// �� ��� 
//  1)�ɹ�����
//  2)�ż���

// �޼���(�Լ�) : ��ɴ����� �ڵ���� ������ �� �ְ� ���� ��.
// �޼��� ���� 
// �ڷ���Ű���� �޼����(){ ���๮ }
// void - ��ȯ�� Ÿ���� �������� ���� ��쿡 ��� 
class Intro {
	String name;
	
	// Type 1
	// void ��ȯ X . �Ķ���� X . 
	void sayHello() {
		// ���๮ 
		System.out.printf("%s�� �ȳ� ! \n", name);
	}
	// ����) 1~5������ ���� ����ϴ� �޼���.
	void sum() {
		int sum = 0;
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	// 4���� ������ �޼��� ���ǹ�� 
	// Type 2
	// ��ȯ X , �Ķ�̴� O
	void add(int num1, int num2) { // parameter �Ű�����
		int sum = num1+num2;
		System.out.println("sum : " +sum);
		
	}
	
	// Type 3
	// ��ȯ O , �Ķ���� X
	int ranNum() {
		Random rn = new Random();
		int rNum = rn.nextInt(10)+1;
		return rNum;
	}
	// Type 4
	// ��ȯ O , �Ķ���� O
	String makeStr(String key) {
		return key + "�� �ȳ�!";
	}
	
}//class Intro




public class Ex002 {

	public static void main(String[] args) {
		String str = "abcd";
//		str.
		// �޼����� ���(ȣ��)
		// .(��)�� ��� > Ŭ������ ������ �ִ� �޼��带 ���� . 
		
		Intro intro = new Intro();
		Calculater cal = new Calculater();
		intro.name = "�輼��";
		intro.sayHello();
		
		intro.sum();
		
		int a = 10;
		int b = 20;
		
		intro.add(a,b); // arguments ����(��)
		
		int num = intro.ranNum();
		System.out.println(num);
		
		String result = intro.makeStr("�Ѹ�");
		System.out.println(result);
		System.out.println();
		
		cal.guide();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
