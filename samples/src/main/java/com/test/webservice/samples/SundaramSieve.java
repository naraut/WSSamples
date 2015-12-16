package com.test.webservice.samples;

import java.util.ArrayList;
import java.util.List;

public class SundaramSieve implements PrimeNumberGenerator {
	
	@Override
	public List<Integer> getPrimeNumbers(int limit)
    {
		long time = System.currentTimeMillis();
		List<Integer> primeList = new ArrayList<>(limit/3);
		int n = limit/2;
        boolean[] primes = new boolean[limit];        
 
        for (int i = 1; i < n; i++)
            for (int j = i; j <= (n - i) / (2 * i + 1); j++)
                primes[i + j + 2 * i * j] = true;
        
        primeList.add(2);
        primeList.add(3);
        for (int i = 2; i < primes.length/2; i++)
            if (!primes[i])
            	primeList.add((2 * i + 1));
        
        System.out.println("The number of primes <= " + limit + " is " + primeList.size() + " Time taken: " +(System.currentTimeMillis()-time) +" (ms)");
        return primeList;
    }
}
