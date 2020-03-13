package com.cts.training.lambda;

public class LambdaExpressionOne {
public static void main(String[] args) {
	Calculate add=(a,b)->a+b;
	System.out.println(add.calculate(4, 2));
	Calculate sub=(a,b)->a-b;
	System.out.println(sub.calculate(4, 2));
	Calculate mul=(a,b)->a*b;
	System.out.println(mul.calculate(4, 2));
	Calculate div=(a,b)->a/b;
	System.out.println(div.calculate(4, 2));
	}
}


interface Calculate
{
	double calculate(double a,double b);
	
}