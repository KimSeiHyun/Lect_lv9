package lv.test_7;

import lv7.ExMonster;

//stack
//heap
//static 
//�� ����ƽ �����ڰ� ������ ������ �ٸ� �޸𸮿� �Ҵ�ް� ���� . 

class ExMonster {
	static int level;
	String name;
	boolean death;
	
	ExMonster(String name) {
		this.name = name;
		System.out.println("������ ź�� >> ");
	}
	
	void printInfo() {
		System.out.printf("%s�� Level %d / death : %b\n",this.name, this.level , this.death);
	}
}

public class lv7_24 {

	public static void main(String[] args) {
		ExMonster m1 = new ExMonster("��ũ");
		m1.level ++;
		m1.level ++;
		m1.level ++;
		ExMonster m2 = new ExMonster("����");
		m2.level ++;
		m2.death = true;
		ExMonster m3 = new ExMonster("��ũ");
		m3.level ++;
		m3.level ++;
		
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();
		
		
		
	}

}
