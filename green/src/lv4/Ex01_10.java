package lv4;

public class Ex01_10 {

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
		 int min = arr.length;
		 int a = 0;
		 int b = 0;
		 for(int i=0; i<arr.length; i++) {
			 int cnt = 0;
			 
			 for(int j =i; j<arr.length; j++) {
				 if(arr[i] == arr[j]) {
					 cnt ++;
				 }
			 }
			 if( cnt > max ) {
				 max = cnt;
				 a = arr[i];
			 }
			 if( cnt < min ) {
				 min = cnt;
				 b = arr[i];
			 }
		 }
		 
		 System.out.printf("������ ���� ���� ���ڴ� %d�̸� ������ %d�Դϴ�.\n",a,max);
		 System.out.printf("������ ���� ���� ���ڴ� %d�̸� ������ %d�Դϴ�.",b,min);

		 
 
		 
		 
		 
	} //clear

}
