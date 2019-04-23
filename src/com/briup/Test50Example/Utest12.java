package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月31日 下午2:21:11
 *          题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 *          程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。
 */
public class Utest12 {
	public static boolean Function(int n) {
		// 判断完全平方数
		boolean isComp = false;
		for (int i = 1; i < Math.sqrt(n) + 1; i++) {
			if (n == Math.pow(i, 2)) {
				isComp = true;
				break;
			}
		}
		return isComp;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			if (Function(i + 100) && Function(i + 168))
				System.out.println(i);
			;
		}

	}

}
