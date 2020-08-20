package Task1;

import java.util.*;
import java.io.Serializable;

public class Account implements Serializable {
	private int pin; // this is for part b
	private int id;
	String firstName;
	String lastName;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		id = 0;
		firstName = null;
		lastName = null;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		pin = 0;
		
	}
	
	public Account(int identification, double bal){
		id = identification;
		balance = bal;
		dateCreated = new Date();
		firstName = null;
		lastName = null;
		annualInterestRate = 0;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int identification) {
		this.id = identification;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double bal) {
		this.balance = bal;
	}
	
	public double getAnnualIntRate() {
		return annualInterestRate;
	}
	
	public void setAnnualIntRate(double AnnualIntRate) {
		this.annualInterestRate = AnnualIntRate;
	}
	
	public Date getDate() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate)/12;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	
	public void withdraw(double amt) {
		this.balance -= amt;
	}
	
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	public int getPin() {
		return this.pin;
	}
}
