package lv.test_8;

import java.util.ArrayList;

public class lv8_01 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		// �߰�
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		// ���
		System.out.println(arr);
		
		for(int i : arr)
			System.out.println(i);
		
		// ����(�ε���)
		arr.remove(0);
		
		// ����(��)
		arr.remove(new Integer(20));
		arr.remove(new Integer(30));
		
		System.out.println("\n>>");
		for(Integer i : arr)
			System.out.println(i);
		
		// ���� 
		arr.add(1, 100);
		
		System.out.println("\n>>");
		for(int i : arr)
			System.out.println(i);
		
		// �� ��������
		System.out.println("\n>>");
		System.out.println(arr.get(1));
		
		// �迭�� ũ��
		System.out.println(arr.size());


	}
}