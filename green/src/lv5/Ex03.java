package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03 {

	public static void main(String[] args) {
		// FIle 파일
		//  try - catch 문 안에서 예외처리를 해줘야 사용 가능.
		
		// 파일쓰기
		// FileWriter
		
		File file = new File("text.txt");// text.txt 라는 이름 파일의 이름을 초기화 . 
		FileWriter fw = null;
		try {
			fw = new FileWriter(file); // text.txt 라는 파일 생성 . 
			fw.write("김세현\nddd"+123); // text.txt 라는 파일에 값을 삽입 .
			fw.close();					// 꼭 작업이 끝나면 닫아줘야함 . (중요)
			System.out.println("저장완료!");
		} catch (Exception e ) {
			System.out.println("저장실패!");
		}
		
		//파일읽기
		// FIleReader
		// BufferedReader
		
		FileReader fr = null;
		BufferedReader br = null;
		if(file.exists()) {
			try {
				fr = new FileReader("text.txt"); // text.txt 파일을 찾는 역할만 함 . 
				br = new BufferedReader(fr);	// FileReader 가 찾은 파일의 내용을 불러옴 
				
				String data = br.readLine(); // 새로운 문자열 단 한 줄(줄바꿈 기준)을 읽어옴 . > String 타입으로 반환
				String data2 = br.readLine(); 
				System.out.println("data : " + data);
				System.out.println("data2 : " + data2);
				
				fr.close();
				br.close();
			} catch (Exception e) {
				System.out.println("파일로드 실패 ! ");
				e.printStackTrace();
			}
			
		}
		
	}

}
