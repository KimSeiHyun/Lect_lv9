package lv.test_7;

import lv7.ExMonster;

//stack
//heap
//static 
//ㄴ 스테틱 제어자가 붙으면 완전히 다른 메모리에 할당받고 시작 . 

class ExMonster {
	static int level;
	String name;
	boolean death;
	
	ExMonster(String name) {
		this.name = name;
		System.out.println("몬스터의 탄생 >> ");
	}
	
	void printInfo() {
		System.out.printf("%s의 Level %d / death : %b\n",this.name, this.level , this.death);
	}
}

public class lv7_24 {

	public static void main(String[] args) {
		ExMonster m1 = new ExMonster("오크");
		m1.level ++;
		m1.level ++;
		m1.level ++;
		ExMonster m2 = new ExMonster("나비");
		m2.level ++;
		m2.death = true;
		ExMonster m3 = new ExMonster("헐크");
		m3.level ++;
		m3.level ++;
		
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();
		
		
		
	}

}
