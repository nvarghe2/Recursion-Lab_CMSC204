package lab3;

/*
 * CLASS : CMSC204
 * LAB 3
 * INSTRUCTOR : Dr.Kuijt
 * DESCRIPTION : Recursion Lab
 * DUE : 10/1/23
 *  I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 * STUDENT : NIKITTA JOAN VARGHESE
 */


public class ArraySum {

	/**
	 * Recursive method to sum the values in an array of integers
	 * @param a the integer of arrays
	 * @param index the number in the array to summed next
	 * @return sum - the sum of values in array
	 */
	public int sumOfArray(Integer[] a, int index) {
		if (index < 0) {
			return 0;
		}
		return sumOfArray(a, index-1) + a[index];
	}
}