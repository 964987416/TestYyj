package com.briup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author yyj
 * @version CreateTime：2018年10月17日 上午9:35:31 map遍历的四种方式
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", "five");

		// 一、拿到所有的key进行遍历
		System.out.println("第一种方式 通过拿到所有的key遍历map");
		Set<String> set = map.keySet();
		for (String str : set) {
			System.out.println("map.key: " + str + " map.value: "
					+ map.get(str));
		}
		System.out.println("第二种方式 拿到map的entry实体来拿到所有的key,value");

		// 二、通过iteratror拿到map的entry实体再来拿到所有的key和values
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println("map.key = " + entry.getKey() + " map.value:"
					+ entry.getValue());
		}
		System.out.println("第三种遍历方式 entry实体foreach 遍历map.entry拿到key和values");
		// 三、在map容量大时直接foreach遍历entryset遍历map
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("map.key = " + entry.getKey() + " map.value:"
					+ entry.getValue());
		}
		System.out.println("第四种遍历方式遍历所有的values但不能遍历key");
		// 四、遍历所有的values但不能遍历key
		for (String str : map.values()) {
			System.out.println("map.values() " + str);
		}

	}

}
