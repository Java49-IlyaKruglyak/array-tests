package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static telran.arrays.MyArraysInt.*;

class MyArraysIntTest {

	@Test
	void testAddNumber() {
		//TODO
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3, 3};
		int expected2[] = {1, 2, 3, 1};
		int expected3[] = {1, 2, 3, 6};
		assertArrayEquals(expected1, addNumber(array, 3));
		assertArrayEquals(expected2, addNumber(array, 1));
        assertArrayEquals(expected3, addNumber(array, 6));
	}

	@Test
	void testRemoveNumber() {
		//TODO
		int[] array = {1, 2, 3};
		int[] expected = {1, 2};
		assertArrayEquals(expected, removeNumber(array, 2));
	}

	@Test
	void testInsertNumber() {
		//TODO
	}
	@Test
	void testCopyOf() {
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3};
		int expected2[] = {1};
		int expected3[] = {1, 2, 3, 0, 0, 0};
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}
	@Test
	void testArraycopy() {
		int array[] = {1, 2, 3};
		int expected[] = {5, 10, 1, 2, 20};
		int arrayDestination[] = new int[5];
		int array1[] = {2, 5, 10};
		System.arraycopy(array, 0, arrayDestination, 2, 2);
		System.arraycopy(array1, 1, arrayDestination, 0, 2);
		arrayDestination[4] = 20;
		assertArrayEquals(expected, arrayDestination);
		
	}
	@Test
	void testBinarySearchInt() {
	
		//Arrays.binarySearch(array, number)
		//TODO
		//Write tests for standard method binatySearch of the Class arrays taking array of ints and int number
	}

}
