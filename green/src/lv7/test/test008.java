package lv7.test;

//시작시간 12 : 49
//종료시간 01 : 49
//소요시간 01 : 00

class Library {
	int bookNumber;
	int memberNumber;
	String bookName;
	String rentalDate[] = new String[3];
	int rentDay;
}

public class test008 {

	public static void main(String[] args) {
		String rentalData = "";
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";

		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		int cnt = 0;
		int totay = 4;
		// 위 데이터는 도서관 책 대여 데이터이다.
		// 오늘은 12월4일 이라고했을때 연체자 이름 출력 (1주일 초과 시, 연체)
		// 11월은 30일까지 있음 . 7일초과 = 8일째 , 11월 26일부터 연체자

		String temp[] = rentalData.split("\n");
		Library library[] = new Library[temp.length - 1];
		for (int i = 0; i < library.length; i++) {
			library[i] = new Library();
		}

		for (int i = 1; i < temp.length; i++) {
			String temp2[] = temp[i].split("/");

			library[i - 1].bookNumber = Integer.parseInt(temp2[0]);
			library[i - 1].bookName = temp2[1];
			library[i - 1].memberNumber = Integer.parseInt(temp2[3]);
			String temp3[] = temp2[2].split("-");

			for (int k = 0; k < temp3.length; k++) {
				library[i - 1].rentalDate[k] = temp3[k];

			}

		}
		temp = userData.split("\n");

		for (int i = 1; i < temp.length; i++) {
			String temp2[] = temp[i].split("/");
			library[i - 1].rentDay = Integer.parseInt(temp2[2]);
		}

		for (int i = 0; i < library.length; i++) {
			System.out.println("책번호 : " + library[i].bookNumber);
			System.out.println("책이름 : " + library[i].bookName);
			System.out.println("회원번호 : " + library[i].memberNumber);
			System.out.println("대여일수 : " + library[i].rentDay);
			System.out.print("대여날짜 : ");
			for (int j = 0; j < 3; j++) {
				System.out.print(library[i].rentalDate[j] + " ");
			}
			System.out.println("\n");
		}

		for (int i = 0; i < library.length; i++) {
			if (Integer.parseInt(library[i].rentalDate[1]) == 11) {
				if(30-Integer.parseInt(library[i].rentalDate[2]) +totay >= 8) {
					System.out.printf("회원번호 %d는 연체자입니다 . ",library[i].memberNumber);
				}
			}
		}
	}

}
