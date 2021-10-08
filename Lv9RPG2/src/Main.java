import java.util.Scanner;

class MainGame {
	public static Scanner sc = new Scanner(System.in);
	private Inventory inventory = new Inventory();
	private FileManager fm = new FileManager();
	private Shop shop = new Shop();
	private Player player = new Player();
	private Guild guild = new Guild();
	private Raid raid = new Raid();
	public void run( ) {
		
		while(true) {
			MainMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				this.guild.guildManager();
			}
			if(sel == 2) {
				this.player.itemManager();
			}
			if(sel == 3) {
				this.inventory.inventoryManager();
			}
			if(sel == 4) {
				this.fm.save();
			}
			if(sel == 5) {
				this.fm.load();
			}
			if(sel == 6) {
				this.raid.raidManager();
			}
			if(sel == 7) {
				break;
			}
		}
	}
	
	public void MainMenuPrint() {
		System.out.println("1.길드관리\n2.상점\n3.인벤토리\n4.저장\n5.로드\n6.레이드\n7.종료");
	}
}
public class Main {

	public static void main(String[] args) {
		MainGame e = new MainGame();
		e.run();

	}

}
