package backjoon11_15;

import java.util.Random;
import java.util.Scanner;

public class lv11_002_2231 {

	public static void main(String[] args) { // 2231
		Scanner sc= new Scanner(System.in);
		Random rn = new Random();
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		int temp = n;
		while(temp > 0) { // 10�� �ڸ��� ��ư��� �ڸ����� �� . 
			temp = temp/10;
			cnt++;
		}
	//	System.out.println("cnt : " + cnt);
		for(int i=n-cnt*9; i<n; i++) { // �־����� - �ڸ���*9���� ����(�����¸� �˻��ϴϱ� �׷����Ϸ�)
			sum = 0;
			temp = i;
			sum += i;
			while(temp >0) {
				sum += temp%10;
				temp = temp/10;
				
			}
			if(sum == n) { // ���� ã���� ���� �����ϰ� �ݺ��� �ٷ� �������� 
				sum = i;
			//	System.out.println(i);
				break;
			}
			if(i == n-1) { // for���� �� �������� ���� ��ã���� sum�� 0���� �ʱ�ȭ
				sum = 0;
				break;
			}
		}
		if(sum != 0) { // ���������� ��� ������ 0 ��� 
			System.out.println(sum);
		}
		else System.out.println(0);
		
		
    }
	
}