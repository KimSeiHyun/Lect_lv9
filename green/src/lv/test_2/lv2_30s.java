package lv.test_2;

public class lv2_30s {

	public static void main(String[] args) {
		//		#���� 1) 8 �� 12 �� �ּ� ������� ���Ͻÿ�
		//	# �ּ� ������� �� ���� ����� �����Ѵ��� ó������ �������ڸ� ���Ѵ�.
		//	# ��) 8 16 24... 
		//	# ��) 12 24....
		//	# ���⼭ 24�� �ּҰ�����̴�.
		//	
		System.out.println("����1");
		for(int i=1; i<100; i++) {
			if(i%8 ==0 && i%12 == 0) {
				System.out.println(i);
				break;
			}
		}
		//	# ����2) �����̴� 4�� ���� �������� ���� ���ִ� 6�ϸ��� �����忡����
		//	# �λ����  4�� 3�Ͽ� �����ٸ� ������ �������� �����ΰ�?
		//
		System.out.println("����2");
		for(int i=1;i <100; i++) {
			if(i%4 == 0 && i%6 == 0) {
				System.out.println("4�� "+(3+i) + "��");
				break;
			}
		}
		//	# ����3) ���ΰ� 12 �̰� ���ΰ� 8�� ���簢������� ���̸� �þ����
		//	# ������ִ� �������� ���簢���� ��������Ѵ�. ���簢���������� �ʿ��Ѱ�?
		System.out.println("����3");
		int cnt1 = 0;
		int cnt2 = 0;
		int temp = 0;
		for(int i=1; i<100; i++) {
			if(i%12 == 0 && i%8 == 0) {
				temp = i;
				break;
			}
		}
		cnt1 = temp/12;
		cnt2 = temp/8;
		
		System.out.println(cnt1*cnt2);
		

		
	}

}
