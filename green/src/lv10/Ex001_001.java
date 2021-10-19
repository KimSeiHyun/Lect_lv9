package lv10;

class ExManager {
	
	private static ExManager instance = new ExManager();
	private ExManager() {}
	public static ExManager getInstance() {
		return instance;
	}
}

class Main2Manager {
	private ExManager em = ExManager.getInstance();
}

public class Ex001_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
