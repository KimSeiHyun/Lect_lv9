package lv1;

public class Ex11 {

	public static void main(String[] args) {
		//����������
		//�� ���� �Ǵ� ���� 
		
		// 1) a = a + 1;
		// 2) a += 1; ( ��Ģ���� �� ��밡�� . -= , *= , /= ) 
		// 3) a ++; (��������) //�����ڰ� ���Ե� ���� ����� �� ������ ���� 
		// 4) ++ a; (��������) //�����ڰ� ���Ե� ���� ���۵Ǳ� �� ������ ���� .
		
		int a = 10 ;
		int b = 20 ;
		int c ; 
		
		c = a ++ + b; // c = a + b; a += 1;
		System.out.println("c : " + c); // 30
		System.out.println("a : " + a); // 11
		
		c = ++ a + b; // a += 1; c = a + b ;
		System.out.println("c : " + c); // 32
		System.out.println("a : " + a); // 12
		


	}

}
