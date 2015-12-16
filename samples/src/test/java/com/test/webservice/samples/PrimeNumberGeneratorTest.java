package com.test.webservice.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.Assert;

@RunWith(JUnit4.class)
public class PrimeNumberGeneratorTest {

	private PrimeNumberGenerator primeNumberGenerator;
	
	@Test
	public void testEratosthenesSieve() {
		primeNumberGenerator = new EratosthenesSieve();
		List<Integer> expected = Arrays.asList(new Integer[]{2,3,5,7});
		Assert.assertEquals("Generated Prime number are not correct",expected, primeNumberGenerator.getPrimeNumbers(10));
	}
	
	@Test
	public void testSundaramSieve() {
		primeNumberGenerator = new SundaramSieve();
		List<Integer> expected = Arrays.asList(new Integer[]{2,3,5,7});
		Assert.assertEquals("Generated Prime number are not correct",expected, primeNumberGenerator.getPrimeNumbers(10));
	}
		
}
