/**********************************************

Workshop #1

Course:JAC444 - Semester 4

Last Name:Sanghyuk

First Name:Lee

ID:129405171

Section:A

This assignment represents my own work in accordance with Seneca Academic Policy.

Signature ÀÌ»óÇõ

Date:2019-01-18

**********************************************/

import java.util.Scanner;

public class workshop1 {
	
	public static boolean isNumber(double Num) {
		return Num >= 0 && Num <=9;
	}

	public static void main(String[] args) { //static means 
		// TODO Auto-generated method stub
			
		
		//Task1
		Scanner input = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		System.out.print("Enter a, b, c, d, e, f: ");
		a = input.nextDouble(); //by using nextDouble, it can accept double value.
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		x = (e*d - b*f)/(a*d - b*c);
		y = (a*f - e*c)/(a*d - b*c);
		
		if((a*d-b*c) != 0) {
		System.out.println("x is " + x + " and y is " + y);
		}else {
			System.out.println("The equation has no solution");
		}
		
		
		/**System.out.println("Enter the values: ");
		h=input.nextInt();
		q=input.nextInt();
		m=input.nextInt();
		System.out.println("The value of h: "+h
				+"The value of q: "+q+
				"The value of m: "+ m);*/
		
		
		//Task2
		//Scanner input = new Scanner(System.in);
		int h,q,m,j,k;
		int year;
		
		System.out.print("Enter year: (e.g., 2012): ");
		year = input.nextInt();
		j = year/100;
		k = year%100;

		System.out.print("Enter month: 1-12: ");
		m = input.nextInt();
		
		if(m == 1 || m == 2) {
			m += 12;
			k -= 1;
		}
		
		
		System.out.print("Enter the day of the month: 1-31: ");
		q = input.nextInt();
		
		h = (int)((q+(26*(m+1)/10)+k+(k/4)+(j/4)+(5*j))%7);
		
		switch(h) { //as variable 'h' is a integer value, the case should be the value without quotation mark.
		case 0: System.out.print("Day of the week is Saturday"); break;
		case 1: System.out.print("Day of the week is Sunday"); break;
		case 2: System.out.print("Day of the week is Monday"); break;
		case 3: System.out.print("Day of the week is Tuesday"); break;
		case 4: System.out.print("Day of the week is Wednesday"); break;
		case 5: System.out.print("Day of the week is Thursday"); break;
		case 6: System.out.print("Day of the week is Friday"); 
		}
		
		
		
		
		//Task3
		//Scanner input = new Scanner(System.in);
		double principal,annualInterstRate,monthlyInterestRate,balance,interest;
		int numberOfYears;
		
		
		System.out.print("\nLoan Amount: ");
		balance = input.nextDouble(); //Initialize the first balance(loan).
		System.out.print("Number of Years: ");
		numberOfYears = input.nextInt(); //Type how many years. 
		System.out.print("Annual Interest Rate: ");
		annualInterstRate = input.nextInt(); //Type annual Interest Rate.
		

		
		double monthlyPayment = (annualInterstRate*0.01/12*balance)/(1-Math.pow(1+annualInterstRate*0.01/12, -12)); //Be careful when there is a multiple * or /. you need to use parenthesis to make sequence in calculating.

		System.out.println("Payment# \tInterest \tPrincipal \tBalance");
		monthlyInterestRate = annualInterstRate*0.01/12;
		for (int i = 1; i <= numberOfYears * 12; i++) {
			
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + Math.floor(100*interest)/100
			+ "\t\t" + Math.floor(100*principal)/100 + "\t\t" + Math.floor(100*balance)/100); //used Math.floor to get two decimal instead of all.
			}
			
		
		
	}

}
