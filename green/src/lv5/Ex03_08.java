package lv5;

public class Ex03_08 {

	public static void main(String[] args) {
		//���ڿ���ȭ3����
		String nameData = "";
		nameData+=	"100001/�̸���";nameData += "\n";		
		nameData += "100002/�̿���";nameData += "\n";
		nameData += "100003/���缮";nameData += "\n";
		nameData += "100004/�ڸ��";nameData += "\n";
		nameData += "100005/�ֿ���";nameData += "\n";
		nameData += "100006/�ں���";
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		// ����) moneyData �� nameData �� �����ؼ� �Ʒ��Ͱ��� ��������
		String userData = "";
		/*
		 * 100001/�̸���/600
		 * 100003/���缮/7000
		 * 100001/�̸���/100
		 * 100002/�̿���/400
		 * 100001/�̸���/600
		 * 100004/�ڸ��/900
		 * 100001/�̸���/130
		 * 100003/���缮/200
		 * 100002/�̿���/700
		 * 100002/�̿���/900
		 * 100004/�ڸ��/800
		 */
	
		String temp[] = nameData.split("\n");
		String name[][] = new String[temp.length][2];
		for(int i=0; i<name.length; i++) {
			String temp3[] = temp[i].split("/");
			name[i][0] = temp3[0];
			name[i][1] = temp3[1];
		}
		
		System.out.println("name[][]");
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				System.out.print(name[i][j] + " ");
			}
			System.out.println();
		}
		
		String temp2[] = moneyData.split("\n");
		String money[][] = new String[temp2.length][2];
		for(int i=0; i<money.length; i++) {
			String temp3[] = temp2[i].split("/");
			money[i][0] = temp3[0];
			money[i][1] = temp3[1];
		}
		
		System.out.println("money[][]");
		for(int i=0; i<money.length; i++) {
			for(int j=0; j<money[i].length; j++) {
				System.out.print(money[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<money.length; i++) {
			for(int j=0; j<name.length; j++ ) {
				if(money[i][0].equals(name[j][0])) {
					userData += money[i][0]+"/"+name[j][1]+"/"+money[i][1]+"\n";
				}
			}
		}
		
		System.out.println("userData");
		System.out.println(userData);

		
	}

}
