package lv4;

public class Ex02_07 {

	public static void main(String[] args) {
        int [][] arr = {
				{10,20,30},
				{10,20,30,40,50},
				{10,20,30,40}
		};
		//���Ͱ��� �� ���� ũ�Ⱑ �ٸ� 2�����迭�� �ݺ������� ����� (new)
        
        int arr2[][] = new int[arr.length][];
        int x = 0;
        for(int i =0; i<3; i++) {
        	if(i == x ) {
        		arr2[i] = new int[arr[i].length];
        		for(int j = 0; j<arr2[i].length; j++) {
        			arr2[i][j] = arr[i][j];
        		}
        	}
        	x++;
        }
        
        for(int i = 0; i<arr2.length; i++) {
        	for(int j=0; j<arr2[i].length; j++) {
        		System.out.print(arr2[i][j] + " ");
        	}
        	System.out.println();
        }
        
        
	}//claer

}
