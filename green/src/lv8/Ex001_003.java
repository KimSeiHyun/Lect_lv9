package lv8;

import java.util.Scanner;
import java.util.Vector;

class Tv {
	String name;
	String brand;
	int price;

	Tv(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public void print() {
		System.out.printf("%s %s %d\n",this.name , this.brand, this.price);
	}
	

}

	

public class Ex001_003 {

	public static void main(String[] args) {
		Vector<Tv> arr = new Vector<Tv>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			for(Tv e : arr) {
				e.print();
			}
			System.out.println("1.추가");
			System.out.println("2.삽입");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.수정");
			System.out.println("6.값조회(인덱스)");
			System.out.println("7.크기출력");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("추가할 티비 이름 입력 : ");
				String name = sc.next();
				System.out.print("추가할 브랜드 입력 : ");
				String brand = sc.next();
				System.out.print("추가할 가격 입력 : ");
				int price = sc.nextInt();
				Tv a = new Tv(name,brand,price);
				arr.add(a);
				
			}
			if(sel == 2) {
				if(arr.size() != 0) {
					System.out.print("삽입할 인덱스 입력 : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx <= arr.size()) {
						System.out.print("추가할 티비 이름 입력 : ");
						String name = sc.next();
						System.out.print("추가할 브랜드 입력 : ");
						String brand = sc.next();
						System.out.print("추가할 가격 입력 : ");
						int price = sc.nextInt();
						Tv a = new Tv(name,brand,price);
						arr.add(idx, a);
					}else System.out.println("인덱스 범위를 확인해주세요 ");
				}else System.out.println("데이터 추가를 먼저 해주세요 ");
			}
			if(sel == 3) {
				if(arr.size() != 0) {
					System.out.print("삭제할 인덱스 입력 : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx <= arr.size()) {
						arr.remove(idx);
					}else System.out.println("인덱스 범위를 확인해주세요.");
				}else System.out.println("삭제할 데이터가 없습니다 .");
			}
			if(sel == 4) {
				if(arr.size() != 0) {
					System.out.println("삭제할 데이터의 변수들을 입력해주세요 . ");
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("브랜드 입력 : ");
					String brand = sc.next();
					System.out.print("가격 입력 : ");
					int price = sc.nextInt();
					int idx = -1;
					for(int i=0; i<arr.size(); i++) {
						if(arr.get(i).name.equals(name) && arr.get(i).brand.equals(brand) 
								&& arr.get(i).price == price) {
									idx = i;
								}
					}
					if(idx != -1) {
//						Tv a = new Tv(name,brand,price); 
//						주소값을 비교하고있기 때문에 해당값들을 직접찾아서 주소를 이어받아야함 .  
						Tv a = arr.get(idx);
						arr.remove(a);
						
					}else System.out.println("일치하는 데이터가 없습니다.");
				}else System.out.println("삭제할 데이터가 없습니다.");
			}
			if(sel == 5) {
				if(arr.size() != 0) {
					System.out.print("수정할 인덱스 입력 : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx <arr.size()) {
						System.out.print("수정할 티비 이름 입력 : ");
						String name = sc.next();
						System.out.print("수정할 브랜드 입력 : ");
						String brand = sc.next();
						System.out.print("수정할 가격 입력 : ");
						int price = sc.nextInt();
						Tv a = new Tv(name,brand,price);
						arr.set(idx, a);
							
					}else System.out.println("인덱스 범위를 확인해주세요 .");
				}else System.out.println("수정할 데이터가 없습니다.");
			}
			if(sel == 6) {
				if(arr.size() != 0) {
					System.out.print("조회할 인덱스 입력 : ");
					int idx = sc.nextInt();
					if(idx >=0 &&  idx < arr.size()) {
						
							arr.get(idx).print();
							System.out.println();
					}else System.out.println("인덱스 범위를 확인해주세요 . ");
				}else System.out.println("데이터 추가를 먼저 해주세요 . ");
			}
			if(sel == 7) {
				System.out.println("크기 : " +arr.size());
			}
		}
	}

}
