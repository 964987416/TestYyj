package com.briup.Test.stream; 

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/** 
 * @author yyj 
 * @version CreateTime：2018年1月10日 上午10:17:02 
 * 
 */
public class DataStreamTest {
	//定义数据写到外部文件中
	public static void writeFile(String name) throws Exception{
		int i=10;
		FileOutputStream fos = new FileOutputStream(name);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(i);
		dos.flush();
		fos.close();
		dos.close();
	}
	//读取
	public static void readFile(String name) throws Exception{
		FileInputStream fis = new FileInputStream(name);
		DataInputStream dis = new DataInputStream(fis);
		int i = dis.readInt();
		System.out.println(i);
	}
	public static void main(String[] args) throws Exception {
		
		//writeFile("C:\\Users\\moose\\Desktop\\a1.txt");
		//System.out.println("写入完毕");
		readFile("C:\\Users\\moose\\Desktop\\system.txt");
		System.out.println("读取完毕");
	}

}
 