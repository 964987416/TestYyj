package com.briup.Test50Example; 
/** 
 * @author yyj 
 * @version CreateTime：2018年10月31日 下午3:53:15 
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 分子 2,3,5,8,13,21
 * 分母  1,2,3,5,8,13,
 */
public class Utest20 {
	//分母
	public static int Function(int n){
		if(n==1||n==2){
			return n;
		}else{
			return Function(n-1)+Function(n-2);
			
		}
	}
	//分子为Function（n+1）
	
	public static void main(String[] args) {
		double d = 0.0;
		
		for(int i=1;i<=20;i++){
			d+=Function(i+1)/Function(i);
			System.out.print(Function(i+1)+"/"+Function(i)+" ");
		}
		System.out.println(d);
		
	}
	
}
 