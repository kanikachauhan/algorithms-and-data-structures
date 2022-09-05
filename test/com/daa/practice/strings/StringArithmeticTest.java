package com.daa.practice.strings;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringArithmeticTest {

	private StringArithmetic stringArithmetic;
	
	@BeforeEach
	public void setUp() {
		stringArithmetic = new StringArithmetic();
	}
	
	@Test
	public void testIsDivisibleBy11() {
		assertTrue(stringArithmetic.isDivisibleBy11("76945"));
	}
	
	@Test
	public void testisDivisibleBy4() {
		assertTrue(stringArithmetic.isDivisibleBy4("1124"));
	}
	
	@Test
	public void testisEvenOrOdd() {
		assertTrue(stringArithmetic.isEvenOrOdd("8918"));
	}
	
	@Test
	public void testsumAddNumbers() {
		assertEquals(24, stringArithmetic.sumAddNumbers("1abc23"));
	}
	
	@Test
	public void testmaximumNumericValue() {
		assertEquals(564, stringArithmetic.maximumNumericValue("100klh564abc365bg"));
	}
}
