package lv4;

public class Ex02_01 {

	public static void main(String[] args) {
		// 2차원 반복문을 사용해서 > datas 배열의 전체 값을 1부터 6까지 초기화.
		int datas[][] = new int[3][2];
		int x = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(datas[i][j] == 0) {
					datas[i][j] += x;
					x++;
				}
				System.out.println(datas[i][j]);
			}
		}
		

	}//clear

}
