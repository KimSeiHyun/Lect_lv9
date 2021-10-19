import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Main2{

	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Scanner sc= new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int t = sc.nextInt();
		String arr[] = new String[t];
		int count = 0;
		int x = 0;
		for(int i=0; i<arr.length; i++) {
			int check = 0;
			String str = sc.next();
			for(int j=0; j<count; j++) {
				if(arr[j].equals(str)) {
					check = 1;
				}
			}
			if(check == 0 ) {

				arr[x] = str;
				count ++;
				x++;
			}
		}
		
		for(int i=0; i<count; i++) {
			for(int j=i; j<count; j++) {
				if(j != i && arr[i].length() == arr[j].length() &&
						arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
					
				if(j != i && arr[i].length() > arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(arr[i]);
		}
		
    }
	
}