package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年11月7日 下午4:08:24
 *          题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的
 *          加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
public class UTest48 {

	public static void Function(int n) {
		System.out.println(n);
		int a[] = new int[4];
		a[0] = n / 1000;// 千位
		a[1] = (n / 100) % 10;// 百位
		a[2] = (n / 10) % 10;// 十位
		a[3] = n % 10;// 个位

		a[0] = (a[0] + 5) % 10;
		a[1] = (a[1] + 5) % 10;
		a[2] = (a[2] + 5) % 10;
		a[3] = (a[3] + 5) % 10;

		// 第一位和第四位交换
		int temp = 0;
		temp = a[0];
		a[0] = a[3];
		a[3] = temp;
		// 第二位和第三位交换

		temp = a[1];
		a[1] = a[2];
		a[2] = temp;

		System.out.println(a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3]);

	}

	public static void main(String[] args) {
		Function(1234);
	}

}
