package Section7;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String emailAddress;
	
	//Constructors
	public VipCustomer() {
		this("Default name",1000,"nh@gmail.com");
		System.out.println("Im inside the Defualt constructor");
	}
	public VipCustomer(String name, double creditLimit) {
		this(name,creditLimit,"Default email address from constructo with 2 param");
		
		System.out.println("Im inside the constructor with 2 param");
	}
	public VipCustomer(String name,double creditLimit, String emailAddress) {
		this.name=name;
		this.creditLimit=creditLimit;
		this.emailAddress=emailAddress;
		System.out.println("Im inside the constructor with 3 param");
	}
	//getters
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	
}
