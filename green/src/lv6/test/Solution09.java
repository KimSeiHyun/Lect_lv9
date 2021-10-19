package lv6.test;

//���� 09:08
//���� 09:20
//�ҿ� 00:12
/*
 * #����9
���ĺ� ���ڿ��� �־��� ��, �����ϴ� �ߺ� ���ڸ� �����Ϸ��� �մϴ�. 
���� ���, "senteeeencccccceeee"��� ���ڿ��� �־����ٸ�, "sentence"��� ������� ���ɴϴ�.

���� �ҹ��� ���ĺ����� �̷���� ������ ���ڿ� characters�� �Ű������� �־��� ��, 
�����ϴ� �ߺ� ���ڵ��� ������ ����� return �ϵ��� solution �޼ҵ带 �ۼ��Ͽ����ϴ�. 
�׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, �ڵ尡 �ùٸ��� �������� �ʽ��ϴ�.
 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �����ϼ���.

---

#####�Ű����� ����
���� �ҹ��� ���ĺ����� �̷���� ������
 ���ڿ� characters�� solution �޼ҵ��� �Ű������� �־����ϴ�. 
* characters�� ���ĺ� �ҹ��ڷθ� �̷�����ֽ��ϴ�.
* characters�� ���̴� 10 �̻� 100 �����Դϴ�.

---

#####return �� ����
characters���� �����ϴ� �ߺ� ���ڸ� ������ ���ڿ��� return ���ּ���.

---

#####����

| characters                  | return    |
|-------------------------|-----------|
| "senteeeencccccceeee" | "sentence" |

 */

import java.util.Arrays;
public class Solution09 {
    public String solution(String characters){
        String result = "";
        int check = 0;
        char temp = ' ';
        for(int i=0; i<characters.length(); i++) {
        	if(characters.charAt(i) != temp) {
        		result += characters.charAt(i);
        		temp = characters.charAt(i);
        	}
        }
        return result;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
    	Solution09 sol = new Solution09();
        String characters = "senteeeencccccceeee";
        String ret = sol.solution(characters);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}