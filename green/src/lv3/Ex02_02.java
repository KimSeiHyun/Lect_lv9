package lv3;

public class Ex02_02 {

	public static void main(String[] args) {
		/*
		 * ��)
		 * #
		 * ##
		 * ###
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * ���� 1)
		 * ###
		 * ###
		 * ###
		 */
		
		System.out.println("����1");
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		/*
		 * ���� 2)
		 * ###
		 * ##
		 * #
		 */
		
		System.out.println("����2");
		for(int i = 3; i >= 1; i--) {
			for (int j = 1; j<=i; j ++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * ���� 3)
		 * @##
		 * @@#
		 * @@@
		 */
		
		System.out.println("����3");
		for(int i=1; i<=3; i++) {
			for(int j =1; j<=i; j++) {
					System.out.print("@");

			}
			for(int k =3; k >i; k--) {
				System.out.print("#");
			}
			System.out.println();
		}
		

		/*
		 * 
		 * 
		 * ���� 4)
		 * 12345
		 *   #
		 *  ###
		 * #####
		 */
		
		System.out.println("����4");
		for(int i=1; i<=5; i++) {
			for(int j=3; j <=i; j++) {
				System.out.print("#");
			}
			for(int k =2; k >= i; k--) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
