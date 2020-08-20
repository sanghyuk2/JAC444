package Tester;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.util.Scanner;
import Task1.*;
import Task2.*;

public class TesterClass {
	//private static ObjectOutputStream output; // outputs data to file
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
		//Scanner input = new Scanner(System.in);
		
		/*                        TASK 1 DONE                     */
		/*// Create 10 accounts with $100 each
		Account[] account = new Account[10];
		for(int i = 0; i < account.length; i++) {
			account[i] = new Account(i, 100);
		}
		
		// Serialize
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("account.dat"));)
		{
			// Create 10 accounts with $100 each
			for(int i = 0; i < account.length; i++) {
				output.writeObject(account[i]);
			}
		}
		
		// Deserialize
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("account.dat"));)
		{
			
		    while (true){ // loop until there is an EOFException
		 		Account record = (Account) in.readObject(); 
				System.out.println(record.getId() + " " + record.getBalance());
			}		 
		}catch (EOFException endOfFileException) {
			//System.out.printf("No more records");
		}catch (ClassNotFoundException classNotFoundException){
		     System.err.println("Invalid object type. Terminating.");
		}catch (IOException ioException){
		  System.err.println("Error reading from file. Terminating.");
		}
		*/ //end of taask 1
		
		/*                           Task 2                               */
		//ATM.launch(args);
		//ATM.main(args);
		
		
		//ATM.play();
		

	} // end of main
	
	
	
	
	
		
} // end TesterClass
