package AtmMachine;
import java.util.Scanner;
class BankAccount
{
	private double balance;
	
	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited:" + amount);
	}
	public boolean withdraw(double amount)
	{
		if(balance >= amount)
		{
			balance -= amount;
			System.out.println("withdraw:"+amount);
			return true;
			
		}else
		{
			System.out.println("insufficiant balance");
			return false;
		}
	}
	
}
public class ATM 
{
    private BankAccount bankAccount;
    private Scanner sc;
    public ATM(BankAccount account)
    {
    	this.bankAccount = account;
    	this .sc = new Scanner(System.in);
    }
    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void start()
    {
    	int ch = 0;
    	while(ch!=4)
    	{
    		displayMenu();
    		System.out.print("Enter your choice:");
    		ch=sc.nextInt();
    		
    		switch(ch) 
    		{
    		case 1 : 
    			checkBalance();
    			break;
    		case 2 :
    			deposit();
    		case 3 :
                 withdraw();
                 break;	
    		case 4 :
    			System.out.println("Exit the transaction");
    			break;
    		default:
    			System.out.println("Invalid choice .Pleasse try Again");
    			break;
    		}
    	}
    }
    private void checkBalance()
    {
    	double balance = bankAccount.getBalance();
    	System.out.println("Your balnce is:"+balance);
    	
    }
    private void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        bankAccount.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        boolean success = bankAccount.withdraw(amount);
        if (success) {
            System.out.println("Please take your cash.");
        }
    }
   
    
    public static void main(String[] args)
    {
    	BankAccount b = new BankAccount(500);
    	ATM a = new ATM(b);
    	a.start();
    }

}
