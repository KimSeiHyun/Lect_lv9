import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileManager {
	
	//public static FileManager instance = new FileManager();
	File moneyData = new File("Money");
	File ShopData = new File("Shop");
	File inventoryData = new File("Inventory");
	File guildMemberData = new File("GuildMember");
	Scanner sc = new Scanner(System.in);
	
	private FileWriter fw = null;
	private FileReader fr = null;
	private BufferedReader br = null;
	
	public void save() {
		try {
			fw = new FileWriter(moneyData);
			fw.write(Player.money+"/");
			System.out.println("playerMoney : " + Player.money);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void load() {
		
	}
}
