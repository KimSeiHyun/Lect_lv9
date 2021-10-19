package lv.test_1;

public class lv1_04s {

	public static void main(String[] args) {
		// 예) 3의 배수이면서, 짝수이면 true 출력
				int num = 12;
				System.out.println(num % 3 == 0 && num % 2 == 0);
				
				// 문제 1) 과락
				// 3과목의 평균이 60점 이상이면, true
				// 단, 어느 한 과목이라도 50점 미만이면, false
				int kor = 100;
				int eng = 87;
				int math = 41;
				int aver = (kor+eng+math)/3;
				System.out.println(aver >= 60 && kor>=50 && eng>=50 && math >=50);
		    // 문제 2) 키가 200cm이상이거나 몸무게가 200kg 이상이면, 입장(true)
				int 키 = 202;
				int 몸무게 = 150;
				System.out.println(키>=200 || 몸무게 >=200);

	}

}
