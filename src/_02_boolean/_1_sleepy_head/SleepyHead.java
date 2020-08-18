package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
		String day = JOptionPane.showInputDialog("What day is it?");
		
		if(day.equalsIgnoreCase("Saturday")) {
			isWeekend = true;
		} else if(day.equalsIgnoreCase("Sunday")) {
			isWeekend = true;
		} else {
			isWeekend = false;
		}
		
		if(isWeekend == true) {
			JOptionPane.showMessageDialog(null, "You should sleep in");
		} else if(isWeekend == false) {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}
        
		// Set the boolean isWeekend based on the value they enter
		
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam = false;
		// Write code to ask the user what percentage they scored in their last exam
		String userScore = JOptionPane.showInputDialog("What percentage did you score on your last exam?");
		int score = Integer.parseInt(userScore);
		if(score > 70) {
			passedExam = true;
		} else if(score < 70) {
			passedExam = false;
		}
		
		if(passedExam == true) {
			JOptionPane.showMessageDialog(null, "Congradulations on passing!");
		} else if(passedExam ==false) {
			JOptionPane.showMessageDialog(null, "Better luck next time.");
		}

		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		JOptionPane.showMessageDialog(null, "Game is over");
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String userColor = JOptionPane.showInputDialog("What color do you want me to draw with?");
		
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String userShape = JOptionPane.showInputDialog("What shape do you want me to draw?");
		if(userColor.equalsIgnoreCase("red") && userShape.equalsIgnoreCase("square")) {
			isRed = true;
			isSquare = true;
		} else {
			isRed = false;
			isSquare = false;
		}
		
		if(isRed == true && isSquare == true) {
			drawRedSquare();
		} else if(isRed == false && isSquare == false) {
			JOptionPane.showMessageDialog(null, "I dont know how to draw that shape.");
		}
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setPenColor(255, 0, 0);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		// Complete the rest of this method
	}	
}
