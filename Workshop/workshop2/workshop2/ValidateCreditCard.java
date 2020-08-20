package workshop2;

import java.util.Scanner;
import java.lang.Math;

public class ValidateCreditCard{

	public static boolean checkCreditValid(long cardNum) {
		int validNum = 0;
		
		if(NODigit(cardNum) >= 13 && NODigit(cardNum) <= 16) {
			if(cardPrefix(cardNum)) {
				validNum = DoubledSecondDigitSum(cardNum) + oddSum(cardNum);
				if(validNum %10 == 0) { //As in instruction, if the number is divisible by 10, then the card number is valid.
					return true;
				}else { //otherwise, it is invalid.
					return false;
				}
			}else {
				System.out.println("***The prefix number should be same***");
			}
		}else {
			System.out.println("***The number of card number should between 13 and 16***");
		}
		return false;
	}
	
	
	public static int DoubledSecondDigitSum(long cardNum) {
		int cardNODigit = NODigit(cardNum);
		int secondDigitDouble = 0,cardNumSum = 0, i, j;
		long Divide = 10;
		
		for(i = 0; i < cardNODigit; i++) {
			secondDigitDouble = (int)(2 *(((cardNum%(Divide*10))-(cardNum%Divide))/Divide)); //Calculate the second Digit and doubling.
			Divide *= 100;
			i++;
			cardNumSum += cardNumSumCheck(secondDigitDouble);
		}
		return cardNumSum;
	}
	
	public static long cardNumSumCheck(long cardNumSum) {
		
		if(cardNumSum < 10) { //If the sum of the card number is less then 10, then it returns sum of it. Otherwise, it calculates until the sum becomes less than 10.
			return cardNumSum;
		}else {
			return cardNumSum%10+cardNumSum/10;
		}
	}
	
	public static int oddSum(long cardNum) { 
		int sum = 0;
		
		for(int i = 1; i < NODigit(cardNum) + 1; i++) {
			double modularNum = Math.pow(10, i) / 10;
			sum += ((cardNum%(modularNum*10))-(cardNum%modularNum))/modularNum;
			i++;
		}
		return sum;
	}
	
	public static boolean cardPrefix(long cardNum) {
		int cardDigitNum = NODigit(cardNum);
		int fPrefix = (int)(cardNum / Math.pow(10, cardDigitNum - 1));
		int sPrefix = (int)(cardNum / Math.pow(10, cardDigitNum - 2));
		
		if(fPrefix == 4 || fPrefix == 5 || fPrefix == 6 || sPrefix == 37) { //4 for visa card, 5 for master card, 37 for American express card, 6 for discover card.
			return true;
		}else {
			return false;
		}
	}
	
	public static int NODigit(long cardNum) {
		int count = 0;
		
		while(cardNum != 0) {
			cardNum /= 10;
			count++;
		}
		
		return count;
	}
	
	public static long fk(long cardNum, int k) {
		long product = 1;
		
		for(int i = 0; i < cardNum; i++)
			product *= cardNum;
		
		while((int)(product / Math.pow(10, k)) != 0)
			product = product / 10;
		
		return product;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long creditCardNum, inputCardNum = 0;
		boolean flag = true;
		
		while(flag){
			System.out.println("Enter a credit card number as a long integer:");
			
			while(!input.hasNextLong()) { //returns true if the next token in this scanner's input can be interpreted as a long value in the default radix using the nextLong() method.
				System.out.println("Please input number");
				input.next();
			}
			
			inputCardNum = input.nextLong();	
			
			if(inputCardNum < 0) {
				System.out.println("Enter positive number!");
			}else {
				flag = false;
			}	
		}
		creditCardNum = inputCardNum;
		
		if(checkCreditValid(creditCardNum)) {
			System.out.println(creditCardNum + " is valid");
		}else {
			System.out.println(creditCardNum + " is invalid");
		}
		
		
	}

}
