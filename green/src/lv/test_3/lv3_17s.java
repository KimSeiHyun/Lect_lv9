package lv.test_3;

public class lv3_17s {

	public static void main(String[] args) {
		int arr[] = {
				0,0,0,
				3,3,3,
				3,3,0
		};

		//����2) ���࿡ ���ο� 3�� �������� 3�������� "����" ���
		
		for(int i=0; i<9; i+=3) {
			if(arr[i] == 3 && arr[i+1] == 3 && arr[i+2] ==3) {
				System.out.println("���� !! ");
			}
		}
	}

}
