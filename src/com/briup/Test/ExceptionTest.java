package com.briup.Test;

/**
 * @author yyj
 * @version CreateTime：2018年4月19日 上午10:04:44
 * 
 */
public class ExceptionTest {
	public static double getArith(double a, double b)
			throws ArithmeticException {
		ArithmeticException ex = new ArithmeticException("对不起，除数为0");
		if (b == 0) {
			throw ex;
		}
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println(getArith(Double.parseDouble("1"),
					Double.parseDouble("0")));
		} catch (Exception e) {
			System.out.println("做您的处理操作");
			e.printStackTrace();
		}
	}
	
	
	
}
