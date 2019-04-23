package com.briup.Test.recursion;

/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子对数为多少？ 
 * @author moose
 *
 */
public class RecursionTest1 {

	public static int f(int n) {
		if (1 == n || n == 2) {
			return 1;
		} else {
			return f(n - 1) + f(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = 10;
		for(int i =1;i<=n;i++){
			
			System.out.println("第"+i+"个月有"+f(i)+"对兔子");
		}
	}
}
