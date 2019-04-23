package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月31日 下午4:16:32 求1+2!+3!+...+20!的和
 */
public class UTest21 {
	// 阶乘
	public static long Function(int n) {
		long sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += Function(i);
		}
		System.out.println(sum);

	}
}
