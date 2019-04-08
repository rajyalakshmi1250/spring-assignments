package com.capgemini.spring.math;
import org.springframework.stereotype.*;

@Component
public class CalculatorImpl implements Calculator
{
	public void add(int num1, int num2)
	{
		System.out.println(num1+num2);
	}
	public void divide(double num1,double num2)
	{
		System.out.println(num1/num2);
	}
}
