package com.briup.Test50Example;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yyj
 * @version CreateTime：2018年10月31日 上午11:09:09
 *          题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class Utest11 {

	public static Set<Integer> Function() {
		int[] a = { 1, 2, 3, 4 };
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k< a.length; k++) {
					int b = a[i] * 100 + a[j] * 10 + a[k];
					if(i!=j&&j!=k&&i!=k){
						hashSet.add(b);
					}
				}
			}
		}
		return hashSet;
	}
	
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
			hashSet = Function();
		for (Integer i: hashSet) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		System.out.println("一共可以组合出"+hashSet.size()+"个数字");
		
	}
}
