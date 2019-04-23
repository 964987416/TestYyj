package com.briup.Test50Example; 
/** 
 * @author yyj 
 * @version CreateTime：2018年10月31日 下午4:52:46 
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
 */
public class Utest25 {
	
	public static void Function(int n) throws Exception{
		StringBuffer sb = new StringBuffer();
		sb.append(n);
		String str = sb.toString();
		char [] c = str.toCharArray();
		try {
			if(c[0]==c[4]&&c[1]==c[3]){
				System.out.println(n+"是回文数");
			}else{
				System.out.println(n+"不是回文数");
			}
			
		} catch (Exception e) {
			throw new Exception("请输入一个五位数");
		}
		
		
	}
	public static void main(String[] args) {
		try {
			Function(12321);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}	
 