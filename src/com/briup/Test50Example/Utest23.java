package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月31日 下午4:38:33
 *          题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数
 *          他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。
 *           最后问第一个人，他说是10岁。请问第五个人多大？
 */
public class Utest23 {
	public static int Function(int n){
		if(n==1){
			return 10;
		}else{
			return Function(n-1)+2;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(Function(5));
	}
	
	

}
