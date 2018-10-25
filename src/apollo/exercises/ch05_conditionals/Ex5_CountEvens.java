package apollo.exercises.ch05_conditionals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ex5_CountEvens {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		// Call countEvens a few times with different arrays and print the result


		int[] a = {7, 5, 10, 17, 7, 49, 28, 5};

		Ex5_CountEvens.countEvens(a);
	}
	
	// Create a method called countEvens
	// Return the number of even ints in the given array. 
	// Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1. 
	
	// int a = {2, 1, 2, 3, 4};
	// countEvens(a); // -> 3
	// int b = {2, 2, 0};
	// countEvens(b); // -> 3
	// int c = { 1, 3, 5};
	// countEvens(c); // -> 0





	public static void countEvens(int a[]){

		int i, j;

		for(i = 0; i < a.length; i++) {

			for (j = i + 1; j < a.length; j++) {

				if(a[i] == a[j]) System.out.println(a[i] + " ");

			}
		}


	}


}

/*
 * SAMPLE OUTPUT:
 *  
 * 3
 * 0
 * 2
 *  
 */