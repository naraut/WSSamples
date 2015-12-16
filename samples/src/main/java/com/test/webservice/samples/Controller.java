package com.test.webservice.samples;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.ClassUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/primeGen")
	public List<Integer> generatePrimeNumbers(@Validated @RequestParam(value="limit", defaultValue="10") int limit) {
		return Strategy.getStrategy(limit).getPrimeNumbers(limit);
	}
	
	@ExceptionHandler(Exception.class)
	public String handleNumberFormatException(Exception ex, HttpServletRequest request) {
	    return "Exception while processing request : \n" + ex;
	}
}
