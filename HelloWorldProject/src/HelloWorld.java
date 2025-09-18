/*
 * TODO: Christopher Lee
 * TODO: 9/18/25
 * TODO: Pd 6
 * TODO: Will ask the user what type of conversion they want to perform (Binary to Decimal or Decimal to Binary).  
 * If they enter a choice that is not one that is valid, ask them again until they give a valid input.
 * Ask the user for the correct input based on their choice.
 * Ask the user if they would like to continue and convert another number (return to question for type) or exit.

 */
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		//TODO: Implement Program Requirements Here
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome!  You have the following options: \n1. Binary to Decimal \n2. Decimal to Binary \nWhich type of conversion would you like to perform?");
    	int type = scanner.nextInt();
		while(type!=1 && type!=2){
			System.out.println("Which type of conversion would you like to perform?");
			type = scanner.nextInt();
		}
		
		if(type == 1){
			System.out.println("What is the binary number?");	
			String name = scanner.nextLine();
			
		}

		
		//System.out.print(name);

		scanner.close();





	}

}
