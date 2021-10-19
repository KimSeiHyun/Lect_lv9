package lv.test_7;

class Test{
	private int num;
	private int size;
	private  char[] data;
	public void print() {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	public Test(int num , int size, char data[]) {
		this.num = num;
		this.size = size;
		this.data = data;
	}
	
	public int getNum() {
		return this.num;
	}
	public int getSize() {
		return this.size;
	}
	
	public String getData() {
		String str = "";
		for(int i=0; i<this.data.length; i++) {
			str += this.data[i]+"/";
		}
		return str;
	}
	

}

public class lv7_16 {

	public static void main(String[] args) {
		String data ="6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);	

		Test[] t;	
        // data의 정보를 클래스배열에 저장.
		String temp[] = data.split("\n");
		t = new Test[temp.length-1];
		for(int i=0; i<t.length; i++) {
			String temp2[] = temp[i+1].split("/");
			char temp3[] = new char[temp2.length-2];
			for(int j=0; j<temp3.length; j++) {
				char a = temp2[j+2].charAt(0);
				temp3[j] = a;
			//	System.out.println(temp3[j]);
			}
		//	System.out.println(temp[0]);
		//	System.out.println(temp[1]);
			t[i] = new Test(Integer.parseInt(temp2[0]),Integer.parseInt(temp2[1]),temp3);
		}
		System.out.println();
		
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i].getNum()+"/"+t[i].getSize()+"/"+t[i].getData());
		}
	}

}