package lv1;

public class Ex12 {

	public static void main(String[] args) {
		// �������� 1. ���������� 3�ܰ� 
		// ���� 9:28
		// ���� 9:30
		// �ҿ� 2�� 
		
		// �������� ��� ( ��¹� ) 
		// �� ����� ���
		// �� ���ڿ� �ȿ� ��ӵ� ������Ű�� �Է� -> ���� 
		
		// print()
		// println()  // new lint (�ٹٲ� ����) 
		// printf() // formatter 
		
		// �ڷ���
		// 1. ���� integer -> int			: "%d" decimal
		// 2. �Ǽ� float   -> double		: "%f" float
		// 3. ���� char    -> char		: "%c" char
		// 4. ���ڿ� String -> String 	: "%s" String
		
		// ** �л��� ������ ** �� �Դϴ� . 
		String stu = "�輼��";
		int score = 100;
		
		System.out.println(stu + "�л��� ������ " + score + "�� �Դϴ� .");
		System.out.printf("%s �л��� ������ %d �Դϴ�.", stu , score);
	}

}
