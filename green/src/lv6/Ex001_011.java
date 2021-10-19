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
		 * # ���ϱ� ����
		 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
		 * 2. 6���� �迭�� �ε����� 0���� 5������ ���� �� 3���� �ߺ� ���� ������ 
		       �� �ε����� �� �� ���� ����Ѵ�. 
		 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
		*  ��)  4, 7, 5, 3, 2, 9  //   ����:  14   ==> �ε��� 3���� ��� ���� ���߸�ȴ�.  
		    ����)  3,4,5 (�������� ����� ���� ���ü����ִ�)
		 */
		
		Ex001_11 ex = new Ex001_11();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int s = 0;
		
		
		while(s < ex.SIZE) { //�迭�� �ߺ����� ������ ����.
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
		while(s < 3) {//�迭�� �ߺ����� ������ ����. 
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
			//���
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
			System.out.println("�ߺ����� �ε����� 3�� ����ּ��� . ");
			int x = sc.nextInt();
			int check = 0;
			if(x >=0 && x <6) {//�ߺ����� �ε��� 3�� ���� . �ߺ��̶�� ó������ ���� .
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
				System.out.println("�̹� ���� �ε����Դϴ�.");
			}
			}//if(x = 0~6)
			else System.out.println("�ε����� ������ ������ϴ�.");
			
			if(cnt == 3 && ex.sum != ex.checkSum) { //3���� �� ��� Ʋ����� ó������ �ٽ�. 
				System.out.println("3���� �� ������� ���� ���� �ʽ��ϴ�. ó������ �ٽ� �������ּ��� . ");
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
