package com.briup; 

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/** 
 * @author yyj 
 * @version CreateTime：2018年4月13日 上午10:10:46 
 * 时间格式转换
 */
public class DateTest {
	
	public static void main(String[] args) {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = new Date();
		System.out.println(df.format(d));
		//聚宝盆
		Random r = new Random();
		System.out.println(r.nextInt(100));
		
		//学习之神
		//List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
			
	
		for(int i=1;i<=100;i++){
			set.add(i);
		}
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

}
 