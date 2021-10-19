package lv.test_1;

public class lv1_03s {

	public static void main(String[] args) {
		//예) 점수가 60점 이상이면 true 출력
        int score = 30;
        System.out.println(score >= 60);
        
        //문제1) 3의 배수이면 true 출력
        //힌트1) 숫자 % 3 == 0 (3의 배수)
        int num1 = 18;
        
        System.out.println(num1 %3 ==0);
        //문제2) 짝수이면 true 출력      
        //힌트2) 숫자 % 2 == 0 (짝수)
        //힌트2) 숫자 % 2 == 1 (홀수)
        int num2 = 28;
        System.out.println(num2 %2 == 0);
	}

}
