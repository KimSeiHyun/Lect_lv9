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
		System.out.println("1.������\n2.����\n3.�κ��丮\n4.����\n5.�ε�\n6.����");
	}
}
public class Main {

	public static void main(String[] args) {
		MainGame e = new MainGame();
		e.run();

	}

}
