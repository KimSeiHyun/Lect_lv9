package lv6.test;
//���� 02:32
//���� 03:24
//�ҿ� 00:58
/*
 * #����8
�տ������� ���� ���� �ڿ������� ���� �� �Ȱ��� �ܾ� �Ǵ� ������ 
�Ӹ����(palindrome)�̶�� �մϴ�. ���� �� racecar, noon�� �Ӹ���� �ܾ��Դϴ�. 

�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ������ 
�Ӹ���� �������� �����Ϸ� �մϴ�. ���� ������ ���ĺ��� 
�����Ͽ��� ���� �Ӹ���� �ܾ��̸� �Ӹ���� �����Դϴ�.
 ���� ���, "Never odd or even."�� ���� ������ �Ӹ�����Դϴ�.

�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ����
 sentence�� �־��� �� �Ӹ�������� �ƴ����� return �ϵ��� solution �޼ҵ带 �ۼ��߽��ϴ�.
 �׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, ��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�.
 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �������ּ���.

---
##### �Ű����� ����
�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ����
 sentence�� solution �޼ҵ��� �Ű������� �־����ϴ�.

* sentence�� ���̴� 1�̻� 100�����Դϴ�.
* sentence���� ��� �ϳ��� ���ĺ��� ���ԵǾ� �ֽ��ϴ�.
* setntence�� �� ���ڴ� �ҹ��� ���ĺ�, ����(" "), �Ǵ� ��ħǥ(".")�Դϴ�.

---
##### return �� ����
�־��� ������ �Ӹ�������� �ƴ����� return ���ּ���.

---
##### ����

| sentence             	| return 	|
|----------------------	|--------	|
| "never odd or even." 	| true   	|
| "palindrome"         	| false  	|


##### ���� ����
���� #1
���ĺ��� ���ڸ� �����Ͽ� �ҹ��ڷ� ��ȯ�غ��� "neveroddoreven"�� �Ǹ� �� �ܾ�� �Ӹ�����Դϴ�.

���� #2
������ �� �� ������ "p"�� �� �� ������ "e"�� �ٸ��Ƿ� �Ӹ������ �ƴմϴ�.


 */

import java.util.Arrays;

public class Solution08 {
	boolean solution(String sentence) {
		String str = "";
		boolean b = true;
		// �ƽ�Ű�ڵ� 
		// A ~ Z  = 65 ~ 90 (26����)
		// a ~ z  = 97 ~ 122 
		// ���ڸ����� 32���� 
		String str1 = "";
		String str2 = "";
		String temp[] = sentence.split(" ");
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length(); j++) {
				if('.' != temp[i].charAt(j)) {
					str += temp[i].charAt(j);
				}
			}
		}
		int x = str.length()/2;
		for(int i=0; i<x; i++) {
			int c = str.charAt(i);
			if (c >= 65 && c <= 90) {
				c += 32;
			}
			char c2 = (char)c;
			str1 += c2;
		}
		for(int i=str.length()-1; i>=x; i--) {
			int c = str.charAt(i);
			if (c >= 65 && c <= 90) {
				c += 32;
			}
			char c2 = (char)c;
			str2 += c2;
		}
//		System.out.println();
//		System.out.println("str : " +str);
//		System.out.println("str1 : " +str1);
//		System.out.println("str2 : " +str2); 
//		System.out.println();
//		System.out.println("str.length : " + str.length());
//		System.out.println("str1.length : " + str1.length());
//		System.out.println("str2.length : " + str2.length());
		if(str1.equals(str2)) {
			 b = true;
		}
		else {
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {
		Solution08 sol = new Solution08();
		String sentence1 = "Never odd or even.";
		boolean ret1 = sol.solution(sentence1);
		System.out.println("�� : " + ret1 + " .");

		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		System.out.println("�� : " + ret2 + " .");
		


	}

}