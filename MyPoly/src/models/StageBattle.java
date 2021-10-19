package models;

import java.util.Random;
import java.util.Scanner;

import controller.UnitManager;

public class StageBattle extends Stage{
	public static StageBattle instance = new StageBattle();
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	private UnitManager um = UnitManager.getUnitManagerinstance();
	
	public static StageBattle getStageBattleInstance() {
		return StageBattle.instance;
	}
	
	@Override
	public void init() {
		
		
	}

	@Override
	public void menu() {
		allUnitPrint();
	}
	public void allUnitPrint() {
		System.out.printf("--- ���� ��Ƽ�� ---   (STAGE LEVEL = %d)\n",Stage.stageLevel);
		System.out.println("�̸�		ü��		����		�Ŀ�		����");
		for(int i=0; i<um.player.size(); i++) {
			System.out.println(this.um.player.get(i).getName()+"\t\t" + this.um.player.get(i).getHp()+"/"+this.um.player.get(i).getMaxHp()+"\t\t" +
					this.um.player.get(i).getMp()+"/"+this.um.player.get(i).getMaxMp()+"\t\t"+this.um.player.get(i).getPower()+"\t\t" +this.um.player.get(i).getDeth());
		}
		System.out.println("--- ���� ���� ---");
		for(int i=0; i<um.unit.size(); i++) {
			System.out.println(this.um.unit.get(i).getName()+"\t\t" + this.um.unit.get(i).getHp()+"/"+this.um.unit.get(i).getMaxHp()+"\t\t" +
					this.um.unit.get(i).getMp()+"/"+this.um.unit.get(i).getMaxMp()+"\t\t"+this.um.unit.get(i).getPower()+"\t\t" +this.um.unit.get(i).getDeth());
		}System.out.println("---------------");
	}
	
	public void playerTurn() {
		int x = 0;
		this.menu();
		while(x < this.um.player.size()) {
			System.out.printf("%s�� ���� �ൿ�� �������ּ��� ! \n",this.um.player.get(x).getName());
			System.out.println("[1.����]   [2.��ų]  [3.��ų����]");
			int sel = sc.nextInt();
			if(sel == 1) {
				int monsterIdx = rn.nextInt(this.um.unit.size());
				this.um.player.get(x).attack(this.um.unit.get(monsterIdx));
				this.monsterDieCheck();
				this.menu(); 
				x++;
			}
			if(sel == 2) {
				if(this.um.player.get(x).getMp() >= 10) {
					int monsterIdx = rn.nextInt(this.um.unit.size());	
					if(x == 0) {this.um.player.get(x).skillPowerStrike(this.um.player.get(x), this.um.unit.get(monsterIdx));}
					if(x == 1) {this.um.player.get(x).skillThunderbolt(this.um.player.get(x));}
					if(x == 2) {this.um.player.get(x).skillFocusShot(this.um.player.get(x), this.um.unit.get(monsterIdx));}
					if(x == 3) {this.um.player.get(x).skillHealingWave(this.um.player.get(x));}
					x++;
					this.monsterDieCheck();
					this.menu(); 
				}else System.out.println("[  MP�� �����մϴ�  ]");
			}
			if(sel == 3) {
				this.skillInformation(x);
			}
			if(um.unit.size() == 0) break;
		}
		
	}
	
	private void monsterDieCheck() {
		for(int i=0; i<this.um.unit.size(); i++) {
			if(this.um.unit.get(i).getHp() <= 0) {
				System.out.printf("%s�� óġ!!\n",this.um.unit.get(i).getName());
				this.um.unit.remove(i);
			}
		}
	}
	
	private void skillInformation(int x) {
		if(x == 0) {
			System.out.println("[�Ŀ� ��Ʈ����ũ] : ������ ��󿡰� �ڽ��� ���ݷ¿� �ι��� �������� ������.]");
		}
		if(x == 1) {
			System.out.println("[�����Ʈ] : �� ��ο��� �ڽ��� ���ݷ� ��ŭ �������� ������.");
		}
		if(x == 2) {
			System.out.println("[���߻��] : ������ ��󿡰� �ڽ��� ���ݷ¿� �ι� �������� ������.");
		}
		if(x == 3) {
			System.out.println("[���� ���̺�] : ����ִ� �Ʊ� ��ο��� �ڽ��� ���ݷ¸�ŭ ȸ����Ų��.");
		}
	}
	
	private void mpRecover() {
		for(int i=0; i<this.um.player.size(); i++) {
			
		}
	}
	
	public void monsterTurn() {
		
	}
	

}
