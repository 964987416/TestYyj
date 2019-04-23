package com.briup;

import java.util.ArrayList;
import java.util.List;

/**
 * 输出1-100中能被3整除的数
 * 
 * @author moose
 *
 */

public class Foreach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			int a = 3;

			if (i % a == 0) {
				list.add(i);
			}

		}
		//foreach
		for (int b : list) {
			System.out.println(b);
		}

	}

}
