import javax.swing.JOptionPane;

import java.lang.Math;
public class rockPaperScissors {
	// This program plays the rock paper scissors game
	public static void main(String[] args) {
		int choice = 5;
		System.out.println("Welcome to Rock Paper scissors, 0 for Scissors, 1 for rock, 2 for paper, Enter 5 to exit");
		do  {
			// Generate a random number (0,1 or 2) (Scissors, rock and paper)
			int num = (int)(Math.random() * 3);
			
			choice = Integer.parseInt( JOptionPane.showInputDialog( "Enter 0 for Scissors, 1 for rock, 2 for paper"));
			
			switch (choice) {
			// If computer chooses scissors
			case 0: 
				System.out.println();
				System.out.println("Chooosing.....");
				if (num == 1) {
					System.out.println("Sorry, you lost, Rock beats scissors");break;
				} 
				else if (num ==2) {
					System.out.println("Yay! you win, Scissors beats paper");break;
				}
				else {
					System.out.println("This is a draw!");break;
				}
			// If computer chooses Rock		
			case 1:
				System.out.println();
				System.out.println("Chooosing.....");
				if (num == 2) {
					System.out.println("Sorry, you lost, Paper beats Rock");break;
				} 
				else if (num == 0) {
					System.out.println("Yay! you win, Rock beats Scissors");break;
				}
				else {
					System.out.println("This is a draw!");break;
				}
			
			// If computer chooses Paper	
			case 2:
				System.out.println();
				System.out.println("Chooosing.....");
				if (num == 0) {
					System.out.println("Sorry, you lost, Scissors beats Paper");break;
				} 
				else if (num == 1) {
					System.out.println("Yay! you win, Paper beats Rock");break;
				}
				else {
					System.out.println("This is a draw!");break;
				}
			default: System.out.println("Please Enter Either 0, 1  or 2 \nEnter 5 to Exit");
			System.out.println();break;
			}
		} while(choice != 5);

	}
}
