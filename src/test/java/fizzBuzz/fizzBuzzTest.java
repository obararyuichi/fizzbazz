package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzBuzzTest {

	@Test
	void testFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz2(15));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz2(30));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzz2(90));
	}

	@Test
	void testFizz() {
		assertEquals("Fizz", fizzBuzz.fizzBuzz2(3));
		assertEquals("Fizz", fizzBuzz.fizzBuzz2(6));
		assertEquals("Fizz", fizzBuzz.fizzBuzz2(9));
		assertEquals("Fizz", fizzBuzz.fizzBuzz2(12));
		assertEquals("Fizz", fizzBuzz.fizzBuzz2(18));
	}

	@Test
	void testBuzz() {
		assertEquals("Buzz", fizzBuzz.fizzBuzz2(5));
		assertEquals("Buzz", fizzBuzz.fizzBuzz2(10));
		assertEquals("Buzz", fizzBuzz.fizzBuzz2(20));
	}

	@Test
	void testNumber() {
		assertEquals("1", fizzBuzz.fizzBuzz2(1));
		assertEquals("2", fizzBuzz.fizzBuzz2(2));
		assertEquals("4", fizzBuzz.fizzBuzz2(4));
		assertEquals("7", fizzBuzz.fizzBuzz2(7));

	}

}
