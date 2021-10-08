package averageNumber;
import javax.swing.JOptionPane;

public class AverageNumber {
	// This programs requests input form the user, calculates and displays total, positives, negatives and average

	public static void main(String[] args) {
		// Declare all variables
		int count = 0;
		int positive = 0;
		int negative = 0;
		double total = 0;
		double average = 0.00;
		
		int num;
		do {
		    num = Integer.parseInt( JOptionPane.showInputDialog( "Please enter  a number or enter 0 to exit"));
			
			// Check if number is positive
			if (num > 0) {
				positive++;
				count++;
			}
			// Check if number is negative
			else if (num < 0) {
				negative++;
				count++;
			}
			total += num;
		}while( num!= 0);
		
		// Calculate average
		average = total / count;
		// Display results
		System.out.println("positives = " + positive);
		System.out.println("negatives = " + negative);
		System.out.println("total = " + total);
		System.out.format("average = %.2f", average);
	}

}
