package lv.test_6;

//�ż��� �⺻���� 
//����
//1) void 				==> Ű����
//2) setNums 			==> �̸�
//3) (int a , int b )  ==> main���� ������������ �����ϴº���(�Ű�����)
//4) {���}             ==> ����Ǵ� ���� 
	
//����
//test1.setNums(10, 20);
//1) test1     ==> Ŭ����������
//2) .setNums  ==> .�Լ��̸�
//3) (10, 20); ==> (�����Ұ�);

class Test3s{
	int num1;
	int num2;
	
	void setNums(int a , int b) {
		num1 = a;
		num2 = b;
	}
	void printNums() {
		System.out.println(num1 + " " + num2);
	}
}

public class lv6_15s {

	public static void main(String[] args) {
		// �Ʒ��Ͱ��� ���� �����ؼ� ��� �Ҽ���������.
		// �ż��带 ���� ����Ҽ����ִ�.
		Test3 test1 = new Test3();
		test1.num1 = 10;
		test1.num2 = 20;
		System.out.println(test1.num1 + " " + test1.num2);
			
		Test3 test2 = new Test3();
		test2.setNums(10, 20);
		test2.printNums();
	}
}