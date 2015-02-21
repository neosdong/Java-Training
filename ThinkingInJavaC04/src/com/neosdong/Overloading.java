package com.neosdong;




public class Overloading {

	
	public Overloading() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Tree();
		for (int i = 0; i < 10; i++) {
			new Tree(i);
		}
	}

}

class Tree{
	int height;
	public Tree(){
		prtln("This is a seek");
	}
	
	public Tree(int height){
		prtln("This is a "+height+" m tree");
	}
	
	private void prtln(String str){
		System.out.println(str);
	}
}
