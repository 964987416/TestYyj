package com.briup.Test50Example;


/**
 * @author yyj
 * @version CreateTime：2018年10月30日 下午3:57:42
 *          一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
 *          引入test4中分解质因数的方法
 */
public class Test9 {
	public static void main(String[] args) {
		int n = 10000;
		compNumber(n);
	}

	// 求完数
	private static void compNumber(int n) {
		int count = 0;
		System.out.println(n + "以内的完数：");
		for (int i = 1; i <= n ; i++) {
			int sum = 0;
			//只需循环一半的次数即可得出i的所有因数
			for (int j = 1; j < i / 2 + 1; j++) {
				if ((i % j) == 0) {
					//如果i能够整除j则j是i的因数，将j全部相加
					sum += j;
					if (sum == i) {
						System.out.print(i + " ");
						if ((count++) % 5 == 0)
							System.out.println();
					}
				}
			}
		}
	}
}