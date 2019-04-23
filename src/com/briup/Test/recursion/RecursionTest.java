package com.briup.Test.recursion;

/**
 * 使用递归求5的阶乘
 * 
 * @author moose
 *
 */
public class RecursionTest {
	public static void main(String[] args) {
		System.out.println(f(5));
		System.out.println(add(100));
	}

	public static int f(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * f(n - 1);
		}

	}
	public static int add(int n){
		if(n==1){
			return 1;
		}else{
			return n+add(n-1);
		}
		
		
	}
}
