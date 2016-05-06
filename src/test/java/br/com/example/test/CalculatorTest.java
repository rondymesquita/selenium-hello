package br.com.example.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.example.Calculator;

/*
 * Basic unit test with junit
 */
public class CalculatorTest{
	
	Calculator calculator;
	
	@Before
	public void before(){
		calculator = new Calculator();
	}
	
	@After
	public void after() throws Exception{
    	
	}
	
	@Test
	public void shouldSumTwoValidNumbers(){
		calculator.sum(1, 2);
		Assert.assertEquals(3, calculator.getResult());
	}
}
