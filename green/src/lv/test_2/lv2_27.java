package lv.test_2;

public class lv2_27 {

	public static void main(String[] args) {
		//		#���� 1) ��Ʈ���� ���̸� 3���� ��� 1500���� �Ǵٰ� �Ѵ�
		//	# ���̰� 14�� �ʿ��ϴ�. ���� ���ʿ��Ѱ�(���̴� �������θ� �Ǵ�)
		//	/*
		//	   ��Ʈ : 3�ǹ���� �ƴϸ� �ɶ����� ������Ų��. 
		//	    while(���� % 3  != 0){
		//	       ���� += 1;
		//	   }
		//
		//	*/
		System.out.println("����1 ");
		int x = 3;
		int y = 1;
		while(x <=14) {
			y++;
			x+=3;
		}
		System.out.println("���� 14���� ����� ���� " + y*1500 +"�� �ʿ��ϴ�.");
		
		//	# ���� 2) �μ��� �� �л��� 26���Դϴ�
		//	# �μ��׹� �л��鿡�� ��ȭ���� 2 �徿 ������ �ַ����մϴ�.
		//	# ��ȭ���� 10�坼 �������θ� �Ǹ��ϰ� 10�忡 1200���Դϴ�.
		//	# �Ѿ󸶰� �ʿ��Ѱ���?
		System.out.println("����2");
		x = 10;
		y = 26;
		while(x<52) {
			x+= 10;
		}
		System.out.println("��ȭ���� �����ϴµ� �� �ʿ��� �ݾ��� " + x/10*1200 + "��");
		//	#����3) ���Կ��� 24600�� ¥�� ��������ϴ�.
		//	# 1000��¥�� ����θ� �ʰ��� ���ٸ� ������ �ʿ��Ѱ���?
		x = 1000;
		int cnt = 1;
		while (x < 24600) {
			cnt ++;
			x +=1000;
		}
		System.out.println("����3");
		System.out.println("1000¥���� �� "+cnt +"�� �ʿ��ϴ�.");
		
		//	# ����1 )  ����� 3�� ���Ͽ����� 6.12 ���Ǿ����ϴ�. �̼��� 4�� ������ ��? 
		//            (�ݺ����� Ȱ���� ����ȭ -> ���� �� �ǵ��� ����)
		System.out.println("����1");
		double a1 = 0;
		while (a1*300 <= 612) {
			
			a1+=0.01;
		}
		double a2 = (a1*100)/4;
		int a3 = (int)a2;
		System.out.println(a3*0.01);
		//	# ����2) �����̰� 1�ð� 20�е��� ������ ������� ���� ���� ���԰� 9 Ű���̴�
		//	# 3�е��� �������� ��Ű���ΰ� ?
		double temp1 = 9;
		double temp2 = 80;
		double avr = temp1/temp2;
		double a = 0;
		double temp = 0;
		while(a <3) {
			temp += avr; 
			a++;
		}
		System.out.println("����2 ");
		System.out.println(avr);
		System.out.println("3�е��� ���� ���� : " + temp);
		
		
		//	# ����3) ���Կ� ������ 250���� �ִ� ���߿� ������ 84�ۼ�Ʈ�� �ȷȰ� �������� ���Ŀ� ���ȷȴ�
		//	# ������ �ȸ����� - ���Ŀ� �ȸ������� ���ΰ�
		System.out.println("����3");
		double total = 250;
		double m = total*0.84;
		double e = 0;
		while(e < m) {
			e++;
		}
		System.out.println("������ �ȸ� ���� : " +m);
		System.out.println("���Ŀ� �ȸ� ���� : "+(total-m));
		System.out.println("���� - ���� : " + (m-(total-m)));
		
		//	# ����4) ������ÿ� ��ü �α��� 400000 ���ε� ���̰� 19�� ���� �α��� 35�ۼ�Ʈ
		//	#  40�� �̻��α��� 25�ۼ�Ʈ�϶�
		//	# 19�������α� - 40���̻��α� ���� ���Ͻÿ�
		System.out.println("����4");
		double l = 400000*0.35;
		double h = 400000*0.25;
		double p1 = 0;
		double p2 = 0;
		while (p1 < l) {
			p1++;
		}
		while(p2<h) {
			p2++;
		}
		System.out.println("19�������α� - 40�� �����α� : " +(p1-p2));
		
		
		
	}

}