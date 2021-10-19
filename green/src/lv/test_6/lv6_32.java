package lv.test_6;

import java.util.Random;
import java.util.Scanner;

class Test3s1 {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	public void problem1(int arr[]) {
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		for(int i=0; i<arr.length; i++) {
			int rNum = rn.nextInt(100)+1;
			arr[i] = rNum;
		}
	}
	public void problem2(int arr[]) {
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +(double)sum/arr.length);
	}
	public void problem3(int arr[]) {
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명\
		int cnt =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 60) cnt++;
		}
		System.out.println("합격생 수 : " +cnt);
	}
	public void problem4(int arr[]) {
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.print("인덱스 입력 : ");
		int idx = sc.nextInt();
		System.out.println(arr[idx]);
	}
	public void problem5(int arr[]) {
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();
		int idx = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == score) idx = i;
		}
		System.out.println(idx);
	}
	public void problem6(int arr1[] , int arr2[]) {
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		System.out.print("학번 입력 : ");
		int num = sc.nextInt();
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == num) System.out.println(arr2[i]);
		}
	}
	public void problem7(int arr1[] , int arr2[]) {
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		int num = sc.nextInt();
		int check = 0;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == num) {
				check = 1;
				System.out.println(arr2[i]);
			}
		}
		if(check == 0) System.out.println("해당 학번은 존재하지 않습니다.");
	}
	public void problem8(int arr1[] , int arr2[]) {
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int max  =0;
		int idx = -1;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] > max ) {
				max = arr2[i];
				idx = i;
			}
		}
		System.out.printf("%d번(%d점)",arr1[idx],max);
	}
}

public class lv6_32 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		Test3s1 e = new Test3s1();
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		e.problem1(scores);
		System.out.println("문제1.");
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}System.out.println();
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		System.out.println("문제2.");
		e.problem2(scores);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		System.out.println("문제3");
		e.problem3(scores);
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.println("문제4");
		e.problem4(scores);
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.println("문제5");
		e.problem5(scores);
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		System.out.println("문제6");
		e.problem6(hakbuns,scores);
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.println("문제7");
		e.problem7(hakbuns, scores);
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		System.out.println("문제8");
		e.problem8(hakbuns, scores);
	}
}