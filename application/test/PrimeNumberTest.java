package application.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import application.PrimeNumber;

public class PrimeNumberTest {

	@Test
	public void check2IsPrimeNumber() {
		assertEquals(true, PrimeNumber.isPrimeNumber(2L));
	}

	@Test
	public void chec12049IsPrimeNumber() {
		assertEquals(true, PrimeNumber.isPrimeNumber(12049L));
	}

	@Test
	public void check1IsNotPrimeNumber() {
		assertEquals(false, PrimeNumber.isPrimeNumber(1L));
	}

	@Test
	public void check1234567IsNotPrimeNumber() {
		assertEquals(false, PrimeNumber.isPrimeNumber(1234567L));
	}

	@Test
	public void checkNegativIsNotPrimeNumber() {
		assertEquals(false, PrimeNumber.isPrimeNumber(-1234567L));
	}

	@Test
	public void checkPrimeFactorsOf12() {
		List<Long> expected = new ArrayList<Long>();
		expected.add(2L);
		expected.add(2L);
		expected.add(3L);
		assertEquals(expected, PrimeNumber.getPrimeFactors(12L));
	}

	@Test
	public void checkPrimeFactorsOf17() {
		List<Long> expected = new ArrayList<Long>();
		expected.add(17L);
		assertEquals(expected, PrimeNumber.getPrimeFactors(17L));
	}

	@Test
	public void checkPrimeFactorsOf1() {
		List<Long> expected = new ArrayList<Long>();
		assertEquals(expected, PrimeNumber.getPrimeFactors(1L));
	}

	@Test
	public void checkPrimeFactorsOfNegativ() {
		List<Long> expected = new ArrayList<Long>();
		assertEquals(expected, PrimeNumber.getPrimeFactors(-12L));
	}
}
