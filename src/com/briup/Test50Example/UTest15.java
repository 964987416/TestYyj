package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月31日 下午2:42:25 输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class UTest15 {
	public static void main(String[] args) {
		int x = 10;
		int y = 50;
		int z = 20;
		
		int a [] = {x,y,z};
		for(int i =0;i<a.length;i++){
			for(int j =0;j<a.length-1;j++){
				int temp = 0;
				if(a[j]>a[j+1]){
					temp = a[j+1];
					a[j+1]=a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
		
	}
}
