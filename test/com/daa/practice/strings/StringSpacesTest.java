package com.daa.practice.strings;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StringSpacesTest {
	
	private StringSpaces stringSpaces;
	
	@BeforeEach
	public void setUp() {
		stringSpaces = new StringSpaces();
	}
	
	@Test
	public void testRemoveSpaces() {
		assertTrue(stringSpaces.removeSpaces("g eeks for ge eeks ").equals("geeksforgeeeks"));
	}
	
	@Test
	public void testMoveSpacesFront() {
		assertTrue(stringSpaces.moveSpacesFront("move these spaces to beginning").equals("    movethesespacestobeginning"));
	}

}
