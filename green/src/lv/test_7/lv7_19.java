package lv.test_7;

class Products{
	String name;
	int price;
	Products(){
		name = "�ڽ�";
		price = 1000;
		System.out.println("�⺻������ ");
	}
	Products(String n , int p){
		name = n; price = p;
	}
	void printProduct() {
		System.out.println(name + " : " + price);
	}
}

public class lv7_19 {

		// ������ �����ε� 
		// �����ڵ� �޼����̱⶧���� �����̸����� ������ ������ִ�.
		// �� �ٸ� �޼��� �� ���������� ���޵Ǵ� ���ڰ��� ���� �ٸ��� �ϸ�ȴ�.
		public static void main(String[] args) {
			Products p = new Products(); // �̷��� �⺻������ȣ��
			p.printProduct();
			Products p1 = new Products("��ڽ�" , 2000); // �޼��� �����ε� 
			p1.printProduct();
		}
	}
