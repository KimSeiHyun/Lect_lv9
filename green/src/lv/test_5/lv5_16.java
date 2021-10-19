package lv.test_5;

public class lv5_16 {

	public static void main(String[] args) {
		// 세이브된 파일을 로드해오기 
		
		// 1) fr = new FileReader(fileName); 
		// 	  	(1) 저장된 파일을 읽어온다.
		// 2) br = new BufferedReader(fr);   
		// 	    (1) fr 로가져온파일은 char[] 로가져온다.
		//      (2) char[]은 저장이 불편하기떄문에 
		//      (3) String 으로 데이터를 가져올수있는 br을 이용한다.
		// 3) String data = br.readLine();	
		//      (1) br.readLine(); 을 이용해서 String 으로 데이터를 가져온다.
		
		// 4) fr.close(); // 반드시 닫아야된다.
		// 5) br.close(); // 반드시 닫아야된다.
		
		String fileName = "ex01.txt";
			
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String data = br.readLine();			// 한 줄 읽어오기
			System.out.println(data);  // 데이터가 출력된다. 
			fr.close();
            br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}