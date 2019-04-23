package com.briup;

import java.math.BigDecimal;

/**
 * @author yyj
 * @version CreateTime：2018年10月8日 上午10:35:27
 * 
 */
public class TempTest1 {
	public static void main(String[] args) {

	        BigDecimal a = new BigDecimal("2.3");
	        BigDecimal b = new BigDecimal("3.1341");
	        BigDecimal c = new BigDecimal("53.5234");
	        
	        System.out.println("a+b="+a.add(b));
	        System.out.println("c-a="+c.subtract(a));

	        
	}
}
