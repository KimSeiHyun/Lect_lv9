package lv6;

// Ŭ������ ���� �� �ִ� ��� �ΰ���
// 1) �ɹ�����
// 2) �޼���


// �޼��� �����ε� Overloading
// �� ���� Ŭ���� ������ , ���� �̸��� �޼��带 ������ ������ �� ���� . 
// �� �Ű������� ������ �ٸ��� �� .

// ������ Scope (����, �����ֱ�)
// �� ������ �ڽ��� ����� ����{}�� ��� �� ����.

class Overload {
	
	int a;
	int b;
	
	
	void myPrint(int i) {
		this.a = i;
		System.out.println(i);
	}
	void myPrint(char c) {
		this.b = c;
		System.out.println(c);
	}
	void myPrint(String s) {
		System.out.println(s);
	}
	void myPrint(boolean b) {
		System.out.println(b);
	}
	void myPrint(int i , int j) {
		System.out.println(i + " " + j);
	}
	
	
	
	
}



public class Ex003 {

	public static void main(String[] args) {

		Overload ex = new Overload();
		
		ex.myPrint(5);
		ex.myPrint('a');
		ex.myPrint("abc");
		ex.myPrint(false);
		ex.myPrint(1,2);
		

	}

}
