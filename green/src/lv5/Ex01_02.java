package lv5;

public class Ex01_02 {

	public static void main(String[] args) {
		//문자열 1차원 문제
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		String result[] = str.split("/");
		System.out.println("문제1 : arr배열에 각 점수를 저장하고 , 총점 출력 ");
		for(int i=0; i<result.length;i ++) {
			arr[i] = Integer.parseInt(result[i]);
			System.out.println(arr[i]);
		}
		
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		System.out.println("문제2 : score 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결 ");
		for(int i=0; i<scores.length; i++) {
			text += scores[i] + "/";
		}
		System.out.println(text);
		

		
	}

}
