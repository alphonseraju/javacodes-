package StudentClass;

public class bankBalance {
	public class Bank {
	    private String accountHolder;
	    private long accountNumber;
	    private double balance;

	    public Bank(String accountHolder, long accountNumber, double balance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public String getAccountHolder() {
	        return accountHolder;
	    }

	    public long getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    public void main(String[] args) {

	        Bank myAccount = new Bank("raju", 44858439, 6000.0);

	        System.out.println("Account Holder: " + myAccount.getAccountHolder());
	        System.out.println("Account Number: " + myAccount.getAccountNumber());
	        System.out.println("Balance: $" + myAccount.getBalance());

	   
	        myAccount.deposit(500.0);
	        myAccount.withdraw(200.0);

	       
	    }
	}

}
