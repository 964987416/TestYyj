package com.yyjnewwork; 
/** 
 * @author yyj 
 * @version CreateTime：2018年8月23日 下午5:38:46 
 * 
 */
public class JieCheng {
	
	public void cheng (int a){
		int temp = 1;
		for(int i =1;i<=a;i++){
			temp *=i;
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		JieCheng j = new JieCheng();
		j.cheng(5);
		
		
	}

}
 