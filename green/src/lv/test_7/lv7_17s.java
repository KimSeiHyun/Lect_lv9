package lv.test_7;

class Members{
	private int no;
	private int point;
	private String name;
	private boolean best;
	
	public Members(int no , String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return this.no;
	}
	public int getPoint() {
		return this.point;
	}
	public String getName() {
		return this.name;
	}
	public boolean getBest() {
		return this.best;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setPoint(int point) {
		this.point += point;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBest(boolean best) {
		this.best = best;
	}
}

public class lv7_17s {

	public static void main(String[] args) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";
		
		// data1 은 사원번호와 판매실적이다.
		// data2 는 사원번호와 이름이다.
		// 판매실적이 4이상인사원은 best를 true로 저장하세요.
		
		// 위데이터를 파싱 해서 Member 클래스 배열을 완성후 출력해보세요.
		Members[] arr = null;
		String temp[] = data2.split(",");
		arr = new Members[temp.length];
		
		for(int i=0; i<arr.length; i++) {
			String temp2[] = temp[i].split("/");
			arr[i] = new Members(Integer.parseInt(temp2[0]),temp2[1]);
		}
		
		temp = data1.split(",");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<temp.length; j++) {
				String temp2[] = temp[j].split("/");
				if(arr[i].getNo() == Integer.parseInt(temp2[0])) {
					arr[i].setPoint(Integer.parseInt(temp2[1]));
				}
			}
			if(arr[i].getPoint() >= 4) arr[i].setBest(true);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("번호 : " + arr[i].getNo());
			System.out.println("실적 : " + arr[i].getPoint());
			System.out.println("이름 : " + arr[i].getName());
			System.out.println("boolean : " + arr[i].getBest());
		}
		
		
		
	}

}