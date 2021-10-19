package lv5.test;

public class test13 {

	public static void main(String[] args) {
		//시작시간 09 : 07
		//종료시간 09 : 33
		//소요시간 00 : 26
		// 아주긴수는 변수에 저장할수없다. int 나 long 에 넣지않고 아래합구하기 
		String data1 = "129999999999";
		String data2 = "88888888888888";
		//위 수의 합을 구하시요 .
		//힌트  : 배열에 넣으세요~
		
		
		System.out.println("data1의 길이 : " + data1.length());
		System.out.println("data2의 길이 : " + data2.length());
		int a = data1.length();
		int b = data2.length();
		int c = a-b;
		int max = 0 ;
		String t = "0";
		String temp = "";
		//수를 편하게 합하기 위해 자릿수를 파악하고 0을 채워넣어서 똑같이 맞춰줌 . 
		if( c > 0) {
			for(int i=0; i<data1.length()-data2.length(); i++) {
				temp += t;
			}
			temp += data2;
			data2 = temp;
			max = a;
		}else if ( c < 0) {
			for(int i=0; i<data2.length()-data1.length(); i++) {
				temp += t;
			}
			temp += data1;
			data1 = temp;
			max = b;
		}else {
			max = a;
		}
		String temp1[] = new String[max];
		String temp2[] = new String[max];
		int temp3[] = new int[max];
		
		for(int i=0; i<temp1.length; i++) {//배열에 각 숫자 하나씩 하나씩 삽입 . 
			temp1[i] = data1.charAt(i)+"";
			temp2[i] = data2.charAt(i)+"";
		}
		
		for(int i=temp1.length-1; i>=0; i--) {
			if(i > 0) {
				temp3[i] += Integer.parseInt(temp1[i]);
				temp3[i] += Integer.parseInt(temp2[i]);
				if(temp3[i] >= 10) { //10이 넘어가면 올림. 
					temp3[i-1] += 1;
					temp3[i] = temp3[i] % 10;
				}
			}
			if(i == 0) { 
				temp3[i] += Integer.parseInt(temp1[i]);
				temp3[i] += Integer.parseInt(temp2[i]);
			}
			
		}

		String sum = "";
		System.out.println();
		for(int i=0; i<max; i++) {
			sum += temp3[i]+"";
		}
		System.out.println(sum);

	}

}
