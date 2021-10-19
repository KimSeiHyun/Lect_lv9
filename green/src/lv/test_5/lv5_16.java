package lv.test_5;

public class lv5_16 {

	public static void main(String[] args) {
		// ���̺�� ������ �ε��ؿ��� 
		
		// 1) fr = new FileReader(fileName); 
		// 	  	(1) ����� ������ �о�´�.
		// 2) br = new BufferedReader(fr);   
		// 	    (1) fr �ΰ����������� char[] �ΰ����´�.
		//      (2) char[]�� ������ �����ϱ⋚���� 
		//      (3) String ���� �����͸� �����ü��ִ� br�� �̿��Ѵ�.
		// 3) String data = br.readLine();	
		//      (1) br.readLine(); �� �̿��ؼ� String ���� �����͸� �����´�.
		
		// 4) fr.close(); // �ݵ�� �ݾƾߵȴ�.
		// 5) br.close(); // �ݵ�� �ݾƾߵȴ�.
		
		String fileName = "ex01.txt";
			
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String data = br.readLine();			// �� �� �о����
			System.out.println(data);  // �����Ͱ� ��µȴ�. 
			fr.close();
            br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}