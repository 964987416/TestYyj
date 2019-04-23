package com.briup.oldTest;
/**
 * 冒泡排序
 * @author moose
 *
 */

public class Bubble {
	public static void main(String[] args) {

		int[] a = { 30, 22, 70, 60, 80 };
		for (int o = 0; o < a.length - 1; o++) {
			for (int i = 0; i < a.length - 1; i++) {
				int temp = 0;
				if (a[i] < a[i + 1]) {
					temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
				}

			}
		}
		for (int l = 0; l < a.length; l++) {
			System.out.print(a[l] + "\t");
		}
	}
}
