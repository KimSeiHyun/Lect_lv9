
public class Item {
	public static final int WEAPON = 1;
	public static final int ARMOR = 2;
	public static final int ACCESSORISE = 3;
	
	private String kind;
	private String name;
	private int power;
	private int price;
	
	public Item (String kind , String name , int power , int price) {
		this.kind = kind;
		this.name = name;
		this.power = power;
		this.price = price;
	}
	public String getKind() {
		return this.kind;
	}
	public String getName() {
		return this.name;
	}
	public int getPower() {
		return this.power;
	}
	public int getPrice() {
		return this.price;
	}
	public int getWEPON() {
		return this.WEAPON;
	}
	
}
