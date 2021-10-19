package lv5;

public class Ex03_09 {

	public static void main(String[] args) {
		//문자열심화4문제
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		data = data.substring(0 , data.length()-1); // 마지막 글삭제 
		System.out.println(data);
		System.out.println("=====================");
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;
		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		for(int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		for(int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("=====================");
		// 문제1) 위 데이터 는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
		//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
		/*
		  =====================
			10001 김철수 2670
			10002 이영희 1950
			10003 유재석 4080
			10004 박명수 7130
		   =====================		  
		 */
		int max = 0;
		for(int i=0; i<numList.length; i++) { //10001부터 몇번까지 있는지 모른다는 가정하게 끝번호 찾기.
			if(max < numList[i]) {
				max = numList[i]%10000;
			}
		}
		
		int numList2[] = new int[max]; // max = 4;
		String nameList2[] = new String[max];
		int priceList2[] = new int[max];
		
		for(int i=0; i<max; i++) { //순서대로 번호 삽입 
			numList2[i] = 10001+i;
		}
		
		for(int i=0; i<max; i++) { //***List 배열에서 인덱스 찾기
			String temp = "";
			int sum = 0;
			for(int j= 0; j<totalSize; j++) {
				if(numList2[i] == numList[j]) {
					temp = nameList[j];
					sum += priceList[j];
				}
			}
			priceList2[i] = sum;
			nameList2[i] = temp;
		}
		

		for(int i=0; i<max; i++) {
			System.out.println(numList2[i] + " " + nameList2[i] + " " + priceList2[i]+ " ");
		}
		

		
	}

}
