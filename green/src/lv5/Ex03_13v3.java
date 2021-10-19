package lv5;

import java.util.Scanner;

public class Ex03_13v3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int map[][] = {
				{0,0,0,0,0},
				{0,0,4,4,0},
				{0,4,9,9,4},
				{0,0,0,4,0},
				{0,0,0,0,0}
		};
		int bombs[][] = new int[5][5]; // {y,x}
		bombs[0][0] = 2;
		bombs[0][1] = 2;
		bombs[1][0] = 2;
		bombs[1][1] = 3;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(map[i][j] == 9) {
					System.out.print("¡Ü ");
				}
				else if(map[i][j] == 4) {
					System.out.print("¡Ú ");
				}
				else {
					System.out.print("+ ");
				}
			}
			System.out.println();
		}
		System.out.println("ÆøÆÄ(5): ");
		int btn = sc.nextInt();
		if(btn == 5) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(map[i][j] == 9) {
						map[i][j] = 0;
						int a = i;
						int b = j;
						for(int k=-1; k<=1; k++) {
							
						}
						if(map[i][j+1] == 9) {
							map[i][j+2] = 0;
							map[i+1][j+1] = 0;
							map[i-1][j+1] = 0;
						}
						if(map[i][j-1] == 9) {
							map[i][j-2] = 0;
							map[i+1][j-1] = 0;
							map[i-1][j-1] = 0;
						}
						if(map[i+1][j] == 9) {
							map[i+2][j]= 0;
							map[i+1][j+1] = 0;
							map[i+1][j-1] = 0;
						}
						if(map[i-1][j] == 9) {
							map[i-2][j]= 0;
							map[i-1][j+1] = 0;
							map[i-1][j-1] = 0;
						}
						map[i][j+1] = 0;
						map[i][j-1] = 0;
						map[i+1][j] = 0;
						map[i-1][j] = 0;
					}
				}

			}
			System.out.println("BOMB!");
		}
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(map[i][j] == 9) {
					System.out.print("¡Ü ");
				}
				else if(map[i][j] == 4) {
					System.out.print("¡Ú ");
				}
				else {
					System.out.print("+ ");
				}
			}
			System.out.println();
		}
	}
}