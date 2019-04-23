package com.briup; 
/** 
 * @author 刘京赟 
 * @version CreateTime：2018年11月2日 上午9:32:43 
 * 
 */
public class YangHui {
	public static void main(String[] args) {
		//传入index为杨辉三角的层数
		setAre(5);
	}
	 //杨辉三角的实现。
	   public static void setAre(int index){//实现成功 
		   int[][]arr=new int[index][];
		   //处理数据
		   for (int i = 0; i < index; i++) {
			 arr[i]=new int[i+1];
			 for(int j=0;j<arr[i].length;j++){
				 if(j==0||j==arr[i].length-1)arr[i][j]=1;
				 else {
					 arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				 }
			 }
		   }
		   //处理打印形状
		   for(int i=0;i<index;i++){
			       int j=arr[index-1].length-i-1;
				   for (int x = j; x >0 ; x--)
					System.out.print("\t");
				   for(int y=0;y<arr[i].length;y++){
					  System.out.print(arr[i][y]+"\t");
					  System.out.print("\t");
				   }
				  System.out.println();
		   }
	   }
}
 