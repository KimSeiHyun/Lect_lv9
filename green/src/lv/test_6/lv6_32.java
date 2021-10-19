package lv.test_6;

import java.util.Random;
import java.util.Scanner;

class Test3s1 {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	public void problem1(int arr[]) {
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		for(int i=0; i<arr.length; i++) {
			int rNum = rn.nextInt(100)+1;
			arr[i] = rNum;
		}
	}
	public void problem2(int arr[]) {
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("���� : " +sum);
		System.out.println("��� : " +(double)sum/arr.length);
	}
	public void problem3(int arr[]) {
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��\
		int cnt =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 60) cnt++;
		}
		System.out.println("�հݻ� �� : " +cnt);
	}
	public void problem4(int arr[]) {
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.print("�ε��� �Է� : ");
		int idx = sc.nextInt();
		System.out.println(arr[idx]);
	}
	public void problem5(int arr[]) {
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		int idx = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == score) idx = i;
		}
		System.out.println(idx);
	}
	public void problem6(int arr1[] , int arr2[]) {
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		System.out.print("�й� �Է� : ");
		int num = sc.nextInt();
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == num) System.out.println(arr2[i]);
		}
	}
	public void problem7(int arr1[] , int arr2[]) {
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.print("�й� �Է� : ");
		int num = sc.nextInt();
		int check = 0;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == num) {
				check = 1;
				System.out.println(arr2[i]);
			}
		}
		if(check == 0) System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
	}
	public void problem8(int arr1[] , int arr2[]) {
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		int max  =0;
		int idx = -1;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] > max ) {
				max = arr2[i];
				idx = i;
			}
		}
		System.out.printf("%d��(%d��)",arr1[idx],max);
	}
}

public class lv6_32 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		Test3s1 e = new Test3s1();
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		e.problem1(scores);
		System.out.println("����1.");
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}System.out.println();
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		System.out.println("����2.");
		e.problem2(scores);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		System.out.println("����3");
		e.problem3(scores);
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.println("����4");
		e.problem4(scores);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.println("����5");
		e.problem5(scores);
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		System.out.println("����6");
		e.problem6(hakbuns,scores);
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("����7");
		e.problem7(hakbuns, scores);
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		System.out.println("����8");
		e.problem8(hakbuns, scores);
	}
}