package lv.test_7;

class Members1{
	private int no;
	private int point;
	private String name;
	private boolean best;
	
	public Members1(int no , String name) {
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
	public void setPorint(int point) {
		this.point += point;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBest(boolean best) {
		this.best = best;
	}
}

public class lv7_17 {

	public static void main(String[] args) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/�̸���,1002/��ö��,1003/�Źξ�,1004/�ڻ��";
		
		// data1 �� �����ȣ�� �ǸŽ����̴�.
		// data2 �� �����ȣ�� �̸��̴�.
		// �ǸŽ����� 4�̻��λ���� best�� true�� �����ϼ���.
		
		// �������͸� �Ľ� �ؼ� Member Ŭ���� �迭�� �ϼ��� ����غ�����.
		Members1[] memberList = null;
		String temp[] = data2.split(",");
		memberList = new Members1[temp.length];
		for(int i=0; i<memberList.length; i++) {
			String temp2[] = temp[i].split("/");
			memberList[i] = new Members1(Integer.parseInt(temp2[0]),temp2[1]);
		}
		temp = data1.split(",");
		for(int i=0; i<memberList.length; i++) {
			for(int j=0; j<temp.length; j++) {
				String temp2[] = temp[j].split("/");
				if(memberList[i].getNo() == Integer.parseInt(temp2[0])) {
					memberList[i].setPorint(Integer.parseInt(temp2[1]));
				}
			}
			if(memberList[i].getPoint() >= 4) memberList[i].setBest(true);
		}
		for(int i=0; i<memberList.length; i++) {
			System.out.println("��ȣ : " + memberList[i].getNo());
			System.out.println("����Ʈ  : " +memberList[i].getPoint());
			System.out.println("�̸� : " + memberList[i].getName());
			System.out.println("boolean : " + memberList[i].getBest());
		}
	}

}