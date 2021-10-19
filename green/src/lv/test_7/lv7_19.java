package lv.test_7;

class Products{
	String name;
	int price;
	Products(){
		name = "박스";
		price = 1000;
		System.out.println("기본생성자 ");
	}
	Products(String n , int p){
		name = n; price = p;
	}
	void printProduct() {
		System.out.println(name + " : " + price);
	}
}

public class lv7_19 {

		// 생성자 오버로딩 
		// 생성자도 메서드이기때문에 같은이름으로 여러개 만들수있다.
		// 단 다른 메서드 와 마찬가지로 전달되는 인자값을 서로 다르게 하면된다.
		public static void main(String[] args) {
			Products p = new Products(); // 이러면 기본생성자호출
			p.printProduct();
			Products p1 = new Products("빅박스" , 2000); // 메서드 오버로드 
			p1.printProduct();
		}
	}
