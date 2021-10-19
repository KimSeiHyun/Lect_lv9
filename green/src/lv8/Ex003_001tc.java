package lv8;

import java.util.ArrayList;

class User2 {
	private String id;
	private String pw;
	private String userName;

	public User2(String id, String pw, String userName) {
		this.id = id;
		this.pw = pw;
		this.userName = userName;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getUserName() {
		return this.userName;
	}
}

class UserManager2 {
	private static ArrayList<User2> users = new ArrayList<>();

	static void dataSetting(String data) {
		String temp[] = data.split("\n");
		for (int i = 0; i < temp.length; i++) {
			String info[] = temp[i].split("/");
			users.add(new User2(info[0], info[1], info[2]));
		}
	}

	public int getSize() {
		return users.size();
	}

	public User2 getUser(int index) {
		return users.get(index);
	}
}

class Account2 {
	private String id;
	private String number;
	private int money;

	public Account2(String id, String number, String money) {
		this.id = id;
		this.number = number;
		this.money = Integer.parseInt(money);
	}
	
	public String getId() {
		return this.id;
	}
}

class AccountManager2 {
	private static ArrayList<Account2> accs = new ArrayList<>();

	static void dataSetting(String data) {
		String temp[] = data.split("\n");
		for (int i = 0; i < temp.length; i++) {
			String info[] = temp[i].split("/");
			accs.add(new Account2(info[0], info[1], info[2]));
		}
	}

	public int getSize() {
		return accs.size();
	}

	public Account2 getAcc(int index) {
		return accs.get(index);
	}
}

class Bank2 {
	private UserManager2 um = new UserManager2();
	private AccountManager2 am = new AccountManager2();

	void run() {
		System.out.println(um.getSize()); // 4
		System.out.println(am.getSize()); // 8

		sortAccById();
	}

	private void sortAccById() {
		for(int i=0; i<um.getSize(); i++) {
			int cnt = 0;
			for(int j=0; j<am.getSize(); j++) {
				if(um.getUser(i).getId().equals(am.getAcc(j).getId())) {
					cnt++;
				}
			}
			
			System.out.printf("%s %s ´Â °èÁÂ¸¦ %d°³ °¡Áö°í ÀÖ´Ù.\n",um.getUser(i).getId(),um.getUser(i).getUserName(),cnt);
		}
	}

}

public class Ex003_001tc {

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

		UserManager2.dataSetting(userdata);
		AccountManager2.dataSetting(accountdata);
		Bank2 bank = new Bank2();
		bank.run();

	}
}