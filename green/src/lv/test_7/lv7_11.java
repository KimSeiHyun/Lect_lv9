package lv.test_7;

class Member{
	String name;
	int num;
}
class MemberManager{
	Member[] memberList =new Member[3];
}

public class lv7_11 {

	public static void main(String[] args) {
		MemberManager mg = new MemberManager();	
		Member m1 = new Member();
		mg.memberList[0] = m1;
		m1.name = "??ö??";
		m1.num = 1001;
		m1 = new Member();
		mg.memberList[1] = m1;
		m1.name = "?̸???";
		m1.num = 1002;
		m1 = new Member();
		mg.memberList[2] = m1;
		m1.name = "?ڿ???";
		m1.num = 1003;
		Member temp = mg.memberList[1];
		System.out.println(temp.name);
		
	}

}