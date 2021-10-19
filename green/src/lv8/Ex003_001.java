package lv8;

import java.util.ArrayList;
import java.util.Vector;

import org.w3c.dom.UserDataHandler;

class User {

	private String id;
	private String pw;
	private String name;
	static String x;
	public User(String id, String pw, String name ) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.x = id;
	}
	
	public String getId() {
		return this.id;
	}
	public String getPw() {
		return this.pw;
	}
	public String getName() {
		return this.name;
	}
	public String getX() {
		return this.x;
	}
	
	public void userPrint() {
		System.out.printf("id : %s\nname : %s\npw : %s",this.id,this.name,this.pw);
		
	}
	
	
}

class UserManager {
	private static ArrayList<User> user = new ArrayList<>();
	
	public static void dataSetting(String userdata) {
		String temp[] = userdata.split("\n");
		for(int i=0; i<temp.length; i++) {
			String temp2[] = temp[i].split("/");
			User a = new User(temp2[0],temp2[1],temp2[2]);
			user.add(a);

		}
	}
	
	public void userPrint() {
		System.out.println("id     pw  ÀÌ¸§");
		for(int i=0; i<user.size(); i++) {
			System.out.printf("%s/%s/%s",this.user.get(i).getId()
					,this.user.get(i).getPw(),this.user.get(i).getName());
			System.out.println();
		}
		System.out.println();
	}
	public void print(int i ) {
		System.out.printf("%d) %s %s ´Â °èÁÂ¸¦ ",i+1,user.get(i).getId(),user.get(i).getName());
	}
	
	public String getId(int i) {
		return user.get(i).getId();
	}
	
}

class Account{
	private String id;
	private String number;
	private int money;
	
	public Account(String id , String number , int money) {
		this.id = id;
		this.number = number;
		this.money = money;
	}
	
	public String getId() {
		return this.id;
	}
	public String getNumber() {
		return this.number;
	}
	public int getMoney() {
		return this.money;
	}
	

}
class AccountManager {
	int size = account.size();
	private static ArrayList<Account> account = new ArrayList<>();
	public static void dataSetting(String accountdata) {
		String temp[] = accountdata.split("\n");
		for(int i=0; i<temp.length; i++) {
			String temp2[] = temp[i].split("/");
			Account a = new Account(temp2[0],temp2[1],Integer.parseInt(temp2[2]));
			account.add(a);
		}
	}
	
	public void accountPrint() {
		System.out.println("id     number        money");
		for(int i=0; i<account.size(); i++) {
			System.out.printf("%s/%s/%d\n",this.account.get(i).getId(),this.account.get(i).getNumber(),this.account.get(i).getMoney());
		}
	}
	
	public static void print(String accountdata) {
		String temp[] = accountdata.split("\n");
	}
	
	public String getId(int i) {
		return account.get(i).getId();
	}
	
	


}

class Bank {
	private UserManager um = new UserManager();
	private AccountManager am = new AccountManager();
  public void run() {
	 um. userPrint();
	 am. accountPrint();
	 accountCountPrint();
  }
  
  public void accountCountPrint() {
	  for(int i=0; i<4; i++) {
		  int cnt = 0;
		  um.print(i);
		  for(int j=0; j<am.size; j++) {
			  if(um.getId(i).equals(am.getId(j))) cnt++;
		  }
		  System.out.printf("%d°³ °¡Áö°í ÀÖ½À´Ï´Ù\n",cnt);
	  }
  }



}

public class Ex003_001 {

	public static void main(String[] args) {
		String userdata = "test01/pw1/±èÃ¶¼ö\n";
		userdata += "test02/pw2/ÀÌ¿µÈñ\n";
		userdata += "test03/pw3/½Å¹Î¼ö\n";
		userdata += "test04/pw4/ÃÖ»ó¹Î";
		
		String accountdata = "test01/1111-1111-1111/8000\n";
		accountdata += "test02/2222-2222-2222/5000\n";
		accountdata += "test01/3333-3333-3333/11000\n";
		accountdata += "test03/4444-4444-4444/9000\n";
		accountdata += "test01/5555-5555-5555/5400\n";
		accountdata += "test02/6666-6666-6666/1000\n";
		accountdata += "test03/7777-7777-7777/1000\n";
		accountdata += "test04/8888-8888-8888/1000";
		// 1) test01 ±èÃ¶¼ö ´Â °èÁÂ¸¦ 3°³ °¡Áö°íÀÖ´Ù.
		// 2) test02 ÀÌ¿µÈñ ´Â °èÁÂ¸¦ 2°³ °¡Áö°íÀÖ´Ù.
		// 3) test03 ½Å¹Î¼ö ´Â °èÁÂ¸¦ 2°³ °¡Áö°íÀÖ´Ù.
		// 4) test04 ÃÖ»ó¹Î Àº °èÁÂ¸¦ 1°³ °¡Áö°íÀÖ´Ù. 
		
		UserManager.dataSetting(userdata);
		AccountManager.dataSetting(accountdata);		
		Bank bank = new Bank();
		bank.run();
			
	}
}
