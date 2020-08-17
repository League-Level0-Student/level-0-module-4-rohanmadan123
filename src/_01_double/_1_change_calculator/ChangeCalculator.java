package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String userNickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickels = Integer.parseInt(userNickels);
		
		String userDimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(userDimes);
		
		String userQuarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters = Integer.parseInt(userQuarters);
		
		double nicklesAmount = nickels*.05;
		double dimesAmount = dimes*.10;
		double quartersAmount = quarters*.25;
		double total = nicklesAmount+dimesAmount+quartersAmount;
		JOptionPane.showMessageDialog(null, "You have $" + total + " .");

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

