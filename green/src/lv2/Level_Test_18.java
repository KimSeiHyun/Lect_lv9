package lv2;

public class Level_Test_18 {
public static void main(String[] args) {
	
//		# ����1) 36�� ��� �� ���� ���
//		# �����  36�� ������ �������� 0�μ��� ���Ѵ�.
//		# 1,2
	
	//	���� : 10:08
	//	���� : 10:21
	//	�ҿ� : 13��
	
	int a = 36;
	
	int i = 1;
	System.out.print("36�� ����� : ");
	while (i <= a) {
		if(a%i == 0) {
			System.out.print(+ i + ", ");
		}
		i++;
	}
	

	
}
}
