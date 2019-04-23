package com.briup.Test; 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/** 
 * @author yyj 
 * @version CreateTime：2018年1月11日 上午11:08:54 
 * wwqweqdasdafdsfdsferer 字符串中出现的字母一共有哪些
 * 
 */
public class ListTest { 
    public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		String str ="wwqweqdasdafdsfdsferer";
		char[] char1= str.toCharArray();
		for(int i = 0;i<char1.length;i++){
			if(!list.contains(char1[i])){
				list.add(char1[i]);
			}
		}
		/**
		 * for循环遍历
		 * 
		 */
		for(int i = 0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println("");
		/**
		 * iterator循环遍历
		 */
		Iterator<Character> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println("");
		/**
		 * foreach循环遍历
		 */
		for (char c : list) { 
			System.out.print(c+" ");
		}
		System.out.println("");
		
		
		String str1 = "rgerfwddfdfnnfdfsd";
		List<Character> list1 = new ArrayList<Character>();
		char[] c = str1.toCharArray(); 
		for(int j = 0;j<c.length;j++){
			char c1 = c[j];
			if(!list1.contains(c1)){
				list1.add(c1);
			}
		}
		System.out.println(list1.size());
		System.out.println("第一种方式基础遍历");
		//基础遍历
		for(int i =0;i<list1.size();i++){
			System.out.print(list1.get(i));
		}
		System.out.println("");
		System.out.println("第二种方式iterator循环遍历");
		//iterator循环遍历
		Iterator<Character> it1 = list1.iterator();  
		while(it1.hasNext()){
			System.out.print(it1.next()+"");
		}
		System.out.println("");
		System.out.println("第三种方式foreach循环遍历");
		//foreach遍历
		for (char d : list1) {
			System.out.print(d);
		}
		
	}
}
 