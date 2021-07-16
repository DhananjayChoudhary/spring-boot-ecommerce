package com.training.ecommerce.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class MathOperationTest {

	@Test
	public void testAddInteger() {
		Integer a = 9;
		Integer b = 4;
		MathOperation mathOperation = new MathOperation();
		assertTrue(13==mathOperation.addInteger(a, b));
		
	}
	
	@Test
	public void testSubtractInteger() {
		Integer a = 9;
		Integer b = 4;
		MathOperation mathOperation = new MathOperation();
		assertTrue(5==mathOperation.subtractInteger(a, b));
		
	}
	
}
