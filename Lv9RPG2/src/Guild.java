import java.util.ArrayList;
import java.util.Scanner;

public class Guild {

	Scanner sc = new Scanner(System.in);
	ArrayList<Member> member = new ArrayList<>();
	public void guildManager() {
		while(true) {
			guildMainMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				
			}
			if(sel == 2) {
				
			}
			if(sel == 3) {
				
			}
			if(sel == 4) {
				
			}
			if(sel == 5) {
				
			}
			if(sel == 6) {
				
			}
			if(sel == 7) {
				
			}
		}
	}
	
	public void guildMainMenuPrint() {
		System.out.println("1.길드원목록\n2.길드원추가\n3.길드원삭제\n4.파티원목록\n5.파티원추가\n6.파티원추방\n7.뒤로가기");
	}
	
	private void GuildMemberList() {
		if(this.member.size() != 0) {
			System.out.println("이름\t레벨\t체력\t공격력\t방어력\t경험치");
			System.out.println();
		}else System.out.println("길드원이 존재하지 않습니다.");
	}
	
	private void addGuildMember() {
		
	}
}
