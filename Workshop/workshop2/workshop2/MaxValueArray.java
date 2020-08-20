package workshop2;
import java.util.Scanner;

public class MaxValueArray{
	public static Location locateLargest(double[][] a) {
		Location location = new Location(a);
		location.maxValue = location.userArray[0][0];
		int i, j;
		
		for(i = 0; i < location.userArray.length; i++) {
			for(j = 0; j < location.userArray[0].length; j++) { 
				if(location.userArray[i][j] > location.maxValue) {
					location.maxValue = location.userArray[i][j];
					location.row = i;
					location.column = j;
				}
			}
		}
		
		System.out.print("The location of the largest element is " + (int)location.maxValue + " at (" + (int)location.row + ", " + (int)location.column + ")");
		return location;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i, j, rowNum = 0, columnNum = 0, rowInput = 0, columnInput = 0; //Initialize all the input fields as a 0.
		double[][] userArray;
		boolean flag = true;
		
		do{
			System.out.print("Enter the number of rows and columns in the array: ");
			
			if(input.hasNextInt()) { //If the input has a int, then it returns true.
				rowInput = input.nextInt(); //put the int input value into row Input.
				
				if(rowInput < 0) {
					System.out.println("Enter a positive number!");
				}else {
					if(input.hasNextInt()) {
						columnInput = input.nextInt();
						
						if(columnInput < 0) {
							System.out.println("Enter a positive number!");
						}else {
							columnNum = columnInput;
							flag = false;
						}
					}else {
						System.out.println("Enter number!");
						input.next();
					}
				}
			}else {
				System.out.println("Enter number!");
				input.next(); //input.next() ignores blank. But input.nextLine() does not.
				input.next();
			}
			
		}while(flag); //If the flag is still true then it returns to the back and start from the beginning.
		
		rowNum = rowInput;
		columnNum = columnInput;
		userArray = new double[rowNum][columnNum];
			
		System.out.println("Enter the array:");
		for(i = 0; i < rowNum; i++) {
			for(j = 0; j < columnNum; j++) {
				boolean inputFlag = true;
				do {
					while(!input.hasNextDouble()) {
						System.out.println("You didn't enter number at (" + i + ", " + j + ")");
						input.next();
						if(j != columnNum - 1) {
							j++;
						}else {
							i++;
						}
					}
					userArray[i][j] = input.nextDouble();
					inputFlag = false;
				}while(inputFlag);
			}	
		}
		
		locateLargest(userArray);
		
	}

}