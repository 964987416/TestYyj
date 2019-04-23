package com.briup;
/**
 * 求一个数的阶乘
 * @author moose
 *
 */

public class Jiecheng {
	public void test(int a,int b){
		int sum = 1;
		
		for(int i = 0;i<b;i++){
			sum = sum *a;
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		Jiecheng st = new Jiecheng();
		st.test(5, 3);
	}
}
