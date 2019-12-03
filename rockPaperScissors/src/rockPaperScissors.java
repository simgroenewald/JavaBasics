// Compulsory Task 1
// Importing modules needed for the program
import javax.swing.*;
import java.util.Random;


// Calling a public class and main
public class rockPaperScissors {
	public static void main(String[] args) {
		
		// Allowing the user to make a choice between rock, paper or scissors
		String user_choice = JOptionPane.showInputDialog("Enter rock, paper or scissors: ");
		user_choice = user_choice.toLowerCase();
		
		// This uses the random module to generate a random number from 1 to 3
		Random randomGenerator = new Random();
		int game_choice = randomGenerator.nextInt(3) + 1;
		
		// This prints out the users choice
		System.out.println("You chose: " + user_choice);
		
		// This statement runs if random number chosen is 1
		// Each if statement depends on the users choice and will print out the results depending on what the users selection was
		if (game_choice == 1)
		{ 
			String game_display = "Rock";
			System.out.println("The computer chose: " + game_display);
			if (user_choice.contentEquals("rock"))
			{
				System.out.println("Nobody Wins!");
			}
			if (user_choice.contentEquals("paper"))
			{
				System.out.println("You Win!");
			}
			if (user_choice.contentEquals("scissors"))
			{
				System.out.println("You Lose!");
			}
				
		}
		
		
		// This statement runs if random number chosen is 2
		// Each if statement depends on the users choice and will print out the results depending on what the users selection was
		if (game_choice == 2)
		{
			String game_display = "Paper";
			System.out.println("The computer chose: " + game_display);
			if (user_choice.contentEquals("rock"))
			{
				System.out.println("You Lose!");
			}
			if (user_choice.contentEquals("paper"))
			{
				System.out.println("Nobody Wins!");
			}
			if (user_choice.contentEquals("scissors"))
			{
				System.out.println("You Win!");
			}
		}
			
		
		// This statement runs if random number chosen is 3
		// Each if statement depends on the users choice and will print out the results depending on what the users selection was
		if (game_choice == 3)
		{
			String game_display = "Scissors";
			System.out.println("The computer chose: " + game_display);
			if (user_choice.contentEquals("rock"))
			{
				System.out.println("You Win!");
			}
			if (user_choice.contentEquals("paper"))
			{
				System.out.println("You Lose!");
			}
			if (user_choice.contentEquals("scissors"))
			{
				System.out.println("Nobody Wins!");
			}
		}
	}
}
	
		
