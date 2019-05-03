package Pack1;

public interface MyInterface {

	public static void main(String[] args) {
		Mai o=new Mai();
		o.m1();
		o.m2();
	}
	
	void m1();
	void m2();
}

class Mai implements MyInterface{

	@Override
	public void m1() {

		System.out.println("implementation of method1");
	}

	@Override
	public void m2() {
		System.out.println("implementation of method2");
		
	}
	
	
}