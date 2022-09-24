package com.daa.practice.strings;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringOccurrenceTest {
	
	private StringOccurrence stringOccurrence;

	@BeforeEach
	public void setUp() {
		stringOccurrence = new StringOccurrence();
	}
	
	@Test
	public void testKthNonRepeatingCharacter() {
		String str = "geeksforgeeks";
		assertEquals('r', stringOccurrence.kthNonRepeatingCharacter(str, 3));
	}
	
	@Test
	public void testfirstRepeatedCharacter() {
		String str = "geeksforgeeks";
		assertEquals('e', stringOccurrence.firstRepeatedCharacter(str));
	}
	
	@Test
	public void testMaxOccuringCharacter() {
		String str = "sample string";
		assertEquals('s', stringOccurrence.maxOccuringCharacter(str));
	}
	
	@Test
	public void testFirstNonRepeatedCharacter() {
		String str = "geeksforgeeks";
		assertEquals('f', stringOccurrence.firstNonRepeatedCharacter(str));
	}
	
	@Test
	public void testMaxConsecutiveRepeatingCharacter() {
		String str = "aaaabbaaccde";
		assertEquals('a', stringOccurrence.maxConsecutiveRepeatingCharacter(str));
		str = "geeekk";
		assertEquals('e', stringOccurrence.maxConsecutiveRepeatingCharacter(str));
	}
	
	@Test
	public void testCheckOccurrencesTogether() {
		assertFalse(stringOccurrence.checkOccurrencesTogether( "abcabc", 'c'));
		assertFalse(stringOccurrence.checkOccurrencesTogether("3231131", '1'));
	}
}
