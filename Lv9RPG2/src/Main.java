import java.util.Scanner;

class MainGame {
	public static Scanner sc = new Scanner(System.in);
	private Inventory inventory = new Inventory();
	private Shop shop = new Shop();
	private Player player = new Player();
	public void run( ) {
		
		while(true) {
			MainMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				
			}
			if(sel == 2) {
				this.player.itemManager();
			}
			if(sel == 3) {
				
			}
			if(sel == 4) {
				
			}
			if(sel == 5) {
				
			}
			if(sel == 6) {
				
			}
		}
	}
	
	public void MainMenuPrint() {
		System.out.println("1.길드관리\n2.상점\n3.인벤토리\n4.저장\n5.로드\n6.종료");
	}
}
public class Main {

	public static void main(String[] args) {
		MainGame e = new MainGame();
		e.run();

	}

}
