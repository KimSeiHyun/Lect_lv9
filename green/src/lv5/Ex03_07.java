package lv5;

public class Ex03_07 {

	public static void main(String[] args) {
		//���ڿ���ȭ1����
		String [][] student = { // [4][3]
				{"aaa","����","1001"}, 
				{"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} , 
				{"ddd" , "����","1004"}};
		String[][] score = { // [4][4]
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		//�л� ������ ������ ��� ������ �̴� 
		//student ==> 1.id 2.�ּ� 3.��ȣ
		//score ==> 1.��ȣ 2.���� 3.���� 4.���� ���� �̴� 
		//����1) ��ü ������ 1���� �л� �̸� ��� 
		int max = 0;
		int sum = 0;
		int x = -1;
		String maxName = "";
		for(int i=0; i<score.length; i++) {
			sum = 0;
			for(int j=1; j<4; j++) {
				sum += Integer.parseInt(score[i][j]);
			}
			if(max < sum ) {
				max = sum;
				x = i;
				maxName = score[i][0];
			}
		}

		for(int i=0; i<student.length; i++) {
			for(int j=0; j<student[i].length; j++) {
				if(maxName.equals(student[i][j])) {
					System.out.print("1�� ������ �̸� : ");
					System.out.println(student[i][0]);
				}
			}
		}
		

		
	}

}
