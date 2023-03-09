package practise_Java;

public class methodBank {
	static int currentBal = 1000; 
	
	public static void greetCustomer() 	{
		System.out.println("Hello, Welcome to the banking application");
	}
	
	public void deposit(int amt)	{
		currentBal = currentBal+amt;
		System.out.println("Amount is deposited successfully..");
	}
	
	public static void withDrawl(int amt) 
	{
		currentBal = currentBal-amt;

		System.out.println("withdraw is successful, please check your cash and cards before leaving the bank");
		
	}
	
	public int getCurrentBalance() 
	{
		return currentBal;
	}
	
	public static void main(String[] args) {
		
		greetCustomer();
		methodBank bank = new methodBank();
		System.out.println("Current balance: "+currentBal);
		bank.deposit(500);
		System.out.println("Current balance: "+currentBal);
		bank.getCurrentBalance();
		withDrawl(100);
		bank.getCurrentBalance();
		System.out.println("Current balance: "+currentBal);

	}

}
