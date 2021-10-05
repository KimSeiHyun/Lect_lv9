package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Bank;
import models.User;

public class UserManager {
	public static UserManager instance = new UserManager();
	ArrayList<User>user = new ArrayList<>();
	private Bank bank = Bank.instance;
	public static Scanner sc = new Scanner(System.in);
	public static Random rn  = new Random();
	
	public void logIn() {
		System.out.print("로그인 할 id 입력 : ");
		String id = sc.next();
		System.out.print("로그인 할 pw 입력 : ");
		String pw = sc.next();
		int idx = -1;
		for(int i=0; i<this.user.size(); i++) {
			if(this.user.get(i).getId().equals(id) && this.user.get(i).getPw().equals(pw)) idx = i;
		}
		if(idx != -1) {
			this.bank.log = idx;
			System.out.println("로그인 성공 ! ");
		}else System.out.println("회원정보를 다시 확인해주세요 . ");
	}
	public void SignUp() {
		int code = duplicateCheck();
		System.out.print("회원가입 할 Id입력 : ");
		String id = duplicateId();
		System.out.print("회원가입 할 PW입력 : ");
		String pw = sc.next();
		System.out.print("회원가입 할 name 입력 : ");
		String name = sc.next();
		this.user.add(new User(code,id,pw,name));
	}
	
	public void leave() {
			System.out.print("회원탈퇴할 id 입력 : ");
			String id  = sc.next();
			System.out.print("회원탈퇴할 pw 입력 : ");
			String pw = sc.next();
			int idx = -1;
			for(int i=0; i<this.user.size(); i++) {
				if(this.user.get(i).getId().equals(id) && this.user.get(i).getPw().equals(pw)) idx = i;
			}
			if(idx != -1) {
				this.user.remove(idx);
				this.bank.log = -1;
			}else System.out.println("회원정보를 다시 확인해주세요 . ");
			
	}
	
	public void printUsers() {
		for(int i=0; i<this.user.size(); i++) {
			System.out.print(this.user.get(i).getCode()+"/");
			System.out.print(this.user.get(i).getId()+"/");
			System.out.print(this.user.get(i).getPw()+"/");
			System.out.print(this.user.get(i).getName()+"\n");
			if(this.user.get(i).acc.size() != 0) {
				System.out.println("-----------------");
				for(int j=0; j<this.user.get(i).acc.size(); j++) {
					System.out.print(this.user.get(i).acc.get(j).getUserCode()+"/");
					System.out.print(this.user.get(i).acc.get(j).getAccNum()+"/");
					System.out.print(this.user.get(i).acc.get(j).getMoney());
					if(this.user.get(i).acc.get(j).getRep() ==true) {
						System.out.print("  (대표계좌)");
					}System.out.println();
				}
				System.out.println("-----------------");
				
			}
		}
	}
	
	private int duplicateCheck() {
		int code = 0;
		while(true) {
			int ranNum = rn.nextInt(9000)+1000;
			int check = 0;
			for(int i=0; i<this.user.size(); i++) {
				if(ranNum == this.user.get(i).getCode()) {
					check = 1;
				}
			}
			if(check ==0) {
				code = ranNum;
				break;
			}
		}
		return code;
	}
	private String duplicateId() {
		String id = "";
		while(true) {
			id = sc.next();
			int check = 0;
			for(int i=0; i<this.user.size(); i++) {
				if(this.user.get(i).getId().equals(id)) check = 1;
			}
			if(check ==0 ) {
				break;				
			}else System.out.println("중복된 아이디입니다. 다시 입력해주세요 . ");
		}
		return id;
	}
	
	
}
