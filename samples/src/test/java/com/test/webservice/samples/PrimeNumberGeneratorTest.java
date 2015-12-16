package com.test.webservice.samples;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {

	private PrimeNumberGenerator primeNumberGenerator;
	private int limit;	
	private List<Integer> expectedPrimes;
	
	
	@Parameters	
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{0, Arrays.asList(new Integer[]{})},
    		{1, Arrays.asList(new Integer[]{})},
    		{2, Arrays.asList(new Integer[]{2})},
    		{3, Arrays.asList(new Integer[]{2,3})},
    		{10, Arrays.asList(new Integer[]{2,3,5,7})},
    		{10, Arrays.asList(new Integer[]{2,3,5,7})},
    		{20, Arrays.asList(new Integer[]{2,3,5,7,11,13,17,19})},
    	});
    	
	}
    
    public PrimeNumberGeneratorTest(int limit, List<Integer> expectedPrimes) {
    	this.limit = limit;
    	this.expectedPrimes = expectedPrimes;
    }
    
	@Test
	public void testEratosthenesSieve() {
		primeNumberGenerator = new EratosthenesSieve();
		Assert.assertEquals("EratosthenesSieve is not correct",expectedPrimes, primeNumberGenerator.getPrimeNumbers(limit));
	}
	
	@Test
	public void testSundaramSieve() {
		primeNumberGenerator = new SundaramSieve();
		Assert.assertEquals("SundaramSieve is not correct",expectedPrimes, primeNumberGenerator.getPrimeNumbers(limit));
	}	
}
