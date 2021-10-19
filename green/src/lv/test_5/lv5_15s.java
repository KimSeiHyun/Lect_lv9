package lv.test_5;

public class lv5_15s {

	public static void main(String[] args) {
		// 세이브 파일 만들기 
		// 1) 파일 생성          ==> FileWriter fw = new FileWriter("파일이름"); 
		// 2) 파일에 내용 저장 ==> fw.write("파일저장하기 연습문제");
		// 3) 파일닫기           ==> fw.close(); 
		
		String fileName = "ex01.txt";
		FileWriter fw = null; // try 밖에서 사용을 위해 보통 밖에 변수를 만든다.
		try {
			fw = new FileWriter(fileName);
			fw.write("김철수/10,이영희/30,박만수/50");
           fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 1. Run : Ctrl + F11
		// 2. 프로젝트 선택 후, 
		//    F5(Refresh)를 누르면 생성된 메모장 파일을 확인할 수 있다. 
		
	}

}