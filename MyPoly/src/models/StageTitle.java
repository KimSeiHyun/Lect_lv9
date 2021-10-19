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
		System.out.println("[1.시작]   [2.게임설명]   [3.종료]");
	}
	public void GameMenual() {
		System.out.println("---  게임설명서 ---");
		System.out.println("1.시작시 플레이어는 파티원을 이끌고 스테이지를 진행하게 됩니다.");
		System.out.println("2.플레이어는 정해진 파티원들을 이끌고 최대한의 스테이지까지 도전해보세요! ");
		System.out.println("3.파티원들은 각각의 고유 스킬들을 보유하고 있으며 적절한 타이밍에 사용해주세요 ! ");
		System.out.println("4.스테이지를 클리어 할 때마다 mp가 절반 회복됩니다. ");
		System.out.println("----------------");
	}
	
	
}
