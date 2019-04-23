package com.briup;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author yyj
 * @version CreateTime：2018年9月11日 下午5:21:16
 *
 */

public class TempTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 25, -15, 20);

		System.out.println("list.size():"+list.size());
		//jdk7
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		//jdk8
		System.out.println(" ");
		list.forEach(i -> System.out.print(i+" "));
		
		System.out.println("");

	}
}
