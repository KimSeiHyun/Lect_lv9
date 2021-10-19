package lv5.test;

public class test14 {

	public static void main(String[] args) {
		
		//시작시간 09 : 38
		//종료시간 10 : 40
		//소요시간 00 : 58
		
		
		int[][] data = {{12345678},{4005},{230055},{1},{200}};
		// 위 숫자에 한글단위명을 추가 해서 출력 
		// 예) 1234만5천6백7십8
		// 예) 4천5
		// 예) 23만5십5
		// 예) 1
		// 예) 2백	



		for(int i=0; i<data.length; i++) {
			if(data[i][0] / 10000 > 0) {
				System.out.print(data[i][0] / 10000+"만");
				int x = (data[i][0] / 10000) * 10000;
				data[i][0] -= x;
			}
			if(data[i][0] / 1000 > 0) {
				System.out.print(data[i][0] / 1000 +"천");
				int x = data[i][0] / 1000 * 1000;
				data[i][0] -= x;
			}
			if(data[i][0] / 100 > 0) {
				System.out.print(data[i][0] / 100 +"백");
				int x = data[i][0] / 100 * 100;
				data[i][0] -= x;
			}
			if(data[i][0] / 10 > 0) {
				System.out.print(data[i][0] / 10 +"십");
				int x = data[i][0] / 10 * 10;
				data[i][0] -= x;
			}
			if(data[i][0] != 0) {
				System.out.print(data[i][0]);				
			}
			System.out.println();
		}

	}

}
