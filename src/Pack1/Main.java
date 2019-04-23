package Pack1;

public class Main {

	public static void main(String[] args) {

		
		Child obj = new Child();
		obj.m1(0, 0);
	}

	 int a=10;
	 int b=20;

}

class Child extends Main{

	int a=30;
	int b=40;
	
	void m1(int a, int b) {
		this. a=a;
		this. b=b;
	}
}
