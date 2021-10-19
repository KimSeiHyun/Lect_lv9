package lv7;

class Member2{
	int no;
	int point;
	String name;
	boolean best;
	
	void setInfo(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	void printInfo() {
		System.out.printf("%d %s : point %d",this.no,this.name,this.point);
		if(this.best)
			System.out.print(" <= BEST");
		System.out.println();
	}
}


public class Ex001_013tc {

	public static void main(String[] args) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";
		
		// data1 은 사원번호와 판매실적이다.
		// data2 는 사원번호와 이름이다.
		// 판매실적이 4이상인사원은 best를 true로 저장하세요.
		
		String temp[] = data2.split(",");
		// 위데이터를 파싱 해서 Member 클래스 배열을 완성후 출력해보세요.
		Member2[] memberList = null;
		memberList = new Member2[temp.length];
		for(int i=0; i<memberList.length; i++) {
			String info[] = temp[i].split("/");
			memberList[i] = new Member2();
			memberList[i].setInfo(Integer.parseInt(info[0]) , info[1]);
		}
		
		//실적확인
		temp = data1.split(",");
		for(int i=0; i<temp.length; i++) {
			String info[] = temp[i].split("/");
			int no = Integer.parseInt(info[0]);
			int point = Integer.parseInt(info[1]);
			
			for(int j=0; j<memberList.length; j++) {
				if(memberList[j].no == no) {
					memberList[j].point += point;
				}
			}
		}
		// best
		int max = 0;
		int idx = 0;
		for(int i=0; i<memberList.length; i++ ) {
			if(memberList[i].point > max ) {
				max = memberList[i].point;
				idx = i;
			}
		}
		memberList[idx].best = true;
		// print
		for(int i=0; i<memberList.length; i++) {
			memberList[i].printInfo();
		}
		
		
	}

}