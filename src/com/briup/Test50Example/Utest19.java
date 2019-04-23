package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月31日 下午3:14:22

 *          题目：打印出如下图案（菱形）
 	 *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
 */
public class Utest19 {

	public static void main(String[] args) {
		//上半部分的图形
		for(int i =1;i<=5;i++){
			for(int j =5;j>=i;j--){
				//控制左边空白
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1;k++){
				//输出星星
				System.out.print("*");
			}
			//换行
			System.out.println("");
		}
		//下半部分图形
		for(int i=4;i>=1;i--){
			for(int j =5;j>=i;j--){
				//控制左边空白
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1;k++){
				//输出星星
				System.out.print("*");
			}
			//换行
			System.out.println("");
		}
		
		
		
		
		
	}

}
