package com.briup.Test50Example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yyj
 * @version CreateTime：2018年10月19日 下午2:42:47 题目：输入一行字符，分别统计出其中英文字母数字的个数。
 */
public class Test7 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String str = "qishinishiaiwodeqishiniyehebude";
		char[] c = str.toCharArray();
		for (char ch : c) {
			if (!map.keySet().contains(ch)) {
				map.put(ch, 0);
			}
			// 计数，将值+1
			int count = map.get(ch);
			map.put(ch, count + 1);

		}
		for (char d : map.keySet()) {
			System.out.println("字母" + d + "出现了" + map.get(d) + "次");
		}
	}

}
