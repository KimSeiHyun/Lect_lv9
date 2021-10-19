package lv10_3;



interface Repairable { // Mark Interface : �̸� ��ӹ޾�? ������ Ŭ�������� ���? -> ��ũ �������̽��� ���� �ڷ����� ��.
	
}

interface Damageable {
	//void damage(Unit unit);
	void damage(int att);
}

// damage() �޼ҵ带 ����
// Interface Damageable �� �����ϰ�
// ������ ������ (���?) ���� Damagealbe ���?
// main���� ������ ���ֵ��� �ջ���? �� -> repair() ��������

class Unit { //���? ������ �ְ� ���� Ŭ����
	final int MAX_HP;
	int hp;
	String name;
	int damage;
	public Unit(int hp) { // �ڽ� ������ ������ �ƽ����� ���� .
		this.MAX_HP = hp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}

class GroundUnit extends Unit {

	public GroundUnit(int hp) {
		super(hp);
	}
	
}

class AirUnit extends Unit {

	public AirUnit(int hp) {
		super(hp);
	}
	
}

// GroundUnit
// �� Tank (150) (����V)
// �� Marine (70)
// �� SCV (200) (����V)

class Tank extends GroundUnit implements Repairable,Damageable{
	
	// super()   : �θ��� ������ ȣ�� ( �⺻�����ڴ� ���� O )
	// super.##  : �θ� ���� �����? ���� . 
	public Tank() {
		super(150); // MAX_HP
		hp = MAX_HP;	// 0�ʱ�ȭ �Ǿ��ִ� Unit �� hp�� MAX�� ������ . 
		super.setName("Tank");
		super.setDamage(30);
		System.out.printf("Tank�� ����... Unit [hp : %d]\n",hp);
	}

	@Override
	public void damage(int att) {
		if(hp > 0) {
			hp -= att;
			System.out.printf("%d��ŭ �������� �Ծ���! \n", att);
		}
		
	}

//	@Override
//	public void damage(Unit unit) {
//		unit.hp -= this.damage;
//		System.out.printf("%s�� %s�� ����!!\n",this.name , unit.name);
//		System.out.printf("%s�� �������� %d �̹Ƿ� %s�� %d �������� �Ծ���.\n",this.name , this.damage , unit.name , this.damage);
//		System.out.printf("%s�� ü�� %d/%d\n",unit.name , unit.hp , unit.MAX_HP);
//		
//	}
	
	
	
	
}

class Marine extends GroundUnit implements Damageable{
	
	public Marine() {
		super(70);
		hp = MAX_HP;
		super.setName("Marine");
		super.setDamage(6);
		System.out.printf("Marine�� ����... Unit [hp : %d]\n",hp);
	}

	@Override
	public void damage(int att) {
		if(hp > 0) {
			hp -= att;
			System.out.printf("%d��ŭ �������� �Ծ���! \n", att);
		}
	}

//	@Override
//	public void damage(Unit unit) {
//		unit.hp -= this.damage;
//		System.out.printf("%s�� %s�� ����!!\n",this.name , unit.name);
//		System.out.printf("%s�� �������� %d �̹Ƿ� %s�� %d �������� �Ծ���.\n",this.name , this.damage , unit.name , this.damage);
//		System.out.printf("%s�� ü�� %d/%d\n",unit.name , unit.hp , unit.MAX_HP);
//	}
}

// SCV�� �ٸ� ���ֵ� �߿� "����������" ������ �����ϴ� �����? ������. 
// �� repair() �޼ҵ�
class SCV extends GroundUnit implements Repairable,Damageable {
	
	public SCV () {
		super(200);
		hp = MAX_HP;
		super.setName("SCV");
		super.setDamage(5);
		System.out.printf("SCV�� ����... Unit [hp : %d]\n",hp);
	}
	
	public void repair(Repairable repairable) {
		// Upcasting -> Unit �� ���? hp�� ó���ϱ� ���� . 
		Unit unit = (Unit) repairable;
		while(unit.hp < unit.MAX_HP) {
			unit.hp ++;
			System.out.println("������ >>");
		}
		System.out.printf("[%s �����Ϸ�]\n",unit.name);
	}

	@Override
	public void damage(int att) {
		if(hp > 0) {
			hp -= att;
			System.out.printf("%d��ŭ �������� �Ծ���! \n", att);
		}
	}

//	@Override
//	public void damage(Unit unit) {
//		unit.hp -= this.damage;
//		System.out.printf("%s�� %s�� ����!!\n",this.name , unit.name);
//		System.out.printf("%s�� �������� %d �̹Ƿ� %s�� %d �������� �Ծ���.\n",this.name , this.damage , unit.name , this.damage);
//		System.out.printf("%s�� ü�� %d/%d\n",unit.name , unit.hp , unit.MAX_HP);
//	}
}
// AirUnit
// �� DropShip

class DropShip extends AirUnit {
	
	public DropShip() {
		super(120);
		hp = MAX_HP;
		super.setName("DropShip");
		System.out.printf("DropShip�� ����... Unit [hp : %d]\n",hp);
	}
}
public class eX {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip ship = new DropShip();
		

			scv.repair(tank);
	//		scv.repair(marine);
			scv.repair(scv);
	//		scv.repair(ship);
			tank.damage(5);
			scv.repair(tank);
	}

}
