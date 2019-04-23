package com.briup.Test.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author yyj
 * @version CreateTime：2018年1月10日 上午9:42:26
 * 
 */
public class FileInOutStreamTest {
	public static void main(String[] args) throws Exception {
		String path = "E:\\FileTest\\1.jpg";
		String path1 = "C:\\Users\\moose\\Desktop\\a1.jpg";
		FileInputStream fis = new FileInputStream(path);
		FileOutputStream fos = new FileOutputStream(path1);
		System.out.println("正在传输");
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fis.read(buf)) != -1) {
			fos.write(buf);
		}
		if (fis != null)
			fis.close();
		if (fos != null)
			fos.close();
		System.out.println("传输完成");
	}

}
