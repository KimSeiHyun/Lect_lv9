package lv5.test;

public class test12 {

	public static void main(String[] args) {
		//시작시간 02 : 57
		//종료시간 03 : 07
		//소요시간 00 : 00
		
		String data = "123+46";
		//위 수의 합을 구하시요 .
		
		int sum = 0;
		String temp[] = data.split("[+]");
		for(int i=0; i<temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		System.out.println(sum);
		
	}

}
