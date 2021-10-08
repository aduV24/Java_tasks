import java.util.Scanner;
import java.lang.Math;

public class Subtraction {
	

	public static void main(String[] args) {
		final int NUMBER = 5;
		int correct = 0; int count = 0; long startTime = System.currentTimeMillis();
		String final_display = " ";
		Scanner sc = new Scanner(System.in);
		while (count < NUMBER) {
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			if (number1 < number2) {
				int temp = number1; number1 = number2; number2 = temp;
				}
			System.out.print(
			"What is " + number1 + " - " + number2 + "? ");
			int answer = sc.nextInt();
			if (number1 - number2 == answer) { 
				System.out.println("You are correct!");
				correct++; // Increase the correct answer count
				}
			else {
			System.out.println("Your answer is wrong.\n" + number1
			+ " - " + number2 + " should be " + (number1 - number2));
			}
			count++;
			final_display += "\n" + number1 + "-" + number2 + "=" + answer +
			((number1 - number2 == answer) ? " correct" : " wrong");
			
		}
		sc.close();
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct count is " + correct +
		"\nTest time is " + testTime / 1000 + " seconds\n" + final_display);

		

	}

}
