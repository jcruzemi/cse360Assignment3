package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		//fail("Not yet implemented");
		Calculator temp = new Calculator();
		assertNotNull(temp);
	}

	@Test
	public void testGetTotal() {
		Calculator temp = new Calculator();
		assertEquals(0, temp.getTotal());
		//assuming other functions work
		temp.add(2);
		assertEquals(2, temp.getTotal());
		temp.subtract(3);
		assertEquals(-1, temp.getTotal());
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator temp = new Calculator();
		temp.add(1);
		temp.add(3);
		temp.add(0);
		temp.add(10);
		assertEquals(14, temp.getTotal());
		temp.add(-2);
		assertEquals(12, temp.getTotal());
		temp.add(2);
		temp.add(6);
		assertEquals(20, temp.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator temp = new Calculator();
		temp.add(1);
		temp.add(3);
		temp.add(0);
		temp.add(10);
		temp.add(-2);
		temp.add(2);
		temp.add(6);
		temp.subtract(6);
		assertEquals(14, temp.getTotal());
		temp.subtract(-1);
		assertEquals(15, temp.getTotal());
		temp.subtract(10);
		temp.subtract(5);
		assertEquals(0, temp.getTotal());
		temp.subtract(20);
		assertEquals(-20, temp.getTotal());
		
	}

	@Test
	public void testMultiply() {
		Calculator temp = new Calculator();
		temp.add(1);
		temp.multiply(2);
		assertEquals(2, temp.getTotal());
		temp.multiply(1);
		assertEquals(2,temp.getTotal());
		temp.multiply(5);
		assertEquals(10, temp.getTotal());
		temp.multiply(10);
		assertEquals(100, temp.getTotal());
		temp.multiply(0);
		assertEquals(0, temp.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator temp = new Calculator();
		temp.add(1);
		temp.divide(0);
		assertEquals(0, temp.getTotal());
		temp.add(100);
		temp.divide(1);
		assertEquals(100, temp.getTotal());
		temp.divide(2);
		assertEquals(50, temp.getTotal());
		temp.divide(5);
		assertEquals(10, temp.getTotal());
		temp.divide(0);
		assertEquals(0, temp.getTotal());
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
