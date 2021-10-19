package lv8.test;

import java.util.ArrayList;
import java.util.Scanner;

// 시작 09:23
// 종료 10:56
// 소요 01:33

class Tetris{
    private ArrayList<ArrayList<Integer>> map = new ArrayList<>(); // 래퍼클래스 사용

    Scanner sc = new Scanner(System.in);
    public Tetris(String map, String block){

    	String temp[] = map.split("\n");
    	for(int i=0; i<temp.length; i++) {
    		String temp2[] = temp[i].split(",");
    		ArrayList<Integer> arr = new ArrayList<>();
    		for(int j=0; j<temp2.length; j++) {
    			arr.add(Integer.parseInt(temp2[j]));
    		}
    		this.map.add(arr);
    	}
    	
    	temp = block.split("\n");
    	for(int i=0; i<3; i++) {
    		String temp2[] = temp[i].split(",");
    		for(int j=0; j<3; j++) {
    			this.map.get(i).set(j, Integer.parseInt(temp2[j]));
    		}
    	}
    }

    
    
    public void print() {
    	for(int i=0; i<this.map.size(); i++) {
    		for(int j=0; j<this.map.get(i).size(); j++) {
    			System.out.print(this.map.get(i).get(j) + " ");
    		}System.out.println();
    	}System.out.println();
    }
    
    
    public void moveUp() {
    	int check = 0;
    	for(int i=0; i<this.map.get(0).size(); i++) {
    			if(this.map.get(0).get(i) == 2) {
    				check = 1;
    			}
    	}
    	int check2 = 0;
		for(int i=1; i<this.map.size(); i++) {
			for(int j=0; j<this.map.get(i).size(); j++) {
				if(this.map.get(i).get(j) == 2 && this.map.get(i-1).get(j) == 1) check2 = 1;
			}
		}
    	if(check == 0 && check2 == 0) {
    		for(int i=0; i<this.map.size(); i++) {
    			for(int j=0; j<this.map.get(i).size(); j++) {
    				if(this.map.get(i).get(j) == 2) {
    					this.map.get(i).set(j, 0);
    					this.map.get(i-1).set(j, 2);
    				}
    			}
    		}
    	}
    }
    public void moveDown() {
    	int check = 0;
    	for(int i=0; i<this.map.get(this.map.size()-1).size(); i++) {
    		if(this.map.get(this.map.size()-1).get(i) == 2) check = 1;
    	}
    	int check2 = 0;
		for(int i=0; i<this.map.size()-1; i++) {
			for(int j=0; j<this.map.get(i).size(); j++) {
				if(this.map.get(i).get(j) == 2 && this.map.get(i+1).get(j) == 1) check2 = 1;
			}
		}
    	if(check == 0 && check2 == 0) {
    		for(int i=this.map.size()-1; i>=0 ; i--) {
    			for(int j=this.map.get(i).size()-1; j>=0; j--) {
    				if(this.map.get(i).get(j) == 2) {
    					this.map.get(i).set(j, 0);
    					this.map.get(i+1).set(j, 2);
    				}
    			}
    		}
    	}
    }
    public void moveLeft() {
    	int check = 0;
    	for(int i=0; i<this.map.size(); i++) {
    		if(this.map.get(i).get(0) == 2) check = 1;
    	}
    	int check2 = 0;
		for(int i=0; i<this.map.size(); i++) {
			for(int j=1; j<this.map.get(i).size(); j++) {
				if(this.map.get(i).get(j) == 2 && this.map.get(i).get(j-1) == 1) check2 = 1;
			}
		}
    	if(check == 0 && check2 == 0) {
    		for(int i=0; i<this.map.size(); i++) {
    			for(int j=0; j<this.map.get(i).size(); j++) {
    				if(this.map.get(i).get(j) == 2) {
    					this.map.get(i).set(j, 0);
    					this.map.get(i).set(j-1, 2);
    				}
    			}
    		}
    	}
    }
    public void moveRight() {
    	int check = 0;
    	for(int i=0; i<this.map.get(this.map.size()-1).size(); i++) {
    		if(this.map.get(i).get(this.map.size()-1) == 2) check = 1;
    	}
    	int check2 = 0;
		for(int i=0; i<this.map.size(); i++) {
			for(int j=0; j<this.map.get(i).size()-1; j++) {
				if(this.map.get(i).get(j) == 2 && this.map.get(i).get(j+1) == 1) check2 = 1;
			}
		}
    	if(check == 0 && check2 == 0) {
    		for(int i=this.map.size()-1; i>=0 ; i--) {
    			for(int j=this.map.get(i).size()-1; j>=0; j--) {
    				if(this.map.get(i).get(j) == 2) {
    					this.map.get(i).set(j, 0);
    					this.map.get(i).set(j+1, 2);
    				}
    			}
    		}
    	}
    }
    
    public void run() {
		while(true) {
			print();
			System.out.println("8)상    2)하    4)좌    6)우");
			int sel  =sc.nextInt();
			if(sel == 8) {
				moveUp();
			}
			if(sel == 2) {
				moveDown();
			}
			if(sel == 4) {
				moveLeft();
			}
			if(sel == 6) {
				moveRight();
			}
		}
    }
}

public class test001 {

	public static void main(String[] args) {

		
		
		String data ="";
		data += "2,0,0,0,0,1,0,0,0,0\n";
		data += "2,0,0,0,0,1,0,0,0,0\n";
		data += "2,2,2,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		
		System.out.println(data);
		
//		String block = "";
//		block += "2,0,0\n";
//		block += "2,0,0\n";
//		block += "2,2,2\n";
		
		String block = "";
		block += "2,2,2\n";
		block += "2,0,2\n";
		block += "2,2,2\n";
		
		System.out.println(block);
		Tetris t = new Tetris(data,block);
		
		// 문제   ==> "1)상  2)하 3)좌 4)우" 를 입력할때마다 해당방향으로 블록전체이동 
		// 조건) ==> 1은 지나갈수없다. 
		
		/*
		    "2,0,0,0,0,1,0,0,0,0\n";
			"2,0,0,0,0,1,0,0,0,0\n";
			"2,2,2,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
		 */
		
		
		t.run();
	}
}