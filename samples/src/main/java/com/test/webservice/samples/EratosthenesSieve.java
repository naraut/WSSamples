package com.test.webservice.samples;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesSieve implements PrimeNumberGenerator {

	public List<Integer> getPrimeNumbers(int limit)	{
		long time = System.currentTimeMillis();
		List<Integer> primeList = new ArrayList<>(limit/3); 
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= limit; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
            	primeList.add(i);
            }
        }
        System.out.println("The number of primes <= " + limit + " is " + primeList.size() + " Time taken: " +(System.currentTimeMillis()-time) +" (ms)");
        return primeList;
	}
}
