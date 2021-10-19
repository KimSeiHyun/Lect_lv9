package lv7;

class Member{
	int no;
	int point;
	String name;
	boolean best;
	
	void print() {
		System.out.println("사원번호 : " + no);
		System.out.println("판매실적 : " + point);
		System.out.println("이름    : " + name);
		System.out.println("우수사원 : " + best);
	}
}

public class Ex001_013 {

	public static void main(String[] args) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";
		
		// data1 은 사원번호와 판매실적이다.
		// data2 는 사원번호와 이름이다.
		// 판매실적이 4이상인사원은 best를 true로 저장하세요.
		
		// 위데이터를 파싱 해서 Member 클래스 배열을 완성후 출력해보세요.
		String temp[] = data2.split(",");
		Member[] memberList = new Member[temp.length];
		for(int i=0; i<memberList.length; i++) {
			memberList[i] = new Member();
			String temp2[] = temp[i].split("/");
			memberList[i].no = Integer.parseInt(temp2[0]);
			memberList[i].name = temp2[1];
		}
		
		String temp3[] = data1.split(",");

		for(int i=0; i<temp3.length; i++) {
			String temp4[] = temp3[i].split("/");
			for(int j=0; j<memberList.length; j++) {
				int x = Integer.parseInt(temp4[0]);
				int y = Integer.parseInt(temp4[1]);
				if(memberList[j].no == x) {
					memberList[j].point += y;
				}
			}
		}
		
		for(int i=0; i<memberList.length; i++ ) {
			if(memberList[i].point >= 4) {
				memberList[i].best = true;
			}
			memberList[i].print();
			System.out.println();
		}
	}

}