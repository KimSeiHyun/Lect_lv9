package lv4;

public class Ex02_07tc {

	public static void main(String[] args) {
        int [][] arr = { // stack
				{10,20,30},
				{10,20,30,40,50},
				{10,20,30,40}
		};
		//���Ͱ��� �� ���� ũ�Ⱑ �ٸ� 2�����迭�� �ݺ������� ����� (new Ű���带 ���� heap�� '����' ����)
        
        int info[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
        	info[i] = arr[i].length;
        }
        
        int temp[][] = new int[arr.length][];
        for(int i=0; i<temp.length; i++) {
        	temp[i] = new int[info[i]]; // new int[arr[i].length]];
        	for(int j=0; j<temp[i].length; j++) {
        		temp[i][j] = arr[i][j];
        	}
        }
        
        for(int i =0; i<temp.length; i++) {
        	for(int j =0; j<temp[i].length; j++) {
        		System.out.print(temp[i][j] + " ");
        	}
        	System.out.println();
        }
        
        System.out.println(arr[1]);
        System.out.println(info[1]);
        System.out.println(temp[1]);
        
        
        
        
        
        
        
        
        
        
        
	}

}
