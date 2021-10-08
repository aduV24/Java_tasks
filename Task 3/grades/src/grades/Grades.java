package grades;
import javax.swing.JOptionPane;
public class Grades {
	// This program asks users for test scores, stores them in an array, finds the average and assigns a grade
	public static void main(String[] args) {
			
			// Declare variables
			int[] myTestResults;
			myTestResults = new int[5];
			String grade = "";
			double total = 0;
			double avg = 0;
			
			for (int i = 0; i < myTestResults.length; i++) {
				// Repeatedly ask user to input numbers
				int mark = Integer.parseInt( JOptionPane.showInputDialog( "Please Enter test" + (i+1) + " mark"));
				// Check if mark is between 0 and 100
				while (mark < 0 || mark > 100) {
					System.out.println("Please Enter a mark between 0 and 100" );
					mark = Integer.parseInt( JOptionPane.showInputDialog( "Please Enter test" + (i+1) + " mark"));
				} myTestResults[i] =  mark;
			}
			
			
			for (int i = 0; i < myTestResults.length; i++) {
				System.out.println(myTestResults[i] + " ");
				// Add each mark to the array
				total += myTestResults[i];
			} avg = total / myTestResults.length;
			
			// Assign a grade based on the average
			if (avg >= 80 && avg <= 100) {
				grade = "A";
			} else if (avg >= 70 && avg <= 79) {
				grade ="B";
			} else if (avg >= 60 && avg <= 69) {
				grade ="C";
			} else if (avg >= 50 && avg <= 59) {
				grade ="D";
			} else {
				grade = "F";
			}
			System.out.println("Grade is: " + grade);
	}

}
