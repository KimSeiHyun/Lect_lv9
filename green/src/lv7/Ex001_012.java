package lv7;

class Test{
	int num;
	int size;
	char[] data;

	void set(int x) {
		data = new char[x];
	}

	void print() {
		System.out.println("num : " + num);
		System.out.println("size : " + size);
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}

public class Ex001_012 {

	public static void main(String[] args) {
		String data ="6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);	
		// data의 정보를 클래스배열에 저장.

		Test[] t;	

		String temp[] = data.split("\n");

		t = new Test[temp.length-1];

		for(int i=0; i<t.length; i++) {
			t[i] = new Test();
			String temp2[] = temp[i+1].split("/");
			t[i].num = Integer.parseInt(temp2[0]);
			t[i].size = Integer.parseInt(temp2[1]);
			t[i].set(temp2.length-2);
			int x = 0;
			for(int j=2; j<temp2.length; j++) {
				String y = temp2[j];
				t[i].data[x] = y.charAt(0);
				x++;
			}
		}
		
		for(int i=0; i<t.length; i++) {
			t[i].print();
			System.out.println();
		}
		

	}

}