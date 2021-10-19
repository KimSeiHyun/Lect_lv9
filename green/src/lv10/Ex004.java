package lv10;

import java.util.ArrayList;
import java.util.Scanner;

// 상속 -> 다형성
// 상속한 부모를 통해 다양한 class를 정의할 수 있는 것 . 

// Man
// ㄴ 자식
// ㄴ 아빠
// ㄴ 직원
// ㄴ 사장

// 사장
// >> 커피숍사장
// >> 치킨집사장
// >> 편의점사장

// 그림판 예제
// : 그리기(모양)
//	 ㄴ 점
//   ㄴ 선
//   ㄴ 사각형
//   ㄴ 원
//   ㄴ 세모

abstract class Shape {
	Scanner sc = new Scanner(System.in);
	int x,y;
	
	public void move() {}
	public abstract void draw();
}

// Shape를 활용해서 그리기 툴을 이하에 만들어보기 . 

class Dot extends Shape {
	@Override
	public void draw() {
		System.out.println(".");
	}
	@Override
	public String toString() {
		return "점 찍기";
	}
}

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("ㅡ");
	}
	@Override
	public String toString() {
		return "선 그리기";
	}
}

class Squre extends Shape {

	@Override
	public void draw() {
		System.out.println("■");
	}
	@Override
	public String toString() {
		return "사각형 그리기";
	}
	
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("●");
	}
	@Override
	public String toString() {
		return "원 그리기";
	}
}

class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("△");
	}
	@Override
	public String toString() {
		return "세모 그리기";
	}
	
}
public class Ex004 {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		list.add(new Dot());
		list.add(new Line());
		list.add(new Squre());
		list.add(new Circle());
		list.add(new Triangle());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1 +")" + list.get(i));
		}
		
		System.out.print("메뉴 : ");
		int sel = sc.nextInt()-1;
		
		list.get(sel).draw();
	}

}
