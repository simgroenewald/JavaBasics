// Imports the necessary packages  
import java.util.Scanner;

// Declares a public class and main
public class averageNumber{
	public static void main(String[] args){
		
		// Declares the variables needed for the calculations
		int sum_pos = 0;
		int sum_neg = 0;
		int count_pos = 0;
		int count_neg = 0;
		
		// Declares a boolean value which will allow the loop to run until it breaks
		String run = ("start");
		
		// This string will print explaining to the user what must be done
		String prompt = ("Please enter both positive and negative numbers. Enter 0 to calculate their aveages.");
		System.out.println(prompt);
		
		// Loop will run while run until it reaches a break (user enters 0
		while (run.contentEquals("start")) {
		
		// This allows the user to enter values in a variable called num
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		// If the user enters a positive number this code will run and then it adds the number to the sum of positive numbers variable 
		// It also adds 1 to the positive number count
		if (num>0) {
			
			sum_pos += num;
			count_pos += 1;
			
		}
		
		// If the user enters a negative number this code will run and then it adds the number to the sum of negative numbers variable 
		// It also adds 1 to the negative number count
		if (num<0) {
			
			sum_neg += num;
			count_neg += 1;
			
		}
		
		// This will run if the user enters 0 nd it will break the loop
		if (num == 0) {
			
			break;
		}
		}
		 // This code will only run if the user has entered positive numbers
		if (count_pos != 0){
		// Calculates the average
		int average_pos = sum_pos/count_pos; 
		// Prints out the answer
		System.out.println("The average of the positive numbers you entered is " + average_pos);
		}
		
		// This code will only run if the user has entered a negative value
		if (count_neg != 0) {
		// Calculates the average
		int average_neg = sum_neg/(count_neg * (-1));
		// Prints out the value
		System.out.println("The average of the negative numbers you entered is " + average_neg);
		}
		
	}
}