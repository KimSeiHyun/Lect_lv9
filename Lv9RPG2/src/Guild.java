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
		System.out.println("1.�������\n2.�����߰�\n3.��������\n4.��Ƽ�����\n5.��Ƽ���߰�\n6.��Ƽ���߹�\n7.�ڷΰ���");
	}
	
	private void GuildMemberList() {
		if(this.member.size() != 0) {
			System.out.println("�̸�\t����\tü��\t���ݷ�\t����\t����ġ");
			System.out.println();
		}else System.out.println("������ �������� �ʽ��ϴ�.");
	}
	
	private void addGuildMember() {
		
	}
}
