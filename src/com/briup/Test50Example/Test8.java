package com.briup.Test50Example; 
/** 
 * @author yyj 
 * @version CreateTime：2018年10月19日 下午3:45:29 
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222
 */
public class Test8 {
	private static String expressed(int a,int n){
		StringBuffer sb = new StringBuffer();
		StringBuffer subSB = new StringBuffer();
		sb.append("s = ");
		for(int i=1;i<n+1;i++){
		  subSB = subSB.append(a);
		  sb = sb.append(subSB);
		  if(i<n)
		    sb = sb.append("+");
		}
		return sb.toString();
	}
	//求和
	private static long add(int a,int n){
		long sum = 0;
		long subSUM = 0;
		for(int i=1;i<n+1;i++){
			subSUM = subSUM*10+a;
			sum = sum+subSUM;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(expressed(7,2));
		System.out.println(add(7,2));
	}
	

}
 