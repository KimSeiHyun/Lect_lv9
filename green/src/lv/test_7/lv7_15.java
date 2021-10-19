package lv.test_7;

class Students3{
	private String name;
	private int score;
	
	public Students3 (String name , int score) {
		this.name = name;
		this.score = score;
	}
	public void print() {
		System.out.println(name + " : " + score);
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setScore ( int score ) {
		this.score = score;
	}
	

}

public class lv7_15 {

	public static void main(String[] args) {
		String data = "3\n"; 
		data +="김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		
		
		System.out.println(data);

		Students3[] arr;
		
		//문제1)data에 있는 내용을 잘라서 studentList에 저장후 출력 
		String temp[] = data.split("\n");
		arr = new Students3[temp.length-1];
		for(int i=0; i<arr.length; i++) {
			String temp2[] = temp[i+1].split("/");
			arr[i] = new Students3(temp2[0],Integer.parseInt(temp2[1]));
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getScore());
		}
		//문제2)꼴등 삭제후 다시 data에 저장	
		data = "";
		int min = 100;
		int idx = -1;
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i].getScore() < min) {
				min = arr[i].getScore();
				idx = i;
			}
		}
		int x = arr.length-1;
		data = x+"\n";
		for(int i=0; i<arr.length; i++) {
			if(i != idx) {
				data += arr[i].getName()+"/";
				data += arr[i].getScore()+"\n";
			}
		}
		System.out.println(data);
	}

}