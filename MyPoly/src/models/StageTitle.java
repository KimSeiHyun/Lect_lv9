package models;

public class StageTitle extends Stage  {
	
	public static StageTitle instance = new StageTitle();
	
	
	public static StageTitle getStageTitleInstance() {
		return StageTitle.instance;
	}
	
	@Override
	public void init() {

	}

	@Override
	public void menu() {
		System.out.println("==== TEXT RPG ====");
		System.out.println("[1.����]   [2.���Ӽ���]   [3.����]");
	}
	public void GameMenual() {
		System.out.println("---  ���Ӽ��� ---");
		System.out.println("1.���۽� �÷��̾�� ��Ƽ���� �̲��� ���������� �����ϰ� �˴ϴ�.");
		System.out.println("2.�÷��̾�� ������ ��Ƽ������ �̲��� �ִ����� ������������ �����غ�����! ");
		System.out.println("3.��Ƽ������ ������ ���� ��ų���� �����ϰ� ������ ������ Ÿ�ֿ̹� ������ּ��� ! ");
		System.out.println("4.���������� Ŭ���� �� ������ mp�� ���� ȸ���˴ϴ�. ");
		System.out.println("----------------");
	}
	
	
}
