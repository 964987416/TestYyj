package com.briup;
/**
 * 选择排序
 * @author moose
 *
 */


public class Choose {
	public static void main(String[] args) {
		int b[] = { 20, 40, 34, 10, 30, 60 };
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					int temp = 0;
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
				}
				for (int s = 0; s < b.length; s++) {
					System.out.print(b[s] + "\t");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
}
