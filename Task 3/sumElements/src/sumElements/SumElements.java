package sumElements;

import javax.swing.JOptionPane;

public class SumElements {
	// This program asks the user to enter a 3 X 4 array and then calculates the sum of each column in the array

	public static void main(String[] args) {
		// Declare all variables
		float[][] arr;
		float col1 = 0;
		float col2 = 0;
		float col3 = 0;
		float col4 = 0;
		// Create as 3 by 4 array
		arr = new float[3][4];
		
		// Ask user to enter values into the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] =  Float.parseFloat( JOptionPane.showInputDialog( "Enter 12 numbers into a 3 X 4 array" ));
				System.out.print(arr[i][j] + "\t ");
			} System.out.println();
		}
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				// sum values for each column
				switch(i) {
				case 0:
					col1 += arr[j][i];break;
				case 1:
					col2 += arr[j][i];break;
				case 2:
					col3 += arr[j][i];break;
				case 3:
					col4 += arr[j][i];break;
				}
				
			}
		
		}
		// Display results
		System.out.println("------------------------------");	
		System.out.println(col1 + "\t" + col2 + "\t" + col3 + "\t" + col4 + "\t" );	
		System.out.println("------------------------------");	
	}

}
