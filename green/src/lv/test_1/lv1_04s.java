package lv.test_1;

public class lv1_04s {

	public static void main(String[] args) {
		// ��) 3�� ����̸鼭, ¦���̸� true ���
				int num = 12;
				System.out.println(num % 3 == 0 && num % 2 == 0);
				
				// ���� 1) ����
				// 3������ ����� 60�� �̻��̸�, true
				// ��, ��� �� �����̶� 50�� �̸��̸�, false
				int kor = 100;
				int eng = 87;
				int math = 41;
				int aver = (kor+eng+math)/3;
				System.out.println(aver >= 60 && kor>=50 && eng>=50 && math >=50);
		    // ���� 2) Ű�� 200cm�̻��̰ų� �����԰� 200kg �̻��̸�, ����(true)
				int Ű = 202;
				int ������ = 150;
				System.out.println(Ű>=200 || ������ >=200);

	}

}
