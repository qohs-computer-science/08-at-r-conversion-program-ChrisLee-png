/*
 * TODO: Christopher Lee
 * TODO: 9/18/25
 * TODO: Period 6
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
		boolean e = true;
		while(e){
		System.out.println("\nWelcome!\n\nYou have the following options: \n1. Binary to Decimal \n2. Decimal to Binary \n");
    	int type = 0;
		while(type!=1 && type!=2){
			System.out.println("Which type of conversion would you like to perform?");
			type = scanner.nextInt();
		}//end conversion type loop
		if(type==1){
			System.out.println("\nWhat is the binary number?");
			scanner.nextLine();
			int ee = convertBinDec(scanner.nextLine());
			System.out.println("\nThe decimal equivilant is: " +ee);
		}//runs if user chooses binary to decimal
		else{
			System.out.println("\nWhat is the decimal number?");
			String ee = convertDecBin(scanner.nextInt());
			System.out.println("\nThe binary equivalent is: "+ee);
		}//runs if user chooses decimal to binary
		System.out.println("\nDo you want to convert another number?(enter 'true' or 'false')\n");
		e = scanner.nextBoolean();
	}//end loop if user chooses not to continue
	scanner.close();
	}//end main

	public static String convertDecBin(int d){
		String r ="";
		while(d>0){
			r = d%2 + r;
			d/=2;
		}//calculates binary equivalent
		while(r.length()<8){
			r = "0"+r;
		}//makes sure its 8 bits long 
		return r;
	}//end convertDecBin method
	
	public static int convertBinDec(String b){
			int r = 0;
			for(int med=0;med<b.length();med++){
					if(b.substring(med, med+1).equals("1")){
						r+=Math.pow(2, b.length()-(med+1));
					}

			}//calculates decimal equivalent
			return r;
	}//end convertBinDec method

}//end class
