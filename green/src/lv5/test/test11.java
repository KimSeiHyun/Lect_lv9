package lv5.test;

public class test11 {

	public static void main(String[] args) {
		//���۽ð� 02 : 35
		//����ð� 02 : 51
		//�ҿ�ð� 00 : 16
		
		String [][] student = {// [4][3]
				{"aaa","����","1001"}, 
				{"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} ,
				{"ddd" , "����","1004"}};
		String[][] score = {
				{"��ȣ" ,"����" , "����"},
				{"1001" ,"����","20"},
				{"1002" ,"����","50"},
				{"1003" ,"����","60"},
				{"1004" ,"����","17"},
				{"1001" ,"����","65"},
				{"1002" ,"����","15"},
				{"1003" ,"����","80"},
				{"1004" ,"����","70"},
				{"1001" ,"����","43"},
				{"1002" ,"����","90"},
				{"1003" ,"����","30"},
				{"1004" ,"����","70"}
		};
		//�л� ������ ������ ��� ������ �̴� 
		//student ==> 1.id 2.�ּ� 3.��ȣ
		//score ==> 1.��ȣ 2.���� 3.���� 4.���� ���� �̴� 
		//����1) ��ü ������ 1���� �л� �̸� ��� 
		
		int max = 0;
		String num = "";
		for(int i=0; i<4; i++) {
			num = student[i][2];
			int sum = 0;
			for(int j=1; j<score.length; j++) {
					if(score[j][0].equals(num)) {
						sum += Integer.parseInt(score[j][2]);
					}
			}
			if( max < sum ) {
				max = sum;
			}
		}
		
		for(int i=0; i<4; i++) {
			num = student[i][2];
			int sum = 0;
			for(int j=1; j<score.length; j++) {
				if(score[j][0].equals(num)) {
					sum += Integer.parseInt(score[j][2]);
				}
			}
			if(sum == max) {
				for(int k=0; k<4; k++) {
					for(int j=0; j<3; j++) {
						if(student[k][j].equals(num)) {
							System.out.println("1�� �л��� : " + student[k][0]);
						}
					}
				}
			}
		}

	}

}
