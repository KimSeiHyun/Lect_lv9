package lv5.test;

public class test12v2 {

	public static void main(String[] args) {
		//시작시간 02 : 57
		//종료시간 03 : 18
		//소요시간 00 : 21
		
		String data = "123+46";
		//위 수의 합을 구하시요 .
		
		char a = '+';
		String x = "";
		String y = "";
	
		int check = 0;
		for(int i=0; i<data.length(); i++) {
			if(data.charAt(i) == a) {
				check = 1;
				i++;
			}
			if(check == 0 ) {
				x += data.charAt(i);
			}
			else if(check == 1) {
				y += data.charAt(i);
			}
		}
		
		int sum = Integer.parseInt(x) + Integer.parseInt(y);
		System.out.println(sum);

	}

}
