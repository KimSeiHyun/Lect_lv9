package lv5;

import java.util.Scanner;

public class Ex02d {

	public static void main(String[] args) {
		//����ó��4
		
		//	������ ���� (�������Ʈ)
		//	https://butter-shower.tistory.com/87
		
		// try , catch , finally
		
		// finally �� ���� ���� ������� ������ ����ȴ�.
		// �ڵ尡 �� �۵��ߴµ� Ȯ�� �Ҷ� ����.(�ȳ�������)
		Scanner sc = new Scanner(System.in);
		System.out.println("����1");
		int[] arr = { 0 , 1 , 2};
		int num = 10;
		try {
			System.out.println("������ �ε��� :" + arr[3]);
			System.out.println("ó�� �ε��� : " + arr[0]);
			System.out.println(num / 0);
		}catch(Exception a ) {
			System.out.println("������ �ε���(3) �������� ����"); // ������ ���� ����ϴ� ��¹� 
			a.printStackTrace(); // ������ ���� ��� ������ ��� . 
		}
		System.out.println("������ �߻��ص� ������� . \n");
		
		System.out.println("����2");
		int x = 10;
		String str = "abcd";
		try {
			int y = Integer.parseInt(args[0]);
	//		int temp = Integer.parseInt(str);
	//		System.out.println(x / 0);
			System.out.println(x / y);
		} catch (ArrayIndexOutOfBoundsException e){ // �迭�� ������ ��� �ε��� ���� �߻� . 
													// main() �޼ҵ��� �μ��� ���� �� �߻�. 
			System.out.println("�ε����� �������� �ʽ��ϴ�.");
		} catch (NumberFormatException e) { 		// main() �޼ҵ��� �μ��� ���ڷ� �ٲ� �� ���� �� �߻�. 
			System.out.println("���ڰ� �ƴմϴ�.");
		} catch (ArithmeticException e) {			// main() �޼ҵ��� �μ��� 0�϶� ���� �� �����Ƿ� �߻� . 
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			System.out.println("�׻� ����˴ϴ�.\n ");	//���� �߻��� ������� �׻� ���� . 
		}
		// ���� catch ����� �� catch ����
		// 1.���� catch ����� �� try ��Ͽ��� ���ܰ� �߻��ϸ� �߻��� ���ܸ� catch ��� ������� ��.
		// 2.�տ� �ִ� catch ����� ���� ��ü�� ���� catch ��� ���� ��ü�� �θ��� 
		//   �տ� �ִ� catch ����� ���� ����è.
		// 3. ��ü���� ���ܸ� ���� ó����� �� . (�߿�)
		
		System.out.println("����3");
		
		int arr2[] = { 0 , 1 , 2};
		
		try {
			int a = arr2[3];
		} catch (Exception e ) {
			System.out.println("�����߻�  !!");
		}
//		catch (ArrayIndexOutOfBoundsException e) { 
//			// Exception ��ü�� ó���ϴ� catch ��Ͽ��� ��� ���ܸ� ó���ϹǷ� 
//			// �� catch ����� ������ �� ���� . ������ ���� �߻�. 
//			System.out.println("�ε����� �������� �ʽ��ϴ�.");
//		}
		System.out.println("����");

		
	}

}
