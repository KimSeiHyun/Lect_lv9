package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import models.Cart;
import models.Item;
import models.User;

public class FileManager {
	
	public static FileManager instance = new FileManager();
	private UserManager um = UserManager.instance;
	private ItemManager im = ItemManager.instance;
	private Shop shop = Shop.instance;
	File usersFile = new File("Users");
	File itempsFile = new File("Itemps");
	File basketFile = new File("Baskets");
	File categoryFile = new File("Categorys");
	
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	public void save() {
		userDataSave();
		itemDataSave();
		basketDataSave();
		categoryDataSave();
	}
	
	public void load() {
		categoryDataLoad();
		itemDataLoad();
		userDataLoad();
		basketDataLoad();
	}
	
	private void userDataSave() {
		try {
			fw = new FileWriter(usersFile);
			for(int i=0; i <this.um.user.size(); i++) {
				fw.write(this.um.user.get(i).getId()+"/"
						+this.um.user.get(i).getMoney()+"\n");
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void itemDataSave() {
		try {
			fw = new FileWriter(itempsFile);
			for(int i=0; i<this.im.item.size(); i++) {
				fw.write(this.im.item.get(i).getName()+"/"
						+this.im.item.get(i).getPrice()+"/"
						+this.im.item.get(i).getCategory()+"\n");
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void categoryDataSave() {
		try {
			fw = new FileWriter(categoryFile);
			for(int i=0; i<shop.category.size(); i++) {
				fw.write(this.shop.category.get(i)+"\n");
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void basketDataSave() {
		try {
			fw = new FileWriter(basketFile);
			for(int i=0; i<this.um.user.size(); i++) {
				for(int j=0; j<this.um.user.get(i).cart.size(); j++) {
					fw.write(this.um.user.get(i).cart.get(j).getUserId()+"/"
							+this.um.user.get(i).cart.get(j).getItemName()+"/"
							+this.um.user.get(i).cart.get(j).getItemPrice()+"\n");
					
				}
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void categoryDataLoad() {
		try {
			fr = new FileReader(categoryFile);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				this.shop.category.add(data);
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void itemDataLoad() {
		try {
			fr = new FileReader(itempsFile);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String temp[] = data.split("/");
				this.im.item.add(new Item(temp[0],Integer.parseInt(temp[1]),temp[2]));
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void userDataLoad() {
		try {
			fr = new FileReader(usersFile);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String temp[] = data.split("/");
				this.um.user.add(new User(temp[0],Integer.parseInt(temp[1])));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void basketDataLoad() {
		try {
			fr = new FileReader(basketFile);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String temp[] = data.split("/");
				for(int i=0; i<this.um.user.size(); i++) {
					if(temp[0].equals(this.um.user.get(i).getId())) {
						this.um.user.get(i).cart.add(new Cart(temp[0],temp[1],Integer.parseInt(temp[2])));
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	
}
