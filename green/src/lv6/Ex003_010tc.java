package lv6;

class TicTacToe {
	
	int turn = 1;
	
	void printTable() {
		
	}
	void selectTic() {
		
	}
	boolean checkWin() {
		boolean win = false;
		
		//����
		//����
		//�밢��\
		//�밢��/
		return win;
	}
	void run() {
		boolean isRun = true;
		while(isRun) {
			printTable();
			selectTic();
			if(checkWin()) isRun = false;
		}
	}
}
public class Ex003_010tc {

	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		ttt.run();
	}

}
