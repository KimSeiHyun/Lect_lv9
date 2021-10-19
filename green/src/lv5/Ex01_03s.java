package lv5;

public class Ex01_03s {

	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		String str = "김철수/87,이만수/42,이영희/95";
		String[] name = new String[3];
		int[] score = new int[3];
		
		String s[] = str.split(",");
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
			
		}
		System.out.println();
		for(int i=0; i<s.length; i++) {
			String info[] = s[i].split("/");
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(name[i] + " ");
		}System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(score[i] + " ");
		}System.out.println();
		
		
	}

}
