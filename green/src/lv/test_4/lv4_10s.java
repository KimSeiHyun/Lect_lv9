package lv.test_4;

public class lv4_10s {

	public static void main(String[] args) {
		/*
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		�� �迭���� �Ȱ��� ������ ������ ���� ���� ���ڿ� ���� ���� ���� ��  ������  ��� 
		��) ������ ������������ ==> 100
		��) ������ ���帹������ ==> 3
		���� ���� ���� ��� : 3 ===> 5�� 
		���� ���� ���� ��� : 100 ===> 1��
		*/
		
		 int [] arr = {1,1,3,3,3,100,2,2,3,1,3};
		 int max = 0;
		 int cnt = 0;
		 int x = 0;
		 int y = 0;
		 int min = arr.length;
		 int cnt2 = 0;
		 for(int i=0; i<arr.length; i++) {
			 cnt = 0;
			 cnt2 = 0;
			 for(int j=0; j<arr.length; j++) {
				 if(arr[i] == arr[j]) {
					 cnt ++ ;
					 cnt2 ++;
				 }
			 }
			 if(max < cnt ) {
				 max = cnt;
				 x = arr[i];
			 }
			 if(min > cnt2 ) {
				 min = cnt2;
				 y = arr[i];
			 }
		 }
		 
		 System.out.printf("���� ���� ���ڴ� %d�̰� ������ %d�̴� .  ",x,max);
		 System.out.printf("���� ���� ���ڴ� %d�̰� ������ %d�̴� .  ",y,min);

	}

}
