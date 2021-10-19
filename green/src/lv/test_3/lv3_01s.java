package lv.test_3;

import java.util.Random;

public class lv3_01s {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random rn = new Random();
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = 10*(i+1);
			sum += arr[i];
		}
		System.out.println("문제1");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 문제2) 전체 합 출력
		// 정답2) 150
		System.out.println("문제2");
		System.out.println("전체 합 : " + sum);
	}

}
