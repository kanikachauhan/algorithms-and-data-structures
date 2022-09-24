package com.daa.practice.stack;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class StackTest {
	
	private StackBasics stackBasics;
	
	@BeforeEach
	public void setUp() {
		stackBasics = new StackBasics();
	}
	
	
	
	@Test
	public void testPushAndPop() {
		stackBasics.pushStack(1);
		stackBasics.pushStack(2);
		stackBasics.pushStack(3);
		stackBasics.pushStack(4);
		assertEquals(4, stackBasics.popStack());
		assertEquals(3, stackBasics.popStack());
		assertEquals(2, stackBasics.popStack());
		assertEquals(1, stackBasics.popStack());
	}

	@Test
	public void testPrefixToInfixConversion() {
		String str = "*+AB-CD";
		assertEquals("((A+B)*(C-D))", stackBasics.prefixToInfixConversion(str));
	}
	
	@Test
	public void testPrefixToPostfixConversion() {
		String str = "*+AB-CD";
		assertEquals("AB+CD-*", stackBasics.prefixToPostfixConversion(str));
		str = "*-A/BC-/AKL";
		assertEquals("ABC/-AK/L-*", stackBasics.prefixToPostfixConversion(str));
	}
	
	@Test
	public void testPostfixToInfix() {
		String str = "abc++";
		assertEquals("(a+(b+c))", stackBasics.postfixToInfix(str));
		str = "ab*c+";
		assertEquals("((a*b)+c)", stackBasics.postfixToInfix(str));
	}
	
	@Test
	public void testPostfixToPrefix() {
		String str = "AB+CD-*";
		assertEquals("*+AB-CD", stackBasics.postfixToPrefix(str));
		str = "ABC/-AK/L-*";
		assertEquals("*-A/BC-/AKL", stackBasics.postfixToPrefix(str));
	}
	
	
}
