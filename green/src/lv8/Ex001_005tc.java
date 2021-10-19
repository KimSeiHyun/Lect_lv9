package lv8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Student2{
	int number;
	String name;
	int age;
	
	
	public Student2(String name , int age) {
		this.name = name;
		this.age = age;
	}
	public Student2(int number , String name , int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}
	public String infoString() {
		return this.number + " " + this.name + " " + this.age +"\n";
		
	}
}
class Manager2{
	private String fileName = "studentManager.txt";
	File file = new File(fileName);
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	Random rn = new Random();
	private ArrayList<Student2> group = new ArrayList<>();
	
	public void addStudent(Student2 student) { // name, age ������ �ְ� , ���� �й��� ��ġ�� ���� ��ü�� �Ѿ�� ,
		// �й� ���� �ο� �� > Studnet ��ü�� ����� > group �� �߰� 
		student.number = randomNumber();
		group.add(student);
	}
	
	public Student2 getStudent(int number) {
		Student2 student = null;
		for(int i=0; i<this.group.size(); i++) {
			if(number == this.group.get(i).number) {
				student = this.group.get(i);
			}
		}
		return student;
	}
	private int randomNumber() {
		int key;
		// 1000~9999
		while(true) {
			key = rn.nextInt(8999) + 1000;
			int check = -1;
			for(int i=0; i<this.group.size(); i++) {
				if(this.group.get(i).number == key) {
					check = i;
				}
			}
			if(check == -1) {
				break;
			}
		}
		return key;
	}
	
	public void removeStudent(Student2 student) {
//		int idx = -1;
//		for(int i=0; i<this.group.size(); i++) {
//			if(this.group.get(i).number == student.number) {
//				
//			}
//		}
		this.group.remove(student);
	}
	
	public void sort() {
		for(int i=0; i<this.group.size(); i++) {
			String first = this.group.get(i).name;
			int idx = i;
			for(int j=i; j<this.group.size(); j++) {
				if(first.compareTo(this.group.get(j).name) > 0) {
					first = this.group.get(j).name;
					idx = j;
				}
			}
			
			Student2 temp = this.group.get(i);
			this.group.set(i, this.group.get(idx));
			this.group.set(idx, temp);
		}
	}
	@Override
	public String toString() {
		String str = "";
		for(int i=0; i<this.group.size(); i++) {
			str += this.group.get(i).infoString();
		}
		return str;
	}
	
	public void save() {
		String data = "";
		for(int i=0; i<this.group.size(); i++) {
			data += this.group.get(i).number +"/";
			data += this.group.get(i).name +"/";
			data += this.group.get(i).age;
			if(i <this.group.size() -1) {
				data += "\n";
			}
		}
		
		try {
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("����Ϸ�");
		} catch (Exception e) {
			System.out.println("�������");
		}
	}
	
	public void load() {
		save();
		this.group = new ArrayList<>();
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String data = br.readLine();
			while(data != null) {
				String info[] = data.split("/");
				
				int number = Integer.parseInt(info[0]);
				String name = info[1];
				int age = Integer.parseInt(info[2]);
				
				Student2 student = new Student2(number,name,age);
				this.group.add(student);
				
				data = br.readLine();
			}
			System.out.println("�ҷ����� �Ϸ� ");
		} catch (Exception e) {
			System.out.println("�ҷ����� ����");
		}
	}
	
}

public class Ex001_005tc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager2 manager = new Manager2();
		boolean run  = true;
		while(run) {
			System.out.println(manager.toString());
			System.out.println("1.���� 2.Ż�� 3.���� 4.��� 5.���� 6.�ε�");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				manager.addStudent(new Student2(name,age));
			}
			if(sel == 2) {
				System.out.println("Ż���� �й� �Է� : ");
				int number = sc.nextInt();
				manager.removeStudent(manager.getStudent(number));
			}
			if(sel == 3) {
				manager.sort();
			}
			if(sel == 4) {
				System.out.println(manager.toString());
			}
			if(sel == 5) {
				manager.save();
			}
			if(sel == 6) {
				manager.load();
			}
		}
	}
}