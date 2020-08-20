package Task2;
import java.util.Scanner;

public class BankLoan{
	private int loanBankId;
	private double loanBankAmount;
	
	public BankLoan(int bankId) {
		Scanner input = new Scanner(System.in);
		
		double bankAmount;
		this.loanBankId = bankId; //Initializing the bankID to the current object's loanBankId
		boolean flag = true; //Initializing boolean flag to true to use this flag as an escape variable in the loop.
		
		do {
			System.out.print("Amount: ");
			if(input.hasNextDouble()) {
				bankAmount = input.nextDouble();
				this.loanBankAmount = bankAmount;
				flag = false; //To escape the do...while loop, set the flag to false.
				
			}else {
				System.out.println("Please enter integar number");
				input.next();
			}
		}while(flag);
		
	}
	
	public void setLoanBankAmount(double balance) {
		this.loanBankAmount = balance; 
	}
	
	public int getLoanBankId() {
		return this.loanBankId;
	}
	
	public double getLoanBankAmount() {
		return this.loanBankAmount;
	}
	
	public void resetLoanBankAmount() {
		loanBankAmount = 0;
	}
}