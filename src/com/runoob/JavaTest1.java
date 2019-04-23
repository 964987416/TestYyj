package com.runoob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yyj
 * @version CreateTime：2019年1月15日 下午3:32:42
 * 
 */
public class JavaTest1 {

	public static void main(String[] args) {
		// while
		/*
		 * int i = 10; while (i >= 0) { System.out.println("i:" + i); i--; }
		 */
		// do while
		/*
		 * int j = 10; do{ j--; System.out.println("j:"+j); }while(j>0);
		 */
		/*
		 * StringBuffer sb = new StringBuffer(); sb.append("1234567");
		 * sb.reverse(); System.out.println(sb.toString());
		 * 
		 * 
		 * String str[][] = new String[2][2]; str[0][0] = "1,2,3"; str[0][1] =
		 * "2,3,4"; str[1][0] = "3,4,5"; str[1][1] = "4,5,6";
		 * 
		 * for (String[] str1 : str) { for (String str2 : str1) {
		 * System.out.println(str2); } }
		 */
		String str = "abbcccddddeeeeeffffffggggggg";
		char[] c = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c1 : c) {
			if (!map.containsKey(c1)) {
				map.put(c1, 1);
			} else {
				int count = map.get(c1) + 1;
				map.put(c1, count);
			}
		}
		for (char d : map.keySet()) {
			System.out.println("字母"+d+"出现了"+map.get(d)+"次");
		}
	}
}
