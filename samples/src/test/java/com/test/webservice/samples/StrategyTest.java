package com.test.webservice.samples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.Assert;

@RunWith(JUnit4.class)
public class StrategyTest {
	
	@Test
	public void getStrategyForSmallNumbers() {
		PrimeNumberGenerator gen = Strategy.getStrategy(10);
		Assert.assertNotNull(gen);
	}
	
	@Test
	public void getStrategyForLargeNumbers() {
		PrimeNumberGenerator gen = Strategy.getStrategy(1_000_000_000);
		Assert.assertNotNull(gen);
	}
}
