package com.briup.Test50Example;


/**
 * @author yyj
 * @version CreateTime：2018年11月7日 下午3:44:56 求0—7所能组成的奇数个数。
 */
public class UTest43 {

	public static void main(String[] args) {
		int count = Function();
		System.out.println("1-7能组成的三位数奇数一共有" + count + "个");

	}

	public static int Function() {
		int temp = 0;
		int count = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				for (int k = 1; k <= 7; k++) {
					temp = (i * 100 + j * 10 + k);
					if (temp % 2 == 0) {
						count++;
					}

				}
			}

		}

		return count;
	}
}
