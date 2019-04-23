package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月19日 上午10:31:53
 *          题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 *          程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
public class Test5 {

	public  static void  Function(int n){
		if(n>=90){
			System.out.println("A");
		}
		if(89>=n && n>=60){
			System.out.println("B");
		}
		if(n<=60){
			System.out.println("c");
		}
		if(n<0||n>100){
			System.out.println("输入无效");
		}
	}
	
	
	public static void main(String[] args) {
		Function(67);
	}
	
	

}
