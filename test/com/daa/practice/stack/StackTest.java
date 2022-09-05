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

}
