package lv.test_3;

import java.util.Scanner;

public class lv3_30 {

	public static void main(String[] args) {
		/*
		 * [�ݺ��� ��ȭ����]
		 * 
		 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
		 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
		 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
		 * 
		 * ��) 
		 * result �� �Է� : 99
		 * 
		 * �Է� : 10
		 * �Է� : 99
		 * �Է� : 20
		 * �Է� : 99
		 * �Է� : 30
		 * �Է� : 99
		 * �Է� : 10
		 * �Է� : -1
		 * 
		 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
		 */
		
		Scanner sc = new Scanner(System.in);
        int result = 99;
        

        
        // ����� �� ==> -1 ==> Ű�� �Է¹���������.
        // ����� �� ==> 99 , 77 , -1 ==> Ű�� 1���̴� 
        // ����� �� ==> 55, 99 , 99, 99, 99, 3 , -1 ==> Ű�� 2���̴�
		
        System.out.print("key�� �Է� : ");
        int cnt = 1;
        int x = 0;
		while(true) {
			int key = sc.nextInt();
			System.out.println("�Է� : " +key);
			
			if(key == result) {
				x = cnt;  
			}
			if(x ==0) {
			cnt ++;	
			}
			if(key == -1) {
				break;
			}
		}
		System.out.println("ù��°�� ���� Ű ���� :" + x +"��°�̴�.");

	}

}