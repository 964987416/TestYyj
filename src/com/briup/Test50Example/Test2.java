package com.briup.Test50Example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yyj
 * @version CreateTime：2018年10月19日 上午9:57:29 题目：判断101-200之间有多少个素数，并输出所有素数。
 *          程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 */
public class Test2 {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=101;i<=200;i++){
			map.put(i, i);
		}
		for (int i = 101; i <= 200; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					map.remove(i);
					continue;
				}
			}
		}
		for (Integer a : map.keySet()) {
			System.out.print(map.get(a)+" ");
		}
		System.out.println("");
		System.out.println("在101和200之间一共有"+map.size()+"个素数");
	}
}
