package lv1;

// 1. Random Ŭ������ import  �׻� ����Ʈ�� ������Ű�� �ٷ� �ؿ� . 
import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		// ������ ���
		// Random : ������ ���� . 

		Random ran = new Random();
		
		// 1~10������ ���� �߿��� �������� ���� ��, ���.  
		int rNum = ran.nextInt();
		System.out.println((rNum));
		
		rNum = ran.nextInt(10); // 0~9
		System.out.println(rNum);
		
		rNum = ran.nextInt(10) +1 ; // 1~10 
		System.out.println(rNum);
	}

}
