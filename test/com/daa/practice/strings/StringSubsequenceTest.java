package com.daa.practice.strings;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringSubsequenceTest {

	private StringSubsequence stringSubsequence;
	
	
	@BeforeEach
	public void setUp() {
		stringSubsequence = new StringSubsequence();
	}
	
	@Test
	public void testisSubsequence() {
		assertTrue(stringSubsequence.isSubsequence("geeksforgeeks", "gksrek"));
	}
	
}
