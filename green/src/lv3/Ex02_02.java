package lv3;

public class Ex02_02 {

	public static void main(String[] args) {
		/*
		 * 예)
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
		 * 문제 1)
		 * ###
		 * ###
		 * ###
		 */
		
		System.out.println("문제1");
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */
		
		System.out.println("문제2");
		for(int i = 3; i >= 1; i--) {
			for (int j = 1; j<=i; j ++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */
		
		System.out.println("문제3");
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
		 * 문제 4)
		 * 12345
		 *   #
		 *  ###
		 * #####
		 */
		
		System.out.println("문제4");
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
