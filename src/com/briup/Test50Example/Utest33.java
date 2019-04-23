package com.briup.Test50Example; 
/** 
 * @author yyj 
 * @version CreateTime：2018年11月1日 下午4:32:15 
 * 打印出杨辉三角形
  
        1 
       1 1 
      1 2 1 
     1 3 3 1 
    1 4 6 4 1 
  1 5 10 10 5 1 
   
 */

public class Utest33 {
	public static void main(String[] args) {
		//展开项系数
		Function();

		//二维数组输出
		//Function1();
	}

	// 网上案例 通过杨辉三角是（a+b）的n次方项系数的规律展开
	public static void Function() {

		int rows = 10;

		for (int i = 0; i < rows; i++) {
			int number = 1;
			// 打印空格字符串
			System.out.format("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}

	}

	// 答案2号
	public static void Function1() {
		int x = 10;// 输入几层是几层
		int num[][] = new int[x][x];// 这个数组有几层
		for (int m = 0; m < x; m++)// 主要是对数组进行赋值
		{
			for (int n = 0; n <= m; n++)// 每一层的个数都是小于等于层数的，m代表层数，n代表着第几个数
			{
				if (n == 0 || m == n)// 每一层的开头都是1，m==n的时候也是1,必须要这个，凡事都得有个开头
				{
					num[m][n] = 1;
				} else
					num[m][n] = num[m - 1][n - 1] + num[m - 1][n];// 这个就是递推的方法了，例如3=1+2，3的坐标就是3[3,1]=1[2,0]+2[2,1];
			}
		}
		for (int i = 0; i < x; i++)// 主要是输出数组
		{
			for (int l = i; l < x; l++)// 这个主要是打空格，好看一点，去掉就是直角三角形了
			{
				System.out.print(" ");
			}
			for (int j = x - i; j <= x; j++)// 这个就是打印数组了，每层循环几次就几个
			{
				System.out.print(num[i][x - j] + " ");// 不懂的可以把x替换成10，更加清楚点
			}
			System.out.println();// 每层换行
		}
	}
}
