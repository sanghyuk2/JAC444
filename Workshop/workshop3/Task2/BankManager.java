package Task2;

import java.util.Scanner;

public class BankManager {
	private int bankNum;
	private double limitation;
	private Bank[] bank;
	
	public BankManager() {
		Scanner input = new Scanner(System.in);
		
		int bankNum;
		double limitation;
		boolean flag = true; //Initializing flag to true to get out of the loop by using this flag.
		
		do {
			System.out.print("Number of banks: ");
			if(input.hasNextInt()) {
				bankNum = input.nextInt();
				this.bankNum = bankNum;
				flag = false;

			}else {
				System.out.println("Enter integar number");
				input.next();
			}
		}while(flag);
		
		flag = true;
		
		do {
			System.out.print("Minimum asset limit: ");
			if(input.hasNextDouble()) {
				limitation = input.nextDouble();
				this.limitation = limitation;
				flag = false;

			}else {
				System.out.println("Enter number");
				input.next();
			}
		}while(flag);
		

		bank = new Bank[this.bankNum]; //assign the memory to the variable bank with the size of the bankNum that the user input.
		
		for(int i = 0; i < this.bankNum; i++) {
			bank[i] = new Bank(i);
		}
		
		for(int i = 0; i < this.bankNum; i++) {
			System.out.println("Bank#" + i);
			bank[i].setBankLoan();
		}
	}
	
	public void isSafe() {
		for(int i = 0; i < bankNum; i++) {
			if(this.limitation > bank[i].getAmount() + bank[i].getBalance()) {
				bank[i].setIsSafe(false);
			}
		}
	}
	
	public void safeValidate() { //Validate whether the banks are safe or not.
		for(int i = 0; i < this.bankNum; i++) {
			if(!bank[i].getIsSafe()) {
				for(int j = 0; j < this.bankNum; j++) {
					for(int k = 0; k < bank[j].getBankLoanNum(); k++) {
						if(bank[j].getBankLoan(k).getLoanBankId() == i) {
							bank[j].setAmount((bank[j].getBankLoan(k).getLoanBankAmount()) * (-1));
							bank[j].getBankLoan(k).resetLoanBankAmount();
						}
					}
				}
			}
		}
	}
	
	public void safeResultPrint() { 
		int count = 0;
		this.isSafe();
		this.safeValidate();
		
		
		for(int i = 0; i < this.bankNum; i++) {
			if(!bank[i].getIsSafe()) {
				count++;
			}
		}
		
		if(count > 0) {
			System.out.print("Unsafe banks are Bank ");
			
			for(int i = 0; i < this.bankNum; i++) {
				if(!bank[i].getIsSafe()) { //Find the unsafe banks among the banks
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public void bankLoanCheck() {
		for(int i = 0; i < this.bankNum; i++) {
			System.out.println("Bank#" + i);
			for(int j = 0; j < this.bank[i].getBankLoanNum(); j++) {
				System.out.println("BankLoanId" + this.bank[i].bankLoan[j].getLoanBankId() + "\nAmount: " + this.bank[i].bankLoan[j].getLoanBankAmount());
				System.out.println("Total Amount: " + this.bank[i].total);
			}
		}
	}
	
}