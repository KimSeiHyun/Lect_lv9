package lv.test_3;

public class lv3_27 {

	public static void main(String[] args) {
		/*
		 * ���� 1)
		 * #
		 * ##
		 * ###
		 */
		System.out.println("����1");
		for(int i=3; i>0; i--) {
			for(int j=i-1; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}


		/*
		 * ���� 2)
		 * ###
		 * ##
		 * #
		 */
		
		System.out.println("����2");
		for(int i=0; i<3; i++) {
			for(int j=i; j<3; j++) {
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
		for(int i=3; i>0; i--) {
			for(int j=i-1; j<3; j++) {
				System.out.print("@");
			}
			for(int k =i-1; k>0; k--) {
				System.out.print("#");
			}
			System.out.println();
		}
		/*
		 * ���� 4)
		 *   #
		 *  ###
		 * #####
		 */
		int x =0;
		System.out.println("����4");
		for(int i=0; i<3 ; i++) {
			for(int j=2; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<x+1; j++) {
				System.out.print("#");
			}
			x+=2;
			System.out.println();
		}
		
		
		
	}

}
