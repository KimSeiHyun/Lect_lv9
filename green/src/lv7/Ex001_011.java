package lv7;

class Student4{
	String name;
	int score;
	void set(String name , int score) {
		this.name = name;
		this.score = score;
	}
	void print() {
		System.out.println(name + " : " + score);
	}

}

public class Ex001_011 {

	public static void main(String[] args) {
		String data = "3\n"; 
		data +="�迵��/30\n";
		data += "�̸���/40\n";
		data += "��ö��/60";
		
		
		System.out.println(data);

		Student4[] studentList;
		//����1)data�� �ִ� ������ �߶� st�� ������ ��� 
		String temp[] = data.split("\n");

		studentList = new Student4[temp.length-1];

		System.out.println("����1");
		for(int i=0; i<temp.length-1; i++) {
			studentList[i] = new Student4();
			String temp2[] = temp[i+1].split("/");
			studentList[i].name = temp2[0];
			studentList[i].score = Integer.parseInt(temp2[1]);
			studentList[i].print();
		}
		

		//����2)�õ� ������ �ٽ� data�� ����	
		System.out.println("����2");
		int min = 100;
		int idx = -1;
		for(int i=0; i<studentList.length; i++) {
			if(studentList[i].score < min) {
				min = studentList[i].score;
				idx = i;
			}
		}
		
		Student4 temp3[] = studentList;
		studentList = new Student4[temp3.length-1];
		for(int i=0; i<studentList.length; i++) {
			studentList[i] = new Student4();
		}
		
		data = studentList.length +"\n";
		
		int x =0;
		for(int i=0; i<temp3.length;i ++) {
			if(i != idx ) {
				studentList[x].set(temp3[i].name, temp3[i].score);
				data += studentList[x].name+"/";
				data += studentList[x].score+"";
				if(i != temp3.length-1) {
					data +="\n";
				}
				x++;
			}
		}
		
		System.out.println(data);
		
		
		
	}

}