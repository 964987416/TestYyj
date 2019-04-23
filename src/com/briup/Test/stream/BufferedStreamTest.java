package com.briup.Test.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author yyj
 * @version CreateTime：2018年1月10日 上午10:30:26
 * 
 */
public class BufferedStreamTest {
	public static void writeStr(String name) throws Exception {
		// 写入文件
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(name));
		String str = "helloworld";
		byte[] buf = str.getBytes();
		bos.write(buf);
		bos.flush();
		bos.close();
		System.out.println("写入操作完成");
	}

	// 获取文件数据
	public static void read(String name) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				name));
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = bis.read(buf)) != -1) {
			System.out.println(buf);
		}
		bis.close();
		System.out.println("读取操作完成");
	}

	public static void main(String[] args) throws Exception {
		writeStr("e:\\filetest\\a1.txt");
		read("e:\\filetest\\a1.txt");
	}

}
