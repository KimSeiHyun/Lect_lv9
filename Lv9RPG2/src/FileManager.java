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
	private Shop shop = Shop.instance;
	private Inventory inventory = Inventory.instance;
	private Guild guild = Guild.instance;
	public void save() {
		try {
			fw = new FileWriter(moneyData);
			fw.write(Player.money+"\n");
			fw.close();
			
			fw = new FileWriter(ShopData);
			for(int i=0; i<shop.itemList.size(); i++) {
				fw.write(this.shop.itemList.get(i).getKind()+"/"
				+this.shop.itemList.get(i).getName()+"/"
				+this.shop.itemList.get(i).getPower()+"/"
				+this.shop.itemList.get(i).getPrice()+"/"
				+this.shop.itemList.get(i).getUse()+"/"
				+this.shop.itemList.get(i).getUserName()+"\n");
			}
			fw.close();
			
			fw = new FileWriter(inventoryData);
			for(int i=0; i<this.inventory.itemList.size(); i++) {
				fw.write(this.inventory.itemList.get(i).getKind()+"/"
				+this.inventory.itemList.get(i).getName()+"/"
				+this.inventory.itemList.get(i).getPower()+"/"
				+this.inventory.itemList.get(i).getPrice()+"/"
				+this.inventory.itemList.get(i).getUse()+"/"
				+this.inventory.itemList.get(i).getUserName()+"\n");
			}
			fw.close();
			
			fw = new FileWriter(guildMemberData);
			for(int i=0; i<this.guild.member.size(); i++) {
				Member temp = this.guild.member.get(i);
				fw.write(temp.getName()+"/"+temp.getLevel()+"/"+temp.getHp()+"/"+temp.getMaxHp()+"/"+temp.getAtk()+"/"+
				temp.getDef()+"/"+temp.getExp()+"/"+temp.getParty()+"/"+temp.getWeapon()+"/"+temp.getArmor()+"/"+temp.getAccessorise()+"\n");
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void load() {
		try {
			fr = new FileReader(moneyData);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				Player.money = Integer.parseInt(data);				
			}
			fr.close();
			br.close();
			
			fr = new FileReader(ShopData);
			br = new BufferedReader(fr);
			this.shop.itemList.clear();
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String temp[] = data.split("/");
				String kind = temp[0];
				String name = temp[1];
				int power = Integer.parseInt(temp[2]);
				int price = Integer.parseInt(temp[3]);
				boolean use = false;
				if(temp[4].equals("true")) use = true;
				this.shop.itemList.add(new Item(kind , name , power , price));
			}
			fr.close();
			br.close();
			
			fr = new FileReader(inventoryData);
			br = new BufferedReader(fr);
			this.inventory.itemList.clear();
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String temp[] = data.split("/");
				boolean use = false;
				if(temp[4].equals("true")) use = true;
				Item a = new Item(temp[0] , temp[1] , Integer.parseInt(temp[2]) , Integer.parseInt(temp[3]) , use , temp[5] );
				this.inventory.itemList.add(a);
			}
			fr.close();
			br.close();
			
			
			fr = new FileReader(guildMemberData);
			br = new BufferedReader(fr);
			this.guild.member.clear();
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String temp[] = data.split("/");
				boolean party = false;
				if(temp[7].equals("true")) party = true;
				Item weapon = null;
				for(int i=0; i<this.inventory.itemList.size(); i++) {
					String temp2 = "";
					temp2 += temp[8];
					String temp3 = "";
					temp3 += this.inventory.itemList.get(i);
					if(temp2.equals(temp3)) weapon = this.inventory.itemList.get(i);
				}
				Item armor = null;
				for(int i=0; i<this.inventory.itemList.size(); i++) {
					String temp2 = "";
					temp2 += temp[9];
					String temp3 = "";
					temp3 += this.inventory.itemList.get(i);
					if(temp2.equals(temp3)) armor = this.inventory.itemList.get(i);
				}
				Item accessorise = null;
				for(int i=0; i<this.inventory.itemList.size(); i++) {
					String temp2 = "";
					temp2 += temp[10];
					String temp3 = "";
					temp3 += this.inventory.itemList.get(i);
					if(temp2.equals(temp3)) accessorise = this.inventory.itemList.get(i);
				}
				this.guild.member.add(new Member(temp[0] , Integer.parseInt(temp[1]) , Integer.parseInt(temp[2]) 
						, Integer.parseInt(temp[3]) , Integer.parseInt(temp[4]) , Integer.parseInt(temp[5]) 
						, Integer.parseInt(temp[6]) , party , weapon , armor , accessorise));
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
