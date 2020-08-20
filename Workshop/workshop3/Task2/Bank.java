package Task2;
import java.util.Scanner;

public class Bank{
	private int id;
	private int NOBankLoan;
	private double balance;
	private boolean isSafe;
	public BankLoan[] bankLoan;
	public double total;
	
	public Bank(){
		this.id = 0;
		this.NOBankLoan = 0;
		this.total = 0;
		this.balance = 0;
		this.isSafe = true;
	}
	
	public Bank(int bankId){
		Scanner input = new Scanner(System.in);
		
		this.total = 0;
		this.isSafe = true; //Initializing isSafe method which is belong to current object as true.
		this.id = bankId;
		double balance; 
		boolean flag = true;
		
		do {
			System.out.print("Balance: ");
			if(input.hasNextDouble()) {
				balance = input.nextDouble();
				this.balance = balance; //Initializing balance that the user type into the current object's balance.
				flag = false;

			}else {
				System.out.println("Enter integar number");
				input.next();
			}
		}while(flag);
	}
	
	public void setBankLoan() {
		Scanner input = new Scanner(System.in);
		int bankLoanNum;
		boolean flag = true;
		
		do {
			System.out.print("Number of banks Loaned: ");
			if(input.hasNextInt()) {
				bankLoanNum = input.nextInt();
				this.NOBankLoan = bankLoanNum; //Initializing number of banks loaned to the current object's variable.
				flag = false;
			}else {
				System.out.println("Enter integar number");
				input.next();
			}
		}while(flag);
		
		bankLoan = new BankLoan[this.NOBankLoan]; //Based on the value that the user typed, assign the memory by using new operator to the variable bankLoan.
		//new operator returns the address of the first element of the array.
		for(int i = 0; i < this.NOBankLoan; i++) {
			int loanBankId;
			double bankAmount;
			System.out.print("Bank ID: ");
			loanBankId = input.nextInt();
			bankLoan[i] = new BankLoan(loanBankId);
			
			this.total += bankLoan[i].getLoanBankAmount();
		}
	}
	
	public void setAmount(double amount) {
		this.total += amount;
	}
	
	public void setIsSafe(boolean isSafe) {
		this.isSafe = isSafe; //Check If the current object(bank) is safe.
	}
	
	public double getAmount() {
		return this.total;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getBankLoanNum() {
		return this.NOBankLoan;
	}
	
	public BankLoan getBankLoan(int loanId) {
		return bankLoan[loanId];
	}
	
	public boolean getIsSafe() {
		return this.isSafe;
	}
	
}
	