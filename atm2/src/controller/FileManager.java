package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import models.Account;
import models.User;

public class FileManager {
	public static FileManager instance = new FileManager();
	
	private UserManager um = UserManager.instance;
	File Accfile = new File("AccList");
	File Userfile = new File("UserList");
	
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	public void save() {
		try {
			fw = new FileWriter(Userfile);
			for(int i=0; i<this.um.user.size(); i++) {
				fw.write(this.um.user.get(i).getCode()+"/");
				fw.write(this.um.user.get(i).getId()+"/");
				fw.write(this.um.user.get(i).getPw()+"/");
				fw.write(this.um.user.get(i).getName()+"\n");
			}
			fw.close();
			fw = new FileWriter(Accfile);
			for(int i=0; i<this.um.user.size(); i++) {
				for(int j=0; j<this.um.user.get(i).acc.size(); j++) {
					fw.write(this.um.user.get(i).acc.get(j).getRep()+"/");
					fw.write(this.um.user.get(i).acc.get(j).getUserCode()+"/");
					fw.write(this.um.user.get(i).acc.get(j).getAccNum()+"/");
					fw.write(this.um.user.get(i).acc.get(j).getMoney()+"\n");
				}
			}
			fw.close();
			System.out.println("세이브 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void load() {
		try {
			fr = new FileReader(Userfile);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null ) break;
				String temp[] = data.split("/");
				User a = new User(Integer.parseInt(temp[0]),temp[1],temp[2],temp[3]);
				this.um.user.add(a);
			}
			fr.close();
			br.close();
			
			fr = new FileReader(Accfile);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null ) break;
				String temp[] = data.split("/");
				boolean rep = false;
				int userCode = Integer.parseInt(temp[1]);
				int accNum = Integer.parseInt(temp[2]);
				int money = Integer.parseInt(temp[3]);
				if(temp[0].equals("true")) {
					rep = true;
				}else rep = false;
				Account a = new Account(rep,userCode,accNum,money);
				for(int i=0; i<this.um.user.size(); i++) {
					if(this.um.user.get(i).getCode() == userCode) {
						this.um.user.get(i).addAcc(a);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
