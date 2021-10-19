package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex001_11 {
	final int SIZE = 6;
	int arr[] = new int[SIZE];
	int checkArr[] = new int[3];
	int answerArr[] = {-1,-1,-1};
	int sum = 0;
	int checkSum = 0;
}
public class Ex001_011 {

	public static void main(String[] args) {
		
		/*
		 * # 더하기 게임
		 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
		 * 2. 6개의 배열의 인덱스를 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 
		       그 인덱스의 값 의 합을 출력한다. 
		 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
		*  예)  4, 7, 5, 3, 2, 9  //   문제:  14   ==> 인덱스 3개를 골라서 합을 맞추면된다.  
		    정답)  3,4,5 (여러가지 경우의 수가 나올수는있다)
		 */
		
		Ex001_11 ex = new Ex001_11();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int s = 0;
		
		
		while(s < ex.SIZE) { //배열에 중복없이 랜덤값 저장.
			int rNum = rn.nextInt(10)+1;
			int check = 0;
			for(int i=0; i<ex.SIZE; i++) {
				if(ex.arr[i] == rNum) {
					check = 1;
				}
			}
			if(check == 0) {
				ex.arr[s] = rNum;
				s++;
			}
			
		}//while s
		
		s = 0;
		while(s < 3) {//배열에 중복없이 랜덤값 저장. 
			int rIdx = rn.nextInt(6);
			int check = 0;
			for(int i=0; i<3; i++) {
				if(ex.checkArr[i] == rIdx) {
					check = 1;
				}
			}
			if(check == 0) {
				ex.checkArr[s] = rIdx;
				ex.sum += ex.arr[ex.checkArr[s]];
				s++;
			}
		}

		
		int cnt = 0;
		while(true) {
			//출력
			System.out.println("sum : " + ex.sum);
			System.out.println("ex.checkSum : " +ex.checkSum);
			for(int i=0; i<ex.SIZE; i++) {
				System.out.print(ex.arr[i] + " ");
			}System.out.println();
			for(int i=0; i<ex.checkArr.length; i++) {
				System.out.print(ex.checkArr[i] + " ");
			}System.out.println();
			for(int i=0; i<ex.checkArr.length; i++) {
				System.out.print(ex.answerArr[i] + " ");
			}System.out.println();
			System.out.println("중복없이 인덱스를 3개 골라주세요 . ");
			int x = sc.nextInt();
			int check = 0;
			if(x >=0 && x <6) {//중복없이 인덱스 3개 고르기 . 중복이라면 처리되지 않음 .
			for(int i=0; i<3; i++) {
				if(ex.answerArr[i] == x) {
					check = 1;
				}
			}
			if(check == 0 && cnt < 3) {
				ex.answerArr[cnt] = x;
				ex.checkSum += ex.arr[ex.answerArr[cnt]];
				cnt ++;
			}else {
				System.out.println("이미 고르신 인덱스입니다.");
			}
			}//if(x = 0~6)
			else System.out.println("인덱스의 범위를 벗어났습니다.");
			
			if(cnt == 3 && ex.sum != ex.checkSum) { //3개를 다 골라도 틀린경우 처음부터 다시. 
				System.out.println("3개를 다 골랏지만 합이 맞지 않습니다. 처음부터 다시 진행해주세요 . ");
				cnt = 0;
				ex.checkSum = 0;
				for(int i=0; i<3; i++) {
					ex.answerArr[i] = -1;
				}
			}else if (cnt == 3 && ex.sum == ex.checkSum){
				System.out.println("game clear !! ");
				break;
			}
			
		}//while(true)

	}

}
