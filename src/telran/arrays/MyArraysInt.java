package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
	public static int [] addNumber(int[] array, int num) {
		
		int[] newArray = Arrays.copyOf(array, array.length+1);
		newArray[array.length] = num;
		return newArray;
	}

	public static int[] removeNumber(int[] array, int index) {
		//TODO
		//removes element at a given index for right index value [0 - array.length-1] and returns new array with no the removed one
		//returns the source array if for a wrong index value(less than 0 or greater than array.lenght-1)
		//using the standard method System.arraycopy
		// Check if index is valid
	    if (index < 0 || index >= array.length) {
	        return array;
	    }
	    int[] newArray = new int[array.length - 1];
	    
	    System.arraycopy(array, 0, newArray, 0, index);
	    System.arraycopy(array, index+1, newArray, index, (array.length-1) - index);
	    return newArray;

	}
	
	
	public static int[] insertNumber(int[] array, int index, int num) {
		//TODO
		//inserts a given num at a given index for right value of index [0 - array.lengt] and return new array with the inserted num
		//return the source array for a wrong index value (less than 0 or greater than array.lenght-1)
		//using the standard method System.arraycopy
		int[] result = array;
		if(index > -1 && index <= array.length) {
			result = new int[array.length +1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index, result, index + 1, array.length - index);
			result[index] = num;
			
		}
		return result;
	}
	
	public static int[] insertNumberSorted(int[] array, int num) {
		int index = Arrays.binarySearch(array, num);
		if(index < 0) {
			index = -index - 1;
		}
		return insertNumber(array, index, num);
	}
}
