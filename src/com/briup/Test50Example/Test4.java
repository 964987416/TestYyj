package com.briup.Test50Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyj
 * @version CreateTime：2018年10月18日 下午5:32:12
 *          题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
public class Test4 {
	/**
	 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
	 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
	 * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
	 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
	 */
	static List<Integer> list = new ArrayList<Integer>();

	public static List<Integer> Function(int n) {
		for (int i = 2; i <= n; i++) {
			if ((n % i) == 0) {
				// 将最小因数add到list中
				list.add(i);
				// 如果最小因数已经等于n则返回list
				if (i == n) {
					return list;
				}
				// 再将除后的数执行Function函数继续找寻质因数
				Function(n / i);
				// 将这个循环break掉;
				break;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int e = 125;
		List<Integer> list = Function(e);
		// 90=2*3*3*5
		StringBuffer sb = new StringBuffer();
		sb.append(e + "=");
		for (int a = 0; a < list.size(); a++) {
			if (a == list.size() - 1) {
				sb.append(list.get(a));
			}else{
				sb.append(list.get(a) + "x");
			}
		}
		System.out.println(sb.toString());
	}

}
