package com.yyjnewwork;

/**
 * @author yyj
 * @version CreateTime：2018年7月29日 下午7:23:32 统计 101到200的素数数量 并输出
 * 
 */
public class Sushu {

	public static void main(String[] args) {
		/*
		 * int m = 101; int n = 200; int count = 0; // 统计素数个数 for (int i = m; i
		 * <= n; i++) { for (int j = 2; j <i; j++) { if (!(i % j == 0)) {
		 * System.out.print(i + " "); count++; }
		 * 
		 * } if (count % 10 == 0) { System.out.println(); } }
		 * System.out.println(); System.out.println(count);
		 */

		int count = 0;
		for (int i = 101; i < 200; i += 2) {
			boolean b = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b == true) {
				count++;
				System.out.print(i+" ");
				if(count%10==0){
					System.out.println();
				}
			}
		}
		System.out.println("素数个数是: " + count);

	}
}
