package com.briup.oldTest;
/**
 *io流输入输出test 
 *必备条件：桌面存在System.txt文件 
 * 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InOutputStreamReader {

	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\moose\\Desktop\\System.txt";
		String path1 = "C:\\Users\\moose\\Desktop\\CopySystem.txt";
		FileInputStream fis = new FileInputStream(path);
		System.out.println("正在传输");
		long start = System.currentTimeMillis();
		FileOutputStream fos = new FileOutputStream(path1);
		InputStreamReader isr = new InputStreamReader(fis, "GBK");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		@SuppressWarnings("unused")
		int len;
		char[] buf = new char[1024];
	
		while ((len = isr.read(buf)) != -1) {
			osw.write(buf);
			System.out.println(buf);
		}

		long end = System.currentTimeMillis();
		System.out.println("总用时" + (end - start) + "毫秒");
		osw.close();
		isr.close();
		fos.close();
		fis.close();
		System.out.println("传输完成");
	}
}
