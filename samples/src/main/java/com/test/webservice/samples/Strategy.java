package com.test.webservice.samples;

public class Strategy {
	
	private static final PrimeNumberGenerator erasSieve = new EratosthenesSieve();
	private static final PrimeNumberGenerator sundaramSieve = new SundaramSieve();
	
	public static PrimeNumberGenerator getStrategy(int limit) {		
		if(limit <0) throw new IllegalArgumentException("Negative numbers not allowed.");
		if(limit < 5_000_000) {
			return sundaramSieve;
		}else{
			return erasSieve;
		}
	}
}
