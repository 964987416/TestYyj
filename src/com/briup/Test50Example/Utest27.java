package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月31日 下午4:57:36 求100以内的素数
 * 素数 大于1的数除了1和它本身以外不再有其他因数
 */
public class Utest27 {
	public static boolean Function(int n) {
		boolean b = false;
		for (int i = 2; i <= n / 2 + 1; i++) {
			if(n%i==0){
				return b;
			}
		}
		b=true;
		return b;
	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			if (Function(i)) {
				System.out.println(i);
				count++;
			}

		}
		System.out.println("一共有"+count+"个");
	}
}
