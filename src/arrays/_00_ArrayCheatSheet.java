package arrays;

import java.util.Random;

import javax.swing.JButton;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = new String[5]; 
		strings[0] = "hi";
		strings[1] = "thwerwe";
		strings[2] = "wegueorgwe";
		strings[3] = "erwe";
		strings[4] = "greiow";
		
		
		
		//2. print the third element in the array
		System.out.println(strings[3]);
		//3. set the third element to a different value
		strings[3] = "fgosruh";
		//4. print the third element again
		System.out.println(strings[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<strings.length;i++) {
			// 	strings[i] = "test?"; --> makes all strings "test?"
			System.out.println(strings[i]);
			
			}
		
		//6. make an array of 50 integers
		double[] integers = new double[50];
		//7. use a for loop to make every value of the integer array a random number (from 0-50?) im assuming so
		Random random = new Random();
		for(int i=0;i<integers.length;i++) {
		integers[i] = random.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for (int i = 0; i < integers.length; i++) {
		   if (integers[i] < min)
		      min = integers[i];
		   if (integers[i] > max)
		      max = integers[i];
		}
		System.out.println(min);

		//9 print the entire array to see if step 8 was correct
		//System.out.println(integers); --> ends up printing a bunch of gibberish.
		//10. print the largest number in the array.
	}
}
