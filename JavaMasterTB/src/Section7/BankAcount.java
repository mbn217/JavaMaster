package Section7;

public class BankAcount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	//+++++++++++++Gertters and Setters+++++++++++
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//++++++++++++++++++++++++++++++++++++++++++
	
	
	public void deposit(double amount) {
		balance +=amount;
	}
	public void withdraw(double amount) {
		if (balance-amount <=0) {
			System.out.println("Only "+balance + " avaiable . Withdrawal not processed");
		}
		balance -=amount;
	}
	
	
	
	
}
