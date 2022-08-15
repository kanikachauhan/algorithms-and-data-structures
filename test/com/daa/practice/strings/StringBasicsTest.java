package com.daa.practice.strings;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringBasicsTest {

	private StringBasics stringBasics;
	
	@BeforeEach
	public void setUp() {
		stringBasics = new StringBasics();
	}
	
	@Test
	public void testCopy() {
		String str = "happy";
		char arr[] = new char[str.length()];
		String returnedString = stringBasics.copyStr(str, 0, arr);
		assertEquals("happy", returnedString);
	}
	
	@Test
	public void testCopyNull() {
		String str = "";
		char arr[] = new char[str.length()];
		String returnedString = stringBasics.copyStr("", 0, arr);
		assertEquals("", returnedString);
	}
	
	@Test
	public void testIsPanagram() {
		String str = "The quick brown fox jumps over the lazy dog";
		assertTrue(stringBasics.isPanagram(str));
		str = "The quick brown fox jumps over the dog";
		assertFalse(stringBasics.isPanagram(str));
	}
	
	@Test
	public void testMissingCharactersToMakePanagram() {
		String str = "welcome to geeksforgeeks";
		assertEquals("abdhijnpquvxyz", stringBasics.missingCharactersToMakePanagram(str));
	}
	
	@Test
	public void testIsPangrammaticLipogram() {
		String str = "The quick brown fox jumped over the lazy dog";
		assertTrue(stringBasics.isPangrammaticLipogram(str));
		str = "The quick brown fox jumps over the lazy dog";
		assertFalse(stringBasics.isPangrammaticLipogram(str));
	}
	
	@Test
	public void testRemovePunctuations() {
		String str = "%welcome' to @geeksforgeek<s";
		assertEquals("welcome to geeksforgeeks",stringBasics.removePunctuations(str));
	}

	@Test
	public void testIfInteger() {
		String str = "6790";
		assertTrue(stringBasics.isInteger(str));
		str = "199.7";
		assertFalse(stringBasics.isInteger(str));
		str = "122B";
		assertFalse(stringBasics.isInteger(str));
	}
	
	@Test
	public void testAllCharactersAreSame() {
		String str = "geeks";
		assertFalse(stringBasics.allCharactersAreSame(str));
		str = "aaaaaaaaaaaaaaaaaaa";
		assertTrue(stringBasics.allCharactersAreSame(str));
	}
	
	@Test
	public void testFindInitials() {
		String str = "abhishek kumar singh";
		assertEquals("A K S", stringBasics.findInitials(str));
	}
	
	@Test
	public void testIsDuckNumber() {
		String str =  "02364";
		assertFalse(stringBasics.isDuckNumber(str));
		str = "707069";
		assertTrue(stringBasics.isDuckNumber(str));
		str = "805089600";
		assertTrue(stringBasics.isDuckNumber(str));
		str = "0200364";
		assertTrue(stringBasics.isDuckNumber(str));
	}
	
}
