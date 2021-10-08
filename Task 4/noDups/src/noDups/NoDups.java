package noDups;
import java.util.Arrays;


// This program removes removes duplicates form an array
public class NoDups {

	public static void main(String[] args) {
		int[] arr = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
		
		System.out.println("Original Array \n" + Arrays.toString(arr));
		arr = removeDups(arr);
		System.out.println("Array with no duplicated number \n" + Arrays.toString(arr));

	}
	

	// This method takes an integer array argument, and returns the array with duplicates removed
	public static int[] removeDups(int[] numbers) {
		int n = numbers.length;
		// I learned to use the sort method from the Arrays class  from https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
		Arrays.sort(numbers);
		// Create a temporary array to store unique numbers
	    int[] temp = new int[n];
     
        // initialize a counter for unique numbers
        int unique = 0;
        for (int i=0; i<n-1; i++) {
            // if current item != next item store the item in the temporary array;
            if (numbers[i] != numbers[i+1]) {
                temp[unique++] = numbers[i];
            }
        }
        // Store the last number and 
        temp[unique++] = numbers[n-1];  
         
        // Modify original array and update the original array with the unique values
        for (int i=0; i<unique; i++) {
            numbers[i] = temp[i];
        }
       
        // Create a new array with the length = number of unique numbers
     		int[] new_array = new int[unique];
     		for (int i = 0; i < unique; i++) {
     			new_array[i] = temp[i];
     		}
     		// System.out.println("Array with no duplicated number \n" + Arrays.toString(new_array));
        return new_array;
	}
}
