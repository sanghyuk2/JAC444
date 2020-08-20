package workshop2;

import java.util.Scanner;

public class Hangman {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] words = {"write", "that", "program", "test", "play"};
		int count = 0; //whenever user input wrong words which is not in the words array then the count will be increased.
		char YN;
		
		do {
			char inputChar;
			int index, inputCount = 0;
			String wordAnswer = "", userInput, YNInput = "";
			
			index = (int)(Math.random() * words.length); //Select a random word in the array words.
			String word = words[index];
						
			for(int i = 0; i < word.length(); i++) { //Fill the places based on the word's length selected.
				wordAnswer += "*";
			}
			
			do { //the progress after the word has selected.
				int wordExist = 0;
				
				do {
					
					System.out.print("(Guess) Enter a letter in word " + wordAnswer + " > ");
					userInput = input.next();

					if(userInput.length() > 1) {
						System.out.print("***Type a one character!! More than one character is not allowed***\n");
					}
				}while(userInput.length() != 1); //if the number of userInput is not 1 then do...while statement will be finished.
				
				inputChar = userInput.charAt(0); //Converting string to a char type. And because the userInput is a one character there is only one index 0. 
				for(int i = 0; i <word.length(); i++) {
					if(wordAnswer.charAt(i) == inputChar) {
						System.out.print(inputChar + " is already in the word\n");
						wordExist++;
					}else {
						if(word.charAt(i) == inputChar) {
							String Answer = wordAnswer.substring(0,i) + inputChar + wordAnswer.substring(i+1);
							wordAnswer = Answer;
							inputCount++; //if there is a matching letter, then inputCount will increase.
							wordExist++; //if user inputs the letter that does not exist, then wordExist does not count.
						}
					}					
				}
				
				if(wordExist == 0) {
					System.out.println("\t" + inputChar + " is not in the word");
					count++;
				}
				
				
			}while(inputCount != word.length());
			
			System.out.println("The word is program. You missed " + count + " time");
			
			do {
				System.out.print("Do you want to guess another word? Enter y or n> ");
				YNInput = input.next();
				YN = YNInput.charAt(0);
			}while((YN != 'Y' && YN != 'y' && YN != 'N' && YN != 'n') || YNInput.length() > 1);
			
		}while(YN == 'Y' || YN == 'y'); //If the user inputs 'N' or 'n' instead of inputs 'y' or 'Y', then do...while statement will iterate from the start.

	}

}

