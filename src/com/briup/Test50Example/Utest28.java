package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年11月1日 下午3:14:46 对10个数进行排序 选择/冒泡/插入排序
 */
public class Utest28 {

	// 冒泡排序
	public static void Function() {
		int[] a = { 3, 13, 6, 46, 7, 4, 2, 59, 8, 34, 134 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				int temp = 0;
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;

				}
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	// 选择排序
	// 遍历一遍找出最小的值将他放到index=0 即i=0的位置上

	public static void Function1() {
		int b[] = { 20, 40, 34, 10, 30, 60 };
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					int temp = 0;
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
				}

			}
		}
		for (int i : b) {
			System.out.print(i + " ");
		}
	}

	// 插入排序
	

	public static void main(String[] args) {
		// 冒泡
		Function();
		System.out.println(" ");
		// 选择排序
		Function1();
	}
}
