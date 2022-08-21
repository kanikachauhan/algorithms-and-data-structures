package com.daa.practice.strings;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringReverseRotationTest {
	
	private StringReverseRotation stringReverseRotation;
	
	@BeforeEach
	public void setUp() {
		stringReverseRotation = new StringReverseRotation();
	}

	@Test
	public void testLeftRotate() {
		String str = "GeeksforGeeks";
		assertEquals("eksforGeeksGe", stringReverseRotation.leftRotate(str, 2));
	}
	
	@Test
	public void testRightRotate() {
		String str = "GeeksforGeeks";
		assertEquals("ksGeeksforGee", stringReverseRotation.rightRotate(str, 2));
	}
	
	@Test
	public void testReverseEquation() {
		String str = "20-3+5*2";
		assertEquals("2*5+3-20", stringReverseRotation.reverseEquation(str));
	}
	
	@Test
	public void testCheckIfTwoStringsAreRotations() {
		String str1 = "GEEKS";
		String str2 = "EKSGE";
		assertTrue(stringReverseRotation.checkIfTwoStringsAreRotations(str1, str2));
	}
	
	@Test
	public void testReverse() {
		String str = "abcde";
		assertEquals("edcba", stringReverseRotation.reverse(new StringBuilder(), str, 0, str.length()));
	}

	@Test
	public void testReverseWithoutEffectingSpecialCharacters() {
		String str = "Ab,c,de!$";
		assertEquals("ed,c,bA!$", stringReverseRotation.reverseWithoutEffectingSpecialCharacters(str));
	}

	@Test
	public void testReverseWordsOfString() {
		String str  = "i like this program very much";
		assertEquals("much very program this like i", stringReverseRotation.reverseWordsOfString(str));
	}

	@Test
	public void testReverseIndidualWords() {
		String str = "Hello World";
		assertEquals("olleH dlroW", stringReverseRotation.reverseIndidualWords(str));
	}
	
	@Test
	public void testReverseWordsPreservingSpaces() {
		String str = "abc de";
		assertEquals("edc ba", stringReverseRotation.reverseWordsPreservingSpaces(str));
	}
	
	@Test
	public void testReverseStringRemoveVowels() {
		String str = "geeksforgeeks";
		assertEquals("skgrfskg", stringReverseRotation.reverseStringRemoveVowels(str));
	}

	@Test
	public void testCheckIfCircularRotations() {
		int mat[][] = {{1, 2, 3, 4},
		        {4, 1, 2, 3},
		        {3, 4, 1, 2},
		        {2, 3, 4, 1}
		        };
		assertTrue(stringReverseRotation.checkIfCircularRotations(mat));
	}
	
}
