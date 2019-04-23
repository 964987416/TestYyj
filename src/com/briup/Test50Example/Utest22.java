package com.briup.Test50Example; 
/** 
 * @author yyj 
 * @version CreateTime：2018年10月31日 下午4:26:08 
 * 利用递归方法求5!
 */
public class Utest22 {
	public static int Function(int n){
		if(n==1){
			return 1;
		}else{
			
			return Function(n-1)*n;
		}
	}
	public static void main(String[] args) {
		System.out.println(Function(5));
	}
}
 