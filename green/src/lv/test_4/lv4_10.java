package lv.test_4;

public class lv4_10 {

	public static void main(String[] args) {
		/*
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		�� �迭���� �Ȱ��� ������ ������ ���� ���� ���ڿ� ���� ���� ���� ��  ������  ��� 
		��) ������ ������������ ==> 100
		��) ������ ���帹������ ==> 3
		���� ���� ���� ��� : 3 ===> 5�� 
		���� ���� ���� ��� : 100 ===> 1��
		*/
		
		 int [] arr = {1,1,3,3,3,100,3,2,3,1,1};
		 
		 int temp =0;
		 int temp2 = 0;
		 int max2 = 0;
		 int min = 20;
		 int temp3 = 0;
		 for(int i=0; i<arr.length;i ++) {
			 int max= 0;
				 temp = arr[i];
			 for(int j=0; j<arr.length; j++) {
				 if(temp == arr[j]) {
					 max ++;
				 }
				 
			 }
			 if(max2 <max) {
				 max2 = max;
				 temp2 = arr[i];
			 }
			 if(max < min) {
				 min = max;
				 temp3 = arr[i];
			 }
		 }
		 System.out.println("������ ���� ���� ���ڿ� ������ : " + temp2 + "," + max2);
		 System.out.println("������ ���� ���� ���ڿ� ������ : " + temp3 + "," + min);
		 
		 
	}

}
