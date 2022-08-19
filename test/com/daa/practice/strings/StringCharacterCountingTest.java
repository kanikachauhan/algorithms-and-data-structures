package com.daa.practice.strings;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCharacterCountingTest {

	private StringCharacterCounting stringCharacterCounting;
	
	@BeforeEach
	public void setUp() {
		stringCharacterCounting = new StringCharacterCounting();
	}
	
	@Test
	public void testCountDifferentCases() {
		String str = "#GeeKs01fOr@gEEks07";
		assertEquals(5, stringCharacterCounting.countUpperCase(str));
		assertEquals(8, stringCharacterCounting.countLowerCase(str));
		assertEquals(2, stringCharacterCounting.countSpecial(str));
		assertEquals(4, stringCharacterCounting.countNumbers(str));
	}
	
	@Test
	public void testNumberOfSubstrings() {
		String str = "abc";
		assertEquals(6, stringCharacterCounting.numberOfSubstrings(str));
		str = "abcde";
		assertEquals(15, stringCharacterCounting.numberOfSubstrings(str));
	}
	
	@Test
	public void testSamePositionAsInEnglish() {
		String str = "ABcED";
		assertEquals(3, stringCharacterCounting.numberSamePositionASEnglish(str));
	}
	
	@Test
	public void testNumberOfSubstringsWithsameEndings() {
		String str = "abcab";
		assertEquals(7, stringCharacterCounting.numberOfSubstringsWithsameEndings(str));
	}
	
	@Test
	public void testCommonCharactersInAlphabeticalOrder() {
		String str1 = "geeks";
		String str2 = "forgeeks";
		assertEquals("eegks", stringCharacterCounting.commonCharactersInAlphabeticalOrder(str1, str2));
	}
	
	@Test
	public void testDistinctCharactersInString() {
		String str = "Hello Geeks";
		assertEquals("HoGks", stringCharacterCounting.distinctCharactersInString(str));
		str = "Geeks for Geeks";
		assertEquals("for", stringCharacterCounting.distinctCharactersInString(str));
	}
	
	@Test
	public void testRemoveVowelsFromString() {
		String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
		assertEquals("GksfrGks -  Cmptr Scnc Prtl fr Gks", stringCharacterCounting.removeVowelsFromString(str));
	}
	
	@Test
	public void testRemoveConsecutiveVowels() {
		String str = "your article is in queue";
//		assertEquals("yor article is in qu", stringCharacterCounting.removeConsecutiveVowels(str));
	}
	
	@Test
	public void testCountVowels() {
		String str = "geeksforgeeks portal";
		assertEquals(7, stringCharacterCounting.countVowels(str, 0, 0));
	}

	@Test
	public void testCountConsonants() {
		String str = "geeksforgeeks portal";
		assertEquals(12, stringCharacterCounting.countConsonants(str, 0, 0));
	}

	@Test
	public void testHalvesHaveSameCharacters() {
		String str = "abccab";
		assertTrue(stringCharacterCounting.halvesHaveSameCharacters(str));
	}
}

