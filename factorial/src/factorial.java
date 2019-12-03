// Imports the necessary package
import java.util.Scanner;

// Declare the public class and main
public class factorial {
	public static void main(String[] args) {
		
		// Creates a string that will giev the user an instruction and prints in out
		String prompt = ("Please enter a number you would like the factorial of: ");
		System.out.println(prompt);
		
		// Allows the user to enter a value which is then stored in the variable num
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		// The factorial variable is where the calculation is done and it starts at 1
		int factorial = 1;
		
		// This loop starts with 1 being multiplied to the factorial and keeps looping until the x value reaches the value the user has selected
		for (int x=1; x <= num ; x++) {
			
			factorial = factorial * x;
			
		}
		 // This prints out the factorial calculated
		System.out.println("The factorial of the number you entered is: " + factorial);
		
	}
}