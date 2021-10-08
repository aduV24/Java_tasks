package factorial;
import javax.swing.JOptionPane;
public class Factorial {
	// This program determines the factorial of a number entered by the user
	public static void main(String[] args) {
		int num = Integer.parseInt( JOptionPane.showInputDialog( "Please enter a positive number"));
		while (num < 0) {
			System.out.println("Please Enter a positive number" );
			num = Integer.parseInt( JOptionPane.showInputDialog( "Please enter a positive number"));
		}
		if (num == 0) {
			System.out.println("Factorial is "+ 1);
		}
		else {
			for (int i = num-1; i > 0; i--) {
				num = num * i;
			}
			System.out.println("Factorial is "+ num );
		}
		
		
	}

}
