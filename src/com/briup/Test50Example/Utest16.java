package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月31日 下午2:53:17 【程序16】 题目：输出9*9口诀。
 *          程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
 */
public class Utest16 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println(" ");
		}

	}
}
