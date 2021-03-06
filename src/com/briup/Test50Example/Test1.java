package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月19日 上午9:40:53 【程序1】
 *          题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 *          假如兔子都不死，问每个月的兔子对数为多少？ 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 * 
 */
public class Test1 {
	public static int Function(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return Function(n - 1) + Function(n - 2);
		}
	}

	public static void main(String[] args) {
		int i =8;
		System.out.println(Function(i));
	}

}
