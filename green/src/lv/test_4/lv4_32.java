package lv.test_4;

import java.util.ArrayList;
import java.util.Arrays;

public class lv4_32 {

	public static void main(String[] args) {
		/*
		 * # ���� ���
		 * . ���� ������ �̸� ���
		 */
		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		int max = 100;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i != j && score[i]  > score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
					
					String temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(name[i] + "\t");
		}System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(score[i] + "\t");
		}
	}

}
