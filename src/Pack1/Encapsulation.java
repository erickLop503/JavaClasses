package Pack1;

public abstract class Encapsulation {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.setAcc_No(756050400);
		obj.setName("Sumair");
		obj.setEmail("sumair@syntaxsolutions.com");
		obj.setAmount(500000.0);
		
		System.out.println(obj.getAcc_No()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
	}
}

class B{
	
	private long acc_no;  
	private String name,email;  
	private double amount;  
	
	public void setAcc_No(long acc_no) {
		this.acc_no=acc_no;
	}
	
	public long  getAcc_No() {
		
		return acc_no;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public double getAmount() {
		return amount;
	}
}
