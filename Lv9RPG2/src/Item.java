
public class Item {
	public static final int WEAPON = 1;
	public static final int ARMOR = 2;
	public static final int ACCESSORISE = 3;
	
	private String kind;
	private String name;
	private int power;
	private int price;
	private boolean use = false;
	private String userName;
	public Item (String kind , String name , int power , int price) {
		this.kind = kind;
		this.name = name;
		this.power = power;
		this.price = price;
	}
	public Item (String kind , String name , int power , int price , boolean use, String userName) {
		this.kind = kind;
		this.name = name;
		this.power = power;
		this.price = price;
		this.use = use;
		this.userName = userName;
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
	public boolean getUse() {
		return this.use;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUse() {
		while(true) {
			if(this.use == false) {
				this.use = true;
				break;
			}
			if(this.use == true) {
				this.use = false;
				break;
			}
		}
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
