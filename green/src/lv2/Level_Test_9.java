package lv2;

public class Level_Test_9 {

	public static void main(String[] args) {
//		# ����3)
//		# ��� ���忡�� �ѻ���� 1�ð��� ��ǻ�͸� 4�븦 �����Ҽ� �ִٰ��Ѵ�.
//		# 3���� ��ǻ�� 96�븦 �������� ��ð��� �ɸ��°�
		//	���� : 02:58
		//	���� : 03:10
		//	�ҿ� : 12��
		
		int one = 4;
		int three = one*3;
		int time = 1;
		int max = 0;
		while (three * time <= 96  ) {
			if (time > max ) {
				max++;
			}
			



			time++;

		}

		
		System.out.println("3���� 96�븦 �����ϸ� �ɸ��� �ð��� : " + max + " �ð� ");
		

		
		
		
	}

}
