package LabProgram312;

import java.util.Scanner;
import java.util.NoSuchElementException;

/*
 * Write a program that takes in three integers as inputs and outputs 
 * the largest value. Use a try block to perform all the statements. 
 * Use a catch block to catch any NoSuchElementException caused by missing inputs. 
 * Then output the number of inputs read and the largest value, or output "No max" if 
 * no inputs are read.
 */

public class InputErrorsWithZyLabs {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int val1;
		int val2;
		int val3;
		int max;

		val1 = 0;
		val2 = 0;
		val3 = 0;

		/* Type your code here. */
		
		int counter = 0;
		try {
			val1 = scnr.nextInt();
			counter++;
			val2 = scnr.nextInt();
			counter++;
			val3 = scnr.nextInt();
			counter++;

			int[] myArray = new int[3];
			myArray[0] = val1;
			myArray[1] = val2;
			myArray[2] = val3;

			max = myArray[0];

			for (int i = 0; i < myArray.length; i++) {
				if (myArray[i] > max)
					max = myArray[i];
			}
			System.out.println(max);
		} catch (NoSuchElementException e) {
			System.out.println(counter + " input(s) read:");
			if (counter == 0) {
				System.out.println("No max");
			}
			else if (val1 > val2) {
				System.out.println("Max is " + val1);
			}
			else {
				System.out.println("Max is " + val2);
			}

		}
	}
}
