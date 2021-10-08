package identicalArrays;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class IdenticalArrays {
	// This program asks the user to input values into two different arrays and determines whether the arrays are identical
	public static void main(String[] args) {
		// Declare variables
		int[] arr1;
		int[] arr2;
		arr1 = new int[3];
		arr2 = new int[3];
		System.out.println("Please 3 integer values i9nto the first array" );
		for (int i = 0; i < arr1.length; i++) {
			// Repeatedly ask user to input numbers
			int num = Integer.parseInt( JOptionPane.showInputDialog( "Please Enter num" + (i+1) + " for array 1"));
			arr1[i] = num;
		}
		System.out.println("Please another 3 integer values into the second array" );
		for (int i = 0; i < arr2.length; i++) {
			// Repeatedly ask user to input numbers
			int num = Integer.parseInt( JOptionPane.showInputDialog( "Please Enter num" + (i+1) + " array 2"));
			arr2[i] = num;
		}
		// Determine Whether arrays are identical
		// Learned how to compare arrays here: https://www.geeksforgeeks.org/compare-two-arrays-java/
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("The arrays are identical");
		} else {
			System.out.println("The arrays are not identical");
		}
	}

}
