package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

	public static Calculator calc;

	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@BeforeClass
	public static void setUp() {
		System.out.println("@BeforeClass is ran once before everything else in the class.");
		calc = new Calculator();
	}

	@Before
	public void beforeEach() {
		System.out.println("@Before executes before every method.");
	}

	@After
	public void afterEach() {
		System.out.println("@After executes after every method.");
	}

	@AfterClass
	public static void tearDown() {
		System.out.println("@AfterClass occurs after all the tests have ran.");
		// ie: closing resources
	}

	@Test
	public void testInstantiation() {
		assertNotNull(calc);
	}

	@Test
	public void testAddition() {
		assertEquals(2, calc.add(1, 1));
	}

	@Test(expected = ArithmeticException.class)
	public void testAdding15() {
		calc.add(15, 1);
	}
	
	@Test
	public void testAdding15Message(){
		expectedException.expectMessage("We don't like 15");
		calc.add(15, 1);
	}
}
