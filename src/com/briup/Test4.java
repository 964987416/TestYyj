package com.briup;

public class Test4 {
	public static void main(String[] args) {
		// 冒泡排序
		int temp = 0;
		int a[] = { 12, 23, 24, 53, 76, 34, 2, 25, 6 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + "\t");
		}
	}
}