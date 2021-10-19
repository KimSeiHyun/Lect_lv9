package lv7;

class Member{
	int no;
	int point;
	String name;
	boolean best;
	
	void print() {
		System.out.println("�����ȣ : " + no);
		System.out.println("�ǸŽ��� : " + point);
		System.out.println("�̸�    : " + name);
		System.out.println("������ : " + best);
	}
}

public class Ex001_013 {

	public static void main(String[] args) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/�̸���,1002/��ö��,1003/�Źξ�,1004/�ڻ��";
		
		// data1 �� �����ȣ�� �ǸŽ����̴�.
		// data2 �� �����ȣ�� �̸��̴�.
		// �ǸŽ����� 4�̻��λ���� best�� true�� �����ϼ���.
		
		// �������͸� �Ľ� �ؼ� Member Ŭ���� �迭�� �ϼ��� ����غ�����.
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