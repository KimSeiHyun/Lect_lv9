package lv6.test;
//시작 02:32
//종료 03:24
//소요 00:58
/*
 * #문제8
앞에서부터 읽을 때와 뒤에서부터 읽을 때 똑같은 단어 또는 문장을 
팰린드롬(palindrome)이라고 합니다. 예를 들어서 racecar, noon은 팰린드롬 단어입니다. 

소문자 알파벳, 공백(" "), 그리고 마침표(".")로 이루어진 문장이 
팰린드롬 문장인지 점검하려 합니다. 문장 내에서 알파벳만 
추출하였을 때에 팰린드롬 단어이면 팰린드롬 문장입니다.
 예를 들어, "Never odd or even."과 같은 문장은 팰린드롬입니다.

소문자 알파벳, 공백(" "), 그리고 마침표(".")로 이루어진 문장
 sentence가 주어질 때 팰린드롬인지 아닌지를 return 하도록 solution 메소드를 작성했습니다.
 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다.
 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정해주세요.

---
##### 매개변수 설명
소문자 알파벳, 공백(" "), 그리고 마침표(".")로 이루어진 문장
 sentence가 solution 메소드의 매개변수로 주어집니다.

* sentence의 길이는 1이상 100이하입니다.
* sentence에는 적어도 하나의 알파벳이 포함되어 있습니다.
* setntence의 각 문자는 소문자 알파벳, 공백(" "), 또는 마침표(".")입니다.

---
##### return 값 설명
주어진 문장이 팰린드롬인지 아닌지를 return 해주세요.

---
##### 예시

| sentence             	| return 	|
|----------------------	|--------	|
| "never odd or even." 	| true   	|
| "palindrome"         	| false  	|


##### 예시 설명
예시 #1
알파벳과 숫자만 추출하여 소문자로 변환해보면 "neveroddoreven"이 되며 이 단어는 팰린드롬입니다.

예시 #2
문장의 맨 앞 문자인 "p"와 맨 뒤 문자인 "e"가 다르므로 팰린드롬이 아닙니다.


 */

import java.util.Arrays;

public class Solution08 {
	boolean solution(String sentence) {
		String str = "";
		boolean b = true;
		// 아스키코드 
		// A ~ Z  = 65 ~ 90 (26개씩)
		// a ~ z  = 97 ~ 122 
		// 앞자리수는 32차이 
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
		System.out.println("답 : " + ret1 + " .");

		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		System.out.println("답 : " + ret2 + " .");
		


	}

}