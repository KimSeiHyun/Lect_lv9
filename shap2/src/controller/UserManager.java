package controller;

import java.util.ArrayList;
import java.util.Scanner;

import models.User;

public class UserManager {
	ArrayList<User> user = new ArrayList<>();
	public static UserManager instance = new UserManager();
	public static Scanner sc = new Scanner(System.in);
	public static int log = -1;
	
	
	public void signUp() {
		System.out.print("ȸ������ �� ���̵� �Է� : ");
		String id = sc.next();
		int check = 0;
		for(int i=0;i <this.user.size(); i++) {
			if(this.user.get(i).getId().equals(id)) check = 1;
		}
		if(check == 0) {
			this.user.add(new User(id,10000));
		}else System.out.println("�ش� ���̵�� �̹� �����մϴ�.");
	}
	public void leave() {
		System.out.print("ȸ��Ż�� �� �ڽ��� ���̵� �Է� : ");
		String id = sc.next();
		if(this.user.get(this.log).getId().equals(id)) {
			this.user.remove(this.log);
			this.log = -1;
		}else System.out.println("���̵� �ٽ� Ȯ�����ּ��� . ");
	}
	public void logIn() {
		System.out.print("�α��� �� ���̵� �Է� : ");
		String id = sc.next();
		int idx = -1;
		for(int i=0; i<this.user.size(); i++) {
			if(this.user.get(i).getId().equals(id)) idx = i;
		}
		if(idx != -1) {
			this.log = idx;
		}else System.out.println("�ش� ���̵� ã�� �� �����ϴ�.");
	}
}
