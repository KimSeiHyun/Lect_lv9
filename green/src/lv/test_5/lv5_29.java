package lv.test_5;

public class lv5_29 {

	public static void main(String[] args) {
		/*
		 * # 콘솔 게시판
		 * 1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다.
		 * 2. 현재 페이지 번호에 해당되는 게시글만 볼 수 있다.
		 * 3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다.
		 * 4. 게시글을 추가하고 삭제할 때마다 파일입출력을 통해 데이터가 바로바로 저장된다.
		 * 5. 실행시 저장되어 있는 파일이 존재한다면, 바로 파일을 불러오도록 설계한다.
		 */


		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
	        String fileName = "board.txt";

			String[][] board = null;
			int count = 0;				// 전체 게시글 수
			int pageSize = 5;			// 한 페이지에 보여줄 게시글 수
			int curPageNum = 1;			// 현재 페이지 번호
			int pageCount = 0;			// 전체 페이지 개수
			int startRow = 0;			// 현재 페이지의 게시글 시작 번호
			int endRow = 0;				// 현재 페이지의 게시글 마지막 번호
			
			while(true) {
				System.out.println("[1]이전");
				System.out.println("[2]이후");
				System.out.println("[3]추가하기");
				System.out.println("[4]삭제하기");
				System.out.println("[5]내용확인");

				int choice = scan.nextInt();
				
				if(choice == 1) {}
				else if(choice == 2) {}
				else if(choice == 3) {}
				else if(choice == 4) {}
				else if(choice == 5) {}
			}



		}

	}
