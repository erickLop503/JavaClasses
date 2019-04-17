package com.class24;

public class Class1 {

	//3. Create 1 class with a private method that has 3 overloaded forms. 
	 //  Then call each overloaded method with specific arguments and observe result.

	private void barca(short num) {
		System.out.println(num);
	}

    private void barca(String str) {
		System.out.println(str);
	}

    private void barca(int num) {
	System.out.println(num);
}


    public static void main(String[] args) {
		
    	Class1 obj = new Class1();
    	obj.barca(3);
    	obj.barca("Messi");
    	obj.barca(0);
	}


}
