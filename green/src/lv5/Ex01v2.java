package lv5;

public class Ex01v2 {

	public static void main(String[] args) {
		//���ڿ�
		//�� ������ ����(�迭)
		// ��char �ڷ����� �迭 > String Ŭ������ ó��
		
		
		//���ڿ� �޼���
		
		// substring() 
		// �� ���ڿ�.substring(index)  //index ~������ ���ڱ��� ����. 
		// �� ���ڿ�.substring(start,end) // start~end-1 ���ڱ��� ����
		String str = "Do not go gentle onto that good night.";
//					  0123456...
		System.out.println("[substring()]");
		System.out.println(str.substring(0));
		System.out.println(str.substring(0,1));
		
		
		// split()
		// �� ���ڿ�.split("������")   //�����ڸ� �������� �߶󳻱� > ���ڿ� �迭�� ��ȯ 
		
		System.out.println("[split(������)]");
		String result[] = str.split(" ");
		System.out.println(result.length);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		//charAt()
		// �� ���ڿ�.charAt(index) // ������ �ε����� ���� �� ���� char Ÿ������ ��ȯ 
		System.out.println("[charAt(index)]");
		char a = str.charAt(1); // D
		System.out.println(a);
	}

}
