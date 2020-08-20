package Main;

import java.util.Scanner;
import Task1.*;
import Task2.*;
import Task3.*;

public class TesterClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter Task number: ");
		int num = input.nextInt();
		
		switch(num) {
		case 1: 
			//Task1
			try {
				double num1 = 0, num2 = 0;
				boolean flag = true;
				
				do {
					System.out.print("Enter the first complex number: ");
					if(input.hasNextDouble()) { //This method returns true if the next token in this scanner's input can be interpreted as an int value in the default radix using nextInt() method.
						num1 = input.nextDouble();
						if(input.hasNextDouble()) {
							num2 = input.nextDouble(); //by entering two first complex number, the second one is stored in the num2
							flag = false; //to get out of the do..while statement
						}else {
							System.out.println("You enter strings. Please enter number"); //If the second number is not number, then executes this function.
							input.next(); //accept the second number only.
							num1 = 0; 
						}
					}else {
						System.out.println("You enter strings. Please enter number"); //If the all of the numbers are wrong(not matched with the condition), then executes the function below.
						input.next();
						input.next();
					}
				}while(flag);
				
				ComplexNum com1 = new ComplexNum(num1, num2); //It is automatically cloned by deriving Cloneable interface.
				//Sending to the ComplexNum constructor.
				flag = true; //reinitialize the flag to true as we initialized flag to false in do..while loop to escape from it.
				 
				do { //do the same thing as we did in the first one.
					System.out.print("Enter the Second complex number: ");
					if(input.hasNextDouble()) {
						num1 = input.nextDouble();
						if(input.hasNextDouble()) {
							num2 = input.nextDouble();
							flag = false;
						}else {
							System.out.println("Enter number");
							input.next();
							num1 = 0;
						}
					}else {
						System.out.println("Enter number");
						input.next();
						input.next();
					}
				}while(flag);
				
				ComplexNum com2 = new ComplexNum(num1, num2);
				
				com1.add(com2); //add a com2 to com1
				com1.substract(com2);
				com1.multiply(com2);
				com1.divide(com2);
				com1.abs();
				
				System.out.println();
			}catch(Exception e) { //If the exception happens then it shows an error message.
				System.out.println("Error: " + e); 
			}
			break;
		case 2:
			//Task2
			try {
				BankManager manager = new BankManager();
				manager.safeResultPrint();
				
				System.out.println();
			}catch(Exception e) {
				System.out.println("Error: " + e);
			}
			break;
		case 3:
			//Task3
			try {
				GeometricObject[] geoObj = new GeometricObject[4];
				
				geoObj[0] = new Square();
				geoObj[1] = new Octagon();
				geoObj[2] = new Triangle();
				geoObj[3] = new Octagon();
				
				
				for(int i = 0; i < 4; i++) {
					geoObj[i].howToColor();
				}
			}catch(Exception e) {
				System.out.println("Error: " + e);
			}
			break;
		}
		
		
		
	}
}