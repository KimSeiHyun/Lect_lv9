package lv5;

public class Ex01_03 {

	public static void main(String[] args) {
		//문자열2차원문제
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		String str = "김철수/87,이만수/42,이영희/95";
		String[] name = new String[3];
		int[] score = new int[3];
		int x = 0;
		String s[] = str.split(",");
		String s2[][]  = new String[3][2]; 
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		
		}
		for(int i=0; i<s2.length; i++) {
			for(int j=0; j<s2[i].length; j++) {
				System.out.println(s2[i][j]);
			}
			
		}
		
		String s3[];
		while(x<3) {//문자 숫자 분리하여 삽입 
		s3 = s[x].split("/");
		name[x] = s3[0];
		score[x] = Integer.parseInt(s3[1]);
		
		x++;
		}//w
		
		//정답 
		for(int i=0; i<3; i++) {
			System.out.print(name[i] + " ");
		}System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(score[i] + " ");
		}System.out.println();

		
	}

}
