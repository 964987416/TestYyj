package com.yyjnewwork; 
/** 
 * @author yyj 
 * @version CreateTime：2018年7月1日 下午7:22:25 
 * 冒泡排序
 * 
 */
public class Maopaopaixu {
	public static void main(String[] args) {
		 int temp = 0;
		 int a [] = {1,5,4,3,2};
		 for(int i=0;i<a.length-1;i++){
			for(int j =0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}	
			} 	
		 }
		 for(int b:a){
			 System.out.print(b+" ");
		 }
	}
	
}
 