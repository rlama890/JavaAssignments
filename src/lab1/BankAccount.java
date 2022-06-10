package lab1;

public class BankAccount {
	private static long acctnumber = 500; 
	private String name; 
	private double balance; 
	
	public BankAccount(String name) {
		acctnumber++; 
		this.name = name; 
		this.balance = 0; 
	}
	
	public BankAccount(String name, double balance) {
		acctnumber++; 
		this.name = name;
		this.balance = balance; 
	}
		
	public void withdraw(double amount) {
		double newBalance = balance - amount; 
		balance = newBalance; 
		displayInfo(acctnumber, name, balance);
		
	}
	
	public void withdraw(double amount, double fee) {
		double newBalance = balance - amount - fee; 
		balance = newBalance; 
		displayInfo(acctnumber, name, balance);
		
	}
	
	public void deposit(double dep) {
		double newBalance = balance + dep; 
		balance = newBalance; 
		displayInfo(acctnumber, name, balance);
		
	}
	
	public void deposit(double dep, double interest) {
		double newBalance = balance + dep + interest; 
		balance = newBalance; 
		displayInfo(acctnumber, name, balance);
		
	}
		
	private void displayInfo(long a, String n, double b) {
		System.out.println("The Account number is: " + a);
		System.out.println("The Name is: " + n);
		System.out.println("The Balance is: " + b);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Deposit Summary");
		BankAccount bacct = new BankAccount("Ram", 3000);
		bacct.deposit(5);
		System.out.println("==============================");
		System.out.println("Deposit with fee Summary");
		BankAccount bacct1 = new BankAccount("Gopal", 1500);
		bacct1.deposit(15, 5);
		System.out.println("==============================");
		System.out.println("Withdraw Summary");
		BankAccount bacct2 = new BankAccount("Shyam", 2000);
		bacct2.deposit(8);
		System.out.println("==============================");
		System.out.println("Withdraw with fee Summary");
		BankAccount bacct3 = new BankAccount("Shyam", 2000);
		bacct3.deposit(10, 8);
		System.out.println("==============================");
		System.out.println("Withdraw with fee Summary");
		BankAccount bacct4 = new BankAccount("Bal");
		bacct4.deposit(10, 8);
		System.out.println("==============================");
		System.out.println("Withdraw Summary");
		BankAccount bacct5 = new BankAccount("sall");
		bacct5.deposit(10);
		System.out.println("==============================");
		System.out.println("Deposit Summary");
		BankAccount bacct6 = new BankAccount("deed");
		bacct6.deposit(12);
		System.out.println("==============================");
		System.out.println("Deposit Summary");
		BankAccount bacct7 = new BankAccount("Sara");
		bacct7.deposit(20);
		System.out.println("==============================");
		
		
	}
}
