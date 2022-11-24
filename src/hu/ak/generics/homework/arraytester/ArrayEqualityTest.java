package hu.ak.generics.homework.arraytester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayEqualityTest {

	@Test
	public void testArraysWithNullValue() {
		Object[] nullArray = { null, null, null };
		Object[] arrayA = { "1", 2, null };
		assertFalse(ArrayTester.equivalent(nullArray, arrayA));
	}

	@Test
	public void testArraysWithDifferentLengths() {
		Object[] arrayA = { "1", 2, 3 };
		Object[] arrayB = { "1", 2, 3, '4' };
		assertFalse(ArrayTester.equivalent(arrayA, arrayB));
	}

	@Test
	public void testArraysWithSameElements() {
		Object[] arrayA = { "1", 2, 3 };
		Object[] arrayB = { "1", 2, 3 };
		assertTrue(ArrayTester.equivalent(arrayA, arrayB));
	}

	@Test
	public void testArrayWithoutValue() {
		Object[] arrayA = { "1", 2, 3 };
		Object[] arrayB = null;
		assertFalse(ArrayTester.equivalent(arrayA, arrayB));
	}

	@Test
	public void testEmptyArrays() {
		Object[] emptyArray = {};
		Object[] arrayA = { "1", 2, null };
		assertFalse(ArrayTester.equivalent(emptyArray, arrayA));
	}

	@Test
	public void testArraysWithThreeDifferentLengths() {
		Object[] arrayA = { "1", 2, 3 };
		Object[] arrayB = { "1", 2, 3, '4' };
		Object[] arrayC = { 3, '4' };
		assertFalse(ArrayTester.equivalent(arrayA, arrayB, arrayC));
	}

	@Test
	public void testThreeArraysWithSameElements() {
		Object[] arrayA = { "1", 2, 3 };
		Object[] arrayB = { "1", 2, 3 };
		Object[] arrayC = { "1", 2, 3 };
		assertTrue(ArrayTester.equivalent(arrayA, arrayB, arrayC));
	}

	@Test
	public void testThreeArraysAsTwoAreEmpty() {
		Object[] arrayA = {};
		Object[] arrayB = {};
		Object[] arrayC = { 1, 2, 3 };
		assertFalse(ArrayTester.equivalent(arrayA, arrayB, arrayC));
	}
	
	@Test
	public void testTwoEmptyArrays() {
		Object[] arrayA = {};
		Object[] arrayB = {};
		assertTrue(ArrayTester.equivalent(arrayA, arrayB));
	}
}