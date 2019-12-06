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

	@Test
	public void checkAllPrimeNumbersInRange() {
		List<Long> expected = new ArrayList<Long>();
		expected.add(2L);
		expected.add(3L);
		expected.add(5L);
		expected.add(7L);
		expected.add(11L);
		expected.add(13L);
		expected.add(17L);
		expected.add(19L);
		expected.add(23L);
		expected.add(29L);
		expected.add(31L);
		expected.add(37L);
		expected.add(41L);
		expected.add(43L);
		expected.add(47L);
		expected.add(53L);
		expected.add(59L);
		expected.add(61L);
		expected.add(67L);
		assertEquals(expected, PrimeNumber.getAllPrimeNumbersInRange(0, 70));
	}
}
