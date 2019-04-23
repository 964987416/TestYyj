package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月18日 下午5:14:51
 *          题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 *          例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Test3 {
	// 分析从100-999循环遍历每个数字将各位十位百位的数字分别进行立方运算，再相加若等于原来的数字 则输出 若不等于则继续遍历
	public static int cheng3(int n) {

		int res = n * n * n;

		return res;
	}

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100;
			int b = (i - a * 100) / 10;
			int c = i - (a * 100 + b * 10);

			int res = cheng3(a) + cheng3(b) + cheng3(c);
			if (res == i) {
				System.out.println(i);
			}

		}

	}

}
