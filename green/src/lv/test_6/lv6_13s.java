package lv.test_6;

//�ż��� �⺻���� 
//����
//1) void 				==> Ű����
//2) testPrint() 		==> �̸�
//3) {���}             ==> ����Ǵ� ���� 
	
//����
//t1.testPrint();
//1) t1     ==> Ŭ����������
//2) .testPrint(); ==> .�Լ��̸�();
class Tests{		
	void testPrint() {
		System.out.println("!!");
	}
}

public class lv6_13s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.testPrint();
		test.testPrint();
		test.testPrint();
		test.testPrint();
		

	}

}
